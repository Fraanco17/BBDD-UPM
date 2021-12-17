package game.model;

public class Espectro {

    private int ID_Es;
    private int vida;
    private int daño;
    private int oro;
    private String nombre;

    public Espectro(int ID_Es, int vida, int daño, int oro, String nombre) {
        this.ID_Es = ID_Es;
        this.vida = vida;
        this.daño = daño;
        this.oro = oro;
        this.nombre = nombre;
    }

    public int getID_Es() {
        return ID_Es;
    }

    public void setID_Es(int ID_Es) {
        this.ID_Es = ID_Es;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
