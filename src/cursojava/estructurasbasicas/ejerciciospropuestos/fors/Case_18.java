package cursojava.estructurasbasicas.ejerciciospropuestos.fors;

public class Case_18 {

    public static void main (String[] args) {

        // caso #18 -> Contar cuántos múltiplos de 3 hay entre 1 y 100.

        int count = 0;

        for (int i=3; i<100; i+=3){
            count++;
        }

        System.out.println("Existen " + count + " multiplos de 3 del 1 al 100");

    }
}
