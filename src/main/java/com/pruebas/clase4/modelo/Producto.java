package com.pruebas.clase4.modelo;

public class Producto {
    private String nombre;
    private int precio;
    private int unidades;
    private Proveedor proveedor;

    public Producto() {
    }

    public Producto(String nombre, int precio, int unidades, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void agregarAProveedor() {
        this.proveedor.agregarProducto(this);
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", unidades=" + unidades + ", proveedor="
                + proveedor.getNombre() + "]";
    }


}
