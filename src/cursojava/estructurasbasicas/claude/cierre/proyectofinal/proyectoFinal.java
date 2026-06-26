package cursojava.estructurasbasicas.claude.cierre.proyectofinal;

import java.util.Scanner;

public class proyectoFinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays (Datos estudiantes)

        double[][] notas = new double[20][3];
        String[] nombres = new String[20];
        int[] edad = new int[20];
        double[] promedio = new double[20];

        // Variables

        boolean condicionMenu = false;
        int opcionMenu;
        int contadorEstudiante = 0;
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
                    if (contadorEstudiante == 20) {
                        System.out.println("Máximo de estudiantes alcanzado (20)");
                    } else {
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
                    }
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
                    boolean buscarEstudiante = false;
                    System.out.print("Ingresa el nombre del estudiante a consultar: ");
                    consultaEstudiante = sc.nextLine();

                    for (int x = 0; x < contadorEstudiante; x++) {
                        if (nombres[x].contains(consultaEstudiante)) {
                            System.out.println("Estudiante: " + nombres[x] + ", edad " + edad[x]);
                            for (int h = 0; h < 3; h++) {
                                System.out.println("Nota #" + (h + 1) + ": " + notas[x][h]);
                            }
                            buscarEstudiante = true;
                        }
                    }
                    if (!buscarEstudiante) {
                        System.out.println("Estudiante no encontrado");
                    }
                    break;
                case 4:
                    double prePromedio = 0;
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
                        for (int u = 0; u < contadorEstudiante; u++) {
                            prePromedio += promedio[u];
                        }
                        System.out.println("El promedio general del curso es: " + Math.round(prePromedio / contadorEstudiante * 100.0) / 100.0);
                    }
                    break;
                case 5:

                    int indiceMax = 0;
                    int indiceMin = 0;

                    for (int p = 0; p < contadorEstudiante; p++) {
                        if (promedio[p] > promedio[indiceMax]) {
                            indiceMax = p;
                        }
                        if (promedio[p] < promedio[indiceMin]) {
                            indiceMin = p;
                        }
                    }

                    System.out.println("Máximo promedio: " + promedio[indiceMax]);
                    System.out.println("Estudiante: " + nombres[indiceMax] + ", edad " + edad[indiceMax]);
                    for (int v = 0; v < 3; v++) {
                        System.out.println("Nota #" + (v + 1) + ": " + notas[indiceMax][v]);
                    }
                    System.out.println("Mínimo promedio: " + promedio[indiceMin]);
                    System.out.println("Estudiante: " + nombres[indiceMin] + ", edad " + edad[indiceMin]);
                    for (int t = 0; t < 3; t++) {
                        System.out.println("Nota #" + (t + 1) + ": " + notas[indiceMin][t]);
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
