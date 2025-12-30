package cursojava.estructurasbasicas.trabajofinal;

import java.util.Scanner;

public class Trabajo_1 {

    public static void main(String[] args) {

        System.out.println("...Sistema de Análisis de Notas...");

        Scanner sc = new Scanner(System.in);

        int cantidadEstudiantes;
        double notaEstudiante;
        int contarAprovados = 0;
        int contarDesaprovados = 0;
        double promedio = 0;
        boolean condicion = false;

        do {
            System.out.print("Ingresa la cantidad de estudiantes: ");
            cantidadEstudiantes = sc.nextInt();

            if (cantidadEstudiantes <= 0) {
                System.out.print("Debes ingresar mas de 1 estudiante\n");
            } else {
                condicion = true;
            }

        } while (!condicion);

        double[] listaNotas = new double[cantidadEstudiantes];

        System.out.println("Ingresa las Notas de los estudiantes (0 a 5): ");

        for (int i = 0; i < cantidadEstudiantes; i++) {

            while (true) {

                System.out.print("Estudiante #" + (i + 1) + ". Nota: ");
                notaEstudiante = sc.nextDouble();

                if (notaEstudiante >= 0 && notaEstudiante <= 5) {
                    listaNotas[i] = notaEstudiante;
                    break;
                } else {
                    System.out.println("Nota no aceptada por el sistema.");
                }
            }
        }

        double max = listaNotas[0];
        double min = listaNotas[0];

        for (double listaNota : listaNotas) {
            if (listaNota > max) {
                max = listaNota;
            }
            if (listaNota < min) {
                min = listaNota;
            }
            if (listaNota >= 3.0) {
                contarAprovados++;
            } else {
                contarDesaprovados++;
            }
            promedio += listaNota;
        }

        System.out.println("------------------------------------------------------");

        System.out.println("Promedio del Curso: " + promedio / cantidadEstudiantes);
        System.out.println("Nota mas baja del Curso: " + min);
        System.out.println("Nota mas alta del Curso: " + max);
        System.out.println("Cantidad de aprobados (>= 3.0): " + contarAprovados);
        System.out.println("Cantidad de reprobados (< 3.0): " + contarDesaprovados);

    }
}
