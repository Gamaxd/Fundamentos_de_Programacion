/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa10;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa10 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int horas_t, horas_e;
            double pago, sueldosem = 0;
            System.out.println("Horas trabajadas");
            horas_t = sc.nextInt();
            System.out.println("¿Pago por hora? ");
            pago = sc.nextInt();

            if (horas_t <= 40 )
            {
                sueldosem = horas_t * pago;
                System.out.println("Recibiras un total de $" + sueldosem);
            }
            else
            {
                horas_e = horas_t - 40;
                sueldosem = 40 * pago + horas_e * (pago * 2);
                System.out.println("Por trabajar " + horas_e + " horas extra, usted recibe un total de $" + sueldosem);


            }
    }
}
