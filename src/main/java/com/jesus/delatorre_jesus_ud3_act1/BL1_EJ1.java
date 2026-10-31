/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jesus.delatorre_jesus_ud3_act1;

import java.util.Scanner;

/**
 *
 * @author Jesusde1
 */
public class BL1_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // Ejercicio 1. Número positivo, negativo o cero

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        teclado.close();
    }
}    
