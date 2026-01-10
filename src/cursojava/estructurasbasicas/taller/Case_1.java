package cursojava.estructurasbasicas.taller;

import java.util.Scanner;

public class Case_1 {

    public static void main(String[] args) {

/*        1️⃣ Número primo
        Pedir un número entero positivo y determinar si es primo.
        Condiciones:
•	No usar arrays
•	Usar for
•	Optimizar hasta n/2 o √n
*/

        Scanner sc = new Scanner(System.in);
        boolean condicion = false;
        int numero;
        boolean primo = true;

        do {

            System.out.print("Ingresa un número positivo: ");
            numero = sc.nextInt();

            if (numero < 0) {
                System.out.println("El número ingresado no es aceptado, ingresar -> (Positivos enteros)");
            } else {
                condicion = true;
            }

        } while (!condicion);


        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("El número " + numero +  " es primo");
        } else {
            System.out.println("El número " + numero +  " no es primo");
        }

        sc.close();

    }

}
