# 🎯 Tomás Coronel – Portfolio Backend Java

¡Hola! Soy **Tomás Coronel**, un apasionado desarrollador backend con Java que busca dejar huella en el mundo de la tecnología. A lo largo de mi camino he aprendido a enfrentar mis miedos, salir de mi zona de confort y construir proyectos reales que reflejen mi crecimiento. Me encanta resolver desafíos complejos, colaborar en equipo y nunca dejo de formarme: mi meta es convertirme en un referente en desarrollo de microservicios y arquitecturas escalables, ayudando a empresas a crear soluciones eficientes y seguras.

---

## 🔥 ¿Por qué este repositorio?

Este es mi **Portfolio Backend**: un espacio donde recojo **todo mi progreso**, desde los primeros ejercicios de lógica en Java hasta aplicaciones completas con Spring Boot, bases de datos y seguridad. Aquí verás no solo _qué_ aprendí, sino _por qué_ cada paso me hizo mejor profesional y cómo puedes aprovecharlo como referencia o colaborador.

---

## 🗂️ Estructura del Portfolio
```
portfolio-backend/
├── Parte1_Fundamentos_Java/
│ ├── Fase1_Fundamentos/ (Sintaxis, variables, condicionales, bucles, arrays, strings, métodos, fechas, archivos y streams)
│ ├── Fase2_POO/ (Clases, objetos, encapsulamiento, herencia, polimorfismo, interfaces, genéricos, SOLID)
│ └── Fase3_ProyectoConsola/ (Aplicaciones de consola completas: Catálogo de Películas, Registro de Alumnos, etc.)
│
├── Parte2_SpringBoot/
│ ├── Fase4_SpringBootIntro/ (Primeros pasos en APIs REST con Spring Boot: configuración, IoC, logs)
│ ├── Fase5_APIs_REST/ (Controladores REST, manejo de errores, CORS, versionado de APIs)
│ ├── Fase6_JPA_BasesDatos/ (Persistencia con Hibernate/JPA, relaciones y transacciones)
│ ├── Fase7_SpringSecurity_JWT/ (Autenticación y autorización con Spring Security y JWT)
│ └── Fase8_Microservicios/ (Introducción a microservicios con Spring Cloud, Eureka, configuración centralizada)
│
├── Parte3_DevOps_y_Extensiones/
│ ├── Docker/ (Contenerización de aplicaciones)
│ ├── CI-CD/ (Pipelines con GitHub Actions)
│ └── Observabilidad/ (Logs, métricas, tracing y monitoreo)
│
└── README.md (Este archivo)
```
---

## 🚀 Lo que aporto

- **Constancia y mejora continua**: cada fase está documentada con ejercicios, retos extra y reflexiones personales.
- **Proyectos reales**: aplicaciones de consola, REST APIs, microservicios y despliegue con Docker.
- **Buenas prácticas**: principios SOLID, arquitectura en capas, DTOs, validaciones, manejo de errores y TDD.
- **Comunicación y colaboración**: código limpio, README detallados y tutoriales paso a paso para facilitar el entendimiento.

---

## 🛠️ Tecnologías & Herramientas

- **Lenguajes y Frameworks**: Java 17+, Spring Boot 3.x, Spring Cloud, Hibernate/JPA  
- **Bases de datos**: MySQL, H2 (pruebas)  
- **Seguridad**: Spring Security, JWT, OAuth2, CSRF  
- **DevOps y Contenerización**: Docker, GitHub Actions, Git (rama `main`)  
- **Documentación & Testing**: Swagger/OpenAPI, JUnit, Mockito, Postman, Testcontainers  
- **Control de versiones**: Git & GitHub (este repo), GitFlow básico

---

## ✨ Objetivo Final

Convertirme en un desarrollador Backend Java capaz de construir aplicaciones robustas y escalables siguiendo buenas prácticas, aplicando principios de diseño moderno y aprovechando tecnologías de punta. En cada parte de este repositorio se encuentran los ejercicios/practicas que hice para lograr el objetivo.


---

## 🗺️ Mapa de Aprendizaje (Orden Cronológico)

---

### 1️⃣ Fundamentos de Java

- [ ] Sintaxis básica (main, variables, tipos de datos, operadores)
- [x] Entrada/salida de datos con `Scanner`
- [x] Condicionales (`if`, `else`, `switch`)
- [x] Bucles (`for`, `while`, `do while`)
- [x] Métodos (definición, parámetros, retorno)
- [x] Arrays y manipulación básica
- [x] Strings y sus métodos (`equals`, `contains`, etc.)
- [ ] Manejo de errores con `try/catch` (checked vs. unchecked)
- [ ] Manejo de fechas y tiempos (`LocalDate`, `LocalDateTime`, `DateTimeFormatter`)
- [ ] Manejo de archivos (`File`, `FileReader`, `BufferedReader`, etc.)
- [ ] Introducción a Streams y Lambdas (`filter`, `map`, `collect`)

---

### 2️⃣ Programación Orientada a Objetos (POO) y Colecciones

- [x] Clases y objetos
- [x] Atributos y métodos
- [x] Encapsulamiento (`private`, getters/setters)
- [x] Constructores
- [x] Herencia
- [x] Polimorfismo (superclases e interfaces)
- [x] Sobrecarga y sobreescritura de métodos
- [x] Clases abstractas
- [x] Interfaces
- [x] Genéricos (`<T>`)
- [x] Colecciones (`ArrayList`, `HashMap`, `HashSet`, `LinkedList`, `TreeMap`, `LinkedHashSet`)
- [x] Métodos `static`, `final` y constantes
- [ ] Expresiones Lambda y uso de Streams en colecciones
- [ ] Principios SOLID (Single Responsibility, Open/Closed, etc.)

