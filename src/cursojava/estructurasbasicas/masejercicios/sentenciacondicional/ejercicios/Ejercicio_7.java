package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.awt.geom.RectangularShape;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        //Realiza un programa que calcule la media de tres notas.

        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double result;

        System.out.print(".Media de notas.");
        System.out.print("\nPrimera nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Tercero nota: ");
        nota3 = sc.nextDouble();

        result = (nota1 + nota2 + nota3) / 3;

        System.out.print("Nota final: " + result);

        sc.close();

    }
}
