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
public class BL1_EJ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Ejercicio 14. Suma de los primeros N numeros

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero positivo: ");
        int numero = teclado.nextInt();

        if (numero <= 0) {
            System.out.println("El numero debe ser positivo");

        } else {

            int suma = 0;

            for (int i = 1; i <= numero; i++) {

                suma = suma + i;

            }

            System.out.println("La suma total es: " + suma);
        }

        teclado.close();
        
    }
    
}
