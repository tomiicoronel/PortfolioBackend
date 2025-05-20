# 🧠 Ejercicios Fase 2.10 — Colecciones (ArrayList, HashMap, HashSet)

Ejercicios basados en datos realistas, diseñados para fortalecer el manejo de colecciones en Java.

---

## Ejercicio 1: 🎬 Catálogo de Películas

**Contexto**: Un cine quiere gestionar su catálogo de películas disponibles.

**Tareas**:
- Crear una clase `Pelicula` con atributos: `titulo`, `genero`, `duracionMinutos`.
- Usar un `ArrayList` para almacenar las películas.
- Permitir al usuario agregar 5 películas.
- Mostrar todas las películas almacenadas.
- Permitir al usuario buscar una película por título.

**Desafío extra**: Permitir eliminar una película por nombre.

---

## Ejercicio 2: 🏫 Registro de Alumnos

**Contexto**: Una escuela debe registrar a sus alumnos.

**Tareas**:
- Crear una clase `Alumno` con `nombre`, `edad`, `curso`.
- Usar un `HashSet` para almacenar a los alumnos (evitar duplicados).
- Permitir al usuario cargar 5 alumnos.
- Mostrar todos los alumnos.
- Consultar si un alumno específico está registrado.

**Desafío extra**: Listar todos los alumnos de un curso específico.

---

## Ejercicio 3: 🛒 Stock de Productos en Tienda

**Contexto**: Una tienda de barrio gestiona su inventario.

**Tareas**:
- Crear una clase `Producto` con `nombre`, `precio`, `stock`.
- Usar un `HashMap<String, Producto>`, donde la clave es el nombre.
- Permitir agregar productos ingresados por el usuario.
- Permitir actualizar el stock de un producto.
- Mostrar el stock total de la tienda.

**Desafío extra**: Listar productos cuyo stock sea menor a 5 unidades.

---

## Ejercicio 4: 🧳 Agenda de Contactos

**Contexto**: Una persona quiere gestionar sus contactos personales.

**Tareas**:
- Crear una clase `Contacto` con `nombre`, `telefono`, `email`.
- Usar un `ArrayList` para guardar contactos.
- Agregar 5 contactos por teclado.
- Buscar un contacto ingresando su nombre.
- Mostrar todos los contactos.

**Desafío extra**: Permitir eliminar un contacto.

---

## Ejercicio 5: 🏆 Ranking de Jugadores

**Contexto**: Una app de videojuegos guarda el puntaje de sus usuarios.

**Tareas**:
- Crear una clase `Jugador` con `nombre` y `puntaje`.
- Usar un `HashMap<String, Integer>` (nombre → puntaje).
- Registrar varios jugadores y sus puntajes.
- Mostrar el ranking completo de mayor a menor puntaje.

**Desafío extra**: Mostrar sólo los jugadores con puntaje mayor a 500.

---

