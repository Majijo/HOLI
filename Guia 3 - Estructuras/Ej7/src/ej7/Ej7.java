/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        String salir = "&&&&&";
        String frase;
        boolean x, o;
        int contrue, contfalse, longitud;
        contrue = 0;
        contfalse = 0;
        do {
            System.out.println("Ingrese la frase");
            frase = teclado.nextLine();
            frase = frase.toLowerCase();
            longitud = frase.length();
            x = frase.startsWith("x");
            o = frase.endsWith("o");

            if (longitud == 5 && x == true && o == true) {
                contrue += 1;
            } else {
                contfalse += 1;
            }

        } while (salir.equals(frase) == false);
        contfalse = contfalse - 1;
        System.out.println("Cantidad Correctas " + contrue);
        System.out.println("Cantidad Incorrectas " + contfalse);
    }

}
