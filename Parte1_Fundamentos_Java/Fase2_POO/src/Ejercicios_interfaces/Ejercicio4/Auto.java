package Ejercicios_interfaces.Ejercicio4;

public class Auto implements Vehiculo{
    @Override
    public void arrancar() {
        System.out.println("El auto arranco");
    }

    @Override
    public void detener() {
        System.out.println("El auto se detuvo");
    }
}
