package com.backend.ejercicios.condicionales;

import java.math.MathContext;
import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        //Raíz Cuadrada Válida: calcula la raíz si el número es ≥ 0; muestra error en caso contrario.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        double resultado;
        if (numero > 0){
            resultado = Math.sqrt(numero);
            System.out.println("La raiz cuadrada de "+numero+ " es: "+resultado);
        }else {
            System.out.println("El resultado no se puede calcular ya que ingreso un numero menor a cero. ");

        }
    }
}
