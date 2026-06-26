package cursojava.estructurasbasicas.claude.cierre.proyectofinal;

import java.util.Arrays;
import java.util.Scanner;

public class proyectoFinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays (Datos estudiantes)

        double[][] notas = new double[2][3];
        String[] nombres = new String[2];
        int[] edad = new int[2];
        double[] promedio = new double[2];

        // Variables

        boolean condicionMenu = false;
        int opcionMenu;
        int contadorEstudiante = 0;
        double prePromedio = 0;
        String consultaEstudiante;

        // Menú

        do {

            System.out.println("=== SISTEMA DE ESTUDIANTES ===");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Ver todos los estudiantes");
            System.out.println("3. Buscar estudiante por nombre");
            System.out.println("4. Ver promedio del salon");
            System.out.println("5. Ver mejor y peor estudiante");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            opcionMenu = sc.nextInt();
            sc.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.print("Ingresa el nombre del estudiante #" + (contadorEstudiante + 1) + ": ");
                    nombres[contadorEstudiante] = sc.nextLine();
                    System.out.print("Ingresa la edad del estudiante: ");
                    edad[contadorEstudiante] = sc.nextInt();
                    sc.nextLine();
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Ingresa la nota #" + (j + 1) + ": ");
                        notas[contadorEstudiante][j] = sc.nextDouble();
                        sc.nextLine();
                    }
                    contadorEstudiante++;
                    break;
                case 2:
                    if (contadorEstudiante == 0) {
                        System.out.println("No existen registros");
                    } else {
                        for (int x = 0; x < contadorEstudiante; x++) {
                            System.out.println("Estudiante #" + (x + 1) + ": " + nombres[x] + ", edad " + edad[x]);
                            for (int h = 0; h < 3; h++) {
                                System.out.println("Nota #" + (h + 1) + ": " + notas[x][h]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el nombre del estudiante a consultar: ");
                    consultaEstudiante = sc.nextLine();

                    for (int x = 0; x < contadorEstudiante; x++) {
                        if (nombres[x].contains(consultaEstudiante)) {
                            System.out.println("Estudiante: " + nombres[x] + ", edad " + edad[x]);
                            for (int h = 0; h < 3; h++) {
                                System.out.println("Nota #" + (h + 1) + ": " + notas[x][h]);
                            }
                        } else {
                            System.out.println("Estudiante no encontrado");
                        }
                    }
                    break;
                case 4:
                    for (int k = 0; k < contadorEstudiante; k++) {
                        double sumaNotas = 0;
                        for (int s = 0; s < 3; s++) {
                            sumaNotas += notas[k][s];
                        }
                        promedio[k] = sumaNotas / 3;
                    }

                    if (contadorEstudiante == 0) {
                        System.out.println("No existen registros");
                    } else {
                        for (double arrayPromedio : promedio) {
                            prePromedio += arrayPromedio;
                        }
                        System.out.println("El promedio general del curso es: " + Math.round(prePromedio / contadorEstudiante * 100.0) / 100.0);
                    }
                    break;
                case 5:
                    Arrays.sort(promedio);
                    System.out.println("Máximo promedio: " + promedio[promedio.length - 1]);
                    System.out.println("Estudiante: " + nombres[0] + ", edad " + edad[0]);
                    for (int v = 0; v < 3; v++) {
                        System.out.println("Nota #" + (v + 1) + ": " + notas[0][v]);
                    }
                    System.out.println("Mínimo promedio: " + promedio[0]);
                    System.out.println("Estudiante: " + nombres[promedio.length - 1] + ", edad " + edad[promedio.length - 1]);
                    for (int t = 0; t < 3; t++) {
                        System.out.println("Nota #" + (t + 1) + ": " + notas[promedio.length - 1][t]);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    condicionMenu = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (!condicionMenu);
    }
}
