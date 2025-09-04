package com.pruebas.clase4.modelo;

import java.util.ArrayList;

public class Proveedor {

    private String nombre;
    private ArrayList<Producto> productos;

    public Proveedor() {
    }

    public Proveedor(String nombre, ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto prod){
        this.productos.add(prod);
    }

    @Override
    public String toString() {
        return "Proveedor [nombre=" + nombre + ", Cantidad de productos=" + productos.size() + "]";
    }
    

}
