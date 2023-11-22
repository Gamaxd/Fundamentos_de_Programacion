/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4programa10;

/**
 *
 * @author DELL
 */
public class U4programa10 {

    public static void main(String[] args) {
        String[] paises = { "China", "España", "México", "Portugal", "Estados Unidos", "Suecia" };

        double longitudPromedio = CalcularLongitudPromedio(paises);
        System.out.println("Longitud Promedio de las Palabras: " + longitudPromedio);
    }

    static double CalcularLongitudPromedio(String[] arreglo) {
        int totalCaracteres = 0;

        for (String palabra : arreglo) {
            totalCaracteres += palabra.length();
        }

        return (double)totalCaracteres / arreglo.length;
    }
}
