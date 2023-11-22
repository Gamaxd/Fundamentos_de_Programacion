/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4programa3;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U4programa3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F = 0, K = 0;
         int TemperaturaTotal;

            System.out.println("Ingrese la cantidad de temperaturas a procesar: ");
            TemperaturaTotal = sc.nextInt();

            double[] temp = new double[TemperaturaTotal];
            for (int i = 0; i < TemperaturaTotal; i++)
            {
                System.out.println("Ingrese la temperatura en grados celsius: ");
                temp[i] = sc.nextInt();

                F = temp[i] * (9 / 5) + 32;
                System.out.println("Su temperatura en °F es: " + F);

                K = temp[i] + 273.15;
                System.out.println("Su temperatura en °K es: " + K);
            }

        }
    }
