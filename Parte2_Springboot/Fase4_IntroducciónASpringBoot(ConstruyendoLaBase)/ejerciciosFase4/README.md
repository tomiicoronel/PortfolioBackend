# 💻 Ejercicios Prácticos - Fase 4: Introducción a Spring Boot

Este conjunto de ejercicios está diseñado para ayudarte a practicar los conceptos fundamentales de **Spring Boot**, especialmente:
- Servicios (`@Service`)
- Inyección de dependencias (`@Autowired` / inyección por constructor)
- Separación de responsabilidades (Service vs Controller)
- Validaciones básicas
- Estructura de proyecto con Spring Boot

Cada ejercicio incluye un contexto realista, requisitos claros, pasos detallados para resolverlos desde cero, y un reto adicional para quienes deseen ir más allá.

---

## 📘 **Ejercicio 1: Gestión de Clientes en una Tienda de Mascotas**

**Contexto**:  
PetPlanet es una tienda de mascotas que quiere registrar sus clientes para enviarles promociones personalizadas.

### 🧩 **Requisitos funcionales**
1. Registrar un cliente con los siguientes datos:
   - Nombre
   - Email
   - Teléfono
2. Listar todos los clientes registrados.

### 🚀 **Pasos para resolver el ejercicio**

#### 1. Crear el proyecto
- Usa **Spring Initializr** con las siguientes dependencias:
  - `Spring Web`: Para crear APIs REST.
  - `Lombok`: Para reducir código repetitivo (getters, setters).
- Configura el archivo `application.properties`:
  ```properties
  server.port=8080
  ```

#### 2. Crear las carpetas del proyecto
- Crea las siguientes subcarpetas en `src/main/java`:
  - **`model`**: Para los DTOs (Data Transfer Objects).
  - **`service`**: Para la lógica de negocio.
  - **`controller`**: Para los controladores REST.

#### 3. Crear el DTO `ClienteDTO` en la carpeta `model`
- Define los siguientes atributos:
  - `nombre` (String)
  - `email` (String)
  - `telefono` (String)
- Usa las anotaciones de Lombok:
  ```java
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class ClienteDTO {
      private String nombre;
      private String email;
      private String telefono;
  }
  ```

#### 4. Crear la clase de servicio `ClienteService` en la carpeta `service`
- Define una lista en memoria para almacenar los clientes:
  ```java
  private final List<ClienteDTO> clientes = new ArrayList<>();
  ```
- Implementa métodos:
  - `guardarCliente(ClienteDTO cliente)`: Agrega un cliente a la lista.
  - `obtenerClientes()`: Devuelve la lista de clientes.

#### 5. Crear el controlador `ClienteController` en la carpeta `controller`
- Define los endpoints:
  - `POST /clientes`: Usa `@RequestBody` para registrar un cliente.
  - `GET /clientes`: Devuelve la lista de clientes.
- Usa las anotaciones `@RestController`, `@PostMapping`, y `@GetMapping` para mapear los endpoints.

---

### 📤 **Salida esperada**
- **POST `/clientes`**: Registra un cliente y devuelve un mensaje de éxito.
- **GET `/clientes`**: Devuelve una lista JSON de todos los clientes registrados.

### 🎯 **Reto adicional**
- Usa `@Valid` para validar que:
  - El email no sea vacío ni inválido.
  - El nombre no sea nulo.

---

## 📘 **Ejercicio 2: Registro de Turnos Médicos**

**Contexto**:  
Una clínica médica necesita un sistema para registrar los turnos de sus pacientes y las especialidades asociadas.

### 🧩 **Requisitos funcionales**
1. Registrar un turno con los datos:
   - Nombre del paciente
   - Especialidad
2. Listar todos los turnos registrados.

### 🚀 **Pasos para resolver el ejercicio**

#### 1. Crear el proyecto
- Usa **Spring Initializr** con las dependencias:
  - `Spring Web`
  - `Lombok`

