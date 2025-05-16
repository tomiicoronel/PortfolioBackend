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

## Ejercicio 6: 📚 Biblioteca Digital

**Contexto**: Una biblioteca online almacena libros.

**Tareas**:
- Crear una clase `Libro` con `titulo`, `autor`, `anioPublicacion`.
- Usar un `HashSet` para guardar los libros.
- Cargar 5 libros únicos.
- Permitir buscar libros por autor.

**Desafío extra**: Mostrar todos los libros publicados después del año 2010.

---

## Ejercicio 7: 🍔 Menú de Restaurante

**Contexto**: Un restaurante digitaliza su menú.

**Tareas**:
- Crear una clase `Plato` con `nombre`, `precio`, `esVegetariano`.
- Usar un `ArrayList` para almacenar los platos.
- Permitir cargar platos desde teclado.
- Listar todos los platos vegetarianos.

**Desafío extra**: Mostrar el plato más barato.

---

## Ejercicio 8: ✈️ Sistema de Reservas de Vuelos

**Contexto**: Una aerolínea guarda las reservas de sus pasajeros.

**Tareas**:
- Crear una clase `Reserva` con `nombrePasajero`, `codigoVuelo`, `fechaVuelo`.
- Usar un `HashMap<String, Reserva>`, donde la clave es el `codigoVuelo`.
- Registrar varias reservas.
- Buscar una reserva ingresando el código de vuelo.

**Desafío extra**: Mostrar todas las reservas de un mismo día.

---

## Ejercicio 9: 🎤 Encuesta de Opiniones

**Contexto**: Una empresa hace una encuesta sobre satisfacción de clientes.

**Tareas**:
- Crear una clase `Opinion` con `cliente`, `comentario`, `calificacion` (1 a 5).
- Usar un `ArrayList` para almacenar opiniones.
- Cargar opiniones ingresadas por el usuario.
- Mostrar solo opiniones con calificación mayor a 4.

**Desafío extra**: Calcular el promedio general de satisfacción.

---

## Ejercicio 10: 🎓 Sistema de Materias de Estudiantes

**Contexto**: Una universidad guarda las materias que cursa cada alumno.

**Tareas**:
- Crear una clase `Materia` con `nombreMateria`, `creditos`.
- Usar un `HashMap<String, ArrayList<Materia>>`, donde la clave es el nombre del alumno.
- Permitir asignar materias a distintos alumnos.
- Listar todas las materias que cursa un alumno.

**Desafío extra**: Calcular el total de créditos de un alumno.


# 🏠 Mini-Proyecto: Sistema de Gestión de Inmobiliaria

**Contexto**: Una inmobiliaria necesita administrar sus propiedades, clientes y reservas de alquiler.

---

## 🎯 Objetivo general
Desarrollar un sistema simple que permita:
- Registrar propiedades en alquiler.
- Registrar clientes interesados.
- Registrar reservas de alquileres.
- Consultar propiedades disponibles y reservas hechas.

---

## 🛠️ Estructuras de datos a usar
- `ArrayList<Propiedad>` para almacenar las propiedades.
- `HashSet<Cliente>` para almacenar los clientes (sin duplicados).
- `HashMap<String, Reserva>` para almacenar reservas (clave = ID de reserva).

---

## 👨‍💻 Tareas

1. **Clase Propiedad**
    - Atributos: `id`, `direccion`, `precioMensual`, `disponible` (boolean).
    - Métodos:
        - `mostrarInfo()`
        - `marcarComoNoDisponible()`

2. **Clase Cliente**
    - Atributos: `nombre`, `dni`, `telefono`.
    - Métodos:
        - `mostrarInfo()`

3. **Clase Reserva**
    - Atributos: `idReserva`, `cliente` (Cliente), `propiedad` (Propiedad), `fechaInicio`, `fechaFin`.
    - Métodos:
        - `mostrarInfo()`

4. **Lógica principal**
    - Permitir al usuario:
        - Cargar propiedades.
        - Cargar clientes.
        - Crear una reserva (elige un cliente, elige una propiedad disponible, ingresa fechas).
        - Mostrar todas las propiedades disponibles.
        - Mostrar todas las reservas registradas.

---

## 💡 Desafíos extra

- Validar que no se pueda reservar una propiedad ya alquilada.
- Al reservar, automáticamente marcar la propiedad como "no disponible".
- Permitir cancelar una reserva (y volver a poner la propiedad disponible).
- Ordenar las propiedades por precio de menor a mayor.

---

✅ **Con este ejercicio combinás**:
- `ArrayList`
- `HashSet`
- `HashMap`
- Relaciones entre clases (`Cliente` ↔ `Reserva` ↔ `Propiedad`)
- Pensamiento de flujo de trabajo real (alta, baja, consulta, validación)
  """