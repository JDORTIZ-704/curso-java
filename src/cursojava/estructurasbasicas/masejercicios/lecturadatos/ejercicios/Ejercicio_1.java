package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        /*Realiza un programa que pida dos números y que luego muestre el resultado
        de su multiplicación.*/

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int resultado;

        System.out.print("Introduce el primer número: ");
        numero1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        numero2 = sc.nextInt();

        resultado = numero1 * numero2;

        System.out.println("El resultado es " + resultado);

        sc.close();

    }
}
