package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

public class Case_P_2 {

    public static void main(String[] args) {

        // Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma:
        // el 1° de A, el 1° de B, el 2° de A, el 2° de B, etc.

        int[] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] b = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] c = new int[20];

        int j  = 0;
        for (int i = 0; i < a.length; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }

        for (int listArray:c) {
            System.out.println(listArray);
        }


    }
}
