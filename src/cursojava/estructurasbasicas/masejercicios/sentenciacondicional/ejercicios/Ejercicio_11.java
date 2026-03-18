package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        /*Escribe un programa que dada una hora determinada (horas y minutos), calcule
        los segundos que faltan para llegar a la medianoche.*/

        Scanner sc = new Scanner(System.in);

        int horas;
        int minutos;
        int resultadoHoras;
        int resultadoSegundos;
        int segundos = 86400;

        System.out.print("Ingresa la hora militar: ");
        horas = sc.nextInt();
        System.out.print("Ingresa los minutos: ");
        minutos = sc.nextInt();

        resultadoHoras = horas * 60;
        resultadoSegundos = (resultadoHoras + minutos) * 60;

        if (resultadoSegundos < segundos) {
            System.out.print("Faltan " + (segundos - resultadoSegundos));
        } else if (resultadoSegundos == segundos) {
            System.out.print("No faltan segundos");
        } else {
            System.out.print("No ingresaste una hora correcta. ");
        }

        sc.close();

    }
}
