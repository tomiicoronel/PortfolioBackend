package Bloque1;

public class Calculadora {

   // Suma
    public static int sumar(int ... numeros){
        int resultado = 0;
        for (int numero : numeros){
            resultado += numero;
        }
        return resultado;
    }

    public static int restar(int ... numeros){
        if (numeros.length == 0) {
            throw new IllegalArgumentException("Se necesita al menos un número para restar.");
        }
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }
    // Multiplicación
    public static int multiplicar(int... numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("Se necesita al menos un número para multiplicar.");
        }
        int resultado = 1;
        for (int numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    // División
    public static double dividir(double... numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("Se necesita al menos un número para dividir.");
        }
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            resultado /= numeros[i];
        }
        return resultado;
    }
}
