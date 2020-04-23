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
public class MathUtilPrimoTest {

    @Test
    public void isPrimo0() {
        assertFalse(MathUtil.isPrimo(0));
    }

    @Test
    public void isPrimo1() {
        assertFalse(MathUtil.isPrimo(1));
    }

    @Test
    public void isPrimo2() {
        assertTrue(MathUtil.isPrimo(2));
    }

    @Test
    public void isPrimo3() {
        assertTrue(MathUtil.isPrimo(3));
    }

    @Test
    public void isPrimo4() {
        assertFalse(MathUtil.isPrimo(4));
    }

    @Test
    public void isPrimo5() {
        assertTrue(MathUtil.isPrimo(5));
    }

    @Test
    public void isPrimo6() {
        assertFalse(MathUtil.isPrimo(6));
    }

    @Test
    public void isPrimo13() {
        assertTrue(MathUtil.isPrimo(13));
    }

    @Test
    public void isPrimoMaxInt() {
        assertTrue(MathUtil.isPrimo(Integer.MAX_VALUE));
    }
}