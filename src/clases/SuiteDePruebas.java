package clases;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * Suite de pruebas que agrupa todas las clases de test relacionadas con
 * {@link UtilidadesMatematicas}.
 *
 * <p>Permite ejecutar de manera centralizada todas las pruebas unitarias.</p>
 */
@Suite // Indica que esta clase es una suite de pruebas
@SelectClasses({
    UtilidadesMatematicasTest.class
})
// @SelectPackages("clases") // Alternativa para incluir todas las pruebas de un paquete
public class SuiteDePruebas {
    // No se necesita código dentro de esta clase
}
