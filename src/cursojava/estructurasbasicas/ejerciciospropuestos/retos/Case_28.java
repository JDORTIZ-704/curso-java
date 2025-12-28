package cursojava.estructurasbasicas.ejerciciospropuestos.retos;

import java.util.Scanner;

public class Case_28 {
    public static void main (String[] args) {

        /*
        28.	Dibujar este patrón usando bucles:
        *
        **
        ***
        ****
        *****
        */

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingresa filas: ");
        n = sc.nextInt();

        char [] list = new char[n];


        for (int i=0; i<list.length; i++) {
            for(int z=0; z<i+1; z++) {
                list[i] = '*';
                System.out.print(list[i]);
            }
            System.out.println();
        }

    }
}
