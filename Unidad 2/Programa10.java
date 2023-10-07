/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa10;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Programa10 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p, ap, area;
        System.out.print("Escriba el valor del perimetro: ");
        p = sc.nextInt ();
        System.out.print("Escriba el valor del apotema: ");
        ap = sc.nextInt ();
        area = (p * ap) / 2;
        System.out.print("El valor del area del hexagono es: " + area);
    }
}
