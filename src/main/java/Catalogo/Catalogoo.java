/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author USUARIO
 */

import com.mycompany.los_panchos.DetalleProducto;
import com.mycompany.los_panchos.Producto;

import java.util.*;
public class Catalogoo {
    
    public List<Producto> crearcatalogo (){
        List<Producto> productos = new ArrayList<>();
        Producto producto1 = new Producto();
        producto1.setCodigo("001");
        producto1.setEstado("Bodega");
        producto1.setNombreProducto("Camisa Veraniega");
        producto1.setPrecio(99.99);
        producto1.setTipoProducto("Importacion");
        productos.add(producto1);
        
        Producto producto2 = new Producto();
        producto2.setCodigo("002");
        producto2.setEstado("Bodega");
        producto2.setNombreProducto("Sombrilla tutiflor");
        producto2.setPrecio(105.90);
        producto2.setTipoProducto("Local");
        productos.add(producto2);

        
        Producto producto3 = new Producto();
        producto3.setCodigo("003");
        producto3.setEstado("Bodega");
        producto3.setNombreProducto("Gorra naik-promax");
        producto3.setPrecio(205.30);
        producto3.setTipoProducto("Importada");
        productos.add(producto3);
        
        Producto producto4 = new Producto();
        producto4.setCodigo("004");
        producto4.setEstado("Bodega");
        producto4.setNombreProducto("Sudadera abidaz");
        producto4.setPrecio(205.30);
        producto4.setTipoProducto("Local");
        productos.add(producto4);
         
        
         Producto producto5 = new Producto();
        producto5.setCodigo("005");
        producto5.setEstado("Bodega");
        producto5.setNombreProducto("Cinturon aquapark");
        producto5.setPrecio(75.25);
        producto5.setTipoProducto("Local");
        productos.add(producto4);
        
        return productos;
        
    }
            
            
    
}
