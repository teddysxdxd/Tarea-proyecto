/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.los_panchos;

/**
 *
 * @author USUARIO
 */
public class DetalleProducto {
    private double precio;
    private String codigo;
    private String detallePersonalizacion;
    private String estadoProducto;

    public DetalleProducto() {
    }

    public DetalleProducto(double precio, String codigo, String detallePersonalizacion, String estadoProducto) {
        this.precio = precio;
        this.codigo = codigo;
        this.detallePersonalizacion = detallePersonalizacion;
        this.estadoProducto = estadoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDetallePersonalizacion() {
        return detallePersonalizacion;
    }

    public void setDetallePersonalizacion(String detallePersonalizacion) {
        this.detallePersonalizacion = detallePersonalizacion;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    
    
    
}
