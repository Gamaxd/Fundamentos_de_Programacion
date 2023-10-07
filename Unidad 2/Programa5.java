/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa5;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int B, H, area;
        System.out.print("Dar el valor de base: ");
        B = sc.nextInt ();
        System.out.print("Dar el valor de altura: ");
        H = sc.nextInt ();
        area = (B * H) / 2;
        System.out.print("El area es: " + area);
        
        Scanner sc= new Scanner(System.in);
        int L1, L2, L3, perimetro;
        System.out.print("Dar valor al lado 1: ");
        L1 = sc.nextInt ();
        System.out.print("Dar valor al lado 2: ");
        L2 = sc.nextInt ();
        System.out.print("Dar valor al lado 3: ");
        L3 = sc.nextInt ();
        perimetro = (L1 + L2 + L3);
        System.out.print("El perimetro es: " + perimetro);
    }
}
