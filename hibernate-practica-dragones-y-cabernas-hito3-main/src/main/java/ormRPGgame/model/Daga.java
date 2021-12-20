package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
public class Daga {
    private String name;
    // @TODO completar las anotaciones de todos los atributos

    public Daga(String nombre){
        this.name=nombre;
        // @TODO completar el constructor de la clase.
    }

    public String getnombre(){ return this.name;}
}
