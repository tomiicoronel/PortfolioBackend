package com.backend.ejercicios.poo;

import java.util.Date;

public class Libro {
    String titulo;
    String autor;
    int año;

    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void mostrarInfo(){
        System.out.println("El titulo es: " + titulo);
        System.out.println("El autor es: " + autor);
        System.out.println("Salio en el año: " + año);
    }
}
