package cursojava.POO.EjerciciosIntroduccion.CuentaBancariaVideo;

public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Alberto", 200);

        CuentaCorriente cuenta2 = new CuentaCorriente("Ximena", 100);

        CuentaCorriente.Transferencia(cuenta1, cuenta2, 200);

        System.out.println(cuenta1.getDatosCuenta());

        System.out.println(cuenta2.getDatosCuenta());
    }
}
