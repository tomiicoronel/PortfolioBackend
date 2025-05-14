package com.backend.ejercicios.condicionales;

import java.util.Scanner;

public class EdadValida {
    public static void main(String[] args) {
        //Edad Válida: determina si un usuario puede votar (≥16) u es obligatorio (≥18).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad porfavor: ");
        int edad = scanner.nextInt();

        if (edad >= 16 && edad < 18){
            System.out.println("Usted puede elegir si votar o no");
        } else if (edad >= 18){
            System.out.println("Usted tiene que votar si o si");
        }else {
            System.out.println("Usted es menor y no puede votar...");
        }


        scanner.close();
    }
}
