package com.pruebas.clase4.modelo;

import java.util.ArrayList;

public class Factura {

    private ArrayList<LineaFactura> lineas;
    private Cliente cliente;

    public Factura() {
        this.lineas = new ArrayList<LineaFactura>();
    }

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.lineas  = new ArrayList<LineaFactura>();
    }

    public Factura(Cliente cliente, ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
        this.cliente = cliente;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean existeProductoEnLineas(Producto prod){
        for (LineaFactura linea : lineas) {
            if(linea.existeProducto(prod)){
                return true;
            }
        }
        return false;
    }
    public int totalGastadoProductoEnLineas(Producto prod){
        int ret = 0;
        for (LineaFactura linea : lineas) {
            if(linea.existeProducto(prod)){
                ret += linea.getProudct().getPrecio();
            }
        }
        return ret;
    }

    @Override
    public String toString() {

        String ret = "Factura [lineas=";

        if(lineas != null && lineas.size() > 0 ){
            for (LineaFactura linea : lineas) {
                ret += linea.toString();
            }
        }else{
            ret += "La Factura no cuenta con lineas que mostrar";
        }

        if(cliente != null && cliente.getNombre() != null && cliente.getApellido() != null){
            ret += ", cliente=" + cliente.getNombre() + " " + cliente.getApellido() + "]";
        }else{
            ret += ", cliente= Cliente no encontrado]";
        }
        return ret;
    }


}
