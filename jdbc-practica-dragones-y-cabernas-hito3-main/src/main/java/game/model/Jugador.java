package game.model;

public class Jugador{

    private int ID_jugador;
    private String nombre;

    public Jugador(int ID_jugador, String nombre) {
        this.ID_jugador = ID_jugador;
        this.nombre = nombre;
    }

    public int getID_jugador() {
        return ID_jugador;
    }

    public void setID_jugador(int ID_jugador) {
        this.ID_jugador = ID_jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
