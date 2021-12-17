package game.model;

public class Hacha{

    private int peso;
    private String nombre;
    private int daño;

    public Hacha(int peso, String nombre, int daño) {
        this.peso = peso;
        this.nombre = nombre;
        this.daño = daño;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
}