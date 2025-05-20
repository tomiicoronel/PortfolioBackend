# 🛒 Ejercicio 3: Stock de Productos en Tienda

**Contexto**  
Una tienda de barrio necesita llevar el control de su inventario de productos, permitiendo tanto el registro como la actualización del stock y visualización de los productos disponibles.

---

## 🎯 Objetivos del Ejercicio

- Practicar el uso de la colección `HashMap` en Java.
- Implementar clases con atributos y métodos que representen entidades del mundo real.
- Aplicar entrada por teclado para simular interacción con el usuario.
- Reforzar conceptos de actualización, búsqueda y recorrido de estructuras de datos.

---

## 📋 Tareas

1. Crear una clase `Producto` con los siguientes atributos:
    - `String nombre`
    - `double precio`
    - `int stock`

2. Usar un `HashMap<String, Producto>` donde la clave será el nombre del producto.

3. Funcionalidades mínimas requeridas:
    - Permitir al usuario **agregar productos** con sus datos.
    - Permitir al usuario **actualizar el stock** de un producto existente.
    - **Mostrar todo el stock actual** de la tienda (nombre, precio y stock de cada producto).

4. Desafío extra:
    - **Listar los productos cuyo stock sea menor a 5 unidades** para identificar los que deben reponerse.

---

## 💡 Tips

- Usá `Scanner` para la entrada de datos.
- Validá si el producto ya existe en el `HashMap` antes de actualizar o agregar.
- Podés crear un método `mostrarProducto()` en la clase `Producto` para imprimir sus datos fácilmente.

---

# 🛒 Ejercicio 3: Uso de `HashMap` para Gestionar el Stock de Productos

## **¿Por qué usar un `HashMap` en este ejercicio?**

Un `HashMap` es una estructura de datos en Java que permite almacenar pares clave-valor. En este caso, la clave será el nombre del producto (`String`), y el valor será un objeto de la clase `Producto`. Este enfoque es ideal para resolver problemas donde se necesita acceder rápidamente a un elemento específico, ya que el `HashMap` ofrece una complejidad promedio de **O(1)** para operaciones como búsqueda, inserción y eliminación.

El objetivo principal de usar un `HashMap` en este ejercicio es **optimizar la gestión del inventario**. En un sistema de tienda, es común que se necesite buscar productos por su nombre, actualizar su stock o listar todos los productos disponibles. Un `HashMap` facilita estas operaciones de manera eficiente y clara.

---

## **Objetivo del enfoque**

El enfoque basado en `HashMap` tiene como objetivo:

1. **Eficiencia**: Permitir búsquedas rápidas de productos por su nombre, lo que es crucial en sistemas donde el tiempo de respuesta es importante.
2. **Organización**: Almacenar los datos de manera estructurada, asociando cada producto con su nombre como clave.
3. **Escalabilidad**: Manejar un número creciente de productos sin que el rendimiento del sistema se degrade significativamente.
4. **Flexibilidad**: Facilitar la implementación de funcionalidades adicionales, como filtrar productos con bajo stock o agregar nuevos atributos en el futuro.

---

## **¿En qué situaciones se aplica este enfoque?**

El uso de un `HashMap` es ideal en escenarios donde:

- **Se necesita acceso directo a elementos específicos**: Por ejemplo, buscar un producto por su nombre en un inventario.
- **Las claves son únicas**: En este caso, el nombre del producto debe ser único para evitar conflictos.
- **El tamaño de los datos es dinámico**: Un `HashMap` permite agregar o eliminar elementos sin necesidad de redimensionar manualmente la estructura.
- **Se requiere un rendimiento óptimo**: En sistemas donde las operaciones de búsqueda y actualización son frecuentes, como en un sistema de gestión de inventarios.

En el contexto de este ejercicio, el `HashMap` es una herramienta perfecta para modelar el inventario de una tienda, ya que permite realizar operaciones comunes (agregar, actualizar, listar) de manera eficiente.

