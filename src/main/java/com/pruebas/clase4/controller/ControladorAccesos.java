package com.pruebas.clase4.controller;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.clase4.modelo.Cliente;
import com.pruebas.clase4.servicios.ServiciosUsuario;

@RestController
@RequestMapping("/partePathController")
public class ControladorAccesos {

    ServiciosUsuario serviciosUsuario = ServiciosUsuario.getInstancia();
    
    @GetMapping("/todos")
    public List<Cliente> todosLosUsuarios() {
        //serviciosUsuario.getInstancia().cargarDatosIniciales();
        //serviciosUsuario.getInstancia().cargarJuegoPrueba2(serviciosUsuario);
        return serviciosUsuario.getInstancia().getUsuarios();
    }

    @GetMapping("/carga")
    public void cargarDatos(){
        serviciosUsuario.getInstancia().cargarDatosIniciales();
    }

    @GetMapping("/lista")
    public List<Cliente> usuariosHabilitadosConAccesoMayorA(@RequestParam int minutos) {
        return null; // Implementación pendiente
    }

}
