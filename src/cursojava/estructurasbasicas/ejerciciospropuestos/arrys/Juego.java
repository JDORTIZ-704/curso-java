package cursojava.estructurasbasicas.ejerciciospropuestos.arrys;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {

        // Constantes para representar el contenido de las celdas
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int x, y;
        int[][] cuadrante = new int[5][4];

        // Inicializa el array completo (5x4)
        for (x = 0; x < cuadrante.length; x++) {
            for (y = 0; y < cuadrante[0].length; y++) {
                cuadrante[x][y] = VACIO;
            }
        }

        // Coloca la mina
        int minaX = (int) (Math.random() * cuadrante.length);       // 0..4
        int minaY = (int) (Math.random() * cuadrante[0].length);    // 0..3
        cuadrante[minaX][minaY] = MINA;

        // Coloca el tesoro (en una posición distinta a la mina)
        int tesoroX, tesoroY;
        do {
            tesoroX = (int) (Math.random() * cuadrante.length);
            tesoroY = (int) (Math.random() * cuadrante[0].length);
        } while (minaX == tesoroX && minaY == tesoroY);
        cuadrante[tesoroX][tesoroY] = TESORO;

        // Juego
        System.out.println("¡BUSCA EL TESORO!");
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            // Pinta el cuadrante (sin revelar mina/tesoro)
            for (y = cuadrante[0].length - 1; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < cuadrante.length; x++) {
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println(" ----------");
            System.out.println("  0 1 2 3 4");
            System.out.println();

            // Pide coordenadas con validación de rango
            while (true) {
                System.out.print("Coordenada x (0-4): ");
                x = sc.nextInt();
                System.out.print("Coordenada y (0-3): ");
                y = sc.nextInt();

                if (x >= 0 && x < cuadrante.length && y >= 0 && y < cuadrante[0].length) {
                    break;
                }
                System.out.println("Coordenadas fuera de rango. Intenta de nuevo.\n");
            }

            // Mira lo que hay en las coordenadas
            switch (cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                    salir = true;
                    break;
                case INTENTO:
                    System.out.println("Ya intentaste ahí. Prueba otra coordenada.");
                    break;
                default:
                    break;
            }

        } while (!salir);

        // Pinta el cuadrante final (revela mina y tesoro)
        System.out.println();
        for (y = cuadrante[0].length - 1; y >= 0; y--) {
            System.out.print(y + "|");
            for (x = 0; x < cuadrante.length; x++) {
                String c;
                switch (cuadrante[x][y]) {
                    case VACIO:
                        c = "  ";
                        break;
                    case MINA:
                        c = "* ";
                        break;
                    case TESORO:
                        c = "€ ";
                        break;
                    case INTENTO:
                        c = "X ";
                        break;
                    default:
                        c = "? ";
                        break;
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" ----------");
        System.out.println("  0 1 2 3 4");

        sc.close();
    }
}
