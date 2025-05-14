package Ejercicios_interfaces.Ejercicio10;

public class Editor implements RolUsuario{
    @Override
    public void mostrarPermisos() {
        System.out.println("Permiso Editor1");
        System.out.println("Permiso Editor2");
        System.out.println("Permiso Editor3");
    }
}
