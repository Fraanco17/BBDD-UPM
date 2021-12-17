package game.model;

public class Guerrero {
    private int apariencia;
    private String nombre;
    private int ID_G;
    private int vida;
    private int fuerza;
    private int mana;
    private int oro;
    private int nivel;

    public Guerrero(int apariencia, String nombre, int ID_G, int vida, int fuerza, int mana, int oro, int nivel) {
        this.apariencia = apariencia;
        this.nombre = nombre;
        this.ID_G = ID_G;
        this.vida = vida;
        this.fuerza = fuerza;
        this.mana = mana;
        this.oro = oro;
        this.nivel = nivel;
    }

    public int getApariencia() {
        return apariencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getID_G() {
        return ID_G;
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getMana() {
        return mana;
    }

    public int getOro() {
        return oro;
    }

    public int getNivel() {
        return nivel;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
