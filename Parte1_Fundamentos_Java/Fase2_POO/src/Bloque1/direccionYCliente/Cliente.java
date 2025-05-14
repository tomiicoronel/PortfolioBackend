package Bloque1.direccionYCliente;

public class Cliente {
    private String nombre;
    private DireccionDeEnvio direccion;

    public Cliente(String nombre, DireccionDeEnvio direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DireccionDeEnvio getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionDeEnvio direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
