package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void suma() {
        assertEquals(5, Main.suma(2, 3));
    }

    @Test
    void resta() {
        assertEquals(1, Main.resta(3, 2));
    }

    @Test
    void multiplicacion() {
        assertEquals(6, Main.multiplicacion(2, 3));
    }

    @Test
    void division() {
        assertEquals(1.5, Main.division(3, 2));
    }

    @Test
    void divisionPorCero() {
        assertThrows(IllegalArgumentException.class, () -> Main.division(3, 0));
    }
}