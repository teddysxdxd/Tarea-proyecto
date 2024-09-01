/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.los_panchos;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Cliente {
    private String NombreCliente;
    private int Telefono;
    private String NitCliente;
    private String DireccionFiscal;

    public Cliente() {
    }

    public Cliente Creacioncliente (){
    
    Scanner entrada = new Scanner (System.in);
    Cliente cliente = new Cliente ();
        System.out.println("Ingrese el nombre del cliente");
        cliente.setNombreCliente(entrada.nextLine());
        
        System.out.println("Ingrese el nit del cliente" +cliente.getNombreCliente());
        cliente.setNitCliente(entrada.nextLine());
        System.out.println("Ingrese la direccion del cliente: " +cliente.getNombreCliente());
        cliente.setDireccionFiscal(entrada.nextLine());
        return cliente;
    }

    public Cliente(String NombreCliente, int Telefono, String NitCliente, String DireccionFiscal) {
        this.NombreCliente = NombreCliente;
        this.Telefono = Telefono;
        this.NitCliente = NitCliente;
        this.DireccionFiscal = DireccionFiscal;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNitCliente() {
        return NitCliente;
    }

    public void setNitCliente(String NitCliente) {
        this.NitCliente = NitCliente;
    }

    public String getDireccionFiscal() {
        return DireccionFiscal;
    }

    public void setDireccionFiscal(String DireccionFiscal) {
        this.DireccionFiscal = DireccionFiscal;
    }
   
    
    
    
    
}
