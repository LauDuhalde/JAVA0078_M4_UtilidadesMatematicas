# JAVA0078_M4_UtilidadesMatematicas

Proyecto en **Java** que implementa y prueba un conjunto de utilidades matemáticas básicas, utilizando **JUnit 5** para la validación mediante pruebas unitarias.

---

## 📂 Estructura del proyecto

```
JAVA0078_M4_UtilidadesMatematicas/
│── src/
│   └── clases/
│       └── UtilidadesMatematicas.java
│       └── UtilidadesMatematicasTest.java
│       └── SuiteDePruebas.java
│── README.md

```

---

## Clases principales

### `UtilidadesMatematicas`
Contiene métodos estáticos que implementan operaciones matemáticas básicas:

- `boolean esPar(int numero)` → Determina si un número es par.  
- `long obtenerFactorial(int numero)` → Calcula el factorial de un número (lanza excepción si es negativo).  
- `boolean esPrimo(int numero)` → Verifica si un número es primo.  
- `int obtenerMCD(int a, int b)` → Calcula el Máximo Común Divisor (MCD) de dos números mediante el algoritmo de Euclides (lanza excepción si son negativos).  

---

### `UtilidadesMatematicasTest`
Contiene pruebas unitarias con **JUnit 5** para validar el correcto funcionamiento de cada método de `UtilidadesMatematicas`.  

Se prueban:
- Casos positivos y negativos para `esPar`.  
- Factorial de 0, 1, números positivos y casos de entrada inválida.  
- Detección de números primos y no primos.  
- MCD de diferentes combinaciones, incluyendo casos inválidos.  

---

### `SuiteDePruebas`
Clase que agrupa y ejecuta todas las pruebas del proyecto.  
Permite correr todos los tests de manera centralizada.  

---

## Requisitos

- **Java 8** o superior  
- **JUnit 5** (Jupiter)  
- Un IDE compatible (Eclipse, IntelliJ, VS Code) o ejecución con Maven/Gradle  

---

## Ejecución de pruebas

1. Clonar el repositorio o descargar el proyecto.  
2. Abrir en tu IDE preferido.  
3. Ejecutar de cualquiera de las siguientes formas:
   - Desde la clase `UtilidadesMatematicasTest` para correr pruebas individuales.  
   - Desde `SuiteDePruebas` para ejecutar todas las pruebas del proyecto.

---
## Generar Javadoc

```bash
javadoc -d javadoc src/clases/*.java
```

---

## Autor
- Laura Duhalde
