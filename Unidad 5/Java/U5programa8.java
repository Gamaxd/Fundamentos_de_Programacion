/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5programa8;
import java.util.Random;
/**
 *
 * @author DELL
 */
public class U5programa8 {

    public static void main(String[] args) {
         dado();
    }
    public static void dado(){
        Random aleatorio = new Random();
        int G = aleatorio.nextInt(6);
        System.out.println("Su numero es: " + G);
    }
}
