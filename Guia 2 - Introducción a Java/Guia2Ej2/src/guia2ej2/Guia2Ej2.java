/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ej2;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Guia2Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        nombre=leer.nextLine();
        System.out.println("Hola "+nombre);
    }
    
}
