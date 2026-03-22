package cursojava.estructurasbasicas.masejercicios.sentenciacondicional.ejercicios;

import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int JUNIORITY = 950;
        final int SENIORITY = 1200;
        final int OWNER = 1600;

        int numeroCargoEmpleado = 0;
        int cargoEmpleado;
        int viajesEmpleado;
        int totalViajesEmpleado;
        int estadoCivilEmpleado;
        int sueldoBrutoEmpleado;
        double totalSueldoEmpleado;
        double totalRetencion;
        double retencion;

        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");

        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        cargoEmpleado = sc.nextInt();
        sc.nextLine();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        viajesEmpleado = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estadoCivilEmpleado = sc.nextInt();
        sc.nextLine();

        totalViajesEmpleado = viajesEmpleado * 30;

        if (estadoCivilEmpleado == 1) {
            retencion = 0.25;
        } else {
            retencion = 0.20;
        }

        switch (cargoEmpleado) {
            case 1 -> numeroCargoEmpleado = JUNIORITY;
            case 2 -> numeroCargoEmpleado = SENIORITY;
            case 3 -> numeroCargoEmpleado = OWNER;
        }

        sueldoBrutoEmpleado = totalViajesEmpleado + numeroCargoEmpleado;
        totalRetencion = sueldoBrutoEmpleado * retencion;
        totalSueldoEmpleado = sueldoBrutoEmpleado - totalRetencion;

        System.out.println("-----------------------------------");
        System.out.println("| Sueldo base               " + numeroCargoEmpleado + "  |");
        System.out.println("| Dietas (" + viajesEmpleado + " viajes)         " + totalViajesEmpleado + "   |");
        System.out.println("| ---------------------------------");
        System.out.println("| Sueldo bruto              " + sueldoBrutoEmpleado + "  |");
        System.out.println("| Retención IRPF (" + (retencion * 100) + "%)    " + totalRetencion + " |");
        System.out.println("| --------------------------------- |");
        System.out.println("| Sueldo neto               " + totalSueldoEmpleado + " |");
        System.out.println("---------------------------------" );


    }
}
