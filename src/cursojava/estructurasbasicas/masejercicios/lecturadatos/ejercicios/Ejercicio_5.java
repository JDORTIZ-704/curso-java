package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        //Escribe un programa que calcule el área de un rectángulo.
        // A = B * AL

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double resultado;

        System.out.print("Base: ");
        base = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextDouble();

        resultado = base * altura;

        System.out.print("El área del rectángulo es: " + resultado);

        sc.close();

    }
}
