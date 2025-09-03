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

    
    

    

    


}
