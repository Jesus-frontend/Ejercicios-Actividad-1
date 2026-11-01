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
public class BL1_EJ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Ejercicio 13. Tabla de multiplicar

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {

            int resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);

        }

        teclado.close();
    }
    
}
