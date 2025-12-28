package cursojava.estructurasbasicas.ejerciciospropuestos.retos;

import java.util.Scanner;

public class Case_30 {
    public static void main (String[] args) {

        // Caso #30 -> Contar cuántos dígitos tiene un número.

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.print("numero " + num + " tiene: " + Integer.toString(num).length());

    }
}
