/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int N,altura,suma;
       double prom;
       suma=0;
       Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese cantidad de personas: ");
        N=leer.nextInt();
        System.out.println("");
        
        for (int i=0;i<N;i++) {
            do{
            System.out.println("Ingrese altura en cm de la persona " + (i+1));
            altura=leer.nextInt();
            suma= (suma+altura);
            } while (altura<100 || altura>200);
        }
        prom=(double) suma/N;
        System.out.println("El promedio de alturas es : " + prom);
    }
    
}
