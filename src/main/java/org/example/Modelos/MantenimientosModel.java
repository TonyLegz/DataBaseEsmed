package org.example.Modelos;

public class MantenimientosModel {
    private int id;
    private String tipo;
    private int equipos_id;

    public MantenimientosModel() {}

    public MantenimientosModel(int id, String tipo, int equipos_id) {
        this.id = id;
        this.tipo = tipo;
        this.equipos_id = equipos_id;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getEquipos_id() {
        return equipos_id;
    }
    public void setEquipos_id(int equipos_id) {
        this.equipos_id = equipos_id;
    }



}
