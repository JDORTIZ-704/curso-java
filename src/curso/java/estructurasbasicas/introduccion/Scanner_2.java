package curso.java.estructurasbasicas.introduccion;

import java.util.Scanner;

public class Scanner_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número: ");

        int number = entrada.nextInt();

        System.out.print("Introduce un segundo número: ");

        int number2 = entrada.nextInt();

        int result = number + number2;

        System.out.print("Suma: " + result);

        entrada.close();

    }
}
