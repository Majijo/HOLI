/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer =new Scanner(System.in);
        System.out.println("ingresa un valor hasta 10");
        int num =leer.nextInt();
        
        while (num>=1&&num<=10){
            
        switch (num) {
            case 1:
                System.out.println(num+" el numero ingresa en romano es I");
                                num=num+10;

            break;
            case 2:
                System.out.println(num+" el numero ingresa en romano es II");
                                num=num+10;

            break;
            case 3:
                System.out.println(num+" el numero ingresa en romano es III");
                                num=num+10;

            break;
            case 4:
                System.out.println(num+" el numero ingresa en romano es IV");
                                num=num+10;

            break;
            case 5:
                System.out.println(num+" el numero ingresa en romano es V");
                                num=num+10;

            break;
            case 6:
                System.out.println(num+" el numero ingresa en romano es VI");
                                num=num+10;

            break;
            case 7:
                System.out.println(num+" el numero ingresa en romano es VII");
                                num=num+10;

            break;
            case 8:
                System.out.println(num+" el numero ingresa en romano es VIII");
                                num=num+10;

            break;
            case 9:
                System.out.println(num+" el numero ingresa en romano es IX");
                num=num+10;
            break;
            case 10:
                 
                System.out.println(num+" el numero ingresa en romano es X");
                 num=num+10;
            break;
            
          ///  default:
//           //     throw new AssertionError();
               // System.out.println("La letra ingresada es una consonante");
            
        }
        
    }
    }
    }
