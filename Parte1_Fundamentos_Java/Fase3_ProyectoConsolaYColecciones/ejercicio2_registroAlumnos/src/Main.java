import java.util.HashSet;
import java.util.Scanner;

/**
 * Clase principal que gestiona un sistema de registro de alumnos.
 */
public class Main {
    public static void main(String[] args) {
        // Crear el HashSet para almacenar los alumnos
        HashSet<Alumno> alumnos = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Consultar alumno");
            System.out.println("3. Listar alumnos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Agregar un alumno
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();

                    // Crear un nuevo objeto Alumno y agregarlo al HashSet
                    Alumno nuevoAlumno = new Alumno(nombre, edad, curso);
                    if (alumnos.add(nuevoAlumno)) {
                        System.out.println("Alumno agregado correctamente.");
                    } else {
                        System.out.println("El alumno ya está registrado.");
                    }
                    break;

                case 2:
                    // Consultar si un alumno está registrado
                    System.out.print("Nombre del alumno a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    boolean encontrado = false;

                    // Buscar el alumno en el HashSet
                    for (Alumno alumno : alumnos) {
                        if (alumno.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                            System.out.println("Alumno encontrado:\n" + alumno);
                            encontrado = true;
                            break;
                        }
                    }

                    // Mostrar mensaje si no se encuentra el alumno
                    if (!encontrado) {
                        System.out.println("El alumno no está registrado.");
                    }
                    break;

                case 3:
                    // Listar todos los alumnos registrados
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        System.out.println("\n--- Lista de alumnos ---");
                        for (Alumno alumno : alumnos) {
                            System.out.println(alumno);
                        }
                    }
                    break;

                case 4:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    // Manejar opción no válida
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        // Cerrar el Scanner
        scanner.close();
    }
}