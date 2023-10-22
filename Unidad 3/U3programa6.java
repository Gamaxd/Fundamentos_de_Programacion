/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa6;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
int N;
System.out.println("Ingrese el un número");
N = sc.nextInt();

if (N % 2 == 0)
    System.out.println("El número es par");
else
    System.out.println("El número es impar");
    }
}
