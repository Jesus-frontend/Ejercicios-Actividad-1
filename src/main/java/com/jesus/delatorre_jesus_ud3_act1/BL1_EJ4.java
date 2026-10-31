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
public class BL1_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        // // Ejercicio 4. Mayor de tres números
        
           Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();

        System.out.println("Introduce el tercer numero: ");
        int numero3 = teclado.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El primer numero es el mayor");

        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El segundo numero es el mayor");

        } else {
            System.out.println("El tercer numero es el mayor");
        }

        teclado.close();
    }
    
}
