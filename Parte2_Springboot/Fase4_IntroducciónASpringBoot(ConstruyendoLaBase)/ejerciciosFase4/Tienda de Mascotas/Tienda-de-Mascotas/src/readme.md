# 🏆 Ejercicio 1: Gestión de Clientes en una Tienda de Mascotas

## **Contexto**

PetPlanet, una tienda de mascotas, quiere registrar a sus clientes para enviarles promociones personalizadas y mantener
un registro de contacto. Necesitan una solución básica para registrar clientes y obtener una lista de todos ellos.

---

## 🎯 **Objetivos del Ejercicio**

- Crear una aplicación básica en Spring Boot que implemente servicios (`@Service`) y controladores REST (
  `@RestController`).
- Aprender el uso de DTOs (Data Transfer Objects) para transferir datos entre las capas del sistema.
- Practicar la validación de datos de entrada utilizando `@Valid` y las anotaciones de validación estándar.
- Almacenar temporalmente los datos en memoria usando una colección (`List`).

---

## 📋 **Tareas**

1. Crear un proyecto Spring Boot con las dependencias necesarias:

- `Spring Web`: Para crear APIs REST.
- `Lombok`: Para reducir el código repetitivo.

2. Configurar el archivo `application.properties` para ajustar la configuración básica.
3. Crear las siguientes capas y componentes:

- **DTO**: Representar los datos del cliente con atributos como nombre, email y teléfono.
- **Servicio**: Implementar la lógica para registrar y listar clientes.
- **Controlador REST**: Exponer los endpoints necesarios para interactuar con la funcionalidad.

4. Implementar validaciones básicas para los datos del cliente.
5. Probar los endpoints de la API con herramientas como Postman o Insomnia.

---

## 💡 **Tips**

- Usa `@Service` para organizar la lógica de negocio y evitar duplicación de código.
- Recuerda que `@RestController` se utiliza para manejar solicitudes HTTP y devolver respuestas en formato JSON.
- Utiliza la anotación `@Valid` en los controladores para asegurarte de que los datos de entrada cumplan con las
  validaciones definidas.
- Usa una `List` en memoria para almacenar los datos de los clientes en esta etapa inicial.

---

## 📤 **Salidas esperadas**

1. **POST `/clientes`**

- Permite registrar un cliente enviando un JSON con los datos del cliente.
- Devuelve un mensaje de éxito con los datos registrados.
- Si los datos no cumplen con las validaciones, devuelve un error con un mensaje descriptivo.

2. **GET `/clientes`**

- Devuelve una lista JSON de todos los clientes registrados.

---

## 🎯 **Reto adicional**

- Implementar validaciones con las siguientes reglas:
    - El `email` no debe ser nulo ni inválido (usa la anotación `@Email`).
    - El `nombre` no debe ser vacío (usa la anotación `@NotBlank`).
- Manejar excepciones para devolver mensajes de error claros cuando las validaciones fallen.

---

# 📘 Documentación para Resolver el Ejercicio

Esta sección explica los conceptos clave que necesitas para resolver el ejercicio, con un enfoque en *por qué* se hace
así, *cuál es el objetivo* y *cómo mejora tu forma de resolver problemas*.

---

## **1. ¿Qué es un DTO (Data Transfer Object)?**

### **¿Qué es?**

Un DTO es un objeto utilizado para transferir datos entre las capas de una aplicación, como entre un controlador y un
servicio. Es una representación simplificada de los datos que queremos transportar.

### **¿Por qué se usa?**

- **Desacoplamiento:** Permite mantener las entidades del modelo separadas de los datos expuestos a los clientes.
- **Seguridad:** Evita exponer atributos sensibles o innecesarios de las entidades.
- **Flexibilidad:** Facilita personalizar los datos enviados o recibidos según el contexto.

### **¿Cuándo usarlo?**

Siempre que necesites transmitir datos entre capas en una aplicación con varias responsabilidades. En aplicaciones REST,
es especialmente útil para estructurar las solicitudes y respuestas.

### **Aplicación en este ejercicio**

En el ejercicio de la tienda de mascotas, el `ClienteDTO` representa los datos del cliente (nombre, email, teléfono) que
se reciben en las solicitudes HTTP y que se devuelven en las respuestas. Esto asegura que solo se manipulen los datos
relevantes, manteniendo las capas desacopladas.

---

## **2. Servicios y la Anotación `@Service`**

### **¿Qué es?**

Un servicio (`@Service`) es una clase que contiene la lógica de negocio de la aplicación. Es la capa intermedia entre
los controladores y los repositorios (si existieran).

### **¿Por qué se usa?**

- **Organización:** Centraliza la lógica de negocio en un lugar específico.
- **Reutilización:** Un servicio puede ser usado por múltiples controladores u otras partes de la aplicación.
- **Testabilidad:** Facilita la creación de pruebas unitarias al separar la lógica de negocio.
- **Desacoplamiento:** Los controladores solo manejan solicitudes HTTP, mientras que la lógica de negocio permanece en
  el servicio.

### **¿Cuándo usarlo?**

