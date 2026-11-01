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
public class BL1_EJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Ejercicio 12. Numeros pares entre dos limites

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero de inicio: ");
        int inicio = teclado.nextInt();

        System.out.println("Introduce el numero final: ");
        int fin = teclado.nextInt();

        if (inicio > fin) {
            int auxiliar = inicio;
            inicio = fin;
            fin = auxiliar;
        }

        for (int numero = inicio; numero <= fin; numero++) {

            if (numero % 2 == 0) {
                System.out.println(numero);
            }

        }

        teclado.close();
    }
    
}
