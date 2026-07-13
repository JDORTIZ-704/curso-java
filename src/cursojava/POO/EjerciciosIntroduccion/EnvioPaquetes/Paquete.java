package cursojava.POO.EjerciciosIntroduccion.EnvioPaquetes;

public class Paquete {

    private int documentoRemitente;
    private double peso;
    private int referenciaEnvio;
    private int prioridadEnvio;

    public Paquete(int documentoRemitente, double peso, int referenciaEnvio, int prioridadEnvio) {
        this.documentoRemitente = documentoRemitente;
        this.referenciaEnvio = referenciaEnvio;
        this.peso = peso;
        this.prioridadEnvio = prioridadEnvio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrioridadEnvio() {
        return prioridadEnvio;
    }

    public void setPrioridadEnvio(int prioridadEnvio) {
        this.prioridadEnvio = prioridadEnvio;
    }

    public int getReferenciaEnvio() {
        return referenciaEnvio;
    }

    public void setReferenciaEnvio(int referenciaEnvio) {
        this.referenciaEnvio = referenciaEnvio;
    }

    public int getDocumentoRemitente() {
        return documentoRemitente;
    }

    public void setDocumentoRemitente(int documentoRemitente) {
        this.documentoRemitente = documentoRemitente;
    }
}
