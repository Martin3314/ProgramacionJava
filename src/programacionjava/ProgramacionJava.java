/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacionjava;

import java.util.Scanner;

/**
 *
 * @author josema
 */
public class ProgramacionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola GitHub! ¿Detectas este cambio?");
        System.out.println("Si, ya lo he detectado");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        if (numero % 2 == 0) System.out.println("Es par");
        else System.out.println("Es impar");
        
        System.out.println("Fin del programa");
        
        
    }
    
}
