package cursojava.estructurasbasicas.masejercicios.variables.ejercicios;

public class Ejercicio_1 {
    public static void main(String[] args) {

        /*Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
        los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
        el valor de cada variable, la suma, la resta, la división y la multiplicación.*/

        int x = 144;
        int y = 999;

        System.out.println("Suma de " + x + " + " + y + " es igual a " + (x+y));
        System.out.println("Resta de " + x + " - " + y + " es igual a " + (x-y));
        System.out.println("División de " + x + " / " + y + " es igual a " + ((double)x/y));
        System.out.println("Multiplicación de " + x + " * " + y + " es igual a " + (x*y));
    }
}
