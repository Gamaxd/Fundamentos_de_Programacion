/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa7;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double m, pies;
        final double p = 3.28;
        System.out.print("Asigne valor a m: ");
        m = sc.nextInt ();
        pies = (m * p);
        System.out.print("El valor en pies es: " + pies);
    }
}
