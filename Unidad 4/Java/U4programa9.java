/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u4programa9;

/**
 *
 * @author DELL
 */
public class U4programa9 {

    public static void main(String[] args) {
        String[] nombres = { "Ricardo", "Emiliano", "Darien" };
        String[] apellidos = { "Carballo", "Celaya", "Zavala" };

        String[] nombresCompletos = ConcatenarNombresApellidos(nombres, apellidos);

        System.out.println("Nombres Completos:");
        for (String nombreCompleto : nombresCompletos) {
            System.out.println(nombreCompleto);
        }
    }

    static String[] ConcatenarNombresApellidos(String[] nombres, String[] apellidos) {
        if (nombres.length != apellidos.length) {
            System.out.println("Error: Los arreglos no tienen la misma longitud.");
            return new String[0];
        }

        String[] nombresCompletos = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            nombresCompletos[i] = nombres[i] + " " + apellidos[i];
        }

        return nombresCompletos;
    }
}
