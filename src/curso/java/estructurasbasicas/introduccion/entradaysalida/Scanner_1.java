package curso.java.estructurasbasicas.introduccion.entradaysalida;

import java.util.Scanner;

public class Scanner_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");

        String name = entrada.nextLine();

        System.out.print("Hola: " + name);

    }
}
