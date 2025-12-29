package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

public class Case_P_12 {

    public static void main(String[] args) {

        // Leer dos series de 10 números enteros, que estarán ordenados crecientemente.
        // Copiar (fusionar) las tablas en una tercera, de forma que sigan ordenados.

        int conteo = 0;

        int [] serie1 = {12,23,34,45,56,67,78,89,90,95};
        int [] serie2 = {13,24,35,46,57,68,79,80,91,99};
        int [] fusion = new int [20];

        for (int i=0; i<10; i++) {
            if (serie1[i] > serie2[i]) {
                fusion[i] = i;
            }
        }



    }

}
