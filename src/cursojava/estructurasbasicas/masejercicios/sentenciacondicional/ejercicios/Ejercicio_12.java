package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {

        /*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
        que se imparten en el curso. Cada pregunta acertada sumará un punto. El
        programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
        tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
        en las diferentes asignaturas del curso.*/

        Scanner sc = new Scanner(System.in);
        int resultado;
        int contador = 0;

        System.out.println("Preguntas");
        System.out.println("------------------");

        //1
        System.out.print("Sumas 0+1: ");
        resultado = sc.nextInt();
        if (resultado == 1) {
            contador++;
        }
        //2
        System.out.print("Sumas 1+1: ");
        resultado = sc.nextInt();
        if (resultado == 2) {
            contador++;
        }
        //3
        System.out.print("Sumas 2+1: ");
        resultado = sc.nextInt();
        if (resultado == 3) {
            contador++;
        }
        //4
        System.out.print("Sumas 3+1: ");
        resultado = sc.nextInt();
        if (resultado == 4) {
            contador++;
        }
        //5
        System.out.print("Sumas 4+1: ");
        resultado = sc.nextInt();
        if (resultado == 5) {
            contador++;
        }
        //6
        System.out.print("Sumas 5+1: ");
        resultado = sc.nextInt();
        if (resultado == 6) {
            contador++;
        }
        //7
        System.out.print("Sumas 6+1: ");
        resultado = sc.nextInt();
        if (resultado == 7) {
            contador++;
        }
        //8
        System.out.print("Sumas 7+1: ");
        resultado = sc.nextInt();
        if (resultado == 8) {
            contador++;
        }
        //9
        System.out.print("Sumas 8+1: ");
        resultado = sc.nextInt();
        if (resultado == 9) {
            contador++;
        }
        //10
        System.out.print("Sumas 9+1: ");
        resultado = sc.nextInt();
        if (resultado == 10) {
            contador++;
        }

        sc.close();

        System.out.println("Tu nota final es " + contador + "/10");

    }
}
