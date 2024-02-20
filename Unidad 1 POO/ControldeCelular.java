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
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Numero de cuenta?: ");
        precio = entrada.nextInt(); //Leer un entero.
        entrada.nextLine(); //Limpia el buffer.
        
        System.out.println("Nombre del cliente?: ");
        dueño = entrada.nextLine();
        
        System.out.println("Saldo inicial?: ");
        precio = entrada.nextDouble();
        
        System.out.println("CVV?: ");
        estado = entrada.nextBoolean();
        
        celularb = new ControldeCelular(marca, dueño, precio, estado);
        double funcion;
        System.out.println("Que cantidad desea retirar?: ");
        funcion = entrada.nextDouble();
        celularb.salida(funcion);
        System.out.println("El saldo actual es: " + celularb.consultarSaldo());
        System.out.println("Que cantidad desea depositar?: ");
        funcion = entrada.nextDouble();
        funcion.retirar(funcion);
        System.out.println("El saldo actual es: " + celularb.consultarSaldo());
    }
}
    
}
