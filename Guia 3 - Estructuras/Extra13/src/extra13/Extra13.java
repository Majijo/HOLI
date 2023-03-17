/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra13;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer=new Scanner(System.in);
        int escalones,cont=0;
        
        System.out.print("Ingrese el numero de escalones: ");
        escalones=leer.nextInt();
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i <= escalones; i++) {
            for (int j=0;j<i;j++){
                System.out.print(j+1); 
            }
            System.out.println("");
        }
    }
    
}
