/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ej4;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Guia2Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        System.out.println(numero+ " al cuadrado = "+ Math.pow(numero, 2));
        System.out.println(numero +" al cubo = "+ Math.pow(numero,3));
        System.out.println("La raiz cuadrada de "+ numero +" = "+ Math.sqrt(numero));
    }
    
}
