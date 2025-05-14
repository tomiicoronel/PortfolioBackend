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







HashSet: Una herramienta poderosa para evitar duplicados
Un HashSet es una implementación de la interfaz Set en Java, que se utiliza para almacenar una colección de elementos únicos. Es parte del paquete java.util y está diseñado para situaciones en las que necesitas garantizar que no haya duplicados en tu conjunto de datos. A continuación, te explico en detalle cómo funciona, por qué es útil, y cómo aplicarlo correctamente en el contexto del ejercicio que estás resolviendo.  <hr></hr>
¿Qué es un HashSet y cómo funciona?
Un HashSet utiliza una estructura de datos llamada tabla hash para almacenar elementos. Cada elemento que agregas al HashSet se convierte en una clave hash mediante el método hashCode() del objeto. Este valor hash determina la posición del elemento en la tabla hash. Si dos elementos tienen el mismo valor hash (lo que se llama una "colisión"), el HashSet utiliza un mecanismo interno para resolverlo, como listas enlazadas o árboles balanceados.  
Características principales de un HashSet:
No permite duplicados: Si intentas agregar un elemento que ya existe (según la comparación de equals() y hashCode()), el HashSet simplemente lo ignora.
Orden no garantizado: Los elementos no se almacenan en un orden específico. Si necesitas orden, deberías usar un LinkedHashSet o un TreeSet.
Operaciones rápidas: Las operaciones como agregar, eliminar y buscar tienen una complejidad promedio de O(1), lo que lo hace muy eficiente para grandes volúmenes de datos.
<hr></hr>
¿Por qué usar un HashSet en este ejercicio?
En el ejercicio, necesitas almacenar los datos de los alumnos sin permitir duplicados. Esto es crucial porque:  
Evitar duplicados manualmente es propenso a errores: Si usas una lista (ArrayList), tendrías que recorrerla cada vez que agregas un nuevo alumno para verificar si ya existe. Esto no solo es ineficiente, sino que también aumenta la complejidad del código.
El HashSet automatiza esta validación: Al sobrescribir los métodos equals() y hashCode() en la clase Alumno, puedes definir qué significa que dos alumnos sean "iguales" (por ejemplo, que tengan el mismo nombre, edad y curso). El HashSet se encargará de evitar duplicados basándose en esta lógica.
<hr></hr>
Buenas prácticas al usar un HashSet
Sobrescribe equals() y hashCode() correctamente:  
Estos métodos son fundamentales para que el HashSet funcione correctamente. Si no los sobrescribes, el HashSet usará la implementación predeterminada de la clase Object, que compara referencias de memoria en lugar de los valores de los atributos.
Asegúrate de que equals() y hashCode() sean consistentes: si dos objetos son iguales según equals(), deben tener el mismo valor de hashCode().
Define claramente qué significa "duplicado":  
En el contexto del ejercicio, podrías decidir que dos alumnos son iguales si tienen el mismo nombre, edad y curso. Sin embargo, en otros casos, podrías considerar solo el nombre como criterio de igualdad. Esto depende de los requisitos del problema.
Evita modificar objetos dentro del HashSet:  
Si cambias los atributos de un objeto que ya está en el HashSet y esos atributos afectan el valor de hashCode(), el objeto podría "perderse" dentro del conjunto. Esto se debe a que su posición en la tabla hash ya no coincide con su nuevo valor de hash.
Usa un HashSet solo cuando no necesites orden:  
Si necesitas mantener el orden de inserción, considera usar un LinkedHashSet. Si necesitas un orden natural o personalizado, usa un TreeSet.
<hr></hr>
Errores comunes al usar un HashSet
No sobrescribir equals() y hashCode():  
Esto puede llevar a que el HashSet permita duplicados porque no sabe cómo comparar correctamente los objetos.
Sobrescribir mal hashCode():  
Si el método genera valores hash inconsistentes o poco distribuidos, el rendimiento del HashSet puede degradarse significativamente.
Usar un HashSet para datos ordenados:  
Como mencioné antes, el HashSet no garantiza ningún orden. Si necesitas orden, esta no es la estructura adecuada.
Confundir HashSet con HashMap:  
Aunque ambos usan tablas hash, un HashSet almacena solo valores únicos, mientras que un HashMap almacena pares clave-valor.
<hr></hr>
Aplicación al ejercicio
En el ejercicio, el HashSet es ideal porque:  
Evita duplicados automáticamente: Al sobrescribir equals() y hashCode() en la clase Alumno, defines qué significa que dos alumnos sean iguales. Esto asegura que no se registren dos veces los mismos datos.
Facilita la búsqueda: Si necesitas verificar si un alumno ya está registrado, puedes usar el método contains() del HashSet, que es mucho más eficiente que recorrer una lista.
Simplifica el código: No necesitas escribir lógica adicional para evitar duplicados o buscar elementos. El HashSet se encarga de todo esto.
<hr></hr>
Cómo mejora tu forma de resolver problemas
Eficiencia: Usar un HashSet te permite manejar grandes volúmenes de datos de manera rápida y eficiente, lo que es crucial en aplicaciones reales.
Legibilidad: Al delegar la lógica de evitar duplicados al HashSet, tu código es más limpio y fácil de entender.
Escalabilidad: Si en el futuro necesitas manejar más datos o agregar nuevas funcionalidades, el HashSet sigue siendo una solución robusta y eficiente.
Buenas prácticas: Aprender a sobrescribir correctamente equals() y hashCode() es una habilidad fundamental en Java, ya que se aplica a muchas otras estructuras de datos y patrones de diseño.
<hr></hr>
Conclusión
El HashSet es una herramienta poderosa y eficiente para manejar colecciones de elementos únicos. En el contexto del ejercicio, te permite resolver el problema de evitar duplicados de manera elegante y eficiente, mientras te enfocas en la lógica principal de la aplicación. Si lo usas correctamente, no solo mejorarás la calidad de tu código, sino que también desarrollarás habilidades clave para resolver problemas más complejos en el futuro.


















































