/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa9;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Programa9 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int N1, N2, suma, resta, multiplicacion, division;
        System.out.print("Escriba el primer numero: ");
        N1 = sc.nextInt ();
        System.out.print("Escriba el segundo numero: ");
        N2 = sc.nextInt ();
        
        suma = (N1 + N2);
        System.out.println("La suma es: " + suma);
        
        resta = (N1 - N2);
        System.out.println("La resta es: " + resta);
        
        multiplicacion = (N1 * N2);
        System.out.println("La multiplicacion es: " + multiplicacion);
        
        division = (N1 / N2);
        System.out.println("La division es: " + division);
    }
}
