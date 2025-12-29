package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_7 {
    public static void main(String[] args) {

        /* Ejercicio 9:Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una
        posición hacia abajo:
        el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente.El último pasa a ser el
        primero. */

        Scanner sc = new Scanner(System.in);


        int [] list = new int [10];

        System.out.println("Llenar el Array");
        for (int i=0; i<10; i++) {
            System.out.print(i+". Digita un numero: ");
            list[i] = sc.nextInt();
        }

        int ultimo = list[9]; // Guardar el ultimo elemento guardado

        for (int i=8; i>=0; i--) {
            list[i+1] = list[i]; // aqui no se suma +1 al valor, cuando esta dentro de los[] solo aumenta la poscisión
        }

        list[0] = ultimo;

        System.out.println("El nuevo arreglo es: ");
        for (int nuevo:list) {
            System.out.println(nuevo);
        }




    }
}
