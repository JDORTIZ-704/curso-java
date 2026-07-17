package cursojava.POO.EjerciciosIntroduccion.UsoVehiculos;

public class Vehiculos {

    private int ruedas;
    private String color;
    private int largo;
    private double ancho;
    private int peso;
    private boolean climatizador;
    private boolean tapiceria;
    private boolean gps;

    public Vehiculos(int ruedas, String color) {
        this.ruedas = ruedas;
        this.color = color;
        largo = 2;
        ancho = 1;
        peso = 2;
    }

    public Vehiculos(int ruedas, int largo, double ancho, int peso) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
    }

    public void setExtra(boolean climatizador) {
        this.climatizador = climatizador;
    }

    public void setExtra(boolean gps, boolean climatizador, boolean tapiceria) {
        this.gps = gps;
        this.tapiceria = tapiceria;
        this.climatizador = climatizador;
    }

    public String getExtra(){
        if (climatizador && !gps && !tapiceria) {
            return "Llevas el pack 1 de extra";
        } else if (climatizador & gps && tapiceria) {
            return "Llevas el pack 2 de extra";
        } else {
            return "No se admiten otras combinaciones";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
