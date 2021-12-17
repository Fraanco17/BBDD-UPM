package game.model;

public class Hacha{
    
    private int peso;
    private String nombre;
    private int daño;
    private boolean equipado_H;

    public Hacha(int peso, String nombre, int daño, boolean equipado_H) {
        this.peso = peso;
        this.nombre = nombre;
        this.daño = daño;
        this.equipado_H = equipado_H;
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

    public boolean isEquipado_H() {
        return equipado_H;
    }

    public void setEquipado_H(boolean equipado_H) {
        this.equipado_H = equipado_H;
    }
}
