package game.model;

public class Goblin {

    private int vida;
    private int daño;
    private int oro;
    private String nombre;

    public Goblin(int vida, int daño, int oro, String nombre) {
        this.vida = vida;
        this.daño = daño;
        this.oro = oro;
        this.nombre = nombre;
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
