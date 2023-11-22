/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4programa1;

/**
 *
 * @author DELL
 */
public class U4programa1 {

    public static void main(String[] args) {
        int[] edad_1 = { 17, 19, 18, 18, 17 };

            /*Console.WriteLine(edades[0]);
            Console.WriteLine(edades[1]);
            Console.WriteLine(edades[2]);
            Console.WriteLine(edades[3]);
            Console.WriteLine(edades[4]); */

            for (int i = 0; i < 5; i++)
            {
                System.out.println("Arreglo1 " + i + " es: " + edad_1[i]);
                /* Console.WriteLine("Arreglo2 " + i + " es: " + edades2[i]);
                Console.WriteLine(); */
                if (edad_1[i] >= 18)
                {
                    System.out.println("Eres mayor de edad!!!!");
                    System.out.println();
                }
                else
                {
                    System.out.println("Eres menor de edad!!!!");
                    System.out.println();
                }


            }
        }
    }
