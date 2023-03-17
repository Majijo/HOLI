/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra10;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     int num1,num2,resp,res;
     num1=(int) (Math.random()*10);
     num2=(int) (Math.random()*10);
     res=num1*num2;
        do{
        System.out.println("Intente adivinar la multiplicación de dos números: ");
        resp=leer.nextInt();
        if (res!=resp)
            System.out.println("Te equivocaste. Volve a intentar.");
        
        }while (resp!=res);
        
        System.out.println("Adivinaste!! Los números eran "+num1+" y "+num2+", y su producto era "+res);
        
    }
    
}
