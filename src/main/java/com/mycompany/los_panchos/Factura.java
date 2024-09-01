/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.los_panchos;
import java.util.*;
/**
 *
 * @author USUARIO
 */
public class Factura {
    private String Numero = "1";
    private Cliente cliente;
    private String Serie  = "1";
    private String Producto;
    private double total = 0;
    private String NitEmpresa = "1168780-2";
    
    //extraemos datos de la orden de produción 
public void CrearFactura (List <DetalleProducto> detalleProductos,List<Producto> prodcutosCatalogo, Cliente cliente){
      double total = 0.0; // Variable local para almacenar el total de la factura

    // Encabezado de la factura
    System.out.println("╔════════════════════════════════════╗");
    System.out.println("║           LOS PANCHOS S.A.         ║");
    System.out.println("╠════════════════════════════════════╣");
    System.out.println("║         NIT: " + this.getNitEmpresa() + "         ║");
    System.out.println("║        Serie: " + this.getSerie() + "               ║");
    System.out.println("║     No. Factura: " + this.getNumero() + "              ║");
    System.out.println("╚════════════════════════════════════╝");
    System.out.println("                Datos del Cliente                ");
    System.out.println("╔════════════════════════════════════╗");
    System.out.println("║  NIT:    " + cliente.getNitCliente() + "               ║");
    System.out.println("║  Nombre: " + cliente.getNombreCliente() + "            ║");
    System.out.println("╚════════════════════════════════════╝");
    System.out.println("         Detalle de los Productos        ");
    
    // Imprime el detalle de los productos
    for (DetalleProducto producto : detalleProductos) {
        System.out.println("╔════════════════════════════════════╗");

        try {
            int codigoProducto = Integer.parseInt(producto.getCodigo());

            if (codigoProducto >= 0 && codigoProducto < productosCatalogo.size()) {
                Producto productoSeleccionado = productosCatalogo.get(codigoProducto);
                System.out.println("║ Producto: " + productoSeleccionado.getNombreProducto() + "   ║");
            } else {
                System.out.println("║ Producto no encontrado en el catálogo. ║");
            }
        } catch (NumberFormatException e) {
            System.out.println("║ Código de producto inválido: " + producto.getCodigo() + " ║");
        }

        System.out.println("║ Detalle: " + producto.getDetallePersonalizacion() + "           ║");
        System.out.println("║ Precio: Q" + String.format("%.2f", producto.getPrecio()) + "                ║");
        System.out.println("╚════════════════════════════════════╝");

        total += producto.getPrecio(); // Suma el precio al total
    }

    this.setTotal(total); // Establece el total en el objeto actual
    System.out.println("╔════════════════════════════════════╗");
    System.out.println("║  El total es: Q" + String.format("%.2f", this.getTotal()) + "            ║");
    System.out.println("╚════════════════════════════════════╝");
}

    public Factura() {
    }

    public Factura(Cliente cliente, String Producto) {
        this.cliente = cliente;
        this.Producto = Producto;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNitEmpresa() {
        return NitEmpresa;
    }

    public void setNitEmpresa(String NitEmpresa) {
        this.NitEmpresa = NitEmpresa;
    }



}