Siempre que tengas lógica de negocio que deba ser compartida entre controladores o que requiera un procesamiento
específico antes de interactuar con la base de datos o los datos en memoria.

### **Aplicación en este ejercicio**

En este ejercicio, la clase `ClienteService` es responsable de:

- Registrar clientes en una lista en memoria.
- Devolver la lista de clientes registrados.
  Esto asegura que el controlador no implemente lógica de negocio directamente y se mantenga enfocado en manejar las
  solicitudes.

---

## **3. Controladores REST y la Anotación `@RestController`**

### **¿Qué es?**

Un controlador REST es una clase que se encarga de procesar solicitudes HTTP y devolver respuestas HTTP. Representa la "
puerta de entrada" de la aplicación.

### **¿Por qué se usa?**

- **Interfaz clara:** Define los puntos de acceso (endpoints) para los clientes externos.
- **Desacoplamiento:** Separa la lógica de negocio (servicios) de la lógica de presentación.
- **Simplicidad:** Spring Boot maneja automáticamente la conversión de objetos Java a JSON y viceversa.

### **¿Cuándo usarlo?**

Siempre que necesites exponer datos o funcionalidades de tu aplicación a través de una API REST.

### **Aplicación en este ejercicio**

El `ClienteController` define los endpoints necesarios para:

- Registrar clientes (`POST /clientes`).
- Listar clientes (`GET /clientes`).
  El controlador recibe las solicitudes, delega el procesamiento al servicio y devuelve los resultados.

---

## **4. Validaciones y la Anotación `@Valid`**

### **¿Qué es?**

La anotación `@Valid` se utiliza para activar las validaciones definidas en los atributos de un DTO. Estas validaciones
se configuran usando anotaciones de la biblioteca **javax.validation** (como `@NotNull`, `@Email`, etc.).

### **¿Por qué se usa?**

- **Garantizar la calidad de los datos:** Impide que datos inválidos ingresen al sistema.
- **Seguridad:** Evita errores y comportamientos inesperados al validar los datos antes de procesarlos.
- **Estandarización:** Simplifica la validación de datos mediante un enfoque declarativo.

### **¿Cuándo usarlo?**

Siempre que recibas datos desde un cliente externo (como solicitudes HTTP) y necesites asegurarte de que cumplen con
ciertos criterios.

### **Aplicación en este ejercicio**

Validamos que:

- El `email` no sea nulo ni inválido.
- El `nombre` no sea vacío.
  Estas validaciones aseguran que los datos de los clientes sean consistentes antes de almacenarlos.

---

## **5. Colecciones en Memoria: Persistencia Temporal**

### **¿Qué es?**

En lugar de usar una base de datos desde el principio, podés almacenar datos temporalmente en una colección en memoria,
como una lista (`List`). Esto simplifica el desarrollo inicial y permite enfocarse en la lógica de negocio.

### **¿Por qué se usa?**

- **Prototipado rápido:** Ideal para ejercicios o proyectos pequeños.
- **Simplicidad:** Reduce la complejidad inicial al evitar la configuración de una base de datos.

### **¿Cuándo usarlo?**

Cuando el objetivo principal es aprender o probar conceptos básicos sin necesidad de persistencia permanente.

### **Aplicación en este ejercicio**

Guardamos los clientes en una lista en memoria dentro del servicio. Esto es suficiente para manejar la funcionalidad
básica de registrar y listar clientes.

---

## **6. Buenas Prácticas y Errores Comunes**

### **Buenas Prácticas**

1. **Separa responsabilidades:** Asegurate de que los controladores no contengan lógica de negocio. Delegá esa
   responsabilidad a los servicios.
2. **Valida siempre los datos de entrada:** Nunca confíes en que los datos enviados por clientes externos sean válidos.
3. **Usá DTOs:** Evitá exponer tus modelos internos directamente a través de la API.
4. **Mantené tu código limpio:** Nombrá métodos y clases de forma descriptiva y consistente (por ejemplo,
   `guardarCliente` en lugar de `guardar`).

### **Errores Comunes**

1. **Lógica de negocio en el controlador:** Esto hace que el código sea más difícil de probar y mantener.
2. **No validar los datos:** Permitir datos inválidos puede causar errores en la lógica de negocio.
3. **No usar DTOs:** Exponer modelos internos puede ser un problema de seguridad y dificulta cambios futuros.
4. **No manejar excepciones:** Si algo falla (por ejemplo, datos inválidos), la aplicación debe responder con mensajes
   de error claros.

---

## **¿Cómo mejora tu forma de resolver problemas?**

1. **Estructura:** Separar responsabilidades entre controladores, servicios y DTOs hace que tu aplicación sea más
   modular, fácil de mantener y escalable.
2. **Reutilización:** Los servicios pueden ser utilizados por múltiples controladores u otras partes de la aplicación.
3. **Calidad:** Validar datos y usar DTOs mejora la seguridad y confiabilidad de tus APIs.
4. **Escalabilidad:** Seguir estas prácticas te prepara para proyectos más complejos, donde la organización del código
   es crucial.

---

Con esta documentación y guía, estás listo para implementar una solución profesional al ejercicio. ¡Manos a la obra! 🚀