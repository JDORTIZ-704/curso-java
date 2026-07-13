package cursojava.POO.EjerciciosIntroduccion.EnvioPaquetes;

import java.util.Scanner;

public class Uso_Sucursal_y_Paquetes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sucursal newSucursal = new Sucursal(1, "NA", "NA");
        Paquete newPaquete = new Paquete(1, 1.0, 1, 1);

        boolean condicionMenu = false;
        int opcionMenu;

        // Variables - Sucursal

        int nSucursal;
        String dSucursal;
        String cSucursal;
        double precioPaquete = 0;

        // Variable - Paquetes

        int cantidadPaquetes;
        int referenciaPaquete;
        int dniPaquete;
        double pesoPaquete;
        int prioridadPaquete;


        do {

            System.out.println("=== SISTEMA DE ENVIOS ===");
            System.out.println("1. Enviar un paquete.");
            System.out.println("2. Consultar un envió.");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            opcionMenu = sc.nextInt();
            sc.nextLine();


            switch (opcionMenu) {
                case 1:

                    // Número Sucursal

                    System.out.print("Ingresa un número de sucursal: ");
                    nSucursal = sc.nextInt();
                    sc.nextLine();
                    newSucursal.setNumeroSucursal(nSucursal);

                    // Ciudad Sucursal

                    System.out.print("Ingresa una ciudad: ");
                    cSucursal = sc.nextLine();
                    newSucursal.setCiudad(cSucursal);

                    // Dirección Sucursal

                    System.out.print("Ingresa una dirección: ");
                    dSucursal = sc.nextLine();
                    newSucursal.setDireccion(dSucursal);

                    // N° de Paquetes a enviar

                    System.out.print("Cuantos paquete quieres enviar: ");
                    cantidadPaquetes = sc.nextInt();
                    sc.nextLine();

                    for (int i = 1; i <= cantidadPaquetes; i++) {

                        System.out.println("Registrando el paquete #" + i);

                        // Referencia Paquete

                        System.out.print("Ingresa al referencia de envió: ");
                        referenciaPaquete = sc.nextInt();
                        sc.nextLine();
                        newPaquete.setReferenciaEnvio(referenciaPaquete);

                        // DNI del remitente

                        System.out.print("Ingresa tu DNI: ");
                        dniPaquete = sc.nextInt();
                        sc.nextLine();
                        newPaquete.setDocumentoRemitente(dniPaquete);

                        // Peso Paquete

                        System.out.print("Ingresa el peso del paquete: ");
                        pesoPaquete = sc.nextDouble();
                        sc.nextLine();
                        newPaquete.setPeso(pesoPaquete);

                        // Prioridad Paquete

                        System.out.print("Ingresa la prioridad del paquete (0, 1 o 2) -> ");
                        prioridadPaquete = sc.nextInt();
                        sc.nextLine();
                        newPaquete.setPrioridadEnvio(prioridadPaquete);

                        precioPaquete = newSucursal.setCalcularPrecio(newPaquete);


                    }
                    break;
                case 2:

                    // --- Mostrar resultado --- // Solo muestra un resultado - No hay ArrayList
                    System.out.println("\n--- Datos del envío ---");
                    System.out.println("Sucursal Nº: " + newSucursal.getNumeroSucursal());
                    System.out.println("Dirección: " + newSucursal.getDireccion());
                    System.out.println("Ciudad: " + newSucursal.getCiudad());
                    System.out.println("Referencia: " + newPaquete.getReferenciaEnvio());
                    System.out.println("DNI remitente: " + newPaquete.getDocumentoRemitente());
                    System.out.println("Peso: " + newPaquete.getPeso() + " kg");
                    System.out.println("Prioridad: " + newPaquete.getPrioridadEnvio());
                    System.out.println("Precio del envío: " + precioPaquete +" €");
                    System.out.println("---------------------------");
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    condicionMenu = true;
                    break;
                default:
                    System.out.println("Ingresar una opción valida");
            }

        } while (!condicionMenu);

        sc.close();

    }
}
