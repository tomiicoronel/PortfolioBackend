package com.backend.ejercicios.arrays;

import java.util.*;


public class ActividadClaseSupermercado {
    public static void main(String[] args) {
        /*Hacer una carga en un registro de una determinada cantidad de articulos y que esos productos se agregen a
        un registro de compras. Cada articulo tiene que tener nombre, precio, codigo y cantidad. Esos articulos se
        tienen que agregar al carrito y calcular el precio subtotal, el precio total con iva que es del 0.21. Por
        ultimo mostrar en pantalla el precio total.
        Luego quiero que cada compra sea unica y esten dentro de un registros de todas las compras.

        Luego quiero listar todas las compras con los detalles de sus articulos y el total subtotal etc etc.

        y por ultimo aplicar un algoritmo de busqueda para las compras dependiendo el numero de compra.


        */




        //Agregamos scanner para la carga por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos artículos desea agregar?: ");
        int cantArticulos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Arreglos paralelos
        String[] nombres = new String[cantArticulos];
        double[] precios = new double[cantArticulos];
        int[] codigos = new int[cantArticulos];
        int[] cantidades = new int[cantArticulos];

        // Carga de artículos
        for (int i = 0; i < cantArticulos; i++) {
            System.out.println("Artículo " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Precio: ");
            precios[i] = scanner.nextDouble();
            System.out.print("Código: ");
            codigos[i] = scanner.nextInt();
            System.out.print("Cantidad: ");
            cantidades[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        }

        // Cálculo de subtotal y total
        double subtotal = 0;
        for (int i = 0; i < cantArticulos; i++) {
            subtotal += precios[i] * cantidades[i];
        }
        double iva = subtotal * 0.21;
        double total = subtotal + iva;

        // Mostrar resultados
        System.out.println("\nResumen de la compra:");
        for (int i = 0; i < cantArticulos; i++) {
            System.out.println("Artículo " + (i + 1) + ":");
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Precio: " + precios[i]);
            System.out.println("Código: " + codigos[i]);
            System.out.println("Cantidad: " + cantidades[i]);
            System.out.println("-------------------------");
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA (21%): " + iva);
        System.out.println("Total: " + total);


        }
    }/*
            SEGUN COPILOT Y SIN SCANNER

       */
