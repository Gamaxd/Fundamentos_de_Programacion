/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4programa16;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U4programa16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, f;
        System.out.println("Ingrese la cantidad de filas: ");
        f = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        c = sc.nextInt();
        
        String[][]matrix = new String[f][c];
        for(int i = 0; i < f; i++){
            for(int j = 0; j < f; j++){
                System.out.println("Ingrese el nombre: ");
                matrix[i][j] = sc.next();
            }
        }
       for(int i = f - 1; i >= 0; i--){
            for(int j = c - 1; j >= 0; j--){ 
                System.out.println("Alrevez: " + matrix[i][j]);
    }
}
    }
}
