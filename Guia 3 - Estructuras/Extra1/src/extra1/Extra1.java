/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min,num,horas,dias;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese cantidad de minutos:");
        num = leer.nextInt();
        min=num/60;
        dias=min/24;
        horas= min % 24;
        System.out.println(num+" es igual a "+dias+" día/s y "+horas+" horas.");
    }
    
}
