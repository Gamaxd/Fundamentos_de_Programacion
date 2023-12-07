/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5programa6;

/**
 *
 * @author DELL
 */
public class U5programa6 {

    public static void main(String[] args) {
            int a = 0, b = 1, c = 0;
        for(int i = 0; i <= 15; i++){
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
