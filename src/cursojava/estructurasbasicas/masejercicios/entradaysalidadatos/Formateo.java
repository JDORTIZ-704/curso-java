package cursojava.estructurasbasicas.masejercicios.entradaysalidadatos;

public class Formateo {

    public static void main(String[] args) {

        /*System.out.printf("El número %d no tiene decimales. \n", 21);
        System.out.printf("El número %f sale con decimales. \n", 21.0);
        System.out.printf("El %.3f sale exactamente con 3 decimales. \n", 21.432);*/

        System.out.println("  Articulo     Precio/Caja    N° Cajas");
        System.out.println("----------------------------------------");
        System.out.printf("%-10s    %8.2f       %6d\n",  "Manzanas", 4.5, 10);
        System.out.printf("%-10s    %8.2f       %6d\n",  "Peras", 2.75, 120);
        System.out.printf("%-10s    %8.2f       %6d\n",  "Aguacates", 10.0, 6);

    }
}
