# Ejercicio 2: Registro de Turnos Médicos

## Contexto
Una clínica médica necesita un sistema para registrar los turnos de sus pacientes junto con las especialidades asociadas. Este ejercicio tiene como objetivo desarrollar una solución sencilla pero eficiente que implemente el registro y la consulta de turnos médicos utilizando Spring Boot.

El desarrollo de este sistema no solo te permitirá consolidar conceptos clave de la arquitectura basada en MVC (Modelo-Vista-Controlador), sino también adoptar buenas prácticas de programación orientada a objetos, diseño limpio y validación de datos.

---

## 🧩 Requisitos funcionales
1. Registrar un turno con los siguientes datos:
    - **Nombre del paciente** (String)
    - **Especialidad** (String)
2. Listar todos los turnos registrados.

---

## 🚀 Pasos para resolver el ejercicio

### **1. Crear el Proyecto**
Utiliza **Spring Initializr** para generar el esqueleto del proyecto:
- **Dependencias necesarias:**
    - **Spring Web:** Para crear controladores REST y manejar solicitudes HTTP.
    - **Lombok:** Para reducir el código boilerplate (como getters, setters, constructores, etc.).

### **2. Crear la Estructura de Carpetas del Proyecto**
Organiza tu proyecto en las siguientes carpetas, siguiendo la arquitectura **MVC**:
- **Model:** Aquí irán las clases que representan los datos (en este caso, `TurnoDTO`).
- **Service:** Encargada de la lógica de negocio, como guardar y obtener los turnos.
- **Controller:** Define los endpoints REST que interactúan con el cliente.

---

## 🔍 Enfoques y Objetivos Clave

### **Arquitectura MVC**
El patrón MVC (Modelo-Vista-Controlador) es fundamental en aplicaciones web modernas. En este ejercicio:
- **Model:** Representa los datos que manejaremos (`TurnoDTO`).
- **Service:** Contiene la lógica de negocio; separa las operaciones complejas del controlador.
- **Controller:** Maneja las solicitudes HTTP y delega las operaciones al servicio.

**Por qué usar MVC:**
- Fomenta la **separación de responsabilidades**, haciendo el código más limpio y fácil de mantener.
- Facilita la **prueba unitaria**: Cada capa puede probarse de forma independiente.
- Mejora la **escalabilidad**: Si el sistema crece, puedes modificar o agregar funcionalidades en cada capa sin afectar las demás.

---

### **DTO (Data Transfer Object)**
Un DTO es una clase que encapsula los datos que se intercambian entre las capas de la aplicación. En este caso, `TurnoDTO` servirá como un puente entre el controlador y el servicio.

**Por qué usar DTOs:**
- **Encapsulación de datos:** Los DTOs definen exactamente qué datos se exponen al cliente.
- **Seguridad:** Evita exponer directamente las entidades del sistema.
- **Flexibilidad:** Permite agregar validaciones y transformar datos antes de enviarlos o procesarlos.

**Errores comunes:**
- No validar los datos del DTO antes de procesarlos. Siempre aplica validaciones para evitar inconsistencias.
- Usar entidades directamente en lugar de DTOs. Esto acopla la capa de datos con otras capas.

---

### **Validación de Datos**
Validar los datos del cliente es esencial para garantizar la integridad del sistema. Por ejemplo:
- **Nombre del paciente:** No debe estar vacío.
- **Especialidad:** Debe ser un valor válido.

**Buenas prácticas en validación:**
- Usa anotaciones como `@NotBlank` o `@NotNull` para validaciones básicas.
- Integra validaciones en el DTO, no en el controlador, para centralizar la lógica.
- Devuelve mensajes de error claros al cliente.

**Errores comunes:**
- Validar datos únicamente en el frontend. Esto es insuficiente, ya que el backend también debe validar para proteger el sistema.
- No manejar adecuadamente los errores de validación, lo que puede confundir al cliente.

---

### **Servicio de Turnos**
El servicio es el núcleo de la lógica de negocio. Aquí se implementan métodos como:
- **guardarTurno(TurnoDTO turno):** Agrega un turno a una lista en memoria.
- **obtenerTurnos():** Devuelve la lista completa de turnos registrados.

**Por qué usar una capa de servicio:**
- Centraliza la lógica de negocio, evitando duplicación de código.
- Hace que el código sea más fácil de probar y escalar.
- Permite separar las responsabilidades del controlador, haciéndolo más liviano.

**Errores comunes:**
- Implementar lógica de negocio directamente en el controlador.
- No manejar casos especiales, como turnos duplicados o datos inválidos.

---

### **Controladores REST**
Los controladores son responsables de manejar las solicitudes HTTP y devolver respuestas al cliente. En este ejercicio, los endpoints son:
- **POST /turnos:** Para registrar un turno.
- **GET /turnos:** Para devolver la lista de turnos.

**Buenas prácticas para controladores:**
- Mantén los controladores livianos. Su único rol es delegar la lógica al servicio.
- Usa respuestas claras y consistentes. Por ejemplo:
    - Mensajes de éxito o error para el cliente.
    - Estándares HTTP como `200 OK`, `201 Created`, o `400 Bad Request`.

**Errores comunes:**
- Mezclar lógica de negocio con la lógica del controlador.
- No devolver códigos de estado HTTP adecuados, lo que puede confundir al cliente.

---

### **Validación en el EndPoint**
Para validar el nombre del paciente, puedes usar herramientas de validación proporcionadas por Spring Boot. Esto garantiza que no se registren turnos con datos incompletos o incorrectos.

---

## 📤 Salida esperada
1. **POST /turnos:**
    - Registra un turno y devuelve un mensaje de éxito: `"Turno registrado con éxito."`
    - Si el nombre del paciente está vacío, devuelve un mensaje de error: `"El nombre del paciente no puede estar vacío."`

2. **GET /turnos:**
    - Devuelve una lista en formato JSON con todos los turnos registrados.

---

## 🎯 Reto adicional
Valida que el nombre del paciente no sea vacío. Esto te ayudará a practicar validaciones de datos y manejar errores correctamente en Spring Boot.

---

## 🌟 Buenas prácticas aplicadas
- **Separación de responsabilidades:** Cada capa tiene su rol específico.
- **Validación de datos:** Garantiza la integridad del sistema.
- **Uso de DTOs:** Mejora la seguridad y la flexibilidad del sistema.
- **Diseño escalable:** La solución puede adaptarse fácilmente a nuevos requisitos, como agregar más datos al turno o conectarlo a una base de datos.

---

## 🚫 Errores comunes en ejercicios similares
1. **No estructurar el proyecto:** No usar una arquitectura clara puede llevar a código desordenado y difícil de mantener.
2. **Validar solo en el frontend:** Esto deja el backend vulnerable a datos incorrectos.
3. **Acoplar capas:** Usar entidades directamente en los controladores o la vista.
4. **No manejar errores correctamente:** No devolver mensajes claros o códigos de estado HTTP adecuados.
5. **Lógica de negocio en controladores:** Esto viola la separación de responsabilidades.

---

Este ejercicio no solo te ayudará a consolidar los conceptos de Spring Boot, sino también a adoptar buenas prácticas que son esenciales para cualquier proyecto real. Si aplicas estas ideas correctamente, estarás en camino de escribir código limpio, escalable y fácil de mantener.