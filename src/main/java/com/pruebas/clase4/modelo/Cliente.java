package com.pruebas.clase4.modelo;

import java.util.ArrayList;


public class Cliente {
    private String userName;
    private String nombre;
    private String apellido;
    private boolean habilitado;
    private ArrayList<Factura> facturas;

    
    
    public Cliente() {
        this.facturas = new ArrayList<Factura>();
    }

    public Cliente(String userName, String nombre, String apellido, boolean habilitado) {
        this.userName = userName;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habilitado = habilitado;
        this.facturas = new ArrayList<Factura>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> accesos) {
        this.facturas = facturas;
    }

    public void agregarFactura( Factura factura ){

        //if(this.accesos != null){
        //    this.accesos.add(acceso);
        //}else{
        //    this.accesos = new ArrayList<Acceso>();
        //    this.accesos.add(acceso);
        //}

        this.facturas.add(factura);

    }

    
    
}
