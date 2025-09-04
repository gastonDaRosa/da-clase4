package com.pruebas.clase4.servicios;

import java.util.ArrayList;
import java.util.List;

import com.pruebas.clase4.claseDePrueba.DatosDePrueba;
import com.pruebas.clase4.modelo.Cliente;
import com.pruebas.clase4.modelo.Factura;
import com.pruebas.clase4.modelo.Producto;

public class ServiciosCliente {

    private static ServiciosCliente instancia;
    private ServiciosStock instanciaStock;
    private ArrayList<Cliente> resultado = new ArrayList<Cliente>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private int minutosConsultados = 0;

    // Patron Singleton
    private ServiciosCliente(ServiciosStock stock) {
        // Constructor privado para evitar instanciación desde fuera de la clase
        this.instanciaStock = stock;
    }
    public static ServiciosCliente getInstancia(ServiciosStock stock) {
        if (instancia == null) {
            instancia = new ServiciosCliente(stock);
        }
        return instancia;
    }


    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente getClienteId(String idCliente){
        for (Cliente cliente : clientes) {
            if(cliente.getId().equals(idCliente)){
                return cliente;
            }
        }
        return null;
    }


    public void cargarDatosIniciales() {
        //DatosDePrueba.cargarDatosIniciales();
    }
    public void cargarDatosEstaticos(){
        DatosDePrueba.cargarDatosEstaticosVoid();
    }

    //EJ 1
    public boolean clienteComproProducto(Cliente cli, Producto prod){

        if (cli.getFacturas() != null && cli.getFacturas().size() > 0) {
            for (Factura fac : cli.getFacturas()) {
                if (fac.existeProductoEnLineas(prod)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<Cliente> clienteQueNoComproElProdMasBarato(){
        Producto prodMasBarato = this.instanciaStock.productoMasBarato();
        ArrayList<Cliente> retorno = new ArrayList<Cliente>();
        for (Cliente cliente : clientes) {
            for (Factura factura : cliente.getFacturas()) {
                if (factura.existeProductoEnLineas(prodMasBarato) ) {
                    retorno.add(cliente);
                }
            }
        }
        return retorno;
    }

    //EJ 2
    public Cliente clienteQueMasGastoEn(Producto prod){
        Cliente ret = new Cliente();
        int monto = 0;
        for (Cliente cliente : clientes) {
            int montoCliente = 0;
            for (Factura factura : cliente.getFacturas()) {
                montoCliente += factura.totalGastadoProductoEnLineas(prod);
            }
            if (montoCliente > monto) {
                monto = montoCliente;
                ret = cliente;
            }
        }
        return ret.getNombre() != null ? ret : null;
    }

    //EJ3

    public int clienteGastoEn(Producto prod){
        Cliente ret = new Cliente();
        int monto = 0;
        for (Cliente cliente : clientes) {
            int montoCliente = 0;
            for (Factura factura : cliente.getFacturas()) {
                montoCliente += factura.totalGastadoProductoEnLineas(prod);
            }
            if (montoCliente > monto) {
                monto = montoCliente;
                ret = cliente;
            }
        }
        return monto;
    }

    public ArrayList<Cliente> clientesGastaronMasDeMontoEn(int monto, Producto prod){
        ArrayList<Cliente> ret = new ArrayList<Cliente>();
        int montoAgregado = 0;
        for (Cliente cliente : clientes) {
            int montoCliente = 0;
            for (Factura factura : cliente.getFacturas()) {
                montoCliente += factura.totalGastadoProductoEnLineas(prod);
            }
            if (monto > montoCliente) {
                ret.add(cliente);
            }
        }
        return ret;
    }

    public void mostrarConsultaPorConsola() {
        System.out.println("---------------Punto 4----------------------------");
        String resultante = " ";
        resultante = "Minutos consultados: " + minutosConsultados + System.lineSeparator();
        resultante = resultante + "Cantidad de clientes del resultado  " + resultado.size() + System.lineSeparator();

        /*
        for (Cliente u : resultado) {
            int minutosAccedidos = u.tiempoTotalAcceso();
            resultante = resultante + "Cliente: " + u.getNombre() + " " + u.getApellido() + " Tolal minutos accodidos: "
                    + minutosAccedidos + System.lineSeparator();
            resultante = resultante + ".........................." + System.lineSeparator();
            System.out.print(resultante);

            System.out.print("..............");

        }
        */

        System.out.println("--------------- FIN Punto 4----------------------------");

    }

}
