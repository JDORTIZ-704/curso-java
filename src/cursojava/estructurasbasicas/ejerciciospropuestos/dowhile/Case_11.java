package cursojava.estructurasbasicas.ejerciciospropuestos.dowhile;

import java.time.LocalDate;
import java.util.Scanner;

public class Case_11 {

    public static void main (String[] args) {

        /*
        Caso #11 -> Mostrar un menú con opciones:
        1.	Saludar
        2.	Mostrar fecha
        3.	Salir
        El programa debe repetirse hasta que el usuario elija salir.
        */

        Scanner sc = new Scanner(System.in);

        int num;

        do {

            System.out.println("Menu \n 1.Saludar \n 2.Mostrar fecha \n 3.Salir");
            System.out.print("Opción: ");

            num = sc.nextInt();

            if (num == 1) {
                System.out.println("Hola");
            } else if (num == 2){
                System.out.println(LocalDate.now());
            } else if (num != 3) {
                System.out.println("Opción invalida");
            }

        } while (num != 3);

        System.out.println("Saliste del programa");

        sc.close();

    }

}
