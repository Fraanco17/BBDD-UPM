package game.model;

import java.sql.Date;

public class Escuadron {
    private int ID_Escuadron;
    private Date fecha_ini, fecha_fin;

    public Escuadron(int ID_Escuadron, Date fecha_ini, Date fecha_fin) {
        this.ID_Escuadron = ID_Escuadron;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
    }

    public int getID_Escuadron() {
        return this.ID_Escuadron;
    }

    public void setID_Escuadron(int ID_Escuadron) {
        this.ID_Escuadron = ID_Escuadron;
    }

    public Date getFecha_ini() {
        return this.fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_fin() {
        return this.fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

}