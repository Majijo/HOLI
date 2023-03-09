/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ej3;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Guia2Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
        después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
        
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = entrada.nextLine();
        System.out.println("La frase en minúsculas es: " + frase.toLowerCase());   
         System.out.println("La frase en mayúsculas es: " + frase.toUpperCase()); 
    }
    
}
