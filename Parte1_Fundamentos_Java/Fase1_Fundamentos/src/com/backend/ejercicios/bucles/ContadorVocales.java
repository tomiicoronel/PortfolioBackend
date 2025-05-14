package com.backend.ejercicios.bucles;

import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        //Contador de Vocales: ingresa una palabra y cuenta cuántas vocales contiene.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el texto que desea contar vocales: ");
        String palabra = scanner.nextLine();
        
        int contVocales = 0;
        for (int i = 0; i < palabra.length(); i++ ){
            char c = Character.toLowerCase(palabra.charAt(i)); // Convertir a minúscula
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contVocales++;
            }
        }

        System.out.println("Su texto tiene: "+ contVocales+" vocales...");

    }
}
