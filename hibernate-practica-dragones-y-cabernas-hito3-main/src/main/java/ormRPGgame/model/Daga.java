package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
public class Daga {
    private String name;
    private float daño;
    private float peso;
    // @TODO completar las anotaciones de todos los atributos

    public Daga(String nombre, float daño, float peso){
        this.name=nombre;
        this.daño=daño;
        this.peso=peso;
        // @TODO completar el constructor de la clase.
    }

    public String getName(){ return this.name;}

    public void setName(String name) {
        this.name = name;
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
