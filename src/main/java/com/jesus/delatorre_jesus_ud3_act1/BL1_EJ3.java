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
public class BL1_EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejercicio 3. Mayor de dos números
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer numero es mayor");

        } else if (numero2 > numero1) {
            System.out.println("El segundo numero es mayor");

        } else {
            System.out.println("Los dos numeros son iguales");
        }

        teclado.close();
    }
}

    

