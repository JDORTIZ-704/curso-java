package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {


        // Amplía el programa anterior para que diga la nota del boletín (insuficiente,
        //suficiente, bien, notable o sobresaliente).


        // insuficiente  -> 0.0 - 2.9
        // suficiente    -> 3.0 - 3.9
        // bien          -> 4.0 - 4.4
        // notable       -> 4.5 - 4.9
        // sobresaliente -> 5.0

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

        System.out.print("Nota final: " + result + "\n");

        if (result < 3.0) {
            System.out.println("insuficiente");
        } else if (result < 4.0) {
            System.out.println("suficiente");
        } else if (result < 4.5) {
            System.out.println("bien");
        } else if (result < 5.0) {
            System.out.println("notable");
        } else {
            System.out.println("sobresaliente");
        }

        sc.close();

    }
}
