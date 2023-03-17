/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char letra;

        System.out.print("Ingrese una letra y le indicaremos si es vocal: ");
        letra = leer.next().toUpperCase().charAt(0);

        switch (letra) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("El caracter es una vocal");
                break;

            default:
//                throw new AssertionError();
                System.out.println("La letra ingresada es una consonante");
        }

        System.out.println("");

    }
}
