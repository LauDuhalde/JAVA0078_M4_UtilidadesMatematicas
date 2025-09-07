package clases;

public class UtilidadesMatematicas {
	public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
	
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
