/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5programa10;
import java.util.Random;
/**
 *
 * @author DELL
 */
public class U5programa10 {

    public static void main(String[] args) {
        int longitud=8;
        String contrasena = aleatorio(longitud);
        System.out.println("password: " + contrasena);
     
   
    }
    public static String aleatorio(int lon){
     String caracteres = "ABCDEFGHIJK123456789*-_.";
     Random random = new Random();
     StringBuilder cadena= new StringBuilder(lon);
     for(int i=0;i< lon; i++){
     int indiceCaracter = random.nextInt(caracteres.length());
     cadena.append(caracteres.charAt(indiceCaracter));
     }
     return cadena.toString();
    }
}