package cursojava.estructurasbasicas.ejerciciospropuestos.whiles;

import java.util.Scanner;

public class Case_9 {

    public static void main (String[] args) {

        // Caso #9 -> Pedir una contraseña hasta que sea correcta (ejemplo: "java123").

        System.out.println("Caso #9 -> Pedir una contraseña hasta que sea correcta (ejemplo: \"java123\").");

        String entrada = "";

        Scanner sc = new Scanner(System.in);

        while (!entrada.equals("java123")) {

            System.out.print("Ingresa la contraseña: ");

            entrada = sc.nextLine();

            if (!entrada.equals("java123")) {

                System.out.println("Contraseña Incorrecta");

            }
        }

        System.out.println("Contraseña correcta");

        sc.close();

    }
}
