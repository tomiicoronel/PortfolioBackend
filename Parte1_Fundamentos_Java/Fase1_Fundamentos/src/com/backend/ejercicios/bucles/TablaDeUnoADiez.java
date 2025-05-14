package com.backend.ejercicios.bucles;

public class TablaDeUnoADiez {
    public static void main(String[] args) {
        //Tablas del 1 al 10: usa bucles anidados para imprimir todas las tablas de multiplicar del 1 al 10.
        for (int i = 1; i <= 10; i++){
            System.out.println("Tabla de "+ i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
