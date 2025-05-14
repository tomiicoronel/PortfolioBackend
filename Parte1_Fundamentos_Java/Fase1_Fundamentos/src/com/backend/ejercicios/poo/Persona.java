package com.backend.ejercicios.poo;

public class Persona {
    //Clase Persona: atributos nombre y edad, metodo esMayorDeEdad().

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void esMayorDeEdad(Persona persona){
        if (persona.getEdad() > 18){
            System.out.println(persona.getNombre() + " es mayor de edad.");
        }else {
            System.out.println(persona.getNombre() + " no es mayor de edad.");
        }
    }

}
