/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa3;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int C1, C2, C3, C4, C5, C6, prom;
        System.out.print("Escribe la primer calificacion: ");
        C1 = sc.nextInt ();
        System.out.print("Escribe la segunda calificacion: ");
        C2 = sc.nextInt ();
        System.out.print("Escribe la tercer calificacion: ");
        C3 = sc.nextInt ();
        System.out.print("Escribe la cuarta calificacion: ");
        C4 = sc.nextInt ();
        System.out.print("Escribe la quinta calificacion: ");
        C5 = sc.nextInt ();
        System.out.print("Escribe la sexta calificacion: ");
        C6 = sc.nextInt ();
        prom = (C1 + C2 + C3 + C4 + C5 + C6) / 6;
        System.out.println("El resultado es: " + prom);
    
    }
}
