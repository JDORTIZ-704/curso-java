package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        /*Realiza un conversor de Kb a Mb.*/

        Scanner sc = new Scanner(System.in);

        final int MG = 1024;
        double kg;
        double resultado;

        System.out.print("Ingresa el valor de MG: ");
        kg = sc.nextDouble();

        resultado = kg / MG;

        System.out.print("El valor de MG " + kg + " es igual a " + resultado + " KG");

        sc.close();

    }
}
