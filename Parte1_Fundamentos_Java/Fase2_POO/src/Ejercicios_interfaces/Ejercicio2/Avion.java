package Ejercicios_interfaces.Ejercicio2;

import javax.xml.transform.Source;

public class Avion implements Volador{
    @Override
    public void volar() {
        System.out.println("El avion esta volando!!!");
    }
}
