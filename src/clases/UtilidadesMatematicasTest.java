package clases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas unitarias para la clase {@link UtilidadesMatematicas}.
 *
 * <p>Utiliza JUnit 5 para validar el correcto funcionamiento 
 * de los métodos definidos en {@code UtilidadesMatematicas}.</p>
 */
class UtilidadesMatematicasTest {

    /**
     * Verifica el correcto funcionamiento del método {@code esPar}.
     */
    @Test
    public void testEsPar() {
        assertTrue(UtilidadesMatematicas.esPar(2)); 
        assertFalse(UtilidadesMatematicas.esPar(3));
    }

    /**
     * Verifica que el cálculo del factorial lance excepción 
     * para números negativos.
     */
    @Test
    public void testFactorialNegativos() {
        assertThrows(IllegalArgumentException.class, () -> UtilidadesMatematicas.obtenerFactorial(-5));
    }

    /**
     * Verifica el cálculo del factorial en valores conocidos.
     */
    @Test
    public void testFactorial() {
        assertEquals(1, UtilidadesMatematicas.obtenerFactorial(0));
        assertEquals(1, UtilidadesMatematicas.obtenerFactorial(1));
        assertEquals(120, UtilidadesMatematicas.obtenerFactorial(5)); 
    }

    /**
     * Verifica el método {@code esPrimo} con casos positivos y negativos.
     */
    @Test
    public void testEsPrimo() {
        assertTrue(UtilidadesMatematicas.esPrimo(7));
        assertFalse(UtilidadesMatematicas.esPrimo(10));
        assertFalse(UtilidadesMatematicas.esPrimo(0));
        assertFalse(UtilidadesMatematicas.esPrimo(1));
        assertFalse(UtilidadesMatematicas.esPrimo(-5));
    }

    /**
     * Verifica que el método {@code obtenerMCD} lance excepción 
     * cuando se ingresan números negativos.
     */
    @Test
    public void testObtenerMCDNegativos() {
        assertThrows(IllegalArgumentException.class, () -> UtilidadesMatematicas.obtenerMCD(-18,24));
        assertThrows(IllegalArgumentException.class, () -> UtilidadesMatematicas.obtenerMCD(18,-24));
        assertThrows(IllegalArgumentException.class, () -> UtilidadesMatematicas.obtenerMCD(-18,-24));
    }

    /**
     * Verifica el cálculo correcto del MCD en distintos casos.
     */
    @Test
    public void testObtenerMCD() {
        assertEquals(6, UtilidadesMatematicas.obtenerMCD(48, 18));
        assertEquals(1, UtilidadesMatematicas.obtenerMCD(7, 13));
    }
}
