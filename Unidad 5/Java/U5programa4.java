/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5programa4;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U5programa4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num = sc.nextInt();
        System.out.println(num+" "+primo(num));
    }

    public static String primo(int x){  
        int c=0;
        String P;
        for(int i = x; i > 0; i--){
            if(x % i == 0){
                c++;
            }
        }
        if(c == 2){
            P = "El numero es primo";
        }else{
            P = "El numero no es primo";
        }
         return P.toString();
    }
   
}
