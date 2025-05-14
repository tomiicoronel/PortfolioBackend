package Ejercicios_interfaces.Ejercicio10;

public class Administrador implements RolUsuario{
    @Override
    public void mostrarPermisos() {
        System.out.println("Permiso admin1");
        System.out.println("Permiso admin2");
        System.out.println("Permiso admin3");
    }
}
