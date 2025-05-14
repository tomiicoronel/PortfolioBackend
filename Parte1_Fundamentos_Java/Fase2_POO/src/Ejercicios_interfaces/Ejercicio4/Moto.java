package Ejercicios_interfaces.Ejercicio4;

public class Moto implements Vehiculo{
    @Override
    public void arrancar() {
        System.out.println("La moto arranco");
    }

    @Override
    public void detener() {
        System.out.println("La moto se detuvo");
    }
}
