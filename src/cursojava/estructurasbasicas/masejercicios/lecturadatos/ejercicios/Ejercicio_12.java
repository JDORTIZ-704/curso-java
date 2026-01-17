package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {

        /*Realiza un programa que calcule la nota que hace falta sacar en el segundo
        examen de la asignatura Programación para obtener la media deseada. Hay
        que tener en cuenta que la nota del primer examen cuenta el 40% y la del
        segundo examen un 60%.*/

/*
        Ejemplo 1:
        Introduce la nota del primer examen: 7
        ¿Qué nota quieres sacar en el trimestre? 8.5
        Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
*/


        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double resultado;

        System.out.print("Introduce la nota del primer examen: ");
        nota1 = sc.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        nota2 = sc.nextDouble();

        resultado = (nota2 - (nota1 * 0.4)) / 0.6;

        System.out.print("\nPara tener un " + nota2 + " en el trimestre necesitas sacar un " + resultado + " en el segundo examen.");

        sc.close();

    }
}
