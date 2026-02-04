package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {

        // Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax^2 + bx + c = 0).

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Ingresa el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Ingresa el valor de b: ");
        b = sc.nextDouble();
        System.out.print("Ingresa el valor de c: ");
        c = sc.nextDouble();

        double primeraParte = (Math.pow(b, 2) - (4 * a) * c);
        double raiz = Math.sqrt(primeraParte);

        double resultadoPositivo = (-(b)+raiz)/(2*a);
        double resultadoNegativo = (-(b)-raiz)/(2*a);

        System.out.println("Resultado Positivo: " + resultadoPositivo);
        System.out.println("Resultado Negativo: " + resultadoNegativo);
    }
}
