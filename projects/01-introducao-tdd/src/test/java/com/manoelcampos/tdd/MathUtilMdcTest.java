package com.manoelcampos.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

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
     * Caso geral que aplica o processo comum de resolução
     * do MDC. Este é normalmente o primeiro a ser resolvido.
     * O caso geral é a regra, os outros são casos alternativos (exceções).
     */
    @Test
    public void testMdcParaCasoGeral() {
        double a = 30;
        double b = 12;
        double result = MathUtil.mdc(a, b);
        double expResult = 6;
        assertEquals(expResult, result, 0.0);
    }  
    
    /**
     * Propriedade 1: Se b > 0 é um divisor de a, então mdc(a, b) = b
     * Verifica b positivo.
     */
    @Test
    public void testMdc_P1_Quando_B_Positivo() {
        double a = 6;
        double b = 2;
        double expResult = b;
        double result = MathUtil.mdc(a, b);
        assertEquals(expResult, result, 0.0); 
    }

    /**
     * Propriedade 1: Se b > 0 é um divisor de a, então mdc(a, b) = b
     * Verifica b negativo.
     */
    @Test
    public void testMdc_P1_Quando_B_Negativo() {
        double a = 6;
        double b = -2;
        double expResult = 2;
        double result = MathUtil.mdc(a, b);
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
        double a = 6;
        double b = 0;
        double expResult = 6;
        double result = MathUtil.mdc(a, b);
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
        double a = -6;
        double b = 0;
        double expResult = 6;
        double result = MathUtil.mdc(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Propriedade 4: Se m é um inteiro não negativo, então 
     * mdc(m*a, m*b) = m * mdc(a, b)
     */
    @Test
    public void testMdc_P4() {
        double m = 2.5;
        double a = 6;
        double b = 0;
        double expResult = m*MathUtil.mdc(a, b);
        double result = MathUtil.mdc(m*a, m*b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Testa se o MDC é 1 quando a não é divisível por b.
     */
    @Test
    public void testMdc_ResultadoIgual1() {
        double a = 9;
        double b = 2;
        double expResult = 1;
        double result = MathUtil.mdc(a, b);
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
        double a = 9;
        double b = 2;
        double c = 5;
        double expResult = MathUtil.mdc(a,c) * MathUtil.mdc(b,c);
        double result = MathUtil.mdc(a*b, c);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Propriedade 6: mdc(a, b) = mdc(b, a).
     */
    @Test
    public void testMdc_P6() {
        //Matriz onde cada linha representa um par de valores a,b para serem testados
        double matrizValores[][] = {{9,2}, {6,2}, {6,0}, {-6,0}};
        double expResult;
        double result;
        String msg;
        for (double[] valores : matrizValores) {
            expResult = MathUtil.mdc(valores[1], valores[0]);
            result = MathUtil.mdc(valores[0], valores[1]);
            msg = String.format("a: %.2f b: %.2f", valores[0], valores[1]);
            assertEquals(msg, expResult, result, 0.0);
        }
    }
    
    /**
     * Propriedade 7: mdc(-a, b) = mdc(a, -b) = mdc(-a, -b) = mdc(a, b)
     */
    @Test
    public void testMdc_P7() {
        double a = 8;
        double b = 2;
        double expResult = MathUtil.mdc(a,-b);
        double result = MathUtil.mdc(-a, b);
        assertEquals(expResult, result, 0.0);
        
        expResult = MathUtil.mdc(-a,-b);
        assertEquals(expResult, result, 0.0);

        expResult = MathUtil.mdc(a,b);
        assertEquals(expResult, result, 0.0);
    }   
    
    /**
     * Propriedade 8: Se a é um número inteiro positivo, então mdc(a,a) = a
     */
    @Test
    public void testMdc_P8() {
        double a = 9;
        double expResult = a;
        double result = MathUtil.mdc(a, a);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Propriedade 12: Se p é um número primo mdc(p,a) = p ou mdc(p,a) = 1
     */
    @Test
    public void testMdc_P12_ResultadoPrimo() {
        double p = 11;
        double a = p;
        double result = MathUtil.mdc(p, a);
        double expResult = p;
        assertEquals(expResult, result, 0.0);
    }    
    
    /**
     * Propriedade 12: Se p é um número primo mdc(p,a) = p ou mdc(p,a) = 1
     */
    @Test
    public void testMdc_P12_ResultadoIgual1() {
        double p = 11;
        double a = 2;
        double result = MathUtil.mdc(p, a);
        double expResult = 1;
        assertEquals(expResult, result, 0.0);
    }  
    
    /**
     * Testa uma série de conjuntos de mais de 2 valores.
     * Assim, a versão sobrecarregada {@link MathUtil#mdc(double...)} será
     * chamada no lugar da {@link MathUtil#mdc(double, double)}.
     */
    @Test
    public void testMdc_Diversos() {
        assertEquals(1, MathUtil.mdc(2, 3, 5), 0.0);
        assertEquals(2, MathUtil.mdc(2, 6, 4), 0.0);
        assertEquals(2, MathUtil.mdc(2, 12, 2, 4, 8), 0.0);
        assertEquals(3, MathUtil.mdc(3, 15, 18), 0.0);
    }  

}
