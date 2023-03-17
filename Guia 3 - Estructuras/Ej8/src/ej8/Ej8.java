/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int largo;
        System.out.println("Ingrese El tamaño");
        largo = teclado.nextInt();
 
        for (int i = 0; i<largo; i++) {
            for (int j=0; j<largo; j++) {
                if (i==0 || i==largo-1) { //pongo largo-1 porque arriba tengo i<largo
                    System.out.print("*"); //estos sin saltar porque serán la primera y última fila del cuadrado
                } else {
                    if (j==0 || j==largo-1 ){ //pongo esto para que me ponga un * solo en los extremos de la fila
                         System.out.print("*");
                    }
                    else {
                        System.out.print(" "); //pongo esto para que me ponga espacios al medio de los * que indique arriba
                    }
  
                }

            }
            System.out.println(""); //este es para que me salte a la siguiente fila
        }
    }
  }