package org.example;

import org.example.Modelos.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio del Programa");
        ClientesModel clientes = new ClientesModel();
        clientes.setId();
        clientes.setNombre();
        clientes.setTelefono();
        clientes.setDireccion();
        clientes.setEmail();
        clientes.setNit();
        clientes.setActivo(Boolean.FALSE);


        EquiposModel equipos = new EquiposModel();
        equipos.setId();
        equipos.setNombre();
        equipos.setMarca();
        equipos.setModelo();
        equipos.setSerie();
        equipos.setInventario();
        equipos.setClasificacion();


        MantenimientosModel mantenimientos = new MantenimientosModel();
        mantenimientos.setId();
        mantenimientos.setTipo();
        mantenimientos.setEquipos_id(equipos.getId());


        InsumosModel insumos = new InsumosModel();
        insumos.setId();
        insumos.setTipo();
        insumos.setNombre();
        insumos.setPresentacion();
        insumos.setPrecio();
        insumos.setExistencia();


        TecnicosModel tecnicos = new TecnicosModel();
        tecnicos.setId();
        tecnicos.setNombre();
        tecnicos.setTelefono();
        tecnicos.setTelefono();
        tecnicos.setDireccion();
        tecnicos.setEmail();
        tecnicos.setNit();
        tecnicos.setApellido();


        UsuariosModel usuarios = new UsuariosModel();
        usuarios.setId();
        usuarios.setNombre();
        usuarios.setEmail();
        usuarios.setContrasena();


        VentasModel ventas = new VentasModel();
        ventas.setId();
        ventas.setFecha();
        ventas.setNumero_documento();
        ventas.setSerie();
        ventas.setCliente_id(clientes.getId());

        Detalle_ventasModel detalle_ventas = new Detalle_ventasModel();



    }
}