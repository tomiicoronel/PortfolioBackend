# 🏫 Ejercicio 2 — Registro de Alumnos

## 🧠 Descripción del problema
Una escuela necesita almacenar los datos de sus alumnos sin permitir duplicados. Vas a crear una aplicación en consola que gestione este registro usando un `HashSet`.

---

## 🛠️ Objetivos del ejercicio

### 📌 Clase `Alumno`
- Atributos:
    - `String nombre`
    - `int edad`
    - `String curso`
- Métodos sugeridos:
    - `mostrarInfo()` → Imprime los datos del alumno.
    - `equals()` y `hashCode()` sobrescritos para evitar duplicados en él `HashSet`.

---

### 📌 Funcionalidades principales
1. Crear un `HashSet<Alumno>` para guardar los registros de los alumnos.
2. Permitir al usuario ingresar **5 alumnos** por teclado.
3. Mostrar todos los alumnos registrados.
4. Consultar si un alumno está registrado, ingresando su nombre.
5. ✅ **Desafío adicional**: Listar todos los alumnos de un curso específico.

---

## 🧩 Sugerencias para desarrollar
- Usar `Scanner` para entrada de datos.
- Implementar correctamente `equals()` y `hashCode()` en la clase `Alumno` para que `HashSet` evite duplicados.
- Para consultar un alumno por nombre, podés recorrer el `HashSet` con un bucle.
- Para el desafío extra, pedir un nombre de curso por teclado y mostrar coincidencias.

---

## 💡 Reto extra (opcional)
- Mostrar la cantidad total de alumnos por curso (bonus si usás un `HashMap<String, Integer>` auxiliar para contarlos).

---

## 🎯 Objetivo educativo
Este ejercicio te permite practicar:
- Uso de `HashSet` para evitar duplicados.
- Comparación de objetos personalizados.
- Búsqueda dentro de una colección.
- Estructuración lógica de datos en la consola.






