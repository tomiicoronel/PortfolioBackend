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