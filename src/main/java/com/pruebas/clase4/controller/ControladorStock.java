package com.pruebas.clase4.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.clase4.modelo.Producto;
import com.pruebas.clase4.modelo.Proveedor;
import com.pruebas.clase4.servicios.ServiciosStock;

@RestController
@RequestMapping("/stock")
public class ControladorStock {

    ServiciosStock serviciosStock = ServiciosStock.getInstancia();
    
    @GetMapping("/todosProductos")
    public ArrayList<Producto> todosLosProductos() {
        //serviciosUsuario.getInstancia().cargarDatosIniciales();
        //serviciosUsuario.getInstancia().cargarJuegoPrueba2(serviciosUsuario);
        return serviciosStock.getInstancia().getStocks();
    }
    @GetMapping("/todosProveedores")
    public ArrayList<Proveedor> todosLosProveedores() {
        return serviciosStock.getInstancia().getProveedores();
    }

    @GetMapping("/carga")
    public void cargarDatos(){
        //serviciosUsuario.getInstancia().cargarDatosIniciales();
    }


}
