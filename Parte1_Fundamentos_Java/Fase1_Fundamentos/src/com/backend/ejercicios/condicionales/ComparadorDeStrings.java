package com.backend.ejercicios.condicionales;

import java.util.Locale;
import java.util.Scanner;

public class ComparadorDeStrings {
    public static void main(String[] args) {
        //Comparador de Strings: compara dos cadenas ignorando mayúsculas y minúsculas.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el texto 1: ");
        String text1 = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese el texto 2: ");
        String text2 = scanner.nextLine().toLowerCase();

        if (text1.equals(text2)) {
            System.out.println("Los textos son lo mismo");
        }else {
            System.out.println("Los textos son diferentes");
        }
    }
}
