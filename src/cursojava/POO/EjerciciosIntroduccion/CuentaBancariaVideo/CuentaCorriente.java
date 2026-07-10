package cursojava.POO.EjerciciosIntroduccion.CuentaBancariaVideo;

import java.util.Random;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        Random rnd = new Random(); // Como se llama Scanner, también existe Random
        numeroCuenta = Math.abs(rnd.nextLong()); // El máximo será el largo del Long en positivo por el abs
    }

    public void setIngreso(double ingreso) {
        if (ingreso < 0) {
            System.out.println("No se permiten ingresos negativos");
        } else {
            saldo += ingreso;
        }
    }

    public void setReintegro(double reintegro) { // Clase repetida
        saldo -= reintegro;
    }

    public String getSaldo() { // Consultar
        return "El saldo es: " + saldo;
    }

    public static void Transferencia (CuentaCorriente titu1, CuentaCorriente titu2, double cantidad) {
        titu1.saldo -= cantidad;
        titu2.saldo += cantidad;
    }

    public String getDatosCuenta()  {
        return "Titular: " + nombreTitular + "\n" +
                "N° de Cuenta: " + numeroCuenta + "\n" +
                "saldo: " + saldo;
    }
}
