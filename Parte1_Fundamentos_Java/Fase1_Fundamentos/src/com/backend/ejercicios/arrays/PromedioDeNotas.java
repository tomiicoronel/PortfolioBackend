package com.backend.ejercicios.arrays;

import java.util.Scanner;

public class PromedioDeNotas {
    public static void main(String[] args) {
        //Promedio de Notas**: pide 5 notas y calcula su promedio; indica si aprobó
        System.out.println("Calculadora de promedio...");

        Scanner sc = new Scanner(System.in);

        // Preguntamos cuantas notas quiero agregar
        System.out.print("Cuantas notas quiere agregar?: ");
        int cantNotas = sc.nextInt();

        // Declaramos un array para la cantidad de notas
        int[] notas = new int[cantNotas];

        // Pedimos al usuario que ingrese las notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }

        // Calculamos el promedio
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        double promedio = suma / (double) notas.length;

        // Mostramos el resultado
        System.out.println("El promedio es: " + promedio);
        if (promedio >= 6) {
            System.out.println("¡Aprobaste!");
        } else {
            System.out.println("No aprobaste.");
        }
    }
}
