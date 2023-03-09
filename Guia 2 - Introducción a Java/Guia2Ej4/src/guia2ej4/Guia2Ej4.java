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
        double Celsius;
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese °C:");
        Celsius=leer.nextDouble();
        System.out.println(Celsius+"°C = "+(32+(9*Celsius/5))+"°F");
    }

}
