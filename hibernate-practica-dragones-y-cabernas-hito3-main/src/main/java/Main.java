import ormRPGgame.Controller;
import ormRPGgame.model.Jugador;
import ormRPGgame.model.Mago;
import ormRPGgame.model.Daga;

import java.sql.SQLException;

public class Main {

    public static void main (String [] args) throws SQLException {
        Controller controller = new Controller();
        Jugador jugador=new Jugador(3,"Pablo");
        Daga daga = controller.createDaga("Daga de madera", 500, 500);
        Mago mago = controller.createMago("Mago Increible", daga,8,jugador);
        try {
            Controller controlador= new Controller();
            //@TODO añada las llamadas a las funciones de la clase Controller.java necesarias
            //para la creación de la daga y el mago.
            if(daga!=null && mago!=null)
                System.out.println("Se ha creado el mago "+mago.getName()+" de nivel 1 con la daga "+daga.getName());
            else throw new SQLException();
        } catch(SQLException e) {
            System.err.println("Se ha producido un error en la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}
