package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroIngresado;
        int contador = 0;
        int sumaMultiplos = 0;

        System.out.print("Introduzca un número entero mayor que 1: ");
        numeroIngresado = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numeroIngresado; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
                sumaMultiplos += i;
            }
        }

        System.out.println("\nDesde 1 hasta " + numeroIngresado + " hay " + contador + " múltiplos de 3 y suman " + sumaMultiplos);

        sc.close();

    }
}