---

### 3️⃣ Proyecto Consola + Pruebas Básicas

- [x] Planificación de estructura y clases
- [ ] Relaciones entre objetos (has-a / is-a)
- [x] Aplicación con menú interactivo por consola
- [x] Validaciones de entrada
- [x] Lógica de negocio
- [x] Modularización del código
- [ ] Pruebas unitarias simples con JUnit

---

### 4️⃣ Introducción a Spring Boot

- [x] ¿Qué es Spring Boot? + diferencia con Spring
- [x] Estructura de un proyecto con Maven/Gradle (gestión de dependencias)
- [x] Configuración de propiedades (`application.properties` / `application.yml`)
- [x] Perfiles de entorno (`@Profile`, archivos de configuración)
- [x] ¿Qué es un Bean? Ciclo de vida, scopes, creación y destrucción
- [ ] Servicios (`@Service`) + Inyección de dependencias (`@Autowired`, por constructor)
- [ ] Inversión de Control (IoC) y Dependency Injection (DI)
- [ ] Logs básicos (`SLF4J`, `Logback`)

---

### 5️⃣ Construcción de APIs RESTful con Spring Boot

- [ ] Estructura en capas (Controller, Service, Repository)
- [ ] DTOs (Data Transfer Objects)
- [ ] Controladores REST (`@RestController`, `@GetMapping`, etc.)
- [ ] Métodos HTTP (GET, POST, PUT, DELETE) y códigos de estado comunes
- [ ] Pruebas con Postman/Insomnia
- [ ] Manejo de errores (`@ExceptionHandler`, `ResponseEntity`)
- [ ] Buenas prácticas en diseño de APIs RESTful
- [ ] CORS: qué es y cómo configurarlo
- [ ] Versionado de APIs

---

### 6️⃣ Persistencia de Datos con Spring Boot y JPA/Hibernate

- [ ] Conexión a bases de datos: MySQL, PostgreSQL, H2
- [ ] Práctica de SQL puro (SELECT, JOINs, filtros)
- [ ] Entidades (`@Entity`, `@Id`, etc.)
- [ ] Anotaciones de mapeo de JPA
- [ ] CRUD con `JpaRepository` / `CrudRepository`
- [ ] Relaciones entre entidades (`@OneToMany`, `@ManyToOne`, etc.)
- [ ] Estrategias de carga (eager vs. lazy)
- [ ] Consultas personalizadas (`@Query`, JPQL)
- [ ] Specifications en Spring Data JPA
- [ ] Transacciones (`@Transactional`)
- [ ] Migraciones de base de datos (Flyway, Liquibase)

---

### 7️⃣ Seguridad en Spring Boot

- [ ] Registro e inicio de sesión
- [ ] Encriptación con BCrypt
- [ ] Autenticación y autorización
- [ ] Generación y validación de JWT
- [ ] Filtros personalizados (`OncePerRequestFilter`)
- [ ] Roles y control de accesos (`hasRole`, `hasAuthority`)
- [ ] Diferencia entre autenticación y autorización
- [ ] Gestión de permisos (Spring Security ACL)
- [ ] OAuth2 y OpenID Connect (intro y recursos)
- [ ] Prevención de CSRF/XSS

---

### 8️⃣ Buenas Prácticas, Documentación y Proyecto Real

- [ ] Separación estricta en capas
- [ ] Uso correcto de DTOs
- [ ] Documentación con Swagger/OpenAPI
- [ ] Manejo global de errores
- [ ] Logs avanzados y monitoreo (Spring Actuator, logs externos)
- [ ] Control de versiones con Git/GitHub (incluyendo Gitflow)
- [ ] Testing integración (Testcontainers, H2)
- [ ] Despliegue (`java -jar`, configuración en server)
- [ ] Proyecto final backend 100% funcional en GitHub
- [ ] README completo, instrucciones de instalación, endpoints documentados

---

### 9️⃣ Nivel Avanzado / Especialización

- [ ] Testing avanzado (JUnit, Mockito, pruebas de integración, end-to-end)
- [ ] Consumo de APIs externas (`RestTemplate`, `WebClient`)
- [ ] Docker: Dockerfile, imágenes, contenedores, Docker Compose
- [ ] Microservicios con Spring Cloud
- [ ] MongoDB y bases de datos NoSQL
- [ ] CI/CD con GitHub Actions/Jenkins
- [ ] Arquitectura hexagonal (opcional)
- [ ] Mensajería asíncrona (RabbitMQ, Kafka)
- [ ] Observabilidad y monitoreo (Prometheus, Grafana)
- [ ] Performance y profiling de la JVM

---
## 🎯 ¿Qué sigue?

- Integrar un front-end React/Angular para mis APIs  
- Profundizar en Kubernetes y Service Mesh  
- Contribuir a proyectos de código abierto  
- Seguir mentorando a nuevos desarrolladores

---

📫 **Contacto**  
- 📧 tomascoronel86@gmail.com  
- 🔗 [LinkedIn](https://www.linkedin.com/in/tomascoronell/)  
- 🐙 [GitHub](https://github.com/tomiicoronel)

> “La perfección es un camino, no un destino. ¡Vamos por más!” 🚀
