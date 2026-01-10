package cursojava.estructurasbasicas.masejercicios.entradaysalidadatos.ejercicios;

public class Ejercicio_3 {

    public static void main(String[] args) {

/*      Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
        correspondiente traducción al castellano. Las palabras deben estar distribuidas
        en dos columnas y alineadas a la izquierda.
        Ejemplo:
        computer ordenador
        student alumno\a
        cat gato
        penguin pingüino
        machine máquina
        nature naturaleza
        light luz
        green verde
        book libro
        pyramid pirámide
        */

        System.out.println("English      |      Español");
        System.out.println("---------------------------");
        System.out.printf("%-10s   |   %10s\n", "computer", "ordenador");
        System.out.printf("%-10s   |   %10s\n", "student", "alumno-a");
        System.out.printf("%-10s   |   %10s\n", "cat", "gato");
        System.out.printf("%-10s   |   %10s\n", "penguin", "pingüino");
        System.out.printf("%-10s   |   %10s\n", "machine", "maquina");
        System.out.printf("%-10s   |   %10s\n", "nature", "naturaleza");
        System.out.printf("%-10s   |   %10s\n", "light", "luz");
        System.out.printf("%-10s   |   %10s\n", "green", "verde");
        System.out.printf("%-10s   |   %10s\n", "book", "libro");
        System.out.printf("%-10s   |   %10s\n", "pyramid", "pirámide");

    }

}
