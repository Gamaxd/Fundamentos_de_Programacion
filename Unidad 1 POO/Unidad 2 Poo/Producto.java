/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.producto;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author SALA PAFP 31
 */
public class Producto {
    public static void main(String[] args) {

   Date fechaCaducidad;
   float lote;
   int tipoProducto;
   String nomCliente;
   Scanner sc = new Scanner(System.in);
   
    System.out.println("Tipo de producto?: ");
    tipoProducto = sc.nextInt(); //Leer un entero.
    sc.nextLine(); //Limpia el buffer.
    System.out.println("Nombre del cliente?: ");
    nomCliente = sc.nextLine();
    System.out.println("Numero de lote: ");
    lote = sc.nextFloat();
    
    int caso = sc.nextInt();
    switch(caso){
        case 1:
            System.out.println("Producto Fresco seleccionado");
            break;
        case 2:
            break;
        case 3:
            break;
            
    }
    }

}