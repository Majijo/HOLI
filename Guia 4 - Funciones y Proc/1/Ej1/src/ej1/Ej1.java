/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n1, n2, n3, op;
        double n4;
        System.out.print("Ingrese el primer número: ");
        n1 = leer.nextInt();
        System.out.println("");
        System.out.print("Ingrese el segundo número: ");
        n2 = leer.nextInt();
        System.out.println("");

        do {
            System.out.println("MENU:");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    n3 = suma(n1, n2);
                    System.out.println(n1 + " + " + n2 + " = " + n3);
                    break;
                case 2:
                    n3 = resta(n1, n2);
                    System.out.println(n1 + " - " + n2 + " = " + n3);
                    break;
                case 3:
                    n3 = producto(n1, n2);
                    System.out.println(n1 + " * " + n2 + " = " + n3);
                    break;
                case 4:
                    n4 = (double) division(n1, n2);
                    System.out.println(n1 + " / " + n2 + " = " + n4);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no reconocida.");
            }
        } while (op != 5);
    }

    public static int suma(int n1, int n2) {
        int n3;
        n3 = n1 + n2;
        return n3;
    }

    public static int resta(int n1, int n2) {
        int n3;
        n3 = n1 - n2;
        return n3;
    }

    public static int producto(int n1, int n2) {
        int n3;
        n3 = n1 * n2;
        return n3;
    }

    public static double division(int n1, int n2){
        double n3;
        n3 =(double) (n1 / n2);
        return n3;
    }
}
