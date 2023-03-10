/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Ej4 {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase=leer.nextLine();
        if (frase.substring(0,1).equalsIgnoreCase("a")==true) {
            System.out.println("Es correcto.");
            
        }
        else {
            System.out.println("Es incorrecto.");
        }
      
    }
    
}
