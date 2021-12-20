package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase

public class Mago {
    private String name;
    private int MagoID;
    private Daga daga;
    private Jugador jugador;
    // @TODO completar las anotaciones de todos los atributos


    public Mago(String nombre, Daga daga,int id){
        // @TODO completar el constructor de la clase.
        //  Para ello es necesario un string con el nombre del mago y un objeto de la clase daga
        //  Inicialice el resto de atributos a los valores que considere oportunos
        this.name=nombre;
        this.daga=daga;
        this.MagoID=id;
    }

    public String getnombre(){ return this.name;}
}
