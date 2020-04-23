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
public class MathUtilMdcTest {

    /**
     * Propriedade 1: Se b > 0 é um divisor de a, então mdc(a, b) = b
     * Verifica b positivo.
     */
    @Test
    public void testMdc_P1_Quando_B_Positivo() {
        int a = 6;
        int b = 2;
        int expResult = b;
        int result = MathUtil.mdc(a, b);
        assertEquals(expResult, result, 0.0); 
    }

    /**
     * Propriedade 1: Se b > 0 é um divisor de a, então mdc(a, b) = b
     * Verifica b negativo.
     */
    @Test
    public void testMdc_P1_Quando_B_Negativo() {
        int a = 6;
        int b = -2;
        int expResult = 2;
        int result = MathUtil.mdc(a, b);
        assertEquals(expResult, result, 0.0); 
    }

    /**
     * Propriedade 3: Considerando que todos os números são fatores de 0 
     * (pois 0 = 0*a pra qualquer a inteiro) então mdc(a, 0) = |a|.
     * 
     * Este teste verifica um a positivo.
     */
    @Test
    public void testMdc_P3_Quando_A_Positivo() {
        int a = 6;
        int b = 0;
        int expResult = 6;
        int result = MathUtil.mdc(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Propriedade 3: Considerando que todos os números são fatores de 0 
     * (pois 0 = 0*a pra qualquer a inteiro) então mdc(a, 0) = |a|.
     * 
     * Este teste verifica um a negativo.
     */
    @Test
    public void testMdc_P3_Quando_A_Negativo() {
        int a = -6;
        int b = 0;
        int expResult = 6;
        int result = MathUtil.mdc(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Propriedade 4: Se m é um inteiro não negativo, então 
     * mdc(m*a, m*b) = m * mdc(a, b)
     */
    @Test
    public void testMdc_P4() {
        int m = 2;
        int a = 6;
        int b = 0;
        int expResult = m*MathUtil.mdc(a, b);
        int result = MathUtil.mdc(m*a, m*b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Testa se o MDC é 1 quando a não é divisível por b.
     */
    @Test
    public void testMdc_ResultadoIgual1() {
        int a = 9;
        int b = 2;
        int expResult = 1;
        int result = MathUtil.mdc(a, b);
        assertEquals(expResult, result, 0.0);
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
    public void testMdc_P5() {
        int a = 9;
        int b = 2;
        int c = 5;
        int expResult = MathUtil.mdc(a,c) * MathUtil.mdc(b,c);
        int result = MathUtil.mdc(a*b, c);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Propriedade 6: mdc(a, b) = mdc(b, a).
     */
    @Test
    public void testMdc_P6() {
        //Matriz onde cada linha representa um par de valores a,b para serem testados
        int matrizValores[][] = {{9,2}, {6,2}, {6,0}, {-6,0}};
        int expResult;
        int result;
        String msg;
        for (int[] valores : matrizValores) {
            expResult = MathUtil.mdc(valores[1], valores[0]);
            result = MathUtil.mdc(valores[0], valores[1]);
            msg = String.format("a: %d b: %d", valores[0], valores[1]);
            assertEquals(expResult, result, msg);
        }
    }
    
    /**
     * Propriedade 7: mdc(-a, b) = mdc(a, -b) = mdc(-a, -b) = mdc(a, b)
     */
    @Test
    public void testMdc_P7() {
        int a = 8;
        int b = 2;
        int expResult = MathUtil.mdc(a, -b);
        int result = MathUtil.mdc(-a, b);
        assertEquals(expResult, result);
        
        expResult = MathUtil.mdc(-a, -b);
        assertEquals(expResult, result);

        expResult = MathUtil.mdc(a, b);
        assertEquals(expResult, result);
    }   
    
    /**
     * Propriedade 8: Se a é um número inteiro positivo, então mdc(a,a) = a
     */
    @Test
    public void testMdc_P8() {
        int a = 9;
        int expResult = a;
        int result = MathUtil.mdc(a, a);
        assertEquals(expResult, result);
    }
    
    /**
     * Propriedade 12: Se p é um número primo mdc(p,a) = p ou mdc(p,a) = 1
     */
    @Test
    public void testMdc_P12_ResultadoPrimo() {
        int p = 11;
        int a = p;
        int result = MathUtil.mdc(p, a);
        int expResult = p;
        assertEquals(expResult, result);
    }    
    
    /**
     * Propriedade 12: Se p é um número primo mdc(p,a) = p ou mdc(p,a) = 1
     */
    @Test
    public void testMdc_P12_ResultadoIgual1() {
        int p = 11;
        int a = 2;
        int result = MathUtil.mdc(p, a);
        int expResult = 1;
        assertEquals(expResult, result);
    }

    /**
     * Caso geral que aplica o processo comum de resolução
     * do MDC. O caso geral é a regra, os outros são casos alternativos (exceções).
     */
    @Test
    public void testMdcParaCasoGeral() {
        int a = 30;
        int b = 12;
        int result = MathUtil.mdc(a, b);
        int expResult = 6;
        assertEquals(expResult, result);
    }

    /**
     * Testa uma série de conjuntos de mais de 2 valores.
     * Assim, a versão sobrecarregada {@link MathUtil#mdc(int...)} será
     * chamada no lugar da {@link MathUtil#mdc(int, int)}.
     */
    @Test
    public void testMdc_Diversos() {
        assertEquals(1, MathUtil.mdc(2, 3, 5));
        assertEquals(2, MathUtil.mdc(2, 6, 4));
        assertEquals(2, MathUtil.mdc(2, 12, 2, 4, 8));
        assertEquals(3, MathUtil.mdc(3, 15, 18));
    }  

}
