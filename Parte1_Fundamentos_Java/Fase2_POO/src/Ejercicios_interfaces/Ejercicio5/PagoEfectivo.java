package Ejercicios_interfaces.Ejercicio5;

public class PagoEfectivo implements Pago{
    @Override
    public double realizarPago(double monto) {
        System.out.println("Pago realizado");
        return 0;
    }
}
