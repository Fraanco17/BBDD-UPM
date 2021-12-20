package game.model;

public class Pocion {
    private int ID_Pocion;
    private int vida_recupera;
    private int mana;
    private float peso;

    public Pocion(int ID_Pocion, int vida_recupera, int mana, float peso) {
        this.ID_Pocion = ID_Pocion;
        this.vida_recupera = vida_recupera;
        this.mana = mana;
        this.peso = peso;
    }

    public int getID_Pocion() {
        return ID_Pocion;
    }

    public int getVida_recupera() {
        return vida_recupera;
    }

    public int getMana() {
        return mana;
    }

    public float getPeso() {
        return peso;
    }
}
