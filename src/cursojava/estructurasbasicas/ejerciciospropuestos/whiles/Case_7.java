package cursojava.estructurasbasicas.ejerciciospropuestos.whiles;

public class Case_7 {

    public static void main(String[] args) {

        // Caso #7 -> Mostrar los números pares del 1 al 100.

        System.out.println("Caso #7 -> Mostrar los números pares del 1 al 100.");

        int numero = 2;

//        while (numero <= 100) {
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//            numero++;
//        }

        // Otra opción

        while (numero <= 100) {
            System.out.println(numero);
            numero += 2;
        }

    }
}
