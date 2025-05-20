import java.util.Objects;

public class Alumno {
    private String nombre;
    private int edad;
    private String curso;

    public Alumno(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
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
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

@Override
public String toString() {
    return String.format(
        "Alumno:\n- Nombre: %s\n- Edad: %d\n- Curso: %s",
        nombre, edad, curso
    );
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return getEdad() == alumno.getEdad() && Objects.equals(getNombre(), alumno.getNombre()) && Objects.equals(getCurso(), alumno.getCurso());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEdad(), getCurso());
    }
}
