/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionjava;

import java.util.Random;

/**
 *
 * @author josema
 */
public class Adivinanza {
    public static void main(String[] args) {
        
        Random r = new Random();
        int valorDado = r.nextInt(100)+1;
        
        int i = 0;
        while(i<50) {
            System.out.println("Aleatorio: " + (r.nextInt(100)+1));
            i++;
        }
    }
    
}
