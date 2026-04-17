package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroIngresado;
        int numero;
        int resultado;
        int contador = 0;
        int contadorDigitos = 0;

        System.out.print("Introduzca un número entero: ");
        numeroIngresado = sc.nextInt();
        numero = numeroIngresado;
        sc.nextLine();

        do {

            numeroIngresado /= 10;
            contadorDigitos++;

        } while (numeroIngresado > 0);

        while (contadorDigitos <= contador) {
            resultado = numero % 10;
            contador++;
            System.out.print(resultado + " ");
        }

        sc.close();

    }
}
