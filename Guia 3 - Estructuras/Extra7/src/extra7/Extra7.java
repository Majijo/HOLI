/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra7;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n, max, min, num, suma;
        double prom;
        
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese cantidad de numeros:");
            n = leer.nextInt();
        } while (n <= 0);
        do {
        System.out.println("Ingrese primer número: ");
        num = leer.nextInt();
        max = num;
        min = num;
        suma = num;
        }while (num<=0);
                
        for (int i = 1; i < n ; i++) {
             
            do {
                System.out.println("Ingrese siguiente número: ");
            num = leer.nextInt();
            suma=suma+num;
            if (num>max){
                max=num;
            } else if (num<min) {
                min=num;
            }
            } while (num <= 0);
        }
        prom=(float) suma/n;
        System.out.println("Valor máximo:" + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Valor promedio: " + prom);
    }
}
