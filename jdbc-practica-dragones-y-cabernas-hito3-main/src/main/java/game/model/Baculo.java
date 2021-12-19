package game.model;

public class Baculo {
    private float peso;
    private String nombre;
    private int daño;

    public Baculo(float peso, String nombre, int daño) {
        this.peso = peso;
        this.nombre = nombre;
        this.daño = daño;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return this.daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

}