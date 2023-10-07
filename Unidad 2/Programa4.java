/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa4;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Y, A, suma;
        System.out.print("Dar valor a Y: ");
        Y = sc.nextInt ();
        System.out.print("Dar valor a A: ");
        A = sc.nextInt ();
        suma = (Y + A + 3);
        System.out.println("El resultado de la suma es: " + suma);
    }
}
