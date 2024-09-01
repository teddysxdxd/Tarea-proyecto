/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.los_panchos;

/**
 *
 * @author USUARIO
 */
public class Vendedor {
    private String nombreVendedor;
    private String telefono;
    private Orden_Produccion orden_Produccion;
    private Cliente cliente;

    public Vendedor() {
    }

    public Vendedor(String nombreVendedor, String telefono, Orden_Produccion orden_Produccion, Cliente cliente) {
        this.nombreVendedor = nombreVendedor;
        this.telefono = telefono;
        this.orden_Produccion = orden_Produccion;
        this.cliente = cliente;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Orden_Produccion getOrden_Produccion() {
        return orden_Produccion;
    }

    public void setOrden_Produccion(Orden_Produccion orden_Produccion) {
        this.orden_Produccion = orden_Produccion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
