package cursojava.estructurasbasicas.ejerciciospropuestos.controlflujo;

public class Case_21 {

    public static void main (String[] args) {
        // Caso #21 -> Buscar el primer número divisible por 7 entre 1 y 100 y detener el bucle.

        int i = 1;

        while (i <= 100) {
            if (i % 7 == 0) {
                break;
            }
            i++;

        }

        System.out.print(i);
    }
}
