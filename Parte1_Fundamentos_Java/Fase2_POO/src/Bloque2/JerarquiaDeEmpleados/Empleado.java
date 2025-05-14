package Bloque2.JerarquiaDeEmpleados;

public class Empleado extends Usuario{
    private int salario;
    private boolean saludable;

    public Empleado(String nombre, int dni, int salario) {
        super(nombre, dni);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", dni=" + getDni() +
                ", salario=" + salario +
                '}';
    }

    public double calcularSalarioAnual(){
        return getSalario() * 12;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Dni: "+ getDni());
        System.out.println("Salario: "+ getSalario());
    }

    public boolean esSaludable(){
        if (getSalario() >= 50000){
            setSaludable(true);
            System.out.println("Este empleado es saludable");
            return saludable;
        }else{
            setSaludable(false);
            System.out.println("Este empleado no es saludable");
            return isSaludable();
        }

    }
}

