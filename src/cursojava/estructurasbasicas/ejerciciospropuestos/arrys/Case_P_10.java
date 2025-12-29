package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Case_P_10 {
    public static void main(String[] args) {

        // Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9).
        // Eliminar el elemento situado en la posición dada sin dejar huecos.

        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[10];
        int entradaArreglo;
        int posicion;
        boolean condicion = false;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ". Introduce un número: ");
            entradaArreglo = sc.nextInt();
            arreglo[i] = entradaArreglo;
        }

        do {
            System.out.print("Ingresa una posición: ");
            posicion = sc.nextInt();
            if (posicion >= 0 && posicion <= arreglo.length) {
                condicion = true;
            } else {
                System.out.println("Digita de nuevo la posición (0 a 9)");
            }
        } while (!condicion);

        for (int i = 0; i < 9; i++) {
            if (i >= posicion) {
                arreglo[i] = arreglo[i + 1]; // Aquí mueve los elementos a la izquierda (Eliminando el número), si es al contrario, solo suma un espacio a la derecha (Así se puede rellenar).
            }
        }

        for (int nuevoArreglo : arreglo) {
            System.out.println(nuevoArreglo);
        }
    }
}
