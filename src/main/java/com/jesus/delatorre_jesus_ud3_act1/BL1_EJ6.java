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
public class BL1_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejercicio 6. Acceso a una atracción.
        
       Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu altura en centimetros: ");
        double altura = teclado.nextDouble();

        if (altura < 0) {
            System.out.println("Altura no valida");

        } else if (altura < 140) {
            System.out.println("Acceso denegado");

        } else {
            System.out.println("Puedes subir a la atraccion");
        }

        teclado.close(); 
    }
    
}
