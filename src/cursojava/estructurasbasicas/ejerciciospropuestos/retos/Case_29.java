package cursojava.estructurasbasicas.ejerciciospropuestos.retos;

import java.util.Arrays;
import java.util.Scanner;

public class Case_29 {

    public static void main (String[] args) {

        // Caso #29 -> Invertir un número entero (ej: 123 → 321).

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero de 3 cifras: ");
        int num = sc.nextInt();

        // operadores

        int c, r, d, u;

        c = num / 100;
        r = num % 100;
        d = r / 10;
        u = r % 10;

        System.out.println("El numero de 3 cifras invertido es: " + u+d+c);


    }

}
