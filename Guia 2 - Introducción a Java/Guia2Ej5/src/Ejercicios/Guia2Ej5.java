
package Ejercicios;

import java.util.Scanner;


public class Guia2Ej5 {

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
