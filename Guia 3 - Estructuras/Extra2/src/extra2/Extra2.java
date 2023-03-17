/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A,B,C,D,aux;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor A:");
        A=leer.nextInt();
        System.out.println("Ingrese el valor B:");
        B=leer.nextInt();
        System.out.println("Ingrese el valor C:");
        C=leer.nextInt();
        System.out.println("Ingrese el valor D:");
        D=leer.nextInt();
        
        System.out.println("VALORES INICIALES:");
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("D="+D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("");
        System.out.println("VALORES FINALES: ");
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("D="+D);
        
    }
    
}
