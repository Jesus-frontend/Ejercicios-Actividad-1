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
public class BL1_EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejercicio 9. Calculadora básica con switch.
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        double numero1 = teclado.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        double numero2 = teclado.nextDouble();

        System.out.println("Elige una operacion (+, -, *, /): ");
        String operacion = teclado.next();

        switch (operacion) {

            case "+":
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case "-":
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case "*":
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            case "/":
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("No se puede dividir entre cero");
                }
                break;

            default:
                System.out.println("Operacion no valida");
        }

        teclado.close();
    }
    
}
