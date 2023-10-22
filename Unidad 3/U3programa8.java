/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa8;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa8 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int N1, N2;
            System.out.println("Ingrese el 1er número: ");
            N1 = sc.nextInt();
            System.out.println("Ingrese el 2do número: ");
            N2 = sc.nextInt();

            if (N1 > N2)
                System.out.println(N1 + " Es mayor que: " + N2);
            else
                System.out.println(N1 + " Es menor que: " + N2);
    }
}
