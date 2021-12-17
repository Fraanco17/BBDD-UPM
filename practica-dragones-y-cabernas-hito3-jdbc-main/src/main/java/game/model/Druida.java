package game.model;

public class Druida {
    private int ID_Druida;
    private String nombre;

    public Druida(int ID_Druida, String nombre) {
        this.ID_Druida = ID_Druida;
        this.nombre = nombre;
    }

    public int getID_Druida() {
        return ID_Druida;
    }

    public String getNombre() {
        return nombre;
    }
}
