package com.backend.ejercicios.bucles;

import java.util.Scanner;

public class SumaDigitosPares {
    public static void main(String[] args) {
        //Suma de Dígitos Pares**: suma todos los dígitos pares de un número ingresado.
        // Número a procesar
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero al cual desea contar sus digitos pares: ");
        Integer numero = sc.nextInt();

        // Variable para acumular la suma de los dígitos pares
        int suma = 0;

        // Recorremos cada dígito del número
        for (int i = 0; i < numero.toString().length(); i++) {
            // Convertimos el carácter actual a un número entero
            int digito = Character.getNumericValue(numero.toString().charAt(i));

            // Verificamos si el dígito es par
            if (digito % 2 == 0) {
                // Sumamos el dígito a la variable acumuladora
                suma += digito;
            }
        }

        // Mostramos el resultado
        System.out.println("La suma de los dígitos pares es: " + suma);
    }
}

