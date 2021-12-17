package game.model;

public class Trol {

    private int daño;
    private int vida;
    private int ID_Tr;
    private String nombre;
    private int oro;

    public Trol(int daño, int vida, int ID_Tr, String nombre, int oro) {
        this.daño = daño;
        this.vida = vida;
        this.ID_Tr = ID_Tr;
        this.nombre = nombre;
        this.oro = oro;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getID_Tr() {
        return ID_Tr;
    }

    public void setID_Tr(int ID_Tr) {
        this.ID_Tr = ID_Tr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }
}