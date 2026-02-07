package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

        //Escribe un programa que nos diga el horóscopo a partir del día y el mes de
        //nacimiento.

        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;

        System.out.print("Ingresa tu día de nacimiento: ");
        dia = sc.nextInt();
        System.out.print("Ingresa tu mes de nacimiento: ");
        mes = sc.nextInt();

        if (dia >=21 && dia <=19) {
            System.out.println("hola");
        }



    }
}
