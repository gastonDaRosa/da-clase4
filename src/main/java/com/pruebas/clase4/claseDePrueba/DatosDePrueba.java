package com.pruebas.clase4.claseDePrueba;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


import com.pruebas.clase4.modelo.Cliente;
import com.pruebas.clase4.modelo.Factura;
import com.pruebas.clase4.modelo.LineaFactura;
import com.pruebas.clase4.modelo.Producto;
import com.pruebas.clase4.modelo.Proveedor;
import com.pruebas.clase4.servicios.ServiciosCliente;




public class DatosDePrueba {

     
    public static ArrayList<Cliente> cargarDatosPruebaEstaticos() {

        // === Proveedores ===
        Proveedor prov1 = new Proveedor("TechWorld", new ArrayList<>());
        Proveedor prov2 = new Proveedor("SuperAlimentos", new ArrayList<>());

        // === Productos ===
        Producto laptop = new Producto("Laptop", 1200, 10, prov1);
        Producto mouse = new Producto("Mouse", 20, 100, prov1); // producto más barato
        Producto arroz = new Producto("Arroz 1kg", 50, 200, prov2);

        prov1.agregarProducto(laptop);
        prov1.agregarProducto(mouse);
        prov2.agregarProducto(arroz);

        // === Clientes ===
        Cliente juan = new Cliente("jperez", "Juan", "Pérez");
        Cliente maria = new Cliente("mgarcia", "María", "García");
        Cliente carlos = new Cliente("crodriguez", "Carlos", "Rodríguez");

        // === Facturas ===
        // Juan compra Laptop y Arroz (no compra el Mouse)
        Factura facturaJuan = new Factura(juan);
        facturaJuan.getLineas().add(new LineaFactura(1, laptop));
        facturaJuan.getLineas().add(new LineaFactura(2, arroz));
        juan.agregarFactura(facturaJuan);

        // María compra Mouse (sí compra el producto más barato)
        Factura facturaMaria = new Factura(maria);
        facturaMaria.getLineas().add(new LineaFactura(3, mouse));
        maria.agregarFactura(facturaMaria);

        // Carlos compra solo Arroz (no compra el Mouse)
        Factura facturaCarlos = new Factura(carlos);
        facturaCarlos.getLineas().add(new LineaFactura(5, arroz));
        carlos.agregarFactura(facturaCarlos);

        // === Retornar clientes en lista ===
        return new ArrayList<>(Arrays.asList(juan, maria, carlos));
    }

    // Para probar estasticos
    public static void cargarDatosEstaticosVoid() {
        ArrayList<Cliente> clientes = cargarDatosPruebaEstaticos();

        System.out.println("=== JUEGO DE PRUEBA ESTÁTICO ===");
        for (Cliente c : clientes) {
            System.out.println(c);
            for (Factura f : c.getFacturas()) {
                System.out.println("  Factura:");
                for (LineaFactura l : f.getLineas()) {
                    System.out.println("    " + l);
                }
            }
        }
    }

    public static void cargarDatosIniciales() {
		Random random = new Random();

        // === 1. Proveedores ===
        Proveedor prov1 = new Proveedor("TechWorld", new ArrayList<>());
        Proveedor prov2 = new Proveedor("SuperAlimentos", new ArrayList<>());
        Proveedor prov3 = new Proveedor("HogarPlus", new ArrayList<>());

        ArrayList<Proveedor> proveedores = new ArrayList<>(Arrays.asList(prov1, prov2, prov3));

        // === 2. Productos ===
        Producto[] productos = {
            new Producto("Laptop", 1200, 50, prov1),
            new Producto("Mouse Gamer", 40, 200, prov1),
            new Producto("Teclado Mecánico", 100, 150, prov1),
            new Producto("Arroz 1kg", 2, 500, prov2),
            new Producto("Aceite de oliva", 8, 300, prov2),
            new Producto("Leche en polvo", 5, 400, prov2),
            new Producto("Sillón", 400, 30, prov3),
            new Producto("Mesa comedor", 250, 20, prov3),
            new Producto("Silla de oficina", 150, 40, prov3)
        };

        // Agregar productos a sus proveedores
        for (Producto p : productos) {
            p.agregarAProveedor();
        }

        // === 3. Clientes ===
        String[][] datosClientes = {
            {"jperez", "Juan", "Pérez"},
            {"mgarcia", "María", "García"},
            {"crodriguez", "Carlos", "Rodríguez"},
            {"lfernandez", "Laura", "Fernández"},
            {"dmartinez", "Diego", "Martínez"}
        };

        ArrayList<Cliente> clientes = new ArrayList<>();

        for (String[] datos : datosClientes) {
            Cliente cliente = new Cliente(datos[0], datos[1], datos[2]);

            // === 4. Facturas por cliente (1–3 facturas) ===
            int numFacturas = 1 + random.nextInt(3);

            for (int i = 0; i < numFacturas; i++) {
                Factura factura = new Factura(cliente);

                // === 5. Líneas por factura (1–5 líneas) ===
                int numLineas = 1 + random.nextInt(5);

                for (int j = 0; j < numLineas; j++) {
                    Producto prod = productos[random.nextInt(productos.length)];
                    int cantidad = 1 + random.nextInt(5);
                    LineaFactura linea = new LineaFactura(cantidad, prod);
                    factura.getLineas().add(linea);
                }

                cliente.agregarFactura(factura);
            }

            clientes.add(cliente);
        }

        // === Mostrar la información generada ===
        System.out.println("=== DATOS DE PRUEBA CARGADOS ===");
        for (Cliente c : clientes) {
            System.out.println("\nCliente: " + c.getNombre() + " " + c.getApellido() +
                               " (" + c.getUserName() + ")");
            System.out.println("Facturas: " + c.getFacturas().size());

            for (int i = 0; i < c.getFacturas().size(); i++) {
                Factura f = c.getFacturas().get(i);
                System.out.println("  Factura " + (i + 1) + ":");

                for (LineaFactura linea : f.getLineas()) {
                    Producto p = linea.getProudct();
                    System.out.println("    Producto: " + p.getNombre() +
                                       " | Cantidad: " + linea.getCantidad() +
                                       " | Precio: " + p.getPrecio() +
                                       " | Subtotal: " + (linea.getCantidad() * p.getPrecio()));
                }
            }
        }
        System.out.println("================================");
	}

}
