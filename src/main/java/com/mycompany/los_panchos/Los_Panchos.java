/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.los_panchos;

/**
 *
 * @author USUARIO
 */
import Catalogo.Catalogoo;
import java.util.*;
public class Los_Panchos {

      public static void main(String[] args) {
  Scanner sp = new Scanner(System.in);
    Integer menu = 0;
    String salir = "no";
    int i = 100;
    int nombre;

    Catalogoo catalogo = new Catalogoo();
    List<Producto> productosCatalogo = catalogo.crearcatalogo();
    Cliente cliente = new Cliente();
    List<Cliente> listaClientes = new ArrayList<>();
    Orden_Produccion ordenProduccion = new Orden_Produccion();
    List<Orden_Produccion> ordenesProduccion = new ArrayList<>();
   
    do {
        System.out.println("____________________________________________");
        System.out.println("|                    MENU                  |");
        System.out.println("| Crear cliente                           1 |");
        System.out.println("| Crear orden de producción               2 |");
        System.out.println("| Terminar orden de producción            3 |");
        System.out.println("| Listar clientes                         4 |");
        System.out.println("| Salir                                   5 |");
        System.out.println("|__________________________________________|");
         menu = sp.nextInt();
            switch (menu) {
                case 1:
                    listaClientes.add(cliente.Creacioncliente());
                    break;
                case 2:
                    System.out.println("seleccione el cliente para la orden de produccion");
                    int j = 1;
                    for (Cliente cliente1 : listaClientes) {
                        
                        System.out.println(cliente1.getNombreCliente()+"         "+j);
                        j++;
                    }//debe de ingresar el numero que aparece a la par del nombre
                    nombre = sp.nextInt();
                    ordenesProduccion.add(ordenProduccion.crearOrdenProduccion(i, productosCatalogo, listaClientes.get(nombre-1)));
                    i++;
                    break;
                case 3:
                    ordenProduccion.terminarOrdenes(ordenesProduccion, productosCatalogo);
                    System.out.println("hola");
                    break;

                case 5:
                    salir = "si";
                    break;
            }
        } while (salir.equals("no"));

    }
}