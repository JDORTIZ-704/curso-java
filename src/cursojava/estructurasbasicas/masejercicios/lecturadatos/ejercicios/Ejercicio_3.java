package cursojava.estructurasbasicas.masejercicios.lecturadatos.ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        /*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
        convertir debe ser introducida por teclado.*/

        Scanner sc = new Scanner(System.in);

        double valorPeseta = 3721.01;
        double euros;
        double resultado;
        System.out.println("El valor de la PESETA ES: "  + valorPeseta);

        System.out.print("Cuantos PESETAS quieres convertir? -> ");
        euros = sc.nextDouble();

        resultado =  euros / valorPeseta;

        System.out.print(euros + " PESETAS equivalen a " + resultado + " EUROS");

        sc.close();

    }
}
