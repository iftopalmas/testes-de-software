package com.sistemabancario.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste base para implementação dos testes
 * unitários para a classe {@link Movimentacao}.
 * Os testes foram gerados pelo IDE apenas como modelo
 * (fiz apenas algumas melhorias de boas práticas 
 * como tirar visibilidade public e definir variáveis como final).
 * 
 * Assim, NENHUM DELES FUNCIONA E O CÓDIGO PRECISA SER ALTERADO
 * de acordo com as regras de negócio dos métodos da classe {@link Movimentacao}.
 * Ao iniciar a alteração de um teste aqui,
 * a primeira coisa a fazer é remover a chamada de fail(),
 * que indica que o teste é apenas um protótipo.
 * 
 * @author Manoel Campos da Silva Filho
 */
class MovimentacaoTest {
    
    @Test
    void testGetId() {
        final Movimentacao instance = null;
        final long expResult = 0L;
        final long result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    void testSetId() {
        final long id = 0L;
        final Movimentacao instance = null;
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    @Test
    void testGetTipo() {
        final Movimentacao instance = null;
        final char expResult = ' ';
        final char result = instance.getTipo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    void testSetTipo() {
        final char tipo = ' ';
        final Movimentacao instance = null;
        instance.setTipo(tipo);
        fail("The test case is a prototype.");
    }

    @Test
    void testGetDescricao() {
        final Movimentacao instance = null;
        final String expResult = "";
        final String result = instance.getDescricao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    void testSetDescricao() {
        final String descricao = "";
        final Movimentacao instance = null;
        instance.setDescricao(descricao);
        fail("The test case is a prototype.");
    }

    @Test
    void testGetValor() {
        final Movimentacao instance = null;
        final double expResult = 0.0;
        final double result = instance.getValor();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    void testSetValor() {
        final double valor = 0.0;
        final Movimentacao instance = null;
        instance.setValor(valor);
        fail("The test case is a prototype.");
    }

    @Test
    void testIsConfirmada() {
        final Movimentacao instance = null;
        final boolean expResult = false;
        final boolean result = instance.isConfirmada();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    void testSetConfirmada() {
        final boolean confirmada = false;
        final Movimentacao instance = null;
        instance.setConfirmada(confirmada);
        fail("The test case is a prototype.");
    }
}
