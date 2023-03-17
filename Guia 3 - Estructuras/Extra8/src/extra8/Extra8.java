/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra8;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num,par,impar,cant;
       Scanner leer= new Scanner(System.in);
       cant=0;
       par=0;
       impar=0;
               
       do{
           System.out.print("Ingrese un número: ");
           num=leer.nextInt();
           if (num>0) {
               cant=cant+1;
               if ((num%2)==0) {
                   par=par+1;
               } else if ((num%2)!=0) {
                   impar=impar+1;
               }
           } else {
               System.out.println("Ingreso un número negativo o 0.");
               num=1;
           }
       }while ((num%5)!=0); 
       
        System.out.println("Cantidad de números: " + cant);
        System.out.println("Cantidad de pares: "+par);
        System.out.println("Cantidad de impares: "+impar);
    }
    
}
