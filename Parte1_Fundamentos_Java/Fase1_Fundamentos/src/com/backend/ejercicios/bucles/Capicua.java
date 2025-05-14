package com.backend.ejercicios.bucles;

import java.util.Scanner;

/**
 * Clase Capicua
 * Este programa verifica si un número o palabra ingresado por el usuario es capicúa.
 * Un número o palabra es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.
 */
public class Capicua {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número o palabra
        System.out.print("Introduzca un numero o palabra: ");
        String capicua = scanner.next().toLowerCase();  // Convertir la entrada a minúsculas para evitar problemas de comparación

        // Crear el reverso de la palabra o número ingresado
        String reverseCapicua = new StringBuilder(capicua).reverse().toString().toLowerCase();

        // Mostrar la palabra o número ingresado y su reverso
        System.out.println("La palabra o numero ingresado es: " + capicua);
        System.out.println("El reverso de la palabra o numero ingresado es: " + reverseCapicua);

        // Verificar si la palabra o número es capicúa
        if (capicua.equals(reverseCapicua)) {
            System.out.println("SU PALABRA O NUMERO ES CAPICUA!!!");
        } else {
            System.out.println("Su palabra o numero no es capicua :(");
        }
    }
}