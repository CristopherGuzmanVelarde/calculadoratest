# 🧮 Calculadora con Pruebas Unitarias

Este proyecto implementa una calculadora básica en Java con pruebas unitarias usando JUnit 5.

## 📋 Funcionalidades Implementadas

### Operaciones Básicas
- ✅ **Sumar**: Suma dos números enteros
- ✅ **Restar**: Resta dos números enteros
- ✅ **Multiplicar**: Multiplica dos números enteros
- ✅ **Dividir**: Divide dos números enteros (con validación de división por cero)
- ✅ **Porcentaje**: Calcula el porcentaje de una parte respecto al total
- ✅ **Raíz Cuadrada**: Calcula la raíz cuadrada de un número (Extra Challenge)

### Manejo de Excepciones
- `ArithmeticException` para división por cero y porcentaje con total = 0
- `IllegalArgumentException` para raíz cuadrada de números negativos

## 🧪 Pruebas Unitarias

Se implementaron pruebas completas para todos los métodos:

### Resta
- Prueba con números positivos
- Prueba con números negativos
- Prueba con resultado negativo

### Multiplicación
- Prueba con números positivos
- Prueba multiplicación por cero
- Prueba con números negativos
- Prueba con un número positivo y uno negativo

### Porcentaje
- Prueba casos normales
- Prueba con números fraccionarios
- Prueba excepción cuando total = 0

### Raíz Cuadrada (Extra Challenge)
- Prueba con números positivos
- Prueba con cero
- Prueba con números decimales
- Prueba excepción con números negativos

## 🚀 Cómo ejecutar

### Prerrequisitos
- Java 11 o superior
- Maven 3.6 o superior

### Compilar el proyecto
```bash
mvn compile
```

### Ejecutar las pruebas
```bash
mvn test
```

### Compilar y ejecutar todas las pruebas
```bash
mvn clean test
```

## 📁 Estructura del Proyecto

```
calculadora/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Calculadora.java
│   └── test/
│       └── java/
│           └── CalculadoraTest.java
```

## 🏆 Cumplimiento del Reto

✅ **Implementación de métodos nuevos**:
- `restar(int a, int b)`
- `multiplicar(int a, int b)`
- `porcentaje(int parte, int total)` con validación

✅ **Pruebas unitarias completas**:
- Mínimo 2 pruebas por método
- Casos normales y casos límite
- Manejo de excepciones con `assertThrows`
- Impresión en consola de resultados esperados vs obtenidos

✅ **Extra Challenge**:
- Método `raizCuadrada(double x)` con validación
- Pruebas unitarias correspondientes

✅ **Buenas prácticas**:
- Uso de `@BeforeEach` y `@AfterEach`
- Mensajes descriptivos en las pruebas
- Documentación JavaDoc en los métodos
- Estructura Maven estándar
