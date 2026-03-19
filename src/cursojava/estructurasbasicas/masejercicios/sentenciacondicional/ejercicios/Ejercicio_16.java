package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String answer;
        int score = 0;

        System.out.println("Answer true or false");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti. ");
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        System.out.println("9. Has notado que últimamente se perfuma más.");
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Your answer #" + i + ": ");
            answer = sc.next();

            if (answer.equals("true")) {
                score += 3;
            }
        }

        if (score >= 23) {
            System.out.println("all the ingredients for a romance");
        } else if (score >= 11) {
            System.out.println("There may be danger");
        } else {
            System.out.println("faithful partner");
        }

        sc.close();

    }
}
