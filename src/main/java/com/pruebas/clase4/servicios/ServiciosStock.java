package com.pruebas.clase4.servicios;

import java.util.ArrayList;

import com.pruebas.clase4.claseDePrueba.DatosDePrueba;
import com.pruebas.clase4.modelo.Producto;
import com.pruebas.clase4.modelo.Proveedor;

public class ServiciosStock {

    private static ServiciosStock instancia;
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();

    // Patron Singleton
    private ServiciosStock() {
        // Constructor privado para evitar instanciación desde fuera de la clase
    }
    public static ServiciosStock getInstancia() {
        if (instancia == null) {
            instancia = new ServiciosStock();
        }
        return instancia;
    }

    public void agregarStock(Producto prod, Proveedor provider) {
        productos.add(prod);
        proveedores.add(provider);
    }
    public void agregarProducto(Producto prod) {
        productos.add(prod);
    }
    public void agregarProveedor(Proveedor provider) {
        proveedores.add(provider);
    }

    public ArrayList<Producto> getStocks() {
        return productos;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void cargarDatosIniciales() {
        //DatosDePrueba.cargarDatosIniciales();

    }

    //EJ 1
    public Producto productoMasBarato(){
        
        if (productos != null && productos.size() > 0) {
            Producto prodMenorPrecio = new Producto();
            for (Producto producto : productos) {
                if(prodMenorPrecio.getPrecio() == 0 || producto.getPrecio() < prodMenorPrecio.getPrecio()){
                    prodMenorPrecio = producto;
                }
            }
            return prodMenorPrecio;
        }
        
        return null;

    }

    public void mostrarConsultaPorConsola() {
        System.out.println("---------------Punto 4----------------------------");
        //String resultante = " ";
        //resultante = "Minutos consultados: " + minutosConsultados + System.lineSeparator();
        //resultante = resultante + "Cantidad de stocks del resultado  " + resultado.size() + System.lineSeparator();

        /*
        for (Stock u : resultado) {
            int minutosAccedidos = u.tiempoTotalAcceso();
            resultante = resultante + "Stock: " + u.getNombre() + " " + u.getApellido() + " Tolal minutos accodidos: "
                    + minutosAccedidos + System.lineSeparator();
            resultante = resultante + ".........................." + System.lineSeparator();
            System.out.print(resultante);

            System.out.print("..............");

        }
        */

        System.out.println("--------------- FIN Punto 4----------------------------");

    }

}
