package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        final int clave = 1234;

        boolean intentosCajaFuerte = false;
        int ingresoClave;
        int intentos = 0;


        do {
            System.out.print("Ingresa la combinación de 4 cifras: ");
            ingresoClave = sc.nextInt();
            sc.nextLine();
            if (ingresoClave != clave) {
                intentos++;
                System.out.println("Lo siento, esa no es la combinación.");
                if (intentos == 4) {
                    System.out.println("Caja fuerte bloqueada");
                    intentosCajaFuerte = true;
                }
            } else {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                intentosCajaFuerte = true;
            }

        } while (!intentosCajaFuerte);

        sc.close();

    }
}
