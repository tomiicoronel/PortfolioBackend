## 🏆 Ejercicio 5: Ranking de Jugadores

**Contexto**
Una aplicación de videojuegos necesita mantener un registro de los puntajes de sus jugadores para poder mostrar un ranking competitivo.

---

## 🎯 Objetivos del Ejercicio

- Practicar el uso de la colección `HashMap` en Java para almacenar datos clave-valor.
- Implementar una clase simple (`Jugador`) para representar a los usuarios.
- Aprender a ordenar los elementos de un `HashMap` basándose en sus valores.
- Filtrar datos dentro de una colección según un criterio específico.

---

## 📋 Tareas

1. Crear una clase `Jugador` con los siguientes atributos:
    - `String nombre`
    - `int puntaje`

2. Usar un `HashMap<String, Integer>` para almacenar los puntajes de los jugadores, donde la clave será el nombre del jugador (`String`) y el valor será su puntaje (`Integer`).

3. Funcionalidades mínimas requeridas:
    - **Registrar varios jugadores** (al menos 5) con sus respectivos puntajes en el `HashMap`. Puedes hardcodearlos directamente en el código para simplificar la entrada.
    - **Mostrar el ranking completo de jugadores**, ordenado de mayor a menor puntaje. En caso de empate en el puntaje, el orden entre esos jugadores no es relevante.

4. Desafío extra:
    - **Mostrar sólo los jugadores que tienen un puntaje mayor a 500**, también ordenados de mayor a menor puntaje.

---

## 💡 Tips

- Para ordenar un `HashMap` por sus valores (los puntajes), necesitarás convertirlo a otra estructura que permita la ordenación, como una `List` de `Map.Entry`.
- Puedes usar la interfaz `Comparable` o un `Comparator` para definir el criterio de ordenación basado en el puntaje.
- Para el desafío extra, simplemente filtra la lista ordenada y muestra solo los jugadores que cumplan con la condición del puntaje.

---

# 🏆 Ejercicio 5: Uso de `HashMap` para el Ranking de Jugadores

## **¿Por qué usar un `HashMap` en este ejercicio?**

Un `HashMap` es una estructura de datos eficiente para almacenar pares clave-valor. En este caso, la clave es el nombre único de cada jugador (`String`) y el valor es su puntaje asociado (`Integer`). Esta estructura es ideal para acceder rápidamente al puntaje de un jugador específico utilizando su nombre.

El objetivo principal de usar un `HashMap` aquí es **asociar de manera directa y eficiente cada jugador con su puntaje**. Esto facilita la consulta del puntaje de un jugador en particular. Sin embargo, un `HashMap` en sí mismo no mantiene un orden específico de sus elementos, por lo que necesitaremos pasos adicionales para generar el ranking.

---

## **Objetivo del enfoque**

El enfoque basado en `HashMap` tiene como objetivo:

1. **Acceso rápido**: Permitir obtener el puntaje de un jugador de manera eficiente utilizando su nombre como clave.
2. **Unicidad de jugadores**: Asegurar que cada jugador esté registrado una sola vez en el sistema.

Para la parte del ranking, el objetivo es demostrar cómo se pueden manipular los datos de un `HashMap` para presentarlos de una manera útil (ordenada por puntaje).

---

## **¿En qué situaciones se aplica este enfoque?**

El uso de un `HashMap` es apropiado cuando:

- **Se necesita acceder rápidamente a un valor utilizando una clave única**: Como obtener el puntaje de un jugador por su nombre.
- **No se requiere mantener un orden específico de los elementos al momento del almacenamiento**: El `HashMap` no garantiza ningún orden.
- **La unicidad de las claves es importante**: Cada nombre de jugador debe ser único.

Para la funcionalidad de ranking (ordenamiento por valor), este enfoque se complementa con la conversión a una estructura ordenable.

---

## **¿Cómo mejora tu forma de resolver problemas?**

Aplicar un `HashMap` en este contexto te enseña a:

1. **Modelar relaciones uno-a-uno**: Comprender cómo asociar una clave única con un valor.
2. **Realizar búsquedas eficientes por clave**: Aprender a aprovechar la eficiencia del `HashMap` para acceder a la información.
3. **Combinar estructuras de datos para lograr un objetivo**: Entender que a veces es necesario usar diferentes estructuras (como `HashMap` y `List`) en conjunto para resolver un problema complejo (almacenamiento eficiente y luego ordenamiento).
4. **Implementar algoritmos de ordenación y filtrado**: Practicar cómo manipular colecciones para presentar los datos de manera significativa.

---

## **Buenas prácticas al usar un `HashMap`**

1. **Elegir claves significativas y únicas**: En este caso, el nombre del jugador es una buena clave si se asume que los nombres son únicos. En sistemas más complejos, podría ser mejor usar un ID único.
2. **Manejar posibles valores nulos**: Si los puntajes pudieran ser nulos, es importante tenerlo en cuenta al acceder a ellos.
3. **Considerar la eficiencia si se realizan muchas operaciones de ordenamiento**: Si el ranking se actualiza con mucha frecuencia, convertir el `HashMap` a una lista y ordenarla repetidamente podría no ser la solución más eficiente a largo plazo. Podrían explorarse otras estructuras de datos que mantengan el orden o permitan una ordenación más eficiente.

---

## **Errores comunes o malos usos**

1. **Asumir un orden específico en el `HashMap`**: Los `HashMap` no garantizan un orden de iteración.
2. **No manejar colisiones (aunque Java lo hace internamente)**: Entender que demasiadas colisiones pueden afectar el rendimiento.
3. **Usar objetos mutables como claves sin precaución**: Si el estado de un objeto usado como clave cambia después de ser insertado en el `HashMap`, puede que ya no se pueda acceder al valor asociado. En este caso, `String` es inmutable, por lo que no hay problema.

---

## **Aplicación al ejercicio**

En este ejercicio, el `HashMap` se utiliza para:

1. **Almacenar los puntajes de los jugadores**: Cada jugador se asocia con su puntaje de manera eficiente.
2. **Acceder al puntaje de un jugador específico**: Dado el nombre del jugador, se puede obtener su puntaje rápidamente.

Para mostrar el ranking:

1. **Se convierte el `HashMap` a una `List` de `Map.Entry<String, Integer>`**: Esto permite acceder tanto al nombre (clave) como al puntaje (valor) de cada jugador.
2. **Se ordena la lista utilizando un `Comparator`**: El `Comparator` se define para comparar las entradas basándose en sus valores (los puntajes), en orden descendente.
3. **Se itera sobre la lista ordenada para mostrar el ranking**.

Para el desafío extra, después de ordenar la lista, simplemente se filtran los jugadores cuyo puntaje es mayor a 500 antes de mostrarlos.

Este enfoque demuestra cómo se puede utilizar un `HashMap` para el almacenamiento eficiente y cómo se pueden manipular sus datos para cumplir con requisitos específicos de presentación, como un ranking ordenado.

---

## **Conclusión**

Este ejercicio te permite comprender la utilidad del `HashMap` para almacenar datos asociados por una clave única y cómo, a través de la manipulación y la combinación con otras estructuras de datos, se pueden lograr funcionalidades más complejas como la generación de un ranking ordenado y el filtrado de información.