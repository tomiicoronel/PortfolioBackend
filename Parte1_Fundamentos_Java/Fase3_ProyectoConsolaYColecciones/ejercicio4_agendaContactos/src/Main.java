import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que gestiona la agenda de contactos.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacto> agenda = new ArrayList<>();

        try {
            // Agregar contactos
            System.out.println("Agrega 5 contactos:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Contacto " + (i + 1) + ":");
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Teléfono: ");
                String telefono = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();

                agenda.add(new Contacto(nombre, telefono, email));
            }

            // Menú de opciones
            int opcion;
            do {
                System.out.println("\n--- Menú ---");
                System.out.println("1. Buscar un contacto");
                System.out.println("2. Mostrar todos los contactos");
                System.out.println("3. Eliminar un contacto");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        buscarContacto(agenda, scanner);
                        break;
                    case 2:
                        mostrarContactos(agenda);
                        break;
                    case 3:
                        eliminarContacto(agenda, scanner);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } while (opcion != 4);

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Busca un contacto por nombre y muestra su información.
     *
     * @param agenda  Lista de contactos.
     * @param scanner Objeto Scanner para entrada de datos.
     */
    private static void buscarContacto(ArrayList<Contacto> agenda, Scanner scanner) {
        System.out.print("Ingresa el nombre del contacto a buscar: ");
        String nombre = scanner.nextLine();
        boolean encontrado = false;

        for (Contacto contacto : agenda) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado: " + contacto);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un contacto con ese nombre.");
        }
    }

    /**
     * Muestra todos los contactos almacenados en la agenda.
     *
     * @param agenda Lista de contactos.
     */
    private static void mostrarContactos(ArrayList<Contacto> agenda) {
        if (agenda.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("Contactos en la agenda:");
            for (Contacto contacto : agenda) {
                System.out.println(contacto);
            }
        }
    }

    /**
     * Elimina un contacto por nombre.
     *
     * @param agenda  Lista de contactos.
     * @param scanner Objeto Scanner para entrada de datos.
     */
    private static void eliminarContacto(ArrayList<Contacto> agenda, Scanner scanner) {
        System.out.print("Ingresa el nombre del contacto a eliminar: ");
        String nombre = scanner.nextLine();
        boolean eliminado = false;

        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNombre().equalsIgnoreCase(nombre)) {
                agenda.remove(i);
                System.out.println("Contacto eliminado.");
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("No se encontró un contacto con ese nombre.");
        }
    }
}