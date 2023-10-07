/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa6;
import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Programa6 {

    public static void main(String[] args) {
        Scanner it = new Scanner(System.in); 
        double p1, p2, p3, subtotal, total, ivaT;
        final double iva = 0.16;
        System.out.println("Escribe el precio 1: ");
        p1 = it.nextDouble();
        System.out.println("Escribe el precio 2: ");
        p2 = it.nextDouble();
        System.out.println("Escribe el precio 3: ");
        p3 = it.nextDouble();
        total = p1 + p2 + p3;
        ivaT = total * iva;
        subtotal = total - ivaT;
        System.out.println("Total: " + total);
        System.out.println("iva: " + ivaT);
        System.out.println("subtotal: " + subtotal);
    }
    }
  
