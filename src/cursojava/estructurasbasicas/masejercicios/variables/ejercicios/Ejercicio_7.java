package cursojava.estructurasbasicas.masejercicios.variables.ejercicios;

public class Ejercicio_7 {
    public static void main(String[] args) {

        /*Escribe un programa que declare variables de tipo char y de tipo String. Intenta
        mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
        de Java (con un solo println) ¿es posible?*/

        char a = 'H';
        char b = 'O';
        char c = 'L';
        char d = 'A';
        String nombre = "Juan David Ortiz Forero";

        System.out.printf("%-1s%-1s%-1s%-1s %-20s", a, b, c, d, nombre);

    }
}
