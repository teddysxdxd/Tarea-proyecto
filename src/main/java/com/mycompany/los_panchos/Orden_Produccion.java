/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.los_panchos;

import java.util.ArrayList;
import java.util.List;
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
    Cliente cliente;
    String estado;
    List<DetalleProducto> detalleProducto;
    
    //agrega productos a la oreden de produccion 
    public List<DetalleProducto> agregarProducto (List<Producto> productosCatalogo){
        String seguir;
        //poner esto solo el metodo crearorden
        List <DetalleProducto> detalleProductos = new ArrayList<>();
//        DetalleProducto detalleProducto = new DetalleProducto();
        Scanner sp = new Scanner (System.in);
        int i = 1;
        do { 
            DetalleProducto detalleProducto = new DetalleProducto();
            System.out.println("_______________________________");
            System.out.println("Producto numero:"+i);
            System.out.println("ingrese el codigo del producto");
            detalleProducto.setCodigo(sp.nextLine());
            System.out.println("el producto es: "+productosCatalogo.get(Integer.parseInt(detalleProducto.getCodigo())).getNombreProducto());
            System.out.println("ingrese el detalle de la personalizacion del producto");
            System.out.println("en dado caso no exista una personalizacion ingrese NA");
            detalleProducto.setDetallePersonalizacion(sp.nextLine());
            if(!detalleProducto.getDetallePersonalizacion().equals("NA")){
                System.out.println("ingrese el precio del producto");
                detalleProducto.setPrecio(sp.nextDouble());
            }else{
                detalleProducto.setPrecio(productosCatalogo.get(Integer.parseInt(detalleProducto.getCodigo())).getPrecio());
            }
            detalleProducto.setEstadoProducto("enProducion");
            detalleProductos.add(detalleProducto);
            i++;
            System.out.println("desea agregar otro producto? si/no");
            seguir = sp.nextLine();
            seguir = sp.nextLine();
            
        }while (seguir.equals("si"));
        return detalleProductos;
    }
    
    
    // al crear la orden de produccion se genera automaticamente la factura para el cliente
    public  Orden_Produccion crearOrdenProduccion (Integer noOrden, List<Producto> productosCatalogo, Cliente cliente){
        Orden_Produccion ordenProduccion = new Orden_Produccion();
        List <DetalleProducto> detalleProductos = new ArrayList<>();
        detalleProductos = this.agregarProducto(productosCatalogo);
        ordenProduccion.setNoOrden(noOrden);
        ordenProduccion.setDetalleProducto(detalleProductos);
        ordenProduccion.setCliente(cliente);
        ordenProduccion.setEstado("enProduccion");
       return ordenProduccion;
    }
    
    public void terminarOrdenes ( List<Orden_Produccion> ordenesProduccion,List<Producto> productosCatalogo){
         Scanner sp = new Scanner (System.in);
        int i = 1;
        int numero;
        System.out.println("Debe de ingresar el numero");
        for(Orden_Produccion ordenProduccion: ordenesProduccion){
            System.out.println(ordenProduccion.getCliente().getNombreCliente()+"      "+i+"   "+ordenProduccion.getEstado());
            i++;
        }
        numero = sp.nextInt();
        ordenesProduccion.get(numero-1).setEstado("terminado");
         Factura factura = new Factura();
        factura.CrearFactura(ordenesProduccion.get(numero-1).getDetalleProducto(),
                productosCatalogo, ordenesProduccion.get(numero-1).getCliente());
    } 

    public Orden_Produccion() {
    }

    public Integer getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(Integer noOrden) {
        this.noOrden = noOrden;
    }

    public List<DetalleProducto> getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(List<DetalleProducto> detalleProducto) {
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