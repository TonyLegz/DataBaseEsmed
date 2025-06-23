package org.example.Modelos;

public class Detalle_ventasModel {
    private int id;
    private int costo;
    private String extra;
    private float descuento;
    private float total;
    private String observaciones;
    private int venta_id;
    private int equipo_id;
    private int mantenimiento_id;

    public Detalle_ventasModel() {}

    public Detalle_ventasModel(int id, int costo, String extra, float descuento, float total, String observaciones, int venta_id, int equipo_id, int mantenimiento_id) {
        this.id = id;
        this.costo = costo;
        this.extra = extra;
        this.descuento = descuento;
        this.total = total;
        this.observaciones = observaciones;
        this.venta_id = venta_id;
        this.equipo_id = equipo_id;
        this.mantenimiento_id = mantenimiento_id;
    }


    public int getId() {
        return id;
    }

    public int getCosto() {
        return costo;
    }

    public String getExtra() {
        return extra;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getTotal() {
        return total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public int getEquipo_id() {
        return equipo_id;
    }

    public int getMantenimiento_id() {
        return mantenimiento_id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public void setEquipo_id(int equipo_id) {
        this.equipo_id = equipo_id;
    }

    public void setMantenimiento_id(int mantenimiento_id) {
        this.mantenimiento_id = mantenimiento_id;
    }




}
