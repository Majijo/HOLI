/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Ej3 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase=leer.nextLine();
        if (frase.length()==8) {
            System.out.println("Correcta. Tiene 8.");  
        }
        else {
            System.out.println("Incorrecta. No tiene 8.");
        }
        }
}
