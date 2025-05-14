import Bloque1.Calculadora;
import Bloque1.RegistroUsuarios;
import Bloque1.direccionYCliente.Cliente;
import Bloque1.direccionYCliente.DireccionDeEnvio;
import Bloque2.JerarquiaDeEmpleados.Empleado;
import Bloque2.JerarquiaDeEmpleados.Manager;
import Bloque2.JerarquiaDeEmpleados.Usuario;
import Bloque3.productos.Libro;
import Bloque3.productos.Videojuego;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //----------------- BLOQUE 1 -------------------------

        /* prueba clase RegistroUsuario
        RegistroUsuarios registroUsuarios = new RegistroUsuarios("Tomas", 15);
        System.out.println(registroUsuarios.getEdad());
        registroUsuarios.setEdad(152);
        System.out.println(registroUsuarios.getEdad());*/


        //prueba direccion y cliente.
       /* DireccionDeEnvio direccion = new DireccionDeEnvio("Av madrid", 2143, "Cordoba Capital");

        Cliente cliente = new Cliente("Tomas Coronel", direccion);*/

        //prueba calculadora
        /*Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.sumar(2,2,2,2,2));
        System.out.println(calculadora.restar(6,2,1));
        System.out.println(calculadora.multiplicar(3,2,2));
        System.out.println(calculadora.dividir(100,2, 2));*/





        //----------------- BLOQUE 2 -------------------------

        //prueba de Jerarquia de empleados
        /*Empleado empleado = new Empleado("Tomas", 43559834, 3000);
        System.out.println(empleado);*/


       /* //Prueba Manager
        // Crear un empleado
        Empleado empleado = new Empleado("Juan", 12345678, 3000);
        System.out.println("Salario anual de empleado: " + empleado.calcularSalarioAnual());
        // Crear un manager
        Manager manager = new Manager("Ana", 87654321, 5000, "IT"); //salario anual de 60000 sin bonus
        System.out.println("Salario anual de manager (con bonus): " + manager.calcularSalarioAnual());*/


      /*  //Prueba Metodo polimorfico
        // Crear un Usuario
        Usuario usuario = new Usuario("Carlos", 12345678);
        imprimirInfo(usuario);

        // Crear un Empleado
        Empleado empleado = new Empleado("Laura", 87654321, 4000);
        imprimirInfo(empleado);

        // Crear un Manager
        Manager manager = new Manager("Sofía", 11223344, 6000, "Recursos Humanos");
        imprimirInfo(manager);}

    public static void imprimirInfo(Usuario u) {
        u.mostrarInfo(); Polimorfismo: llama al metodo correspondiente según el tipo del objeto
        }
        //

        */



        /*
        //Prueba de coleccion heterogenea
        // Lista para almacenar los usuarios creados
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        // Solicitar al usuario la cantidad de usuarios que desea agregar
        System.out.print("¿Cuántos usuarios deseas agregar?: ");
        int cantidadUsuarios = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Bucle para crear la cantidad de usuarios especificada
        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.println("Tipos de usuarios disponibles:");
            System.out.println("1. Usuario");
            System.out.println("2. Empleado");
            System.out.println("3. Manager");
            System.out.print("Selecciona el tipo de usuario a crear: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Crear el tipo de usuario seleccionado
            switch (opcion) {
                case 1:
                    // Crear un Usuario
                    System.out.print("Ingresa el nombre del Usuario: ");
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Ingresa el DNI del Usuario: ");
                    int dniUsuario = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    listaUsuarios.add(new Usuario(nombreUsuario, dniUsuario));
                    break;

                case 2:
                    // Crear un Empleado
                    System.out.print("Ingresa el nombre del Empleado: ");
                    String nombreEmpleado = scanner.nextLine();
                    System.out.print("Ingresa el DNI del Empleado: ");
                    int dniEmpleado = scanner.nextInt();
                    System.out.print("Ingresa el salario del Empleado: ");
                    int salarioEmpleado = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    listaUsuarios.add(new Empleado(nombreEmpleado, dniEmpleado, salarioEmpleado));
                    break;

                case 3:
                    // Crear un Manager
                    System.out.print("Ingresa el nombre del Manager: ");
                    String nombreManager = scanner.nextLine();
                    System.out.print("Ingresa el DNI del Manager: ");
                    int dniManager = scanner.nextInt();
                    System.out.print("Ingresa el salario del Manager: ");
                    int salarioManager = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingresa el departamento del Manager: ");
                    String departamento = scanner.nextLine();
                    listaUsuarios.add(new Manager(nombreManager, dniManager, salarioManager, departamento));
                    break;

                default:
                    // Manejar opción no válida
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    i--; // Repetir la iteración actual
                    break;
            }
        }

        // Mostrar la información de los usuarios creados
        System.out.println("\nUsuarios creados y sus salarios anuales:");
        for (Usuario usuario : listaUsuarios) {
            usuario.mostrarInfo();
            System.out.println(usuario.getNombre() + " tiene un sueldo anual de " + usuario.calcularSalarioAnual());
        }*/


        /*
        HashSet<Usuario> usuarios = new HashSet<>();

        Usuario usuario1 = new Usuario("Carlos", 30);
        Usuario usuario2 = new Usuario("Carlos", 30);
        Usuario usuario3 = new Usuario("Laura", 25);

        usuarios.add(usuario1);
        usuarios.add(usuario2); // No se agregará porque es igual a usuario1
        usuarios.add(usuario3);

        System.out.println("Usuarios en el HashSet:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }*/


        //----------------- BLOQUE 3 -------------------------
        //prueba sistema de productos digitales y fisicos.

        /*
        Videojuego videojuego = new Videojuego("God of War", "Juego de god of war...", 50, 5);
        Libro libro = new Libro("Harry potter", "La historia de harry", 500, 200);


        System.out.println(videojuego.getNombre() + " sale "+ videojuego.calcularPrecioFinal()+ " con descuento...");
        System.out.println(libro.getNombre()+" sale "+libro.calcularPrecioFinal() + " con envio");*/












    }




}

