package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        /*Escribe un programa que pida por teclado un día de la semana y que diga qué
        asignatura toca a primera hora ese día.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miércoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.print("Selecciona el día de la semana: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Lunes -> Calculo vectorial");
                break;
            case 2:
                System.out.print("Martes -> Métodos numéricos");
                break;
            case 3:
                System.out.print("Miércoles -> Bases de datos distribuidas");
                break;
            case 4:
                System.out.print("Jueves -> Hora libre");
                break;
            case 5:
                System.out.print("Viernes -> Métodos numéricos");
                break;
            default:
                System.out.print("No existe esa opción.");
        }

        sc.close();

    }
}
