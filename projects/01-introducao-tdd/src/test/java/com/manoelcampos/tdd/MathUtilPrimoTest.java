package com.manoelcampos.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Realiza vários testes unitários para
 * o método isPrimo() da classe {@link MathUtil},
 * que verifica se um número é primo ou não.
 *
 * @author Manoel Campos da Silva Filho
 */
class MathUtilPrimoTest {

    @Test
    void isPrimo0() {
        assertFalse(MathUtil.isPrimo(0));
    }

    @Test
    void isPrimo1() {
        assertFalse(MathUtil.isPrimo(1));
    }

    @Test
    void isPrimo2() {
        assertTrue(MathUtil.isPrimo(2));
    }

    @Test
    void isPrimo3() {
        assertTrue(MathUtil.isPrimo(3));
    }

    @Test
    void isPrimo4() {
        assertFalse(MathUtil.isPrimo(4));
    }

    @Test
    void isPrimo5() {
        assertTrue(MathUtil.isPrimo(5));
    }

    @Test
    void isPrimo6() {
        assertFalse(MathUtil.isPrimo(6));
    }

    @Test
    void isPrimo13() {
        assertTrue(MathUtil.isPrimo(13));
    }

    @Test
    void isPrimoMaxInt() {
        assertTrue(MathUtil.isPrimo(Integer.MAX_VALUE));
    }
}