/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa6;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Programa6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c, f;
        System.out.print("Da valor a grados centigrados: ");
        c = sc.nextInt ();
        f = (c * 9/5) + 32;
        System.out.print("Conversion a grados Farenheit: " + f);
        
    }
}
