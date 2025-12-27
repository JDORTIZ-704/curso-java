package cursojava.estructurasbasicas.ejerciciospropuestos.integradores;

public class Case_25 {

    public static void main (String[] args) {

//        25.	Mostrar los números del 1 al 100, pero:
//        •	“Fizz” si es múltiplo de 3
//        • “Buzz” si es múltiplo de 5
//        •	“FizzBuzz” si es múltiplo de ambos

        for (int i=1; i<=100; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else {
                System.out.println(i);
            }

        }

    }
}
