/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc41
 */
public class Adivinanza {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
           int numeroSecreto = (int)(Math.random() * 100) + 1;
        int intento = 0;
        int contadorIntentos = 0;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Estoy pensando en un número del 1 al 100. ¿Puedes adivinar cuál es?");

        // Bucle hasta que el usuario adivine
        do {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();
            contadorIntentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número en " + contadorIntentos + " intentos.");
            }
        } while (intento != numeroSecreto);

     
        }
    }

