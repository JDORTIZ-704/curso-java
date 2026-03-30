package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String jugador1;
        String jugador2;

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        jugador1 = sc.nextLine();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        jugador2 = sc.nextLine();

        if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
        } else if (
                (jugador1.equals("piedra") && jugador2.equals("tijera")) ||
                        (jugador1.equals("tijera") && jugador2.equals("papel"))  ||
                        (jugador1.equals("papel")  && jugador2.equals("piedra"))
        ) {
            System.out.println("Gana el jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }

        sc.close();
    }
}
