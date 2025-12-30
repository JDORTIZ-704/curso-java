package cursojava.estructurasbasicas.trabajofinal;

import java.util.Scanner;

public class Trabajo_2 {
    public static void main(String[] args) {

        boolean condicion = false;
        int ingresarNumero = 0;
        double valorNumero;
        int contarPositivos = 0;
        int contarNegativos = 0;
        int contarCeros = 0;
        double suma = 0;
        double promedio = 0;
        int contarPares = 0;
        int contarImpares = 0;


        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Ingresa la cantidad de números enteros positivos: ");

            if (sc.hasNextInt()) {
                ingresarNumero = sc.nextInt();
                if (ingresarNumero > 0) {
                    condicion = true;
                } else {
                    System.out.print("Entrada no permitida.\n");
                }
            } else {
                System.out.print("Entrada no permitida.");
                sc.next();
            }

        } while (!condicion);

        double[] lista = new double[ingresarNumero];

        for (int i = 0; i < lista.length; i++) {

            while (true) {
                System.out.print("Número #" + (i + 1) + ". es: ");

                if (sc.hasNextDouble()) {
                    valorNumero = sc.nextDouble();
                    lista[i] = valorNumero;
                    break;
                } else {
                    System.out.print("Valor no aceptado por el sistema.");
                    sc.next();
                }
            }
        }

        for (double v : lista) {

            suma += v;

            if (v > 0) {
                contarPositivos++;
            } else if (v < 0) {
                contarNegativos++;
            } else {
                contarCeros++;
            }

            promedio = suma / lista.length;

            if (v % 2 == 0) {
                contarPares++;
            } else {
                contarImpares++;
            }

        }

        System.out.println("------------------------------------------------------");

        System.out.println("Cuántos son positivos: " + contarPositivos);
        System.out.println("Cuántos negativos: " + contarNegativos);
        System.out.println("Cuántos ceros: " + contarCeros);
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Cuántos son pares: " + contarPares);
        System.out.println("Cuántos son impares: " + contarImpares);

        sc.close();

    }
}
