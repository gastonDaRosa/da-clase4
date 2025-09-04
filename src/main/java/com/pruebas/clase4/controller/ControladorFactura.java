package com.pruebas.clase4.controller;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.clase4.modelo.Factura;
import com.pruebas.clase4.servicios.ServiciosFactura;

@RestController
@RequestMapping("/factura")
public class ControladorFactura {

    ServiciosFactura serviciosFactura = ServiciosFactura.getInstancia();

    @GetMapping("/todos")
    public List<Factura> todosLosFacturas() {
        //serviciosUsuario.getInstancia().cargarDatosIniciales();
        //serviciosUsuario.getInstancia().cargarJuegoPrueba2(serviciosUsuario);
        return serviciosFactura.getInstancia().getFacturas();
    }

    @GetMapping("/carga")
    public void cargarDatos(){
        //serviciosUsuario.getInstancia().cargarDatosIniciales();
    }


}
