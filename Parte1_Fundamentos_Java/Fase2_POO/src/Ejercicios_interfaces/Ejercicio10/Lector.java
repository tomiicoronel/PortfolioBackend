package Ejercicios_interfaces.Ejercicio10;

public class Lector implements RolUsuario{
    @Override
    public void mostrarPermisos() {
        System.out.println("Permisos Lector 1");
        System.out.println("Permisos Lector 2");
        System.out.println("Permisos Lector 3");
    }
}
