package com.pruebas.clase4.modelo;

import java.util.ArrayList;


public class Cliente {
    private String userName;
    private String nombre;
    private String apellido;
    private ArrayList<Factura> facturas;


    public Cliente() {
        this.facturas = new ArrayList<Factura>();
    }

    public Cliente(String userName, String nombre, String apellido) {
        this.userName = userName;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public void agregarFactura( Factura factura ){

        //if(this.facturas != null){
        //    this.facturas.add(acceso);
        //}else{
        //    this.facturas = new ArrayList<Acceso>();
        //    this.facturas.add(acceso);
        //}

        this.facturas.add(factura);

    }

    @Override
    public String toString() {
        return "Cliente [userName=" + userName + ", nombre=" + nombre + ", apellido=" + apellido + "]";
    }



}
