package com.sistemabancario.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Manoel Campos da Silva Filho
 */
public class MovimentacaoTest {
    private Movimentacao instancia = new Movimentacao();

    @Before
    public void setUp(){
        //instancia.setValor(10);
    }

    @Test
    public void instanciarMovimentacaoComoNaoConfirmada() {
        assertFalse(instancia.isConfirmada());
    }

    @Test
    public void setValorNegativo() {
        final double invalido = -100;
        try{
            instancia.setValor(invalido);
        }catch(IllegalArgumentException e){
        }
        
        final double obtido = instancia.getValor();
        assertNotEquals(invalido, obtido, 0.0001);
    }
    
    @Test
    public void setValorPositivo() {
        final double esperado = 100;
        instancia.setValor(esperado);
        final double obtido = instancia.getValor();
        assertEquals(esperado, obtido, 0.0001);
    }


    @Test
    public void getTipoPadraoC() {
        final char esperado = 'C';
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test
    public void setTipoCreditoMaisuculo() {
        final char esperado = 'C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
        instancia.setConfirmada(true);
    }

    @Test
    public void setTipoDebito() {
        final char esperado = 'D';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test
    public void setTipoCreditoMinusculo() {
        final char esperado = 'c';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test
    public void setTipoInvalido() {
        final char invalido = 'x';
        try {
            instancia.setTipo(invalido);
        }catch(IllegalArgumentException e){
        }

        final char obtido = instancia.getTipo();
        assertNotEquals(invalido, obtido);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTipoInvalidoExcecao() {
        final char invalido = 'x';
        instancia.setTipo(invalido);
    }

    public static void main(String[] args) {
        MovimentacaoTest movimentacaoTest = new MovimentacaoTest();
        movimentacaoTest.instanciarMovimentacaoComoNaoConfirmada();

        movimentacaoTest = new MovimentacaoTest();
        movimentacaoTest.setTipoCreditoMaisuculo();
    }

}