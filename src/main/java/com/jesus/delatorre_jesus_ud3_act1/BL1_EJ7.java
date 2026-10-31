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
public class BL1_EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejercicio 7. Descuento en una compra.
        
         Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra: ");
        double importe = teclado.nextDouble();

        double descuento = 0;

        if (importe < 0) {
            System.out.println("Importe no valido");

        } else if (importe < 50) {
            descuento = 0;

        } else if (importe < 100) {
            descuento = importe * 0.05;

        } else if (importe < 200) {
            descuento = importe * 0.10;

        } else {
            descuento = importe * 0.15;
        }

        if (importe >= 0) {
            double total = importe - descuento;

            System.out.println("Importe inicial: " + importe + " euros");
            System.out.println("Descuento aplicado: " + descuento + " euros");
            System.out.println("Precio final: " + total + " euros");
        }

        teclado.close();
    }
    
}
