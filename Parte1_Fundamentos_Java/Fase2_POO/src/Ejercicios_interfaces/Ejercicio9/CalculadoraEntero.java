package Ejercicios_interfaces.Ejercicio9;

public class CalculadoraEntero implements Calculadora<Integer>{
    @Override
    public double sumar(Integer a, Integer b) {
        return a + b;
    }
}
