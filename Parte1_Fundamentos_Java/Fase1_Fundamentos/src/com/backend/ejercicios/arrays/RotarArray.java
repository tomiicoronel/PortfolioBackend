package com.backend.ejercicios.arrays;

import java.util.Arrays;

public class RotarArray {
    public static void main(String[] args) {
        //Rotar un Array**: recibe 5 números y rótalos una posición a la derecha


        // {1, 2, 3, 4, 5} entrada
        // {5, 1, 2, 3, 4} salida

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numeros));

        System.out.println();

        int[] resultado = rotarArregloUnaUnidad(numeros);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] rotarArregloUnaUnidad(int[] numeros) {
        int[] resultado = new int[numeros.length]; // Crear un nuevo arreglo del mismo tamaño que el original
        resultado[0] = numeros[numeros.length - 1]; // Colocar el último elemento del arreglo original en la primera posición del nuevo arreglo

        for (int i = 1; i < numeros.length; i++) { // Iterar desde la segunda posición (índice 1) hasta el final
            resultado[i] = numeros[i - 1]; // Asignar a cada posición el valor de la posición anterior del arreglo original
        }

        return resultado; // Devolver el nuevo arreglo rotado
    }
}

