package com.example.controlaccesos.servicios;

import java.util.ArrayList;
import java.util.List;

import com.example.controlaccesos.claseDePrueba.DatosDePrueba;
import com.example.controlaccesos.modelo.Usuario;

public class ServiciosUsuario {

    
    private static ServiciosUsuario instancia;
    private List<Usuario> resultado = new ArrayList<Usuario>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private int minutosConsultados=0;
    


    private ServiciosUsuario() {
        // Constructor privado para evitar instanciación desde fuera de la clase
    }

    public static ServiciosUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ServiciosUsuario();
        }
        return instancia;
    }

    

    public List<Usuario> usuariosConAccesoMayorA(int min){

        this.minutosConsultados=min;
               
        for(Usuario u:usuarios){
           
            if(u.isHabilitado() && u.tiempoTotalAcceso()>min){
                resultado.add(u);
            }
        }

        
        return resultado;

    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    

    public void cargarJuegoPrueba2(ServiciosUsuario servicio){
    DatosDePrueba.cargarJuegoPrueba2(ServiciosUsuario.getInstancia());

    }


    public void cargarDatosIniciales() {
    DatosDePrueba.cargarDatosIniciales();

}

public void mostrarConsultaPorConsola(){
    System.out.println("---------------Punto 4----------------------------");
        String resultante=" ";
        resultante= "Minutos consultados: "+ minutosConsultados+System.lineSeparator();
        resultante=resultante+"Cantidad de usuarios del resultado  "+resultado.size()+System.lineSeparator();

       for(Usuario u:resultado){
        int minutosAccedidos=u.tiempoTotalAcceso();
        resultante=resultante+"Usuario: "+ u.getNombre()+" "+ u.getApellido()+" Tolal minutos accodidos: "+minutosAccedidos +System.lineSeparator();
        resultante= resultante+".........................."+System.lineSeparator();
        System.out.print(resultante);

        System.out.print("..............");
        
        
        }

        System.out.println("--------------- FIN Punto 4----------------------------");




    }

}
