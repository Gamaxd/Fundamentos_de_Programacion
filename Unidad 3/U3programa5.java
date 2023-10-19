/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa5;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3programa5 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    double p1,p2,p3,total ;
    System.out.print ("escribe precio de 1: ");
    p1=sc.nextDouble();
    System.out.print ("escribe precio de 2: ");
    p2=sc.nextDouble();
    System.out.print ("escribe precio de 3: ");
    p3=sc.nextDouble();
    total= p1+p2+p3;
    if(total>=1500){
    total=total - (total*0.30);
    System.out.println("tiene 30 porciento de descuento: " + total);
    }else if(total<1500 && total>=1000){
        total = total - (total*0.20);
    System.out.println("tiene 20 porciento de descuento: " + total);
    }
    else if(total<1000 && total>=700){
    total = total - (total*0.10);
    System.out.println("tiene 10 porciento de descuento: " + total);
    }
    }
}

    
    


