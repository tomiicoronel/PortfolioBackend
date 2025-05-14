package com.backend.ejercicios.condicionales;

import java.util.Scanner;

public class ParOImparSinResto {
    public static void main(String[] args) {
        //Par o Impar sin %: identifica si un número es par sin usar el operador módulo.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Verificar si es par o impar
        if ((numero / 2) * 2 == numero) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

    }
}
