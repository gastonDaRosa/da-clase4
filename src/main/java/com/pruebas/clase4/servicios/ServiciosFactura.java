package com.pruebas.clase4.servicios;

import java.util.ArrayList;
import java.util.List;

import com.pruebas.clase4.claseDePrueba.DatosDePrueba;
import com.pruebas.clase4.modelo.Factura;

public class ServiciosFactura {

    private static ServiciosFactura instancia;
    private List<Factura> resultado = new ArrayList<Factura>();
    private List<Factura> facturas = new ArrayList<Factura>();
    private int minutosConsultados = 0;

    // Patron Singleton
    private ServiciosFactura() {
        // Constructor privado para evitar instanciación desde fuera de la clase
    }
    public static ServiciosFactura getInstancia() {
        if (instancia == null) {
            instancia = new ServiciosFactura();
        }
        return instancia;
    }


    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }


    public void cargarDatosIniciales() {
        //DatosDePrueba.cargarDatosIniciales();

    }

    public void mostrarConsultaPorConsola() {
        System.out.println("---------------Punto 4----------------------------");
        String resultante = " ";
        resultante = "Minutos consultados: " + minutosConsultados + System.lineSeparator();
        resultante = resultante + "Cantidad de facturas del resultado  " + resultado.size() + System.lineSeparator();

        /*
        for (Factura u : resultado) {
            int minutosAccedidos = u.tiempoTotalAcceso();
            resultante = resultante + "Factura: " + u.getNombre() + " " + u.getApellido() + " Tolal minutos accodidos: "
                    + minutosAccedidos + System.lineSeparator();
            resultante = resultante + ".........................." + System.lineSeparator();
            System.out.print(resultante);

            System.out.print("..............");

        }
        */

        System.out.println("--------------- FIN Punto 4----------------------------");

    }

}
