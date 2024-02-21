/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controldecelular;

import java.util.Scanner;

/**
 *
 * @author SALA PAFP 27
 */
public class ControldeCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String dueño;
        double precio;
        boolean estado;
        ControldeCelular celularb;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Marca del celular: ");
        marca = sc.nextLine(); //Leer un entero.
        sc.nextLine(); //Limpia el buffer.
        
        System.out.println("Nombre del cliente: ");
        dueño = sc.nextLine();
        
        System.out.println("Precio del celular: ");
        precio = sc.nextDouble();
        
        System.out.println("Estado del celular: ");
        estado = sc.nextBoolean();
        
        celularb = new ControldeCelular(marca, dueño, precio, estado);
        double funcion;
        System.out.println("Introduzca la marca del celular: ");
        marca = sc.nextLine();
        System.out.println("Nombre del dueño: ");
        dueño = sc.nextLine();
        System.out.println("Introduzca el precio del celular: ");
        precio = sc.nextDouble();
        
    }
}
        
        
