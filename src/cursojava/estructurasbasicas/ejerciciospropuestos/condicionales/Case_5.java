package cursojava.estructurasbasicas.ejerciciospropuestos.condicionales;

import java.util.Scanner;

public class Case_5 {

    public static void main (String[] args) {

        // Caso #5 -> Usar switch para leer un número del 1 al 7 y mostrar el día de la semana.

        System.out.println("Case #5 -> Use switch to read a number from 1 to 7 and display the day of the week.");

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of Week: ");

        int numberWeek = input.nextInt();

        switch (numberWeek) {
            case 1:
                System.out.print("Monday");
            break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("It's not a day of the week");
        }

        input.close();

    }
}
