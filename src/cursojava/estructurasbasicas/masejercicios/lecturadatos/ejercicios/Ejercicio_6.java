package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {

        //Escribe un programa que calcule el área de un triángulo.

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double resultado;

        System.out.print("Base: ");
        base = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextDouble();

        resultado = (base * altura) / 2;

        System.out.print("El área del triángulo es: " + resultado);

        sc.close();

    }
}

