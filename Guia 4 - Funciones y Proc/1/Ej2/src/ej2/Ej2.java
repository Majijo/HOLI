/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N, edad, i;
        boolean cond;
        char op;
        Scanner leer = new Scanner(System.in);
        i = 1;
        do {
            System.out.println("Ingrese cantidad de personas ");
            N = leer.nextInt();
        } while (N < 0);

        do {
            do {
                System.out.println("Ingrese la edad de la persona " + i);
                edad = leer.nextInt();
                if (edad > 0) {
                    esLegal(edad);
                } else {
                    System.out.println("Ingreso una edad incorrecta.");
                }

            } while (edad < 0);

            System.out.println("Quiere cancelar la operación? s/S");
            op = leer.next().charAt(0);
            cond = op == 's' || op == 'S';
            if (cond == true) {
                i = N + 1;
            }
        } while (i <= N);
    }

    public static void esLegal(int edad) {

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");

        } else {
            System.out.println("Es menor de edad. ");
        }

    }

}
