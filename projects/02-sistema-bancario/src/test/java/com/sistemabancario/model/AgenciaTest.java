package com.sistemabancario.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Manoel Campos da Silva Filho
 */
public class AgenciaTest {
    private Agencia instance;

    @Before
    public void setUp(){
        instance = new Agencia();
    }

    @Test
    public void setNumeroValido() {
        String esperado = "1886-4";
        instance.setNumero(esperado);
        assertEquals(esperado, instance.getNumero());
    }
}