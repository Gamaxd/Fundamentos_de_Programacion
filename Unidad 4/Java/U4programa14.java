/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4programa14;

/**
 *
 * @author DELL
 */
public class U4programa14 {

    public static void main(String[] args) {
        int[] matriz = new int [3];
        matriz[0] = 3;
        matriz[1] = 5;
        matriz[2] = 2;
        
        System.out.println("Contenido del arreglo");
        for (int i=0; i<3; i++){
            System.out.println(matriz[i]);
           
        }
        int suma;
        suma = matriz[0] + matriz[1] + matriz[2];
        System.out.println("La suma de los arreglos en la matriz es: " + suma);
    }
}
