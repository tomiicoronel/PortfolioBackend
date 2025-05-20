import java.util.*;

/**
 * Clase principal que implementa un sistema de ranking de jugadores.
 * Permite agregar jugadores, mostrar un ranking ordenado por puntaje
 * y filtrar jugadores con puntajes mayores a un umbral.
 */
public class Main {

    /**
     * Método principal que ejecuta el sistema de ranking de jugadores.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> jugadores = new HashMap<>();

        System.out.println("=== Sistema de Ranking de Jugadores ===");

        int opcion;
        do {
            try {
                System.out.println("\nOpciones:");
                System.out.println("1. Agregar jugador");
                System.out.println("2. Mostrar ranking");
                System.out.println("3. Mostrar jugadores con puntaje mayor a 500");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        agregarJugador(scanner, jugadores);
                        break;
                    case 2:
                        mostrarRanking(jugadores);
                        break;
                    case 3:
                        mostrarJugadoresFiltrados(jugadores, 500);
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                opcion = 0; // Reinicia la opción para continuar el bucle
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                opcion = 0; // Reinicia la opción para continuar el bucle
            }
        } while (opcion != 4);

        scanner.close();
    }

    /**
     * Agrega un jugador al sistema.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     * @param jugadores Mapa que almacena los jugadores y sus puntajes.
     */
    private static void agregarJugador(Scanner scanner, HashMap<String, Integer> jugadores) {
        try {
            System.out.print("Ingresa el nombre del jugador: ");
            String nombre = scanner.nextLine();

            if (jugadores.containsKey(nombre)) {
                System.out.println("Error: Ya existe un jugador con ese nombre.");
                return;
            }

            System.out.print("Ingresa el puntaje del jugador: ");
            int puntaje = Integer.parseInt(scanner.nextLine());

            if (puntaje < 0) {
                System.out.println("Error: El puntaje no puede ser negativo.");
                return;
            }

            jugadores.put(nombre, puntaje);
            System.out.println("Jugador agregado exitosamente.");
        } catch (NumberFormatException e) {
            System.out.println("Error: El puntaje debe ser un número entero.");
        }
    }

    /**
     * Muestra el ranking de jugadores ordenado por puntaje de mayor a menor.
     * @param jugadores Mapa que almacena los jugadores y sus puntajes.
     */
    private static void mostrarRanking(HashMap<String, Integer> jugadores) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
            return;
        }

        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(jugadores.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\n=== Ranking de Jugadores ===");
        for (int i = 0; i < listaOrdenada.size(); i++) {
            Map.Entry<String, Integer> entrada = listaOrdenada.get(i);
            System.out.println((i + 1) + ". " + entrada.getKey() + " - Puntaje: " + entrada.getValue());
        }
    }

    /**
     * Muestra los jugadores con puntajes mayores a un umbral especificado.
     * @param jugadores Mapa que almacena los jugadores y sus puntajes.
     * @param umbral Puntaje mínimo para filtrar jugadores.
     */
    private static void mostrarJugadoresFiltrados(HashMap<String, Integer> jugadores, int umbral) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
            return;
        }

        List<Map.Entry<String, Integer>> listaFiltrada = new ArrayList<>(jugadores.entrySet());
        listaFiltrada.removeIf(entry -> entry.getValue() <= umbral);

        if (listaFiltrada.isEmpty()) {
            System.out.println("No hay jugadores con puntaje mayor a " + umbral + ".");
            return;
        }

        System.out.println("\n=== Jugadores con puntaje mayor a " + umbral + " ===");
        for (Map.Entry<String, Integer> entrada : listaFiltrada) {
            System.out.println(entrada.getKey() + " - Puntaje: " + entrada.getValue());
        }
    }
}