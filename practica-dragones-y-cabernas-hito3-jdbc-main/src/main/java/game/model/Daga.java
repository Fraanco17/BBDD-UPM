package game.model;

public class Daga {
    private int daño;
    private float peso;
    private String nombre_daga;

    public Daga(int daño, float peso, String nombre_daga) {
        this.daño = daño;
        this.peso = peso;
        this.nombre_daga = nombre_daga;
    }

    public int getDaño() {
        return daño;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombre_daga() {
        return nombre_daga;
    }
}
