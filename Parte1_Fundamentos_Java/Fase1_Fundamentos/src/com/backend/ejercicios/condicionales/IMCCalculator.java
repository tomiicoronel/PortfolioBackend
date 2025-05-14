package com.backend.ejercicios.condicionales;

import java.util.Locale;
import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        //Calculadora de IMC: ingresa peso y altura, calcula IMC y clasifica bajo peso, normal, sobrepeso u obesidad.

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bienvenido al sistema de calculo IMC por favor responda con sinceridad...");

        System.out.print("Ingrese su peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros (por ej 1.80): ");
        double altura = scanner.nextDouble();


        double imc = peso / (altura * altura);

        System.out.printf("Su IMC es: %.2f\n", imc);


        //Intellj me recomendo utilizar un switch case en cambio de un if.
        String categoria = switch (imc) {
            case double v when v < 18.5 -> "Bajo peso";
            case double v when v < 25 -> "Peso normal";
            case double v when v < 30 -> "Sobrepeso";
            default -> "Obesidad";
        };

        switch (categoria) {
            case "Bajo peso":
                System.out.println("Clasificación: Bajo peso. Necesitas ganar peso.");
                break;
            case "Peso normal":
                System.out.println("Clasificación: Peso normal. ¡Buen trabajo!");
                break;
            case "Sobrepeso":
                System.out.println("Clasificación: Sobrepeso. Considera mejorar tu dieta y ejercicio.");
                break;
            case "Obesidad":
                System.out.println("Clasificación: Obesidad. Consulta a un médico.");
                break;
            default:
                System.out.println("Error en la clasificación.");
                break;
        }



        if (altura > 2.3){
            System.out.println("El calculo de imc fue alterado por poner su altura en centimetros y no metros...");
        }


    }
}
