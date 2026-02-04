package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {

        /*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
        una altura h. Aplica la fórmula t =/-2 h/g siendo g=9.81 m/s 2.
         */

        Scanner sc = new Scanner(System.in);

        final double G = 9.81;
        double altura;


        System.out.print("Ingresa al altura en la que cae el objeto: ");
        altura = sc.nextDouble();

        double t = Math.sqrt(2 * altura / G);
        double result = t * 100;

        System.out.print("Solución: " + (Math.round(result) / 100));


        sc.close();

    }
}