#### 2. Crear las carpetas del proyecto
- Igual que el ejercicio anterior: `model`, `service`, `controller`.

#### 3. Crear el DTO `TurnoDTO` en la carpeta `model`
- Define los atributos:
  - `nombrePaciente` (String)
  - `especialidad` (String)

#### 4. Crear la clase de servicio `TurnoService` en la carpeta `service`
- Implementa métodos:
  - `guardarTurno(TurnoDTO turno)`: Agrega un turno a una lista en memoria.
  - `obtenerTurnos()`: Devuelve la lista de turnos.

#### 5. Crear el controlador `TurnoController` en la carpeta `controller`
- Define los endpoints:
  - `POST /turnos`: Registra un turno.
  - `GET /turnos`: Devuelve la lista de turnos.

---

### 📤 **Salida esperada**
- **POST `/turnos`**: Registra un turno y devuelve un mensaje de éxito.
- **GET `/turnos`**: Devuelve una lista JSON con todos los turnos.

### 🎯 **Reto adicional**
- Valida que el nombre del paciente no sea vacío.

---

## 📘 **Ejercicio 3: Administrador de Tareas Personales**

**Contexto**:  
Un usuario necesita una aplicación para gestionar sus tareas diarias, con la posibilidad de marcarlas como completadas.

### 🧩 **Requisitos funcionales**
1. Registrar una tarea con título y descripción.
2. Listar todas las tareas registradas.

### 🚀 **Pasos para resolver el ejercicio**

#### 1. Crear el proyecto
- Usa las mismas dependencias que los ejercicios anteriores.

#### 2. Crear las carpetas del proyecto
- Igual que en ejercicios anteriores.

#### 3. Crear el DTO `TareaDTO` en la carpeta `model`
- Define los atributos:
  - `titulo` (String)
  - `descripcion` (String)
  - `completada` (boolean, por defecto `false`).

#### 4. Crear la clase de servicio `TareaService` en la carpeta `service`
- Implementa métodos:
  - `guardarTarea(TareaDTO tarea)`: Agrega una tarea a una lista en memoria.
  - `obtenerTareas()`: Devuelve la lista de tareas.

#### 5. Crear el controlador `TareaController` en la carpeta `controller`
- Define los endpoints:
  - `POST /tareas`: Registra una tarea.
  - `GET /tareas`: Devuelve la lista de tareas.

---

### 📤 **Salida esperada**
- **POST `/tareas`**: Registra una tarea y devuelve un mensaje de éxito.
- **GET `/tareas`**: Devuelve una lista JSON con todas las tareas registradas.

### 🎯 **Reto adicional**
- Implementa un endpoint `PUT /tareas/{id}` para actualizar el estado de una tarea a completada.

---

## 📘 **Ejercicio 4: Gestión de Productos Digitales**

**Contexto**:  
Una plataforma de e-commerce necesita registrar sus productos digitales, como ebooks, para mantener un catálogo actualizado.

### 🧩 **Requisitos funcionales**
1. Registrar un producto con nombre, precio y categoría.
2. Listar todos los productos registrados.

### 🚀 **Pasos para resolver el ejercicio**
- Sigue la misma estructura que los ejercicios anteriores.

---

## 📘 **Ejercicio 5: Control de Asistencia en Clases Online**

**Contexto**:  
Una plataforma educativa necesita registrar la asistencia de los estudiantes en sus clases virtuales.

### 🧩 **Requisitos funcionales**
1. Registrar una asistencia con nombre del alumno y fecha.
2. Listar todas las asistencias registradas.

### 🚀 **Pasos para resolver el ejercicio**
- Similar a los anteriores, pero agrega validación para que la fecha tenga formato `yyyy-MM-dd`.

---

## ✅ **Tecnologías y herramientas sugeridas**
- **Lenguaje**: Java 17+
- **Framework**: Spring Boot 3+
- **Dependencias**: Spring Web, Lombok
- **Herramientas de prueba**: Postman o Insomnia