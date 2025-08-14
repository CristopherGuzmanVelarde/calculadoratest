import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Variable para almacenar la instancia de Calculadora
    Calculadora calc;

    // Este método se ejecuta ANTES de cada prueba (@Test)
    @BeforeEach
    void setup() {
        System.out.println("Iniciando prueba...");
        // Creamos una nueva instancia de la calculadora antes de cada prueba
        calc = new Calculadora();
    }

    // Este método se ejecuta DESPUÉS de cada prueba (@Test)
    @AfterEach
    void cleanup() {
        System.out.println("Prueba finalizada!\n");
    }

    // Prueba unitaria para el método sumar
    @Test
    void testSumar() {
        System.out.println("Ejecutando testSumar...");
        int resultado = calc.sumar(3, 4);
        System.out.println("Resultado esperado: 7, Resultado obtenido: " + resultado);
        assertEquals(7, resultado, "La suma debe ser 7");
    }

    // Prueba unitaria para el método dividir
    @Test
    void testDividir() {
        System.out.println("Ejecutando testDividir...");
        int resultado = calc.dividir(12, 4);
        System.out.println("Resultado esperado: 3, Resultado obtenido: " + resultado);
        assertEquals(3, resultado, "La división debe ser 3");
    }
    
    // Pruebas para el método restar
    @Test
    void testRestarPositivos() {
        System.out.println("Ejecutando testRestarPositivos...");
        int resultado = calc.restar(10, 3);
        System.out.println("Resultado esperado: 7, Resultado obtenido: " + resultado);
        assertEquals(7, resultado, "La resta de 10 - 3 debe ser 7");
    }
    
    @Test
    void testRestarNegativos() {
        System.out.println("Ejecutando testRestarNegativos...");
        int resultado = calc.restar(-5, -8);
        System.out.println("Resultado esperado: 3, Resultado obtenido: " + resultado);
        assertEquals(3, resultado, "La resta de -5 - (-8) debe ser 3");
    }
    
    @Test
    void testRestarResultadoNegativo() {
        System.out.println("Ejecutando testRestarResultadoNegativo...");
        int resultado = calc.restar(5, 10);
        System.out.println("Resultado esperado: -5, Resultado obtenido: " + resultado);
        assertEquals(-5, resultado, "La resta de 5 - 10 debe ser -5");
    }
    
    // Pruebas para el método multiplicar
    @Test
    void testMultiplicarPositivos() {
        System.out.println("Ejecutando testMultiplicarPositivos...");
        int resultado = calc.multiplicar(4, 5);
        System.out.println("Resultado esperado: 20, Resultado obtenido: " + resultado);
        assertEquals(20, resultado, "La multiplicación de 4 * 5 debe ser 20");
    }
    
    @Test
    void testMultiplicarPorCero() {
        System.out.println("Ejecutando testMultiplicarPorCero...");
        int resultado = calc.multiplicar(7, 0);
        System.out.println("Resultado esperado: 0, Resultado obtenido: " + resultado);
        assertEquals(0, resultado, "La multiplicación por cero debe ser 0");
    }
    
    @Test
    void testMultiplicarNegativos() {
        System.out.println("Ejecutando testMultiplicarNegativos...");
        int resultado = calc.multiplicar(-3, -4);
        System.out.println("Resultado esperado: 12, Resultado obtenido: " + resultado);
        assertEquals(12, resultado, "La multiplicación de -3 * -4 debe ser 12");
    }
    
    @Test
    void testMultiplicarPositivoYNegativo() {
        System.out.println("Ejecutando testMultiplicarPositivoYNegativo...");
        int resultado = calc.multiplicar(6, -2);
        System.out.println("Resultado esperado: -12, Resultado obtenido: " + resultado);
        assertEquals(-12, resultado, "La multiplicación de 6 * -2 debe ser -12");
    }
    
    // Pruebas para el método porcentaje
    @Test
    void testPorcentajeNormal() {
        System.out.println("Ejecutando testPorcentajeNormal...");
        double resultado = calc.porcentaje(25, 100);
        System.out.println("Resultado esperado: 25.0, Resultado obtenido: " + resultado);
        assertEquals(25.0, resultado, 0.001, "El porcentaje de 25 de 100 debe ser 25%");
    }
    
    @Test
    void testPorcentajeFraccionario() {
        System.out.println("Ejecutando testPorcentajeFraccionario...");
        double resultado = calc.porcentaje(1, 3);
        System.out.println("Resultado esperado: 33.333..., Resultado obtenido: " + resultado);
        assertEquals(33.333333333333336, resultado, 0.001, "El porcentaje de 1 de 3 debe ser aproximadamente 33.33%");
    }
    
    @Test
    void testPorcentajeTotalCero() {
        System.out.println("Ejecutando testPorcentajeTotalCero...");
        System.out.println("Esperando ArithmeticException al dividir por cero");
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calc.porcentaje(10, 0);
        });
        System.out.println("Excepción capturada correctamente: " + exception.getMessage());
        assertEquals("No se puede calcular porcentaje con total igual a cero", exception.getMessage());
    }
    
    // Extra Challenge: Pruebas para el método raizCuadrada
    @Test
    void testRaizCuadradaPositiva() {
        System.out.println("Ejecutando testRaizCuadradaPositiva...");
        double resultado = calc.raizCuadrada(16.0);
        System.out.println("Resultado esperado: 4.0, Resultado obtenido: " + resultado);
        assertEquals(4.0, resultado, 0.001, "La raíz cuadrada de 16 debe ser 4");
    }
    
    @Test
    void testRaizCuadradaCero() {
        System.out.println("Ejecutando testRaizCuadradaCero...");
        double resultado = calc.raizCuadrada(0.0);
        System.out.println("Resultado esperado: 0.0, Resultado obtenido: " + resultado);
        assertEquals(0.0, resultado, 0.001, "La raíz cuadrada de 0 debe ser 0");
    }
    
    @Test
    void testRaizCuadradaDecimal() {
        System.out.println("Ejecutando testRaizCuadradaDecimal...");
        double resultado = calc.raizCuadrada(2.25);
        System.out.println("Resultado esperado: 1.5, Resultado obtenido: " + resultado);
        assertEquals(1.5, resultado, 0.001, "La raíz cuadrada de 2.25 debe ser 1.5");
    }
    
    @Test
    void testRaizCuadradaNegativa() {
        System.out.println("Ejecutando testRaizCuadradaNegativa...");
        System.out.println("Esperando IllegalArgumentException para número negativo");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.raizCuadrada(-4.0);
        });
        System.out.println("Excepción capturada correctamente: " + exception.getMessage());
        assertEquals("No se puede calcular la raíz cuadrada de un número negativo", exception.getMessage());
    }
}
