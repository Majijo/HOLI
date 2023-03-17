/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra12;

import java.util.Scanner;

/**
 *
 * @author mluz2
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, N;
        String codi, codj, codk;

        for (int i = 0; i < 10; i++) {
            codi = Integer.toString(i);
            if (codi.equals("3")) {
                codi = "E";
            }

            for (int j = 0; j < 10; j++) {
                codj = Integer.toString(j);

                if (codj.equals("3")) {
                    codj = "E";

                }
                for (int k = 0; k < 10; k++) {
                    codk = Integer.toString(k);

                    if (codk.equals("3")) {
                        codk = "E";
                        System.out.println(codi + "-" + codj + "-" + codk);
                    } else {
                        System.out.println(codi + "-" + codj + "-" + codk);
                    }

                }
            }
        }

    }
}
