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
    private String DetallPorPerzonalizacion;
    private String EstatusProducto;

    public DetalleProducto() {
    }

    public DetalleProducto(double precio, String codigo, String DetallPorPerzonalizacion, String EstatusProducto) {
        this.precio = precio;
        this.codigo = codigo;
        this.DetallPorPerzonalizacion = DetallPorPerzonalizacion;
        this.EstatusProducto = EstatusProducto;
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

    public String getDetallPorPerzonalizacion() {
        return DetallPorPerzonalizacion;
    }

    public void setDetallPorPerzonalizacion(String DetallPorPerzonalizacion) {
        this.DetallPorPerzonalizacion = DetallPorPerzonalizacion;
    }

    public String getEstatusProducto() {
        return EstatusProducto;
    }

    public void setEstatusProducto(String EstatusProducto) {
        this.EstatusProducto = EstatusProducto;
    }
    
    
    
    
    
}
