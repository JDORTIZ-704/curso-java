package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_8 {
    public static void main(String[] args) {

        /* Ejercicio 10:Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el
        arreglo(N es digitado por el usuario). */

        Scanner sc = new Scanner(System.in);

        int [] lista = new int[10];
        int ultimo;

        System.out.println("Llenar el Array");

        for (int i=0; i<lista.length; i++) {
            System.out.print((i+1) + ". Digita un numero: ");
            lista[i] = sc.nextInt();
        }

        System.out.print("Desplazamiento de: ");
        int desplazar = sc.nextInt();

        for (int i=1; i<=desplazar; i++) {
            ultimo = lista[9];
            for (int j=8; j>=0; j--) {
                lista[j+1] = lista[j];
            }
            lista[0] = ultimo;
        }

        for (int nuevaLista:lista) {
            System.out.print(nuevaLista + "-");
        }

    }
}
