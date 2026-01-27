package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        /*Realiza un programa que pida una hora por teclado y que muestre luego buenos
        días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
        6 a 12, de 13 a 20 y de 21 a 5. Respectivamente. Solo se tienen en cuenta las
        horas, los minutos no se deben introducir por teclado.*/

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.print("Introduce la hora: ");
        hora = sc.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.print("Buenos días");
        }else if (hora >= 13 && hora <= 20) {
            System.out.print("Buenas tardes");
        }else if (hora >= 5 && hora <= 21) {
            System.out.print("Buenas noches");
        }

        //otra forma más profesional.

        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Buenos días");
        }
        if ((hora >= 13) && (hora <= 20)) {
            System.out.println("Buenas tardes");
        }
        if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
            System.out.println("Buenas noches");
        }
        if ((hora >= 24) || (hora < 0)) {
            System.out.println("La hora introducida no es correcta.");
        }
    }
}
