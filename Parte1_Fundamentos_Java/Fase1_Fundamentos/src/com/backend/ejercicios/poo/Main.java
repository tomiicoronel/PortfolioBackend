package com.backend.ejercicios.poo;

public class Main {
    public static void main(String[] args) {
        // aqui se pondran a prueba todas las clases

        //prueba clase persona
        Persona persona1 = new Persona("Tomas", 23);
        persona1.esMayorDeEdad(persona1);

        //prueba clase producto

        Producto producto1 = new Producto("Cerveza", 2099.99, 15.0);


        System.out.println("El precio con descuento de " + producto1.getNombre() + " es de " + producto1.aplicarDescuento(producto1.getPrecio(), producto1.getDescuento()));

        //prueba clase rectangulo

        Rectangulo rectangulo1 = new Rectangulo(5, 3);
        rectangulo1.calcularArea(rectangulo1.getBase(), rectangulo1.getAltura());
        rectangulo1.calcularPerimetro(rectangulo1.getBase(), rectangulo1.getAltura());


        //prueba clase libro

        Libro libro1 = new Libro("Harry Potter", "J.K. Rowling", 2007);
        libro1.mostrarInfo();

        //prueba clase CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.depositar(5000.0);
        cuenta.retirar(2000);
        System.out.println("Su saldo es de: " + cuenta.consultarSaldo());
    }
}
