package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        /*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
        las horas extras. Escribe un programa que calcule el salario semanal de un
        trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
        trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
        la hora.
        Ejemplo 1:
        Por favor, introduzca el número de horas trabajadas durante la semana: 3 6
        El sueldo semanal que le corresponde es de 432 euros
        Ejemplo 2:
        Por favor, introduzca el número de horas trabajadas durante la semana: 4 0
        El sueldo semanal que le corresponde es de 480 euros
        Ejemplo 3:
        Por favor, introduzca el número de horas trabajadas durante la semana: 5 5
        El sueldo semanal que le corresponde es de 720 euros*/

        Scanner sc = new Scanner(System.in);

        int horasTrabajo;
        int salarioExtra = 16;
        int salarioNormal = 12;
        int resultado;

        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        horasTrabajo = sc.nextInt();

        if (horasTrabajo > 41) {
            resultado = (40 * 12) + ((horasTrabajo- 40) * salarioExtra);
        } else {
            resultado = salarioNormal * horasTrabajo;
        }

        System.out.print("El sueldo semanal que le corresponde es de " + resultado + " euros");


    }
}
