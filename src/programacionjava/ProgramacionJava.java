/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacionjava;

import java.util.Random;
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
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println("Bienvenido al juego Piedra, Papel o Tijera");
        System.out.print("Elige una opción (piedra, papel o tijera): ");
        String usuario = scanner.nextLine().toLowerCase();

        
        while (!usuario.equals("piedra") && !usuario.equals("papel") && !usuario.equals("tijera")) {
            System.out.print("Entrada inválida. Por favor, elige piedra, papel o tijera: ");
            usuario = scanner.nextLine().toLowerCase();
        }

        
        int indiceOrdenador = random.nextInt(3);
        String ordenador = opciones[indiceOrdenador];

        System.out.println("El ordenador eligió: " + ordenador);

       
        if (usuario.equals(ordenador)) {
            System.out.println("¡Empate!");
        } else if (
            (usuario.equals("piedra") && ordenador.equals("tijera")) ||
            (usuario.equals("papel") && ordenador.equals("piedra")) ||
            (usuario.equals("tijera") && ordenador.equals("papel"))
        ) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

  
    }
}
        
        
    
    

