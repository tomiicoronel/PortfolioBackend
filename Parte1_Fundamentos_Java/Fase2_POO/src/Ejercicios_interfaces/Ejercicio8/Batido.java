package Ejercicios_interfaces.Ejercicio8;

public class Batido implements Bebible, Comestible {
    @Override
    public void beber() {
        System.out.println("Bebe");
    }

    @Override
    public void comer() {
        System.out.println("Come");
    }
}
