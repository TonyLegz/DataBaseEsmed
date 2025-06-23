package org.example.Modelos;

public class TecnicosModel {
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String nit;
    private String apellido;

    public TecnicosModel() {
    }

    public TecnicosModel(int id, String nombre, String telefono, String direccion, String email, String nit, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nit = nit;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
