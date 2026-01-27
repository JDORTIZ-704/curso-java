package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        /*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
        Ejemplo 1:
        Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
        Por favor, introduzca el valor de a: 2
        Ahora introduzca el valor de b: 1
        x = -0.5
        Ejemplo 2:
        Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
        Por favor, introduzca el valor de a: 0
        Ahora introduzca el valor de b: 7
        Esa ecuación no tiene solución real.
*/

        Scanner sc = new Scanner(System.in);

        double a;
        double b;

        System.out.print("Ingresa el valor de a: ");
        a = sc.nextInt();
        System.out.print("Ingresa el valor de b: ");
        b = sc.nextInt();

        if (a == 0) {
            System.out.print("Esa ecuación no tiene solución real.");
        } else {
            System.out.print("x = " + (-b / a));
        }

        sc.close();

    }
}
