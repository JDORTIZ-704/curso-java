package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double palmera = 1.40;
        final double donut = 1;
        final double pitufoAceite = 1.20;
        final double pitufoTortilla = 1.60;
        final double zumo = 1.50;
        final double cafe = 1.20;

        String comida;
        String bebida;
        String opcionPitufo = "";

        double totalDesayuno;
        double subTotalComida = 0;
        double subTotalBebida = 0;

        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        comida = sc.nextLine();
        if (comida.equals("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            opcionPitufo = sc.nextLine();
        }
        System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
        bebida = sc.nextLine();

        switch (comida) {
            case "palmera" -> {
                subTotalComida += palmera;
                System.out.println(comida + ": " + palmera);
            }
            case "donut" -> {
                subTotalComida += donut;
                System.out.println(comida + ": " + donut);
            }
            case "pitufo" -> {
                if (opcionPitufo.equals("aceite")) {
                    subTotalComida += pitufoAceite;
                    System.out.println(comida + " con " + opcionPitufo + ": " + pitufoAceite);
                } else if (opcionPitufo.equals("tortilla")) {
                    subTotalComida += pitufoTortilla;
                    System.out.println(comida + " con " + opcionPitufo + ": " + pitufoTortilla);
                }
            }
        }

        if (bebida.equals("zumo")) {
            subTotalBebida += zumo;
            System.out.println(bebida + ": " + zumo);
        } else if (bebida.equals("cafe")) {
            subTotalBebida += cafe;
            System.out.println(bebida + ": " + cafe);
        }

        totalDesayuno = subTotalComida + subTotalBebida;

        System.out.println("Total desayuno: " + totalDesayuno);

        sc.close();

    }
}