---

## **¿Cómo mejora tu forma de resolver problemas?**

Aplicar un `HashMap` correctamente te ayuda a:

1. **Pensar en términos de relaciones clave-valor**: Esto es útil no solo en Java, sino también en otros lenguajes y contextos, como bases de datos (donde las claves primarias funcionan de manera similar).
2. **Optimizar el rendimiento**: Al comprender cómo funciona un `HashMap` internamente (tablas hash, colisiones, etc.), puedes diseñar sistemas más rápidos y escalables.
3. **Simplificar el código**: Usar un `HashMap` reduce la necesidad de escribir lógica compleja para buscar o actualizar elementos, lo que hace que tu código sea más limpio y fácil de mantener.
4. **Abstraer la complejidad**: Te permite centrarte en la lógica del negocio (gestión del inventario) sin preocuparte por los detalles de implementación de la estructura de datos.

---

## **Buenas prácticas al usar un `HashMap`**

1. **Validar la existencia de claves**: Antes de agregar o actualizar un producto, verifica si ya existe en el `HashMap` para evitar sobrescribir datos accidentalmente.
2. **Evitar claves nulas**: Aunque un `HashMap` permite claves nulas, esto puede generar errores difíciles de depurar. Es mejor evitarlo.
3. **Elegir claves únicas y significativas**: En este caso, el nombre del producto es una buena clave, pero en sistemas más complejos podrías usar un identificador único (como un código de barras).
4. **Sincronización en entornos concurrentes**: Si el sistema es multiusuario, considera usar un `ConcurrentHashMap` para evitar problemas de concurrencia.
5. **Manejo de colisiones**: Aunque Java maneja colisiones internamente, es importante entender cómo afectan el rendimiento y evitar claves que generen demasiados conflictos.

---

## **Errores comunes o malos usos**

1. **No manejar claves duplicadas**: Si no verificas si un producto ya existe antes de agregarlo, podrías sobrescribir datos importantes.
2. **No iterar correctamente**: Al recorrer un `HashMap`, es común que los desarrolladores intenten modificarlo directamente, lo que puede generar excepciones como `ConcurrentModificationException`.
3. **Usar claves inadecuadas**: Elegir claves que no sean únicas o que puedan cambiar (como el nombre del producto si es editable) puede causar inconsistencias.
4. **No manejar valores nulos**: Si un producto tiene un valor nulo, podrías obtener errores inesperados al intentar acceder a sus atributos.

---

## **Aplicación al ejercicio**

En este ejercicio, el `HashMap` se utiliza para modelar un sistema CRUD (Crear, Leer, Actualizar, Eliminar) básico para gestionar el inventario de una tienda. Cada operación tiene un propósito claro:

1. **Agregar productos**: Permite registrar nuevos productos en el inventario. Antes de agregar, se debe verificar si el producto ya existe para evitar duplicados.
2. **Actualizar stock**: Facilita la modificación del stock de un producto existente. Esto es útil para reflejar ventas o reposiciones.
3. **Listar productos**: Muestra todos los productos disponibles, lo que ayuda a los usuarios a tener una visión general del inventario.
4. **Filtrar productos con bajo stock**: Identifica productos que necesitan reposición, lo que es clave para mantener el inventario actualizado.

Este enfoque no solo resuelve el problema planteado, sino que también sienta las bases para sistemas más complejos, como APIs REST o aplicaciones con bases de datos, donde el `HashMap` puede ser reemplazado por estructuras más avanzadas (como tablas en una base de datos relacional).

---

## **Conclusión**

El uso de un `HashMap` en este ejercicio no solo es una solución eficiente, sino también una oportunidad para aprender conceptos fundamentales de programación y diseño de software. Al aplicar este enfoque correctamente, mejoras tu capacidad para resolver problemas relacionados con la gestión de datos, optimizas el rendimiento de tus aplicaciones y adoptas buenas prácticas que te serán útiles en proyectos más avanzados.