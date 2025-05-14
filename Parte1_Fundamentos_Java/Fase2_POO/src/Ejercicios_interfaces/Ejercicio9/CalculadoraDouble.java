package Ejercicios_interfaces.Ejercicio9;

public class CalculadoraDouble implements Calculadora<Double>{
    @Override
    public double sumar(Double a, Double b) {
        return a + b;
    }
}
