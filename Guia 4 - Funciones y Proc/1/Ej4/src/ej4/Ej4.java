/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cond;
        int num;
       Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese un nro para ver si es primo: ");
        num=leer.nextInt();
        primo(num);
    }
    
 public static void primo(int num){
     boolean cond;
     int i=2;
     cond=false;
     while (cond==false && i<num){
         cond= (num%i)==0; //Va a volverse true cuando encuentre un nro distinto a 1 y num que pueda dividirlo.
         i=i+1;
     }
          if (cond==true) {
            System.out.println("El nro. no es primo.");
        }else {
            System.out.println("El nro. es primo.");
                    }
        }
 }
    
