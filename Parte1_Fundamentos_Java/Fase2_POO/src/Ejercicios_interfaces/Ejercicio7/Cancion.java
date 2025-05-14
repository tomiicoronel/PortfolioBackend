package Ejercicios_interfaces.Ejercicio7;

public class Cancion implements Reproducible{
    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pausa");
    }
}
