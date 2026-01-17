package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        /*scribe un programa que calcule el salario semanal de un empleado con base en
        las horas trabajadas, a razón de 12 euros la hora.*/

        Scanner sc = new Scanner(System.in);

        int salarioHora = 12;
        double horasLaboradas;
        double totalPago;


        System.out.print("Valor hora -> " + salarioHora);
        System.out.print("\nIngresa las horas trabajadas en las semana: ");
        horasLaboradas = sc.nextDouble();
        totalPago = horasLaboradas * salarioHora;
        System.out.print("El pago total de la semana es: " + totalPago);

        sc.close();

    }
}
