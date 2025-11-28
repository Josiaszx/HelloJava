package JUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// un test unitario es una prueba que se realiza a una unidad especifica de codigo (normalmeta a metodos)
class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test // definir una prueba unitaria
    @DisplayName("Probar Suma") // (opcional) cambiar el nombre de la prueba
    void sumarTest() {
        int resultado = calculadora.sumar(2, 2); // guardamos el resultado dado
        assertEquals(4, resultado); // assertEquals(): compara el resultado con el valor esperado
        // en este caso la prueba sera pasada
    }


    @Test
    @DisplayName("Probar division")
    void dividirTest() {

        // manejar exepciones
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(10, 0));
        // asserThrows: pasara la prueba si la funcion dada lanza el error dado como parametro

        assertEquals(5.0, calculadora.dividir(25, 5));

    }

    /*
    asserts mas comunes:
        assertEquals(expected, actual);
        assertNotEquals(a, b);
        assertTrue(condicion);
        assertFalse(condicion);
        assertNull(obj);
        assertNotNull(obj);
        assertThrows(IllegalArgumentException.class, () -> metodo());

     */

}