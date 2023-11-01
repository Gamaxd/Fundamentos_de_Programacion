/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa25;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operador;
        double num1, num2, resultado;
        
        do{
            System.out.println("Ingresa el operador (+, -, *, /) o presione 'z' para salir");
            operador = sc.next().charAt(0);
            
            if (operador == 'z'){
                break;
            }
            System.out.println("Ingrese 2 numeros: ");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            
            switch (operador){
                case '+':
                resultado = num1 + num2;
                break;
                case '-':
                resultado = num1 - num2;
                break;
                case '*':
                resultado = num1 * num2;
                break;
                case '/':
                resultado = num1 / num2;
                break;
                default:
                    System.out.println("Operador invalido!!!");
                    continue;
            }
            System.out.println(num1 + " " + operador + " " + num2 + " = " + resultado);    
        }while (true);
    }
}
