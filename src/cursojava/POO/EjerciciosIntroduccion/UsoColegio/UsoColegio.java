package cursojava.POO.EjerciciosIntroduccion.UsoColegio;

import java.util.Scanner;

public class UsoColegio {

    public static void main(String[] args) {

        Colegio Cervantes = new Colegio("Cervantes", 20);
        Scanner sc = new Scanner(System.in);

        int consultaAlumno;

        Cervantes.setCrearAlumno("Juanito", 8.5);
        Cervantes.setCrearAlumno("Maria", 7.5);
        Cervantes.setCrearAlumno("Pepito", 6.5);

        System.out.print("Consulta un alumno: ");
        consultaAlumno = sc.nextInt();
        sc.nextLine();

        if (consultaAlumno > 0) {
            System.out.println(Cervantes.getAlumno(consultaAlumno));
        } else {
            System.out.print("Valor invalido");
        }

        sc.close();


    }
}
