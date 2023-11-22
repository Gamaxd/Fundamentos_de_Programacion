/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4programa2;

/**
 *
 * @author DELL
 */
public class U4programa2 {

    public static void main(String[] args) {
        int[] cal = {90, 100, 80, 70, 100, 80, 40, 30, 69, 100};
            double promedio = 0, suma = 0;

            for (int i = 0; i < 10; i++)
            {
                suma = suma + cal[i];
                promedio = suma / 10;
            }
            System.out.println("El promedio de tus califiaciones es: " + promedio);
        }
    }