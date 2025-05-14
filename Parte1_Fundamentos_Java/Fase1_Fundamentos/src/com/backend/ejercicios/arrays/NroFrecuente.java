package com.backend.ejercicios.arrays;

import java.util.HashMap;
import java.util.Map;

public class NroFrecuente {
    public static void main(String[] args) {

                //Número Más Frecuente: dado un arreglo de enteros, encuentra el elemento que más veces aparece.

                int[] numeros = {1, 3, 2, 3, 4, 1, 3, 2, 1, 1}; // Ejemplo de arreglo

                // Llamar al metodo para encontrar el número más frecuente
                int numeroMasFrecuente = encontrarNumeroMasFrecuente(numeros);

                // Imprimir el resultado
                System.out.println("El número más frecuente es: " + numeroMasFrecuente);
            }

            public static int encontrarNumeroMasFrecuente(int[] numeros) {
                Map<Integer, Integer> frecuencia = new HashMap<>();
                int maxFrecuencia = 0;
                int numeroMasFrecuente = -1;

                // Contar las apariciones de cada número
                for (int numero : numeros) {
                    frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);

                    // Actualizar el número más frecuente si es necesario
                    if (frecuencia.get(numero) > maxFrecuencia) {
                        maxFrecuencia = frecuencia.get(numero);
                        numeroMasFrecuente = numero;
                    }
                }

                return numeroMasFrecuente;
            }
        }


