package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        /*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
        convertir debe ser introducida por teclado.*/

        Scanner sc = new Scanner(System.in);

        double valorPeseta = 3721.01;
        double euros;
        double resultado;
        System.out.println("El valor de la PESETA ES: "  + valorPeseta);

        System.out.print("Cuantos EUROS quieres convertir? -> ");
        euros = sc.nextDouble();

        resultado =  valorPeseta * euros;

        System.out.print(euros + " EUROS equivalen a " + resultado + " PESETAS");

        sc.close();

    }
}
