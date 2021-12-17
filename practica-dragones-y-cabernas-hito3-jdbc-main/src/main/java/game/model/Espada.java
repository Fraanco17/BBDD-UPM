package game.model;

public class Espada {

    private float peso;
    private String nombre;
    private int daño;

    public Espada(float peso, String nombre, int daño) {
        this.peso = peso;
        this.nombre = nombre;
        this.daño = daño;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
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
