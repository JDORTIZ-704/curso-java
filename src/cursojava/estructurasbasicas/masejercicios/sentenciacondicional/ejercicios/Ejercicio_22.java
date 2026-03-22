package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {

        final int TOTAL = 6660;
        final int DAY = 1440;

        Scanner sc = new Scanner(System.in);

        String day;
        int hours;
        int minutes;
        int minuteMoreHours;
        int result;
        int dayNumber = 0;

        System.out.print("Día: ");
        day = sc.nextLine();
        System.out.print("Horas: ");
        hours = sc.nextInt();
        sc.nextLine();
        System.out.print("Minutos: ");
        minutes = sc.nextInt();
        sc.nextLine();

        minuteMoreHours = (hours * 60) + minutes;

        dayNumber = switch (day) {
            case "lunes" -> 1;
            case "martes" -> 2;
            case "miércoles" -> 3;
            case "jueves" -> 4;
            case "viernes" -> 5;
            default -> dayNumber;
        };

        result = TOTAL - ((dayNumber - 1) * DAY + minuteMoreHours);
        System.out.print("Minutos para el fin de semana: " + result);


    }
}
