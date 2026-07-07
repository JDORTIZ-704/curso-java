package cursojava.POO.CuentaBancaria;

public class CuentaBancaria {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaBancaria(double saldo, String nombreTitular, long numeroCuenta) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
    }

    public void setNumeroCuenta(){
        numeroCuenta = (long) (Math.random()*100L);
    }

    public long getNumeroCuenta(){
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimirDatos () {
        System.out.println("Su nombre es: " + getNombreTitular());
        System.out.println("Su número de cuenta es: " + getNumeroCuenta());
        System.out.println("Sus saldo es: " + getSaldo());
    }
    public void transferenciaDinero (Double a) {
        saldo += a;
    }
}
