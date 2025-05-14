// Importamos las clases necesarias
import java.util.ArrayList;
import java.util.Scanner;

// Clase principal que contiene el programa
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Creamos un ArrayList para almacenar las películas
        ArrayList<Pelicula> catalogo = new ArrayList<>();
        int opcion;

        // Bucle principal del programa que muestra el menú y ejecuta las opciones
        do {
            System.out.println("\n--- Catálogo de Películas ---");
            System.out.println("1. Agregar película");
            System.out.println("2. Mostrar todas las películas");
            System.out.println("3. Buscar película por título");
            System.out.println("4. Eliminar película por título");
            System.out.println("5. Promedio de duracion de las peliculas");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            // Ejecutamos la opción seleccionada por el usuario
            switch (opcion) {
                case 1:
                    // Llamamos al método para agregar una película
                    agregarPelicula(scanner, catalogo);
                    break;
                case 2:
                    // Llamamos al método para mostrar todas las películas
                    mostrarPeliculas(catalogo);
                    break;
                case 3:
                    // Llamamos al método para buscar una película por título
                    buscarPelicula(scanner, catalogo);
                    break;
                case 4:
                    // Llamamos al método para eliminar una película por título
                    eliminarPelicula(scanner, catalogo);
                    break;
                case 5:
                    // Llamamos al método para calcular el promedio de duración
                    promedioDuracion(catalogo);
                    break;
                case 6:
                    // Mensaje de salida del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Mensaje en caso de que la opción no sea válida
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 6); // El programa se ejecuta hasta que el usuario elija salir
    }

    // Método para agregar una película al catálogo
    private static void agregarPelicula(Scanner scanner, ArrayList<Pelicula> catalogo) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine(); // Leemos el título de la película
        System.out.print("Género: ");
        String genero = scanner.nextLine(); // Leemos el género de la película
        System.out.print("Duración (en minutos): ");
        int duracion = scanner.nextInt(); // Leemos la duración de la película
        scanner.nextLine(); // Limpiar el buffer de entrada

        // Creamos un nuevo objeto Pelicula y lo agregamos al catálogo
        catalogo.add(new Pelicula(titulo, genero, duracion));
        System.out.println("Película agregada exitosamente.");
    }

    // Método para mostrar todas las películas del catálogo
    private static void mostrarPeliculas(ArrayList<Pelicula> catalogo) {
        if (catalogo.isEmpty()) {
            // Mensaje si no hay películas en el catálogo
            System.out.println("No hay películas en el catálogo.");
        } else {
            // Recorremos y mostramos cada película en el catálogo
            for (Pelicula pelicula : catalogo) {
                System.out.println(pelicula);
            }
        }
    }

    // Método para buscar una película por su título
    private static void buscarPelicula(Scanner scanner, ArrayList<Pelicula> catalogo) {
        System.out.print("Ingresa el título de la película a buscar: ");
        String titulo = scanner.nextLine(); // Leemos el título a buscar

        // Recorremos el catálogo para buscar una coincidencia
        for (Pelicula pelicula : catalogo) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                // Si encontramos la película, la mostramos y salimos del método
                System.out.println("Película encontrada!\n" + pelicula);
                return;
            }
        }
        // Mensaje si no se encuentra la película
        System.out.println("Película no encontrada.");
    }

    // Método para eliminar una película por su título
    private static void eliminarPelicula(Scanner scanner, ArrayList<Pelicula> catalogo) {
        System.out.print("Ingresa el título de la película a eliminar: ");
        String titulo = scanner.nextLine(); // Leemos el título a eliminar

        // Usamos removeIf para eliminar la película si coincide el título
        if (catalogo.removeIf(pelicula -> pelicula.getTitulo().equalsIgnoreCase(titulo))) {
            System.out.println("Película eliminada exitosamente.");
        } else {
            // Mensaje si no se encuentra la película
            System.out.println("Película no encontrada.");
        }
    }

    // Método para calcular y mostrar el promedio de duración de las películas
    private static void promedioDuracion(ArrayList<Pelicula> catalogo) {
        if (catalogo.isEmpty()) {
            // Mensaje si no hay películas en el catálogo
            System.out.println("No hay películas en el catálogo para calcular el promedio.");
            return;
        }
        int total = 0; // Variable para acumular la duración total
        for (Pelicula pelicula : catalogo) {
            total += pelicula.getDuracion(); // Sumamos la duración de cada película
        }
        // Calculamos el promedio dividiendo la duración total entre la cantidad de películas
        double promedio = (double) total / catalogo.size();
        System.out.println("El promedio de tiempo de las películas es: " + promedio);
    }
}