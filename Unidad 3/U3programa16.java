/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa16;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3programa16 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int i=1, h, p, s;
        while (i<=20)
        {
            System.out.println("Ingrese la cantidad de horas trabajadas: ");
            h= sc.nextInt();
            System.out.println("Ingrese el pago de las horas: ");
            p= sc.nextInt();
            s= h * p;        
            System.out.println("Su sueldo semanal es: " + s);
            i++;
        }
    }
}
