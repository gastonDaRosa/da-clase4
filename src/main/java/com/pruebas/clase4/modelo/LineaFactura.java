package com.pruebas.clase4.modelo;

public class LineaFactura {
    private int cantidad;
    private Producto proudct;


    public LineaFactura() {
    }


    public LineaFactura(int cantidad, Producto proudct) {
        this.cantidad = cantidad;
        this.proudct = proudct;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public Producto getProudct() {
        return proudct;
    }


    public void setProudct(Producto proudct) {
        this.proudct = proudct;
    }

    

    

}
