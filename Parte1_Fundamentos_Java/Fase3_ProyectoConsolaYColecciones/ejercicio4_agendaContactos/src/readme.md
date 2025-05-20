## 🧳 Ejercicio 4: Agenda de Contactos

**Contexto**
Una persona quiere gestionar sus contactos personales, permitiendo agregar, buscar, listar y, como desafío extra, eliminar contactos de su agenda.

---

## 🎯 Objetivos del Ejercicio

- Practicar el uso de la colección `ArrayList` en Java.
- Implementar una clase que represente una entidad del mundo real (`Contacto`).
- Aplicar entrada por teclado para interactuar con el usuario y agregar datos.
- Reforzar conceptos de búsqueda y recorrido de estructuras de datos secuenciales.
- (Desafío extra) Implementar la eliminación de elementos de una colección.

---

## 📋 Tareas

1. Crear una clase `Contacto` con los siguientes atributos:
    - `String nombre`
    - `String telefono`
    - `String email`

2. Usar un `ArrayList<Contacto>` para almacenar los objetos `Contacto`.

3. Funcionalidades mínimas requeridas:
    - Permitir al usuario **agregar 5 contactos** ingresando sus datos por teclado.
    - Permitir al usuario **buscar un contacto** ingresando su nombre y mostrar su información.
    - **Mostrar todos los contactos** almacenados en la agenda.

4. Desafío extra:
    - Permitir al usuario **eliminar un contacto** ingresando su nombre.

---

## 💡 Tips

- Utiliza la clase `Scanner` para la entrada de datos desde el teclado.
- Considera la posibilidad de crear métodos en la clase `Contacto` para facilitar la impresión de sus datos.
- Para la búsqueda y eliminación, deberás iterar sobre el `ArrayList` y comparar los nombres de los contactos.

---

# 🧳 Ejercicio 4: Uso de `ArrayList` para Gestionar Contactos

## **¿Por qué usar un `ArrayList` en este ejercicio?**

Un `ArrayList` es una colección dinámica en Java que permite almacenar una secuencia de objetos. En este caso, almacenaremos objetos de la clase `Contacto`. A diferencia de los arrays de tamaño fijo, un `ArrayList` puede crecer o disminuir dinámicamente a medida que se agregan o eliminan elementos.

El objetivo principal de usar un `ArrayList` en este ejercicio es **gestionar una colección de contactos de manera flexible**. Necesitamos poder agregar un número variable de contactos (inicialmente 5, pero podría ser más en el futuro), buscar contactos específicos y mostrar la lista completa. Un `ArrayList` es una estructura adecuada para estas operaciones, especialmente cuando no se conoce de antemano el número exacto de contactos.

---

## **Objetivo del enfoque**

El enfoque basado en `ArrayList` tiene como objetivo:

1. **Flexibilidad**: Permitir agregar y eliminar contactos fácilmente sin preocuparse por el tamaño fijo de una estructura.
2. **Orden**: Mantener el orden en el que se insertan los contactos, lo que puede ser útil para ciertas funcionalidades (aunque no sea un requisito explícito en este ejercicio).
3. **Simplicidad**: Ofrecer una manera sencilla de almacenar y acceder a los elementos mediante un índice.

---

## **¿En qué situaciones se aplica este enfoque?**

El uso de un `ArrayList` es ideal en escenarios donde:

- **Se necesita una colección ordenada de elementos**: Los elementos se almacenan en el orden en que se agregan.
- **El tamaño de la colección puede variar dinámicamente**: Se pueden agregar o eliminar elementos según sea necesario.
- **Se accede a los elementos por su índice**: Aunque en este ejercicio la búsqueda es por nombre, el acceso por índice es una característica fundamental del `ArrayList`.
- **No se requiere una búsqueda extremadamente rápida basada en una clave específica**: Para búsquedas frecuentes y basadas en una clave única, otras estructuras como `HashMap` son más eficientes.

En el contexto de este ejercicio, el `ArrayList` es una buena opción para empezar a gestionar una lista de contactos donde la simplicidad y la capacidad de crecer dinámicamente son importantes.

---

## **¿Cómo mejora tu forma de resolver problemas?**

Aplicar un `ArrayList` correctamente te ayuda a:

1. **Entender las colecciones secuenciales**: Te familiarizas con una de las estructuras de datos más básicas y utilizadas en programación.
2. **Manejar conjuntos de datos dinámicos**: Aprendes a trabajar con colecciones cuyo tamaño no está predefinido.
3. **Implementar algoritmos de búsqueda y recorrido**: Practicas cómo iterar sobre una colección para encontrar o procesar elementos.
4. **Prepararte para estructuras de datos más complejas**: Comprender el `ArrayList` sienta las bases para entender otras colecciones como `LinkedList` o incluso estructuras basadas en claves como `HashMap`.

---

## **Buenas prácticas al usar un `ArrayList`**

1. **Verificar los límites al acceder por índice**: Asegúrate de que el índice esté dentro del rango válido (de 0 al tamaño de la lista menos 1) para evitar errores `IndexOutOfBoundsException`.
2. **Considerar el rendimiento para inserciones y eliminaciones en el medio de la lista**: Estas operaciones pueden ser costosas en términos de rendimiento ya que requieren desplazar otros elementos. Si estas operaciones son frecuentes, `LinkedList` podría ser una mejor opción.
3. **Utilizar métodos proporcionados por la clase**: Aprovecha los métodos como `add()`, `remove()`, `get()`, `size()`, `contains()`, etc., para manipular la lista de manera eficiente.

---

## **Errores comunes o malos usos**

1. **No verificar si un elemento existe antes de intentar eliminarlo**: Esto puede llevar a errores si intentas eliminar un elemento que no está en la lista.
2. **Modificar la lista mientras se itera sobre ella de forma incorrecta**: Al eliminar elementos durante una iteración con un bucle `for` tradicional basado en índices, puedes saltarte elementos. Es mejor usar un `Iterator` o un bucle `for-each` con precaución.
3. **Acceder a índices inválidos**: Intentar acceder a un índice fuera del rango de la lista generará una excepción.

---

## **Aplicación al ejercicio**

En este ejercicio, el `ArrayList` se utiliza para implementar las funcionalidades básicas de una agenda de contactos:

1. **Agregar contactos**: Se crean nuevos objetos `Contacto` y se añaden al final del `ArrayList` utilizando el método `add()`.
2. **Buscar un contacto**: Se itera sobre el `ArrayList` comparando el nombre ingresado por el usuario con el atributo `nombre` de cada objeto `Contacto`.
3. **Mostrar todos los contactos**: Se recorre el `ArrayList` e se imprime la información de cada contacto.
4. **(Desafío extra) Eliminar un contacto**: Se busca el contacto por su nombre y, si se encuentra, se elimina del `ArrayList` utilizando el método `remove()`. Es importante manejar el caso en que el contacto no se encuentre.

Este enfoque proporciona una solución clara y funcional para la gestión básica de contactos, utilizando una de las colecciones más fundamentales de Java.

---

## **Conclusión**

El uso de un `ArrayList` en este ejercicio te permite comprender cómo trabajar con colecciones dinámicas en Java y cómo implementar operaciones comunes como agregar, buscar y eliminar elementos. Aunque para funcionalidades más avanzadas o para grandes cantidades de datos podrían considerarse otras estructuras, el `ArrayList` es una herramienta valiosa para empezar a gestionar listas de objetos de manera sencilla y eficiente.