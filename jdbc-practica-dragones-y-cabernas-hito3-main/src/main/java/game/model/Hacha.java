package game.model;

public class Hacha {

    private float peso;
    private String nombre;
    private int daño;

    public Hacha(float peso, String nombre, int daño) {
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

    public String getAllDataAsString(){
        String returnString = "";
        returnString += "nombre:\t"+nombre+ "\r\n";
        returnString += "daño:\t"+daño+ "\r\n";
        returnString += "peso:\t"+peso+ "\r\n";
        return returnString;
    }
}