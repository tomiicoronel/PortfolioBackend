package com.backend.ejercicios.poo;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public void calcularArea(int base, int altura){
        System.out.println("El area es de " + base*altura);
    }
    public void calcularPerimetro(int base, int altura){
        System.out.println("El perimetro es de " + (2 * (base+altura)));
    }

}
