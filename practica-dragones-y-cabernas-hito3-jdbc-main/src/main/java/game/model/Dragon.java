package game.model;

/**
 * Modela un dragón. No es necesario modificar esta clase. Pero debe crear tantas clases como entidades
 * necesite para llevar a cabo esta parte del hito 3. Inclúyalas en el paquete "game.model"
 */
public class Dragon {

    private String nombre;
    private int ID_Dragon;
    private int vida;
    private int daño;
    private int nivel;

    public Dragon(String nombre, int ID_Dragon, int vida, int daño, int nivel) {
        this.nombre = nombre;
        this.ID_Dragon = ID_Dragon;
        this.vida = vida;
        this.daño = daño;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getID_Dragon() {
        return ID_Dragon;
    }

    public int getVida() {
        return vida;
    }

    public int getDaño() {
        return daño;
    }

    public int getNivel() {
        return nivel;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
