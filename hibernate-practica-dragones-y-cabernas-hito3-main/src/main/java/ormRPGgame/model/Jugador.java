package ormRPGgame.model;

public class Jugador {
    private int ID_Jugador;
    private String nombre;

    public Jugador(int ID_Jugador, String nombre) {
        this.ID_Jugador = ID_Jugador;
        this.nombre = nombre;
    }

    public int getID_Jugador() {
        return ID_Jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setID_Jugador(int ID_Jugador) {
        this.ID_Jugador = ID_Jugador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
