package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeroIngresado;
        double total = 0;
        int contador = 0;
        boolean salirBucle = false;

        do {

            System.out.print("Ingresa un número: ");
            numeroIngresado = sc.nextDouble();
            sc.nextLine();

            if (numeroIngresado >= 0) {
                total += numeroIngresado;
                contador++;
            } else {
                salirBucle = true;
            }

        } while (!salirBucle);

        if (contador > 0) {
            total = total / contador;
            System.out.println("El promedio es: " + total);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        sc.close();

    }
}
