package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

        /*Realiza un conversor de Mb a Kb.*/

        Scanner sc = new Scanner(System.in);

        final int MG = 1024;
        double kg;
        double resultado;

        System.out.print("Ingresa el valor de KG: ");
        kg = sc.nextDouble();

        resultado = MG * kg;

        System.out.print("El valor de KG " + kg + " es igual a " + resultado + " MG");

        sc.close();

    }
}
