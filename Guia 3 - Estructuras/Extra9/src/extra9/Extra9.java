/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra9;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese 2 numeros mayores a 1");
        int dividendo , divisor, cociente=0, resto;

        dividendo=leer.nextInt();
        divisor=leer.nextInt();
        resto=dividendo;
        if (dividendo>1 && divisor>1 && dividendo>=divisor ){
            do{
              dividendo=dividendo-divisor;
              cociente++;
            }while (divisor<dividendo);
            System.out.println("El Resultado de la division de "+resto+ " en "+ divisor+" es: "+cociente+" y el resto: "+ dividendo);
        }else
            System.out.println("Datos ingresados incorrectos");


        
    }
    }
 