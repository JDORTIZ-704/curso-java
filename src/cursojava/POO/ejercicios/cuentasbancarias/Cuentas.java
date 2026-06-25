package cursojava.POO.ejercicios.cuentasbancarias;

import java.util.Random;

public class Cuentas {

    private double sueldo;
    private String nombreTitular;
    private long numeroCuenta;



    public Cuentas(String nombreTitular, double sueldo) {
        this.nombreTitular = nombreTitular;
        this.sueldo = sueldo;
        Random rnd = new Random();
        numeroCuenta = Math.abs(rnd.nextLong());
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
}
