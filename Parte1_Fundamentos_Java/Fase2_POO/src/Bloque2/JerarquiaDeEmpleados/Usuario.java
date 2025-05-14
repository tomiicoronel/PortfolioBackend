package Bloque2.JerarquiaDeEmpleados;

import java.util.Objects;

public class Usuario {
    private String nombre;
    private int dni;

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return dni == usuario.dni && Objects.equals(nombre, usuario.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni);
    }



    public double calcularSalarioAnual(){
        System.out.println("El usuario "+ getNombre()+ " no tiene empleo por eso no puede tener un salario");
        return 0.0;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Dni: "+ getDni());
    }
}
