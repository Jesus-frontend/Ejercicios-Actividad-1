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
public class BL1_EJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        // Ejercicio 10. Menú de conversión de
        // temperaturas.
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("===== CONVERSOR DE TEMPERATURAS =====");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Salir");
        System.out.println("Selecciona una opcion: ");

        int opcion = teclado.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Introduce la temperatura en Celsius: ");
                double celsius = teclado.nextDouble();

                double fahrenheit = celsius * 9 / 5 + 32;

                System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
                break;

            case 2:
                System.out.println("Introduce la temperatura en Fahrenheit: ");
                double gradosFahrenheit = teclado.nextDouble();

                double gradosCelsius = (gradosFahrenheit - 32) * 5 / 9;

                System.out.println("Temperatura en Celsius: " + gradosCelsius);
                break;

            case 3:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opcion no valida");
        }

        teclado.close();

    }
    
}
