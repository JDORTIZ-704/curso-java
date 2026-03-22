package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double firstControl;
        double secondControl;
        double result;
        String recuperation;

        System.out.print("Nota del primer control: ");
        firstControl = sc.nextInt();
        sc.nextLine();
        System.out.print("Nota del segundo control: ");
        secondControl = sc.nextInt();
        sc.nextLine();

        result = (firstControl + secondControl) / 2;

        if (result < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            recuperation = sc.nextLine();
            if (recuperation.equals("apto")) {
                result = 5;
            }
        }

        System.out.print("Tu nota de Programación es: " + result);

        sc.close();

    }
}
