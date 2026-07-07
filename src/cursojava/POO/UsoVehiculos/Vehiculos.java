package cursojava.POO.UsoVehiculos;

public class Vehiculos {

    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;

    public Vehiculos(int ruedas, String color) {

        this.ruedas = ruedas;
        this.color = color;
        largo = 2;
        ancho = 1;
        peso = 2;

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

    public int getAncho() {
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
