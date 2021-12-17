package game.model;

public class Trol {

    private int daño;
    private int vida;
    private int ID_Tr;
    private String nombre;

    public Trol(int daño, int vida, int ID_Tr, String nombre) {
        this.daño = daño;
        this.vida = vida;
        this.ID_Tr = ID_Tr;
        this.nombre = nombre;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setID_Tr(int ID_Tr) {
        this.ID_Tr = ID_Tr;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public int getVida() {
        return vida;
    }

    public int getID_Tr() {
        return ID_Tr;
    }

    public String getNombre() {
        return nombre;
    }
}
