package clases;

/**
 * La clase {@code UtilidadesMatematicas} proporciona métodos estáticos 
 * para realizar operaciones matemáticas comunes como verificar si un número 
 * es par, calcular factoriales, verificar si un número es primo y calcular 
 * el Máximo Común Divisor (MCD).
 *
 * <p>Todos los métodos son estáticos, por lo que no es necesario 
 * crear instancias de esta clase.</p>
 */
public class UtilidadesMatematicas {

    /**
     * Determina si un número es par.
     *
     * @param numero el número a evaluar
     * @return {@code true} si el número es par, {@code false} en caso contrario
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Calcula el factorial de un número.
     *
     * @param numero el número del que se desea calcular el factorial
     * @return el factorial del número como {@code long}
     * @throws IllegalArgumentException si el número es negativo
     */
    public static long obtenerFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No existe factorial de números negativos");
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Verifica si un número es primo.
     *
     * @param numero el número a evaluar
     * @return {@code true} si el número es primo, {@code false} en caso contrario
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // 0, 1 y negativos no son primos
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; // si tiene divisor, no es primo
            }
        }
        return true;
    }

    /**
     * Calcula el Máximo Común Divisor (MCD) de dos números usando 
     * el algoritmo de Euclides.
     *
     * @param a primer número
     * @param b segundo número
     * @return el MCD de {@code a} y {@code b}
     * @throws IllegalArgumentException si alguno de los números es negativo
     */
    public static int obtenerMCD(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("No se permiten números negativos");
        }

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
}
