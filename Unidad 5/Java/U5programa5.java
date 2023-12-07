/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5programa5;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U5programa5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra completa: ");
        String palabra = sc.nextLine();
        System.out.println(palabra + " tiene un total de: "+ palabra(palabra) + " letras");
    }
    public static int palabra(String x){
        int palabra = x.length();
        return palabra;
    }
}
