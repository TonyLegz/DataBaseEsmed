package org.example.Modelos;

import java.util.Date;

public class VentasModel {
    private int id;
    private Date fecha;
    private String numero_documento;
    private String serie;
    private int cliente_id;

    public VentasModel() {}

    public VentasModel(int id, Date fecha, String numero_documento, String serie, int cliente_id) {
        this.id = id;
        this.fecha = fecha;
        this.numero_documento = numero_documento;
        this.serie = serie;
        this.cliente_id = cliente_id;
    }


    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public String getSerie() {
        return serie;
    }

    public int getCliente_id() {
        return cliente_id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }



}