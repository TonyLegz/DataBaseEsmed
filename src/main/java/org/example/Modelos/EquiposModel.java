package org.example.Modelos;

import java.util.ArrayList;
import java.util.List;

public class EquiposModel {
    private int id;
    private String nombre;
    private String marca;
    private String modelo;
    private String serie;
    private String inventario;
    private String clasificacion;
    private static List<EquiposModel> listarequipos=new ArrayList<EquiposModel>();

    public EquiposModel() {}

    public EquiposModel(int id, String nombre, String marca, String modelo, String serie, String inventario, String clasificacion) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.inventario = inventario;
        this.clasificacion = clasificacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSerie() {
        return serie;
    }

    public String getInventario() {
        return inventario;
    }

    public String getClasificacion() {
        return clasificacion;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }



    public int insertarequipo(EquiposModel equipo) {
        listarequipos.add(equipo);
        return 1;
    }

    public List<EquiposModel> listarequipos() {
        return listarequipos;
    }
}
