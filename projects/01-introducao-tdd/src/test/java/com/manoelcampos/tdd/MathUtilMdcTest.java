package com.manoelcampos.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Realiza vários testes unitários para
 * os métodos mdc() da classe {@link MathUtil},
 * que calcula o Máximo Divisor Comum de dois ou mais números.
 *
 * <p>Cada teste unitário verifica uma determinada propriedade
 * do MDC. Os métodos de teste indicam o número da 
 * <a href="https://pt.wikipedia.org/wiki/Máximo_divisor_comum#Propriedades">propriedade<</a> 
 * testada (como p1) no nome.</p>
 * 
 * @author Manoel Campos da Silva Filho <http://github.com/manoelcampos>
 */
class MathUtilMdcTest {

    /**
     * Propriedade 1: Se b > 0 é um divisor de a, então mdc(a, b) = b
     * Verifica b positivo.
     */
    @Test
    void testMdc_P1_Quando_B_Positivo() {
        final int a = 6;
        final int b = 2;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0); 
    }

    /**
     * Propriedade 1: Se b > 0 é um divisor de a, então mdc(a, b) = b
     * Verifica b negativo.
     */
    @Test
    void testMdc_P1_Quando_B_Negativo() {
        final int a = 6;
        final int b = -2;
        final int esperado = 2;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0); 
    }

    /**
     * Propriedade 3: Considerando que todos os números são fatores de 0 
     * (pois 0 = 0*a pra qualquer a inteiro) então mdc(a, 0) = |a|.
     * 
     * Este teste verifica um a positivo.
     */
    @Test
    void testMdc_P3_Quando_A_Positivo() {
        final int a = 6;
        final int b = 0;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0);
    }
    
    /**
     * Propriedade 3: Considerando que todos os números são fatores de 0 
     * (pois 0 = 0*a pra qualquer a inteiro) então mdc(a, 0) = |a|.
     * 
     * Este teste verifica um a negativo.
     */
    @Test
    void testMdc_P3_Quando_A_Negativo() {
        final int a = -6;
        final int b = 0;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0);
    }

    /**
     * Propriedade 4: Se m é um inteiro não negativo, então 
     * mdc(m*a, m*b) = m * mdc(a, b)
     */
    @Test
    void testMdc_P4() {
        final int m = 2;
        final int a = 6;
        final int b = 0;
        final int esperado = m*MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(m*a, m*b);
        assertEquals(esperado, obtido, 0.0);
    }
    
    /**
     * Testa se o MDC é 1 quando a não é divisível por b.
     */
    @Test
    void testMdc_obtidoadoIgual1() {
        final int a = 9;
        final int b = 2;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido, 0.0);
    }

    /**
     * Propriedade 5: Se mdc(a, b) = 1 então mdc(a*b, c) = mdc(a, c) * mdc(b, c).
     * Não há nenhuma propriedade que diga quando o mdc(a, b) = 1.
     * A propriedade 14 diz que será 1 se ab + by = 1.
     * Mas esta não é a única possibilidade.
     * Se fosse, a propriedade diria "se e somente se ab  + by = 1".
     * Então, a primeira parte mdc(a, b) = 1 entra no caso geral:
     * que é a forma comum de calcular o MDC que aprendemos na escola.
     */
    @Test
    void testMdc_P5() {
        final int a = 9;
        final int b = 2;
        final int c = 5;
        final int esperado = MathUtil.mdc(a,c) * MathUtil.mdc(b,c);
        final int obtido = MathUtil.mdc(a*b, c);
        assertEquals(esperado, obtido, 0.0);
    }

    /**
     * Propriedade 6: mdc(a, b) = mdc(b, a).
     */
    @Test
    void testMdc_P6() {
        final int a = 9;
        final int b = 2;
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    /**
     * Parte da Propriedade 7: mdc(-a, b) = mdc(a, -b)
     */
    @Test
    void testMdc_P7() {
        final int a = 8;
        final int b = 2;
        final int esperado = MathUtil.mdc(-a, b);
        final int obtido = MathUtil.mdc(a, -b);
        assertEquals(esperado, obtido);
    }   
    
    /**
     * Propriedade 8: Se a é um número inteiro positivo, então mdc(a,a) = a
     */
    @Test
    void testMdc_P8() {
        final int a = 9;
        final int esperado = a;
        final int obtido = MathUtil.mdc(a, a);
        assertEquals(esperado, obtido);
    }
    
    /**
     * Propriedade 12: Se p é um número primo mdc(p,a) = p ou mdc(p,a) = 1
     */
    @Test
    void testMdc_P12_obtidoadoPrimo() {
        final int p = 11;
        final int a = p;
        final int esperado = p;
        final int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado, obtido);
    }    
    
    /**
     * Propriedade 12: Se p é um número primo mdc(p,a) = p ou mdc(p,a) = 1
     */
    @Test
    void testMdc_P12_obtidoadoIgual1() {
        final int p = 11;
        final int a = 2;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(p, a);
        assertEquals(esperado, obtido);
    }

    /**
     * Caso geral que aplica o processo comum de resolução
     * do MDC. O caso geral é a regra, os outros são casos alternativos (exceções).
     */
    @Test
    void testMdcParaCasoGeral() {
        final int a = 30;
        final int b = 12;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    /**
     * Testa mais de dois valores.
     * Assim, a versão sobrecarregada {@link MathUtil#mdc(int...)} será
     * chamada no lugar da {@link MathUtil#mdc(int, int)}.
     */
    @Test
    void testMdc_DiversosResultado1() {
        final int esperado = 1;
        final int obtido = MathUtil.mdc(2, 3, 5);
        assertEquals(esperado, obtido);
    }  

    /**
     * Testa mais de dois valores.
     * Assim, a versão sobrecarregada {@link MathUtil#mdc(int...)} será
     * chamada no lugar da {@link MathUtil#mdc(int, int)}.
     */
    @Test
    void testMdc_DiversosResultadoMaior1() {
        final int esperado = 2;
        final int obtido = MathUtil.mdc(4, 2, 8);
        assertEquals(esperado, obtido);
    }  

}
