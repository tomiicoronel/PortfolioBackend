# 🎬 Ejercicio 1 — Catálogo de Películas

## 🧠 Descripción del problema
Un cine desea digitalizar su catálogo de películas para poder consultar fácilmente las disponibles, agregarlas, eliminarlas o buscarlas por título.

Tu tarea es desarrollar una aplicación sencilla en consola que cumpla con estos requisitos utilizando un `ArrayList`.

---

## 🛠️ Objetivos del ejercicio

### 📌 Clase `Pelicula`
- Atributos:
    - `String titulo`
    - `String genero`
    - `int duracionMinutos`

- Método sugerido:
    - `void mostrarInfo()` → Imprime los detalles de la película.

---

### 📌 Funcionalidades principales
1. Crear una lista (`ArrayList`) para almacenar objetos de tipo `Pelicula`.
2. Permitir al usuario **agregar 5 películas** por teclado.
3. Mostrar por consola **todas las películas** almacenadas.
4. Buscar una película por su **título exacto**.
5. ✅ **Desafío adicional**: Permitir **eliminar una película** ingresando su título.

---

## 🧩 Sugerencias para desarrollar
- Usar bucles (`for` o `while`) para cargar las películas.
- Usar `Scanner` para ingresar datos por consola.
- Para buscar una película por título, se puede recorrer el `ArrayList` con un `for-each`.
- Para eliminar una película, se puede usar `removeIf()` o una búsqueda por índice.

---

## 💡 Reto extra (opcional)
Mostrar un resumen final con:
- La cantidad total de películas cargadas.
- El promedio de duración de las películas.

---

## 🎯 Objetivo educativo
Este ejercicio te permite practicar:
- Uso de clases personalizadas.
- Manipulación de `ArrayList`.
- Entrada de datos por consola.
- Búsqueda y eliminación de elementos.
