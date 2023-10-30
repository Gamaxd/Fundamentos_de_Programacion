/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa13;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, num;
        for (c=1; c<=100; c++)
        {
        System.out.println("Ingrese la cantidad de valores totales: ");
        num = sc.nextInt();
       
        if (num>0)
        {
            System.out.println("Es positivo");
        }else
        {
            System.out.println("Es negativo");
        }
    }
    }
}
