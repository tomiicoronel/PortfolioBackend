import java.util.HashMap;
import java.util.Scanner;

/**
 * Clase principal que gestiona el inventario de productos utilizando un HashMap.
 */
public class Main {
    public static void main(String[] args) {
        // HashMap para almacenar el inventario, donde la clave es el nombre del producto y el valor es un objeto Producto.
        HashMap<String, Producto> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle principal del menú de opciones.
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar stock");
            System.out.println("3. Mostrar todo el stock");
            System.out.println("4. Mostrar productos con stock menor a 5");
            System.out.println("0. Salir");
            try { // Manejo de error por entrada invalida por teclado
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                opcion = -1; // Asignar un valor inválido para que el menú se repita
            }
            opcion = scanner.nextInt();

            // Manejo de las opciones del menú.
            switch (opcion) {

                case 1:
                    agregarProductos(inventario, scanner);
                    break;
                case 2:
                    actualizarStock(inventario, scanner);
                    break;
                case 3:
                    mostrarStock(inventario);
                    break;
                case 4:
                    mostrarStockBajo(inventario);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intenta de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    /**
     * Método para agregar un nuevo producto al inventario.
     *
     * @param inventario HashMap que almacena los productos.
     * @param scanner    Objeto Scanner para leer la entrada del usuario.
     */
    public static void agregarProductos(HashMap<String, Producto> inventario, Scanner scanner) {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.next();
        // Verifica si el producto ya existe en el inventario.
        if (inventario.containsKey(nombre)) {
            System.out.println("El producto ya existe en el inventario.");
        } else {
            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Stock del producto: ");
            int stock = scanner.nextInt();
            // Agrega el nuevo producto al inventario.
            inventario.put(nombre, new Producto(nombre, precio, stock));
            System.out.println("Producto agregado correctamente.");
        }
    }

    /**
     * Método para actualizar el stock de un producto existente.
     *
     * @param inventario HashMap que almacena los productos.
     * @param scanner    Objeto Scanner para leer la entrada del usuario.
     */
    public static void actualizarStock(HashMap<String, Producto> inventario, Scanner scanner) {
        System.out.print("Nombre del producto a actualizar: ");
        String nombre = scanner.next();
        // Verifica si el producto existe en el inventario.
        if (inventario.containsKey(nombre)) {
            System.out.print("Nuevo stock: ");
            int nuevoStock = scanner.nextInt();
            // Actualiza el stock del producto.
            inventario.get(nombre).setStock(nuevoStock);
            System.out.println("Stock actualizado correctamente.");
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

    /**
     * Método para mostrar todos los productos en el inventario.
     *
     * @param inventario HashMap que almacena los productos.
     */
    public static void mostrarStock(HashMap<String, Producto> inventario) {
        // Verifica si el inventario está vacío.
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            // Muestra todos los productos en el inventario.
            inventario.values().forEach(System.out::println);
        }
    }

    /**
     * Método para mostrar los productos con stock menor a 5.
     *
     * @param inventario HashMap que almacena los productos.
     */
    public static void mostrarStockBajo(HashMap<String, Producto> inventario) {
        boolean hayProductos = false;
        // Recorre el inventario y verifica el stock de cada producto.
        for (Producto producto : inventario.values()) {
            if (producto.getStock() < 5) {
                System.out.println(producto);
                hayProductos = true;
            }
        }
        // Si no hay productos con stock bajo, muestra un mensaje.
        if (!hayProductos) {
            System.out.println("No hay productos con stock menor a 5.");
        }
    }
}