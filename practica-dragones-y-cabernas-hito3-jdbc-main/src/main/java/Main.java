import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import game.model.Dragon;
import game.model.Hacha;

public class Main {
    // @TODO: Sustituya xxxx por los parámetros de su conexión

    private static final String DB_SERVER = "localhost";

    private static final int DB_PORT = 3306;

    private static final String DB_NAME = "mysql";

    private static final String DB_USER = "root";

    private static final String DB_PASS = "123456";

    private static Connection conn;

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);

        // @TODO pruebe sus funciones
        nuevo_dragon("Viseryon");
        ArrayList<Dragon> dragones = (ArrayList<Dragon>) squad_derrota_dragones(1);
        ArrayList<Hacha> hachas = (ArrayList<Hacha>) mostrar_hachas("Forja de Tébez");
        String espada = espada_porta_guerrero("Stanto");
        conn.close();
    }

    // @TODO resuelva las siguientes funciones...

    public static void nuevo_dragon(String nombre) throws SQLException {
        PreparedStatement stmt = conn
                .prepareStatement("INSERT INTO Dragon (ID_Dragon, daño, vida, nivel, nombre) VALUES (?, ? ,? ,? ,?)");
        stmt.setInt(1, 7);
        stmt.setInt(2, 1700);
        stmt.setInt(3, 17000);
        stmt.setInt(4, 7);
        stmt.setString(5, nombre);
        stmt.executeUpdate();
    }

    public static List<Dragon> squad_derrota_dragones(int id_squad) throws SQLException {
        // @TODO: complete este método para que devuelva una lista de los dragones //
        // derrotados por el squad
        // Tenga en cuenta que la consulta a la base de datos
        // le devolverá un ResultSet
        // sobre el que deberá
        // ir iterando y creando un
        // objeto dragon para cada uno de los dragones, y
        // añadirlos a la lista
        ArrayList<Dragon> lista = new ArrayList<Dragon>();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
                "SELECT ID_Dragon, daño, vida, nivel, nombre FROM relescuadrondragon JOIN dragon ON relescuadrondragon.ID_Dragon = Dragon.ID_Dragon WHERE ID_Escuadron = "
                        + id_squad);
        while (rs.next()) {
            Dragon d = new Dragon(rs.getString("nombre"), rs.getInt("ID_Dragon"), rs.getInt("vida"), rs.getInt("daño"),
                    rs.getInt("nivel"));
            lista.add(d);
        }
        rs.close();
        return lista;
    }

    public static List<Hacha> mostrar_hachas(String nombre_forja) throws SQLException {
        // @TODO: complete este método para que muestre por pantalla las hachas que
        // pueden forjarse en "nombre_forja"
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet
        // sobre el que deberá
        // ir iterando y creando un objeto con cada hacha disponible en esa forja, y
        // añadirlos a la lista
        ArrayList<Hacha> lista = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
                "SELECT peso, hacha.nombre, daño FROM hacha JOIN relforjahacha ON hacha.nombre = relforjahacha.nombre WHERE relforjahacha.nombre_forja = "
                        + nombre_forja);
        while (rs.next()) {
            Hacha h = new Hacha(rs.getFloat("peso"), rs.getString("nombre"), rs.getInt("daño"));
            lista.add(h);
        }
        rs.close();
        return lista;
    }

    public static String espada_porta_guerrero(String nombre_guerrero) throws SQLException {
        // @TODO: complete este método para que devuelva el nombre de la espada que
        // porta el guerrero "nombre_guerrero"
        String espada = "ERROR: No hay espada equipada";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
                "SELECT espada.nombre from relforjaespada JOIN guerrero ON relforjaespada.ID_G = guerrero.ID_G WHERE guerrero.nombre = "
                        + nombre_guerrero + " AND relforjaespada.equipado != 0");
        if (rs.next()) {
            espada = rs.getString(1);
        }
        rs.close();
        return espada;
    }
}
