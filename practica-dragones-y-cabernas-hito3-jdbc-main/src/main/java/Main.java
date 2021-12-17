import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import game.model.Dragon;

public class Main {
    // @TODO: Sustituya xxxx por los parámetros de su conexión

    private static final String DB_SERVER = "3306";

    private static final int DB_PORT = 3306;

    private static final String DB_NAME = "3306";

    private static final String DB_USER = "3306";

    private static final String DB_PASS = "3306";

    private static Connection conn;



    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);

        // @TODO pruebe sus funciones



        conn.close();
    }

    // @TODO resuelva las siguientes funciones...

    public static void nuevo_dragon(String nombre){
        // @TODO: complete este método para que cree un nuevo dragón en la base de datos

    }

    public static List<Dragon> squad_derrota_dragones(Long id_squad){
        // @TODO: complete este método para que devuelva una lista de los dragones derrotados por el squad
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto dragon para cada uno de los dragones, y añadirlos a la lista
        return lista;
    }

    public static List<Hacha> mostrar_hachas(String nombre_forja){
        // @TODO: complete este método para que muestre por pantalla las hachas que pueden forjarse en "nombre_forja"
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada hacha disponible en esa forja, y añadirlos a la lista
        return lista;
    }

    public static String espada_porta_guerrero(String nombre_guerrero){
        // @TODO: complete este método para que devuelva el nombre de la espada que porta el guerrero "nombre_guerrero"
        return "espadón";
    }

}