### **Tutorial paso a paso para resolver el ejercicio**

#### **1. Comprender el problema**
- Lee detenidamente la descripción del ejercicio y asegúrate de entender los requisitos.
- Identifica los elementos clave: necesitas almacenar alumnos sin duplicados, usar un `HashSet`, y permitir ciertas funcionalidades como agregar, consultar y listar alumnos.
- Define claramente qué significa "duplicado" en este contexto (por ejemplo, alumnos con el mismo nombre, edad y curso).

#### **2. Diseñar la solución**
- **Clase `Alumno`:** Piensa en los atributos necesarios (`nombre`, `edad`, `curso`) y los métodos que necesitarás (`equals()`, `hashCode()`, y `mostrarInfo()`).
- **Estructura de datos:** Decide usar un `HashSet` para almacenar los alumnos, ya que evita duplicados automáticamente.
- **Flujo de la aplicación:** Define las funcionalidades principales:
  1. Permitir al usuario ingresar alumnos.
  2. Mostrar todos los alumnos registrados.
  3. Consultar si un alumno está registrado.
  4. Listar alumnos por curso (desafío adicional).

#### **3. Planificar la implementación**
- Divide el problema en pasos más pequeños y manejables:
  1. **Crear la clase `Alumno`:** Define los atributos y sobrescribe `equals()` y `hashCode()` para garantizar que el `HashSet` funcione correctamente.
  2. **Configurar el `HashSet`:** Declara un `HashSet<Alumno>` para almacenar los registros.
  3. **Entrada de datos:** Diseña un flujo para que el usuario pueda ingresar alumnos desde la consola.
  4. **Operaciones sobre el `HashSet`:** Implementa las funcionalidades de consulta y listado.
  5. **Desafío adicional:** Agrega la lógica para listar alumnos por curso.

#### **4. Pensar en las validaciones**
- Asegúrate de validar los datos ingresados por el usuario (por ejemplo, que el nombre no esté vacío o que la edad sea un número válido).
- Considera cómo manejar errores comunes, como intentar registrar un alumno duplicado o buscar un alumno que no existe.

#### **5. Implementar buenas prácticas**
- **Modularidad:** Divide el código en métodos claros y específicos para cada funcionalidad (por ejemplo, un método para agregar alumnos, otro para listar, etc.).
- **Legibilidad:** Usa nombres de variables y métodos descriptivos.
- **Reutilización:** Evita duplicar lógica. Por ejemplo, si necesitas buscar un alumno por nombre, crea un método que puedas reutilizar.

#### **6. Probar la solución**
- **Pruebas manuales:** Ingresa diferentes combinaciones de datos para asegurarte de que el programa funcione correctamente.
- **Casos límite:** Prueba situaciones como intentar agregar un alumno duplicado, buscar un alumno que no existe, o listar alumnos cuando el `HashSet` está vacío.

#### **7. Optimizar y refinar**
- Revisa el código para asegurarte de que sea eficiente y fácil de entender.
- Considera agregar comentarios para explicar partes clave del código.
- Si implementaste el desafío adicional, verifica que la lógica para listar alumnos por curso sea precisa y eficiente.

#### **8. Reflexionar sobre el aprendizaje**
- Piensa en cómo el uso de un `HashSet` simplificó la solución.
- Reflexiona sobre cómo podrías aplicar lo aprendido en otros problemas similares, como manejar datos únicos en diferentes contextos.

Este enfoque estructurado te ayudará a resolver el ejercicio de manera eficiente y a desarrollar una mentalidad lógica para abordar problemas similares en el futuro.