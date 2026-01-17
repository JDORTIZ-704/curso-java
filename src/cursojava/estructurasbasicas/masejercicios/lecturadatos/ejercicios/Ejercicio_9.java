package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {

        /*Escribe un programa que calcule el volumen de un cono según la fórmula*/

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14;
        double r;
        double h;
        double resultado;

        System.out.print("Ingresa el valor de R: ");
        r = sc.nextDouble();
        System.out.print("Ingresa el valor de H: ");
        h = sc.nextDouble();

        resultado = (1.0 / 3.0) * PI * Math.pow(r,2) * h;

        System.out.print("\nEl resultado es -> " + resultado);

        sc.close();

    }
}
