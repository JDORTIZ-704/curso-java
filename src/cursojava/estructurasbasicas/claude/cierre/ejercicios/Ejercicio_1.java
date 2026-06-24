package cursojava.estructurasbasicas.claude.cierre.ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        int resultadoDivision;
        int resultadoResiduo;
        boolean condicionCero = false;

        do {

            System.out.print("Ingresa el primer número: ");
            a = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingresa el segundo número: ");
            b = sc.nextDouble();
            sc.nextLine();

            if (b == 0) {
                System.out.println("No se puede dividir por 0, debes ingresar otro número");
            } else {
                condicionCero = true;
            }

        } while (!condicionCero);

        //Suma
        System.out.println("Suma -> " + a + " + " + b + " = " + (a + b));
        //Resta
        System.out.println("Resta -> " + a + " - " + b + " = " + (a - b));
        //Multiplicación
        System.out.println("Multiplicación -> " + a + " * " + b + " = " + (a * b));
        //División
        resultadoDivision = (int) (a / b); // Casting después de realizar la operación, para mantener la operación correcta
        System.out.println("División -> " + a + " / " + b + " = " + resultadoDivision);
        //Residuo
        resultadoResiduo = (int) (a % b);
        System.out.println("Residuo -> " + a + " % " + b + " = " + resultadoResiduo);

        sc.close();

    }
}
