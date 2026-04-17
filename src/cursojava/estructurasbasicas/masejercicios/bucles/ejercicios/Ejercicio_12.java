package cursojava.estructurasbasicas.masejercicios.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numerosMostrar;
        int contador = 0;
        int a = 0;
        int b = 1;
        int c;

        System.out.print("¿Cuántos términos de la serie de Fibonacci quiere mostrar?: ");
        numerosMostrar = sc.nextInt();
        sc.nextLine();

        while (contador < numerosMostrar) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            contador++;
        }

        sc.close();

    }
}
