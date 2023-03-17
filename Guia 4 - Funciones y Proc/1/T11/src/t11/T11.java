/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author mluz2
 */
public class T11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean cond;
        String pal;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese una palabra terminada en punto: ");
            pal = leer.nextLine();
            cond=pal.endsWith(".");
        } while (cond == false);

        String codigo;
        codigo = cambioVocal(pal);
        System.out.println(codigo);
    }

    public static String cambioVocal(String cod) {
        String cod2;
        int i;
        cod2 = "";

        for (i = 0; i < (cod.length()); i++) {
            switch (toLowerCase(cod.substring(i, i + 1))) {
                case "a":
                    cod2 = cod2.concat("@");
                    break;
                case "e":
                    cod2 = cod2.concat("#");
                    break;
                case "i":
                    cod2 = cod2.concat("$");
                    break;
                case "o":
                    cod2 = cod2.concat("%");
                    break;
                case "u":
                    cod2 = cod2.concat("*");
                    break;
                default:
                    cod2 = cod2.concat(cod.substring(i, i + 1));
            }
        }
        return cod2;
    }
}
