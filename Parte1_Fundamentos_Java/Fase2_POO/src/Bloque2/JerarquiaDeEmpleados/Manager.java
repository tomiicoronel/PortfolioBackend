package Bloque2.JerarquiaDeEmpleados;

public class Manager extends Empleado{
    private String departamento;

    public Manager(String nombre, int dni, int salario, String departamento) {
        super(nombre, dni, salario);
        this.departamento = departamento;
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalarioAnual() {
        double salarioBonus = getSalario() * 12; //Salario anual base
        salarioBonus += salarioBonus * 0.2;
        return salarioBonus;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Dni: "+ getDni());
        System.out.println("Salario: "+ getSalario());
        System.out.println("Departamento: "+ getDepartamento());
    }


}
