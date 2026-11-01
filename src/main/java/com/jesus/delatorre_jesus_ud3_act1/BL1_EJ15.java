/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jesus.delatorre_jesus_ud3_act1;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class BL1_EJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Ejercicio 15. Factorial de un numero

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entre 0 y 20: ");
        int numero = teclado.nextInt();

        if (numero < 0 || numero > 20) {

            System.out.println("El numero debe estar entre 0 y 20");

        } else {

            long factorial = 1;

            for (int i = 1; i <= numero; i++) {

                factorial = factorial * i;

            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        teclado.close();
    }
    
}
