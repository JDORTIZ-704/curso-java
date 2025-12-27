package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_1 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum=0;

        int [] list = new int[10];

        for (int i=0; i<list.length; i++) {
            System.out.print("Introduce el digito #" + (i+1) + ": ");
            list[i] += sc.nextInt();
        }

        int max = list[0];
        int min = list[0];
        for (int e=1; e<list.length; e++) {
            if (list[e] > max) {
                max = list[e];
            }
            if (list[e] < min) {
                min = list[e];
            }
        }


        for (int arrayList: list) {
            sum += arrayList;
        }

        System.out.println("Suma: " + sum);
        System.out.println("Prom: " + (sum/list.length));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        sc.close();

    }

}
