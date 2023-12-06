package com.manoelcampos.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.manoelcampos.tdd.MathUtil.mdc;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe para inclusão dos testes unitários para
 * os métodos mdc() da classe {@link MathUtil},
 * que calcula o Máximo Divisor Comum de dois ou mais números.
 *
 * <p>Cada teste unitário deve verificar uma determinada propriedade
 * do MDC. Os métodos de teste indicam o número da 
 * <a href="https://pt.wikipedia.org/wiki/Máximo_divisor_comum#Propriedades">propriedade<</a> 
 * testada (como p1) no nome.</p>
 * 
 * @author Manoel Campos da Silva Filho <http://github.com/manoelcampos>
 */
class MathUtilMdcTest {

    /**
     * Teste parametrizado para a propriedade 1 da função {@link MathUtil#mdc(int, int)}.
     * Assim, o teste é executado múltiplas vezes com valores diferentes.
     * Os valores para os parâmetros do teste são obtidos a partir da anotação {@link CsvSource},
     * onde cada String representa um conjunto de valores que serão passadas para o teste.
     * Múltiplas String indica que o teste será chamado várias vezes com diferentes valores.
     * Os valores em cada String devem ser separados por vírgula (formato CSV (Comma Separated Values)).
     * Assim, se tiver 3 parâmetros no teste, cada String deve ter 3 valores separados por vírgula.
     *
     * @param a valor para o 1o parâmetro da função mdc.
     * @param b valor para o 2o parâmetro da função mdc
     * @param esperado valor esperado como resultado da chamada da função mdc.
     */
    @ParameterizedTest
    @CsvSource({"6, 3, 3", "6, 6, 6", "8, 2, 4"})
    void mdcP1Divisiveis(final int a, final int b, final int esperado){
        final int obtido = mdc(a, b);
        assertEquals(esperado, obtido);
    }

    /**
     * Teste parametrizado para a propriedade 3 da função {@link MathUtil#mdc(int, int)}.
     * Assim, o teste é executado múltiplas vezes com valores diferentes.
     * Usa apenas valores positivos para o parâmetro a da função.
     * @param a valor para o 1o parâmetro da função mdc.
     *          Tal valor é obtido a partir da anotação {@link ValueSource}.
     *          Ela é usada para chamar o teste múltiplas vezes passando em cada vez
     *          um valor para um único parâmetro do método.
     */
    @ParameterizedTest
    @ValueSource(ints = {8, 7, 2, 0, 3, 15, 30, 21})
    void mdcP3APositivoBZero(final int a){
        final int b = 0, esperado = a;
        final int obtido = mdc(a, b);
        assertEquals(esperado, obtido);
    }

}
