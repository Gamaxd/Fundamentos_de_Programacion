/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5programa7;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U5programa7 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el precio un producto: ");
        double p = sc.nextDouble();
        System.out.print(" Numero de Cantidad de productos: ");
        int n= sc.nextInt();
        System.out.println("El subtotal del producto es: "+ sub(p, n) + " $");
        System.out.println("El IVA del producto es: " + iva(p) + " $");
        System.out.println("El total a pagar es: " + total(p,n) + " $");
    }
    //IVA
    public static double iva(double a){
        double Iva = 0.16;
        double r = a * Iva;
        return r;
    }
    //SUBTOTAL
    public static double sub(double a, int b){
        double r = a * b;
        return r;
    }
    // TOTAL
    public static double total(double b, double c){
        double IVA = 0.16;
        double r= (b * c)+((b * c) * IVA);
        return r;
    }
    
}
