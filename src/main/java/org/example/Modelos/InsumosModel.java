package org.example.Modelos;

public class InsumosModel {
    private int id;
    private String tipo;
    private String nombre;
    private String presentacion;
    private String precio;
    private String existencia;

    public InsumosModel() {
    }

    public InsumosModel(int id, String tipo, String nombre, String presentacion, String precio, String existencia) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.precio = precio;
        this.existencia = existencia;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getExistencia() {
        return existencia;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }
}
