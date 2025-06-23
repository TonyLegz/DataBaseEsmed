package org.example.Modelos;

import java.util.ArrayList;
import java.util.List;

public class ClientesModel {
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String nit;
    private Boolean activo;
    private static List<ClientesModel> listaclientes= new ArrayList<ClientesModel>();


    public ClientesModel() {}

    public ClientesModel(int id, String nombre, String telefono, String direccion, String email, String nit, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nit = nit;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getNit() {
        return nit;
    }

    public Boolean getActivo() {
        return activo;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }



    public int insertarcliente(ClientesModel cliente) {
        listaclientes.add(cliente);
        return 1;
    }

    public List<ClientesModel> listarclientes() {
        return listaclientes;
    }
}