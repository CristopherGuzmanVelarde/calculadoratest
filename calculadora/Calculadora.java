public class Calculadora {
    
    /**
     * Suma dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return la suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Divide dos números enteros
     * @param a dividendo
     * @param b divisor
     * @return el resultado de la división
     * @throws ArithmeticException si b es 0
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
    
    /**
     * Resta dos números enteros
     * @param a minuendo
     * @param b sustraendo
     * @return la resta de a y b
     */
    public int restar(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números enteros
     * @param a primer factor
     * @param b segundo factor
     * @return el producto de a y b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Calcula el porcentaje de una parte respecto al total
     * @param parte la parte del total
     * @param total el total
     * @return el porcentaje (parte * 100) / total
     * @throws ArithmeticException si total es 0
     */
    public double porcentaje(int parte, int total) {
        if (total == 0) {
            throw new ArithmeticException("No se puede calcular porcentaje con total igual a cero");
        }
        return (parte * 100.0) / total;
    }
    
    /**
     * Calcula la raíz cuadrada de un número
     * @param x el número del cual calcular la raíz cuadrada
     * @return la raíz cuadrada de x
     * @throws IllegalArgumentException si x es negativo
     */
    public double raizCuadrada(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(x);
    }
}
