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
public class BL1_EJ17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Ejercicio 17. Introduccion de numeros hasta cero

        Scanner teclado = new Scanner(System.in);

        int numero;
        int contador = 0;
        int suma = 0;

        System.out.println("Introduce un numero (0 para terminar): ");
        numero = teclado.nextInt();

        while (numero != 0) {

            contador++;

            suma = suma + numero;

            System.out.println("Introduce otro numero (0 para terminar): ");
            numero = teclado.nextInt();

        }

        System.out.println("Cantidad de numeros: " + contador);
        System.out.println("Suma total: " + suma);

        if (contador > 0) {

            double media = (double) suma / contador;

            System.out.println("Media aritmetica: " + media);

        } else {

            System.out.println("No se puede calcular la media");

        }

        teclado.close();
    
    }
    
}
