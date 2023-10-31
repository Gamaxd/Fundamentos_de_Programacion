/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa17;

/**
 *
 * @author LaboratorioLTI2
 */
public class U3programa17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char salir;

        do
        {
            System.out.println("Bienvenido a una sala de ejecucion");
            System.out.println("Escriba n para no condenar a muerte");
            salir = sc.next().charAt(0);
    }while(salir !='n');
}
