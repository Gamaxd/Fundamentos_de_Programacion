/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4programa8_1;

/**
 *
 * @author DELL
 */
public class U4programa8_1 {

    public static void main(String[] args) {
        int[] numeros = { 1, 12, 23, 14, 5, 66, 27, 18, 99, 10 };
        System.out.println("Números Pares:");
        for (int num : numeros) {
            if (EsPar(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nNúmeros Impares:");
        for (int num : numeros) {
            if (!EsPar(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean EsPar(int numero) {
        return numero % 2 == 0;
    }
}
