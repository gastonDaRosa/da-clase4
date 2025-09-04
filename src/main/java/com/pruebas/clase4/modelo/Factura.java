package com.pruebas.clase4.modelo;

import java.util.ArrayList;

import com.pruebas.clase4.servicios.ServiciosCliente;
import com.pruebas.clase4.servicios.ServiciosStock;

public class Factura {

    private ArrayList<LineaFactura> lineas;
    private String clienteId;

    public Factura() {
        this.lineas = new ArrayList<LineaFactura>();
    }

    public Factura(String cliente) {
        this.clienteId = cliente;
        this.lineas  = new ArrayList<LineaFactura>();
    }

    public Factura(String cliente, ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
        this.clienteId = cliente;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String cliente) {
        this.clienteId = cliente;
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
                ret += "\n    " + linea.toString();
            }
        }else{
            ret += "La Factura no cuenta con lineas que mostrar";
        }

        if(clienteId != null ){
            ret += ", cliente=" + ServiciosCliente.getInstancia(ServiciosStock.getInstancia()).getClienteId(clienteId).getNombre() + "]";
        }else{
            ret += ", cliente= Cliente no encontrado]";
        }
        return ret;
    }


}
