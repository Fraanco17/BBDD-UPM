package ormRPGgame.model;

// @TODO completar las anotaciones de la clase

public class Mago {
    private String name;
    private int ID_M;
    private Daga nombre_daga;
    private Jugador ID_jugador;
    // @TODO completar las anotaciones de todos los atributos


    public Mago(String nombre, Daga daga,int id, Jugador jugador){
        // @TODO completar el constructor de la clase.
        //  Para ello es necesario un string con el nombre del mago y un objeto de la clase daga
        //  Inicialice el resto de atributos a los valores que considere oportunos
        this.name=nombre;
        this.nombre_daga =daga;
        this.ID_M=id;
        this.ID_jugador=jugador;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getID_M() {
        return ID_M;
    }

    public void setID_M(int ID_M) {
        this.ID_M = ID_M;
    }

    public Daga getNombre_daga() {
        return nombre_daga;
    }

    public void setNombre_daga(Daga nombre_daga) {
        this.nombre_daga = nombre_daga;
    }

    public Jugador getID_jugador() {
        return ID_jugador;
    }

    public void setID_jugador(Jugador ID_jugador) {
        this.ID_jugador = ID_jugador;
    }
}
