/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.pkg5;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("BIENVENIDO!! Indique que tipo de socio es ");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        char socio;
           
        socio = leer.next().toUpperCase().charAt(0);
        
        float trat;
        System.out.println("Ingrese el costo del tratamiento:");
        trat=leer.nextFloat();
        
        switch (socio) {
            case 'A':
                trat=(float) (trat-0.5*trat);
                System.out.println("Usted debe pagar: " + trat);
                break;
            case 'B':
                  trat=(float) (trat-0.35*trat);
                  System.out.println("Usted debe pagar: " + trat);
                break;
            case 'C':
                  System.out.println("Usted debe pagar: " + trat);
                
                break;
            default:
                System.out.println("No ingreso una opción valida."); 
                      
        }
        
    }
    
}
