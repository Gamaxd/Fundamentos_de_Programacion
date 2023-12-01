/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5programa2;

/**
 *
 * @author LaboratorioLTI2
 */
public class U5programa2 {

    public static void main(String[] args) {
          System.out.println( suma (9, 5) );
         System.out.println( resta (5, 2) );
         System.out.println( multiplicacion (2, 10) );
         System.out.println(division (20, 2) );
    }
    //1METODO O FUNCION
    public static int suma(int a,int b){
        int r=a +b;
        return r;
    }
        public static int resta(int a,int b){
        int r=a-b;
        return r;
}  
        public static int multiplicacion(int a,int b){
        int r=a*b;
        return r;
}
     public static int division(int a,int b){
        int r=a/b;
        return r;  
}
}
