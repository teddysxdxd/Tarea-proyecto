/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.los_panchos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que maneja las órdenes de producción.
 * Utiliza ArrayList para gestionar dinámicamente los productos en la orden.
 * 
 * @autor USUARIO
 */
import Catalogo.Catalogoo;

public class Orden_Produccion {
    private Integer noOrden;
    private Cliente cliente;
    private String estado;
    private ArrayList<DetalleProducto> detalleProducto;

    // Constructor
    public Orden_Produccion() {
        this.detalleProducto = new ArrayList<>();
    }

    /**
     * Agrega productos a la orden de producción utilizando un ArrayList.
     * 
     * @param productosCatalogo Array de productos disponibles en el catálogo.
     * @return ArrayList de DetalleProducto agregados a la orden.
     */
    public ArrayList<DetalleProducto> agregarProducto(Producto[] productosCatalogo) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DetalleProducto> productos = new ArrayList<>();

        while (true) {
            DetalleProducto detalle = new DetalleProducto();
            System.out.println("_______________________________");
            System.out.println("Producto número: " + (productos.size() + 1));

            System.out.print("Ingrese el código del producto: ");
            detalle.setCodigo(scanner.nextLine());

            // Validar el código del producto
            int codigo;
            try {
                codigo = Integer.parseInt(detalle.getCodigo());
                if (codigo < 0 || codigo >= productosCatalogo.length) {
                    System.out.println("Código de producto inválido. Intente de nuevo.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("El código debe ser un número. Intente de nuevo.");
                continue;
            }

            Producto productoSeleccionado = productosCatalogo[codigo];
            System.out.println("El producto es: " + productoSeleccionado.getNombreProducto());

            System.out.print("Ingrese el detalle de la personalización (o NA si no aplica): ");
            detalle.setDetallePersonalizacion(scanner.nextLine());

            if (!detalle.getDetallePersonalizacion().equals("N/A")) {
                System.out.print("Ingrese el precio del producto: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Por favor, ingrese un número válido para el precio.");
                    scanner.next(); // Consumir la entrada inválida
                }
                detalle.setPrecio(scanner.nextDouble());
                scanner.nextLine(); // Consumir la línea pendiente
            } else {
                detalle.setPrecio(productoSeleccionado.getPrecio());
            }

            detalle.setEstadoProducto("enProduccion");
            productos.add(detalle);

            System.out.print("¿Desea agregar otro producto? (si/no): ");
            if (!scanner.nextLine().equalsIgnoreCase("si")) {
                break;
            }
        }

        return productos;
    }

    /**
     * Crea una orden de producción y asigna los detalles de los productos.
     * 
     * @param noOrden Número de la orden.
     * @param productosCatalogo Array de productos disponibles en el catálogo.
     * @param cliente Cliente asociado a la orden.
     * @return Objeto Orden_Produccion creado.
     */
    public Orden_Produccion crearOrdenProduccion(Integer noOrden, Producto[] productosCatalogo, Cliente cliente) {
        Orden_Produccion orden = new Orden_Produccion();
        orden.setNoOrden(noOrden);
        orden.setCliente(cliente);
        orden.setDetalleProducto(agregarProducto(productosCatalogo));
        orden.setEstado("enProduccion");
        return orden;
    }

    /**
     * Termina una orden de producción y genera la factura correspondiente.
     * 
     * @param ordenes Lista de órdenes de producción.
     * @param productosCatalogo Array de productos disponibles en el catálogo.
     */
    public void terminarOrdenes(ArrayList<Orden_Produccion> ordenes, Producto[] productosCatalogo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el número de la orden a terminar:");

        for (int i = 0; i < ordenes.size(); i++) {
            Orden_Produccion orden = ordenes.get(i);
            if (orden != null) {
                System.out.println((i + 1) + ". " + orden.getCliente().getNombreCliente() + " - " + orden.getEstado());
            }
        }

        int seleccion = -1;
        while (true) {
            System.out.print("Ingrese el número de la orden: ");
            if (scanner.hasNextInt()) {
                seleccion = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea pendiente
                if (seleccion > 0 && seleccion <= ordenes.size()) {
                    break;
                } else {
                    System.out.println("Selección inválida. Intente de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Consumir la entrada inválida
            }
        }

        Orden_Produccion ordenSeleccionada = ordenes.get(seleccion - 1);
        ordenSeleccionada.setEstado("terminado");

        Factura factura = new Factura();
        // Convertimos el ArrayList a array si CrearFactura lo requiere
        factura.CrearFactura(
            ordenSeleccionada.getDetalleProducto().toArray(new DetalleProducto[0]),
            productosCatalogo,
            ordenSeleccionada.getCliente()
        );
    }

    // Getters y setters
    public Integer getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(Integer noOrden) {
        this.noOrden = noOrden;
    }

    public ArrayList<DetalleProducto> getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(ArrayList<DetalleProducto> detalleProducto) {
        this.detalleProducto = detalleProducto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}