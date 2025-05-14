package Ejercicios_interfaces.Ejercicio5;

public class PagoTarjeta implements Pago{
    private double descuento;
    private double monto;

    public PagoTarjeta(double descuento, double monto) {
        this.descuento = descuento;
        this.monto = monto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public double realizarPago(double monto) {
        if (monto < montoMinimo) {
            throw new IllegalArgumentException("El monto debe ser mayor o igual a " + montoMinimo);
        }
        return monto - (monto * descuento / 100);
    }
}
