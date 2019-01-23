package com.sistemabancario.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Manoel Campos da Silva Filho
 */
public class MovimentacaoTest {

    @Test
    public void setTipo() {
        final Movimentacao instancia = new Movimentacao();
        final char esperado = 'C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }
}