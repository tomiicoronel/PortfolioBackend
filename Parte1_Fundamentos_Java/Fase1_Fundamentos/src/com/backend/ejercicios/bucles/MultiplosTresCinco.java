package com.backend.ejercicios.bucles;

public class MultiplosTresCinco {
    public static void main(String[] args) {
        //Múltiplos de 3 o 5: muestra los múltiplos de 3 o 5 entre 1 y 100, excluyendo los múltiplos comunes.


        // Recorremos los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificamos si es múltiplo de 3 o 5, pero no de ambos (15)
            if ((i % 3 == 0 || i % 5 == 0) && i % 15 != 0) {
                // Imprimimos el número si cumple las condiciones
                System.out.println(i);
            }
        }
    }
}
