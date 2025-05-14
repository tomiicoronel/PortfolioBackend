package Bloque1;
//Crea la clase Usuario con atributos privados nombre y edad, constructor, getters/setters y toString(). Simula el registro de 3 usuarios.
public class RegistroUsuarios {
    private String nombre;
    private int edad;

    public RegistroUsuarios(String nombre, int edad) {
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
        if (edad < 0 || edad > 150) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 150.");
        }
        this.edad = edad;
    }
}
