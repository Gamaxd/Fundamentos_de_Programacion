/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa12;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3programa12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, total, num;
        System.out.println("Escribe el total de los numeros a procesar: ");
        total= sc.nextInt();
        for(c=1; c<=total; c++){
            System.out.println("Escribe los numeros: ");
            num= sc.nextInt();
            if (num%2 == 0)
                System.out.println("Par");
            else 
                System.out.println("Impar");
        } 
    }
}
