package com.pruebas.clase4.controller;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pruebas.clase4.servicios.ServiciosStock;

@RestController
@RequestMapping("/stock")
public class ControladorStock {

    ServiciosStock serviciosStock = ServiciosStock.getInstancia();
    
    @GetMapping("/todos")
    public void todosLosStocks() {
        //serviciosUsuario.getInstancia().cargarDatosIniciales();
        //serviciosUsuario.getInstancia().cargarJuegoPrueba2(serviciosUsuario);
        //return serviciosStock.getInstancia().getStocks();
    }

    @GetMapping("/carga")
    public void cargarDatos(){
        //serviciosUsuario.getInstancia().cargarDatosIniciales();
    }


}
