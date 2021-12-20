import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import game.model.Dragon;
import game.model.Hacha;

public class Main {
    // @TODO: Sustituya xxxx por los parámetros de su conexión

    private static final String DB_SERVER = "localhost";

    private static final int DB_PORT = 3306;

    private static final String DB_NAME = "d&c";

    private static final String DB_USER = "root";

    private static final String DB_PASS = "123456";

    private static Connection conn;

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);

        // @TODO pruebe sus funciones
        try {
            nuevo_dragon("Viseryon");
        }catch(Exception e){
            System.out.println(e.toString());
        }

        ArrayList<Dragon> dragones = (ArrayList<Dragon>) squad_derrota_dragones(1);
        System.out.println("Dragones derrotados por el escuadron 1 : ");
        for(int i = 0; i<dragones.size();i++){
            System.out.println(dragones.get(i).getAllDataAsString());
        }
        ArrayList<Hacha> hachas = (ArrayList<Hacha>) mostrar_hachas("Forja de Tébez");
        System.out.println("Hachas forjadas en Forja de Tébez: ");
        for(int i = 0; i<hachas.size();i++){
            System.out.println(hachas.get(i).getAllDataAsString());
        }
        String espada = espada_porta_guerrero("Stanto");
        System.out.println("Espada portada por el guerrero Stanto: ");
        System.out.println(espada);
        conn.close();
    }

    // @TODO resuelva las siguientes funciones...

    public static void nuevo_dragon(String nombre) throws SQLException {

        int newID = 0;
        PreparedStatement stmt = conn.prepareStatement("SELECT MAX(ID_Dragon)+1 as newID from dragon");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            newID = rs.getInt("newID");
        }
        rs.close();
        stmt = conn.prepareStatement("INSERT INTO Dragon (ID_Dragon, daño, vida, nivel, nombre) VALUES (?, ? ,? ,? ,?)");
        if(newID>0){
            stmt.setInt(1, newID);
        }
        else{
            try {
                throw new Exception("No se ha podido crear el dragon");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
                "SELECT dragon.ID_Dragon, daño, vida, nivel, nombre FROM relescuadrondragon JOIN dragon ON relescuadrondragon.ID_Dragon = Dragon.ID_Dragon WHERE ID_Escuadron = "
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
                "SELECT peso, hacha.nombre, daño FROM hacha JOIN relforjahacha ON hacha.nombre = relforjahacha.nombre WHERE relforjahacha.nombre_forja = \""
                        + nombre_forja + "\"");
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
                "SELECT espada.nombre from relforjaespada JOIN guerrero ON relforjaespada.ID_G = guerrero.ID_G JOIN espada ON espada.nombre = relforjaespada.nombre WHERE guerrero.nombre = \""
                        + nombre_guerrero + "\" AND relforjaespada.equipado_E != 0");
        if (rs.next()) {
            espada = rs.getString(1);
        }
        rs.close();
        return espada;
    }
}
