/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5programa2;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U5programa2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int opcion;
            System.out.print("Elige la conversecion a realizar: ");
            System.out.print("Temperatura en °C a °F: ");
            System.out.print("Temperatura en °F a °C: ");
            System.out.print("Medidas pulgadas a metros: ");
            System.out.print("Tiempo en horas a segundos: ");
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                    int c;
                    System.out.print("Escribe los grados a convertir: ");
                    c = sc.nextInt();
                    System.out.print("Tu resultado es: " + temperaturaCF(c));
                    break;
                case 2:
                    System.out.print("Opcion 2");
                    break;
                case 3:
                    medida();
                    break;
                case 4:
                    tiempo();
                    break;
                
                default:
                    System.out.print("La opcion es incorrecta");
                    break;
            }//Switch
        }//Main
       public static double temperaturaCF(double c)
        {
            double resultados = (c * 1.8) + 32;
            return resultados;
        }
        public static double TemperaturaFK()
        {
            Scanner sc = new Scanner(System.in);
            double F, resultado;
            System.out.print("Ingrese la temperatura a en celsius: ");
            F = sc.nextInt();
            resultado = (F - 32) * (5 / 9) + 275.16;
            return resultado;
        }

        public static void medida()
        {
            Scanner sc = new Scanner(System.in);
            double p, resultado;
            System.out.print("Escriba la medida en pulgadas: ");
            p = sc.nextInt();
            resultado = p / 39.37;
            System.out.print("Tu resultado es: " + resultado);
        }
        
        public static double tiempo()
        {
            Scanner sc = new Scanner(System.in);
            double h;
            System.out.print("Escriba su tiempo en horas: ");
            h = sc.nextInt();
            return h * 3600;
        }
    }
