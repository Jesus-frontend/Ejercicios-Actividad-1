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
public class BL1_EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        // Ejercicio 8. Año bisiesto.
        
         Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un año: ");
        int anio = teclado.nextInt();

        if (anio % 400 == 0) {
            System.out.println("El año es bisiesto");

        } else if (anio % 100 == 0) {
            System.out.println("El año no es bisiesto");

        } else if (anio % 4 == 0) {
            System.out.println("El año es bisiesto");

        } else {
            System.out.println("El año no es bisiesto");
        }

        teclado.close();
    }
    
}
