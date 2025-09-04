package com.pruebas.clase4.controller;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.clase4.modelo.Cliente;
import com.pruebas.clase4.servicios.ServiciosCliente;
import com.pruebas.clase4.servicios.ServiciosStock;

@RestController
@RequestMapping("/cliente")
public class ControladorCliente {

    ServiciosCliente serviciosCliente = ServiciosCliente.getInstancia(ServiciosStock.getInstancia());

    @GetMapping("/todos")
    public List<Cliente> todosLosClientes() {
        //serviciosUsuario.getInstancia().cargarDatosIniciales();
        //serviciosUsuario.getInstancia().cargarJuegoPrueba2(serviciosUsuario);
        return serviciosCliente.getInstancia(ServiciosStock.getInstancia()).getClientes();
    }

    @GetMapping("/cargaRandom")
    public void cargarDatos(){
        serviciosCliente.cargarDatosIniciales();
    }
    @GetMapping("/carga")
    public void cargarDatosEstaticos(){
        serviciosCliente.cargarDatosEstaticos();
    }


}
