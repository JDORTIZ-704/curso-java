package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        /*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
        nombre del día de la semana.*/

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.print("Ingresa un número del 1 al 7: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Lunes");
                break;
            case 2:
                System.out.print("Martes");
                break;
            case 3:
                System.out.print("Miércoles");
                break;
            case 4:
                System.out.print("Jueves");
                break;
            case 5:
                System.out.print("Viernes");
                break;
            case 6:
                System.out.print("Sábado");
                break;
            case 7:
                System.out.print("Domingo");
                break;
            default:
                System.out.print("No existe esa opción.");
        }

        sc.close();

    }
}
