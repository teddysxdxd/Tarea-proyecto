/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.los_panchos;

/**
 *
 * @author USUARIO
 */
public class Producto {
public String NombreProducto;
private String codigo;
private String estado;
private double precio;
private String proveedor;
private String tipoPoducto;

    public Producto() {
    }

    public Producto(String NombreProducto, String codigo, String estado, double precio, String proveedor, String tipoPoducto) {
        this.NombreProducto = NombreProducto;
        this.codigo = codigo;
        this.estado = estado;
        this.precio = precio;
        this.proveedor = proveedor;
        this.tipoPoducto = tipoPoducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipoPoducto() {
        return tipoPoducto;
    }

    public void setTipoPoducto(String tipoPoducto) {
        this.tipoPoducto = tipoPoducto;
    }
   


}
