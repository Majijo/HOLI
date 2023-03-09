/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ej1;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Guia2Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int num1,num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=leer.nextInt();
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
    
}
