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
public class BL1_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Ejercicio 2. Número par o impar

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        teclado.close();

    }
    
}
