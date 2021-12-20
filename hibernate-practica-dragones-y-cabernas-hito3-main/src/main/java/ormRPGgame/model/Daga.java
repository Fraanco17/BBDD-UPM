package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "daga")
public class Daga {
    @Id
    @Column(name = "nombre_daga")
    private String name;

    @Column(name = "daño")
    private int daño;

    @Column(name = "peso")
    private float peso;

    // @TODO completar las anotaciones de todos los atributos

    public Daga(String nombre){
        this.name=nombre;
        // @TODO completar el constructor de la clase.
    }

    public String getnombre(){ return this.name;}

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


}
