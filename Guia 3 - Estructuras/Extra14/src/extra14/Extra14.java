/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra14;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int M,N,edad,total=0,suma=0;
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("Ingrese cantidad de familias: ");
            M=leer.nextInt();
        }while (M<=0);
        
        for (int i=0;i<M;i++){
            do{
            System.out.println("Ingrese cantidad de hijos de la familia "+(i+1)+": ");
            N=leer.nextInt();
            }while (N<=0);
            for (int j=0;j<N;j++){
                do{
            System.out.println("Ingrese la edad del hijo +"+(j+1)+" de la familia "+(i+1)+": ");
            edad=leer.nextInt();
            }while (edad<1 || edad>18);
                total=total+1;
                suma=suma+edad;
            }
            
            }
        System.out.println("Los hijos totales son: "+ total);
        System.out.println("La media de edades es: "+ ((float) (suma/total)));
        }
    }
    

