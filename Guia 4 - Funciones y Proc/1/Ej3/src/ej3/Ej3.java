/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Ej3 {

public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    double euros;
    String moneda;
    
    do{
        System.out.print("Ingrese euros a convertir: ");
        euros= leer.nextInt();
        
    }while (euros<0);
    
    System.out.println("CONVERSIONES POSIBLES:");
    System.out.println("CONVERSIÓN A YENES -> Escriba 'yen'");
    System.out.println("CONVERSIÓN A DOLAR -> Escriba 'dolar'");
    System.out.println("CONVERSIÓN A LIBRA -> Escriba 'libra'");
    moneda=leer.next();
    moneda=moneda.toLowerCase();
    convertir(euros,moneda);

}

public static void convertir(double euros,String moneda) {
    
    switch (moneda){
        case "yen":
            System.out.println(euros + " euro/s = "+(140.36*euros)+ "yen/es");       
            break;
        case "dolar":
            System.out.println(euros + " euro/s = "+(1.06*euros)+ "dolar/es");
            break;
        case "libra":
            System.out.println(euros + " euro/s = "+(0.88*euros)+ "libra/s");
             break;
        default:
            System.out.println("Moneda no reconocida.");
    }
}
}