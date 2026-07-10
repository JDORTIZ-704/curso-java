package cursojava.POO.EjerciciosIntroduccion.EnvioPaquetes;

import java.util.Random;

public class Paquete {

    private int documentoRemitente;
    private double peso;
    private int referenciaEnvio;
    private byte prioridadEnvio;

    public Paquete(int documentoRemitente, double peso) {
        this.documentoRemitente = documentoRemitente;
        Random rndRefEnvio = new Random();
        referenciaEnvio = Math.abs(rndRefEnvio.nextInt());
        this.peso = peso;
        prioridadEnvio = 0;

    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        System.out.print("Nuevo peso: ");
        if (peso < 0) {
            System.out.println("Por favor ingresar un valor valido.");
        } else {
            System.out.println("Peso actualizado!.");
            this.peso = peso;
        }
    }

    public byte getPrioridadEnvio() {
        return prioridadEnvio;
    }

    public void setPrioridadEnvio(byte prioridadEnvio) {
        System.out.print("Prioridad el envió (0=normal, 1=Alta y 2=Urgente): ");
        if (prioridadEnvio < 0 || prioridadEnvio > 3) {
            System.out.println("Por favor ingresar un valor valido.");
        } else {
            System.out.println("Prioridad modificada con éxito.");
            this.prioridadEnvio = prioridadEnvio;
        }

    }
}
