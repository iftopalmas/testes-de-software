package com.sistemabancario.model;

import java.util.Arrays;

/**
 * Representa uma agência bancária.
 */
public class Agencia implements Cadastro {
    private long id;

    /**
     * Número único da agência bancária para um banco.
     *
     * <ul>
     *      <li></li>
     *      <li>Deve ter exatamente 5 algarismos, seguido de um hífen e mais um dígito verificador.
     *      (o hífen é pra deixar clara a existência de tal dígito). (1)</li>
     * </ul>
     */
    private String numero;

    @Override
    public long getId() {
        // TODO: Você precisa implementar este método
        return 0;
    }

    @Override
    public void setId(long id) {
        // TODO: Você precisa implementar este método
    }

    public String getNumero() {
        return numero;
    }

    /**
     * Define o número da agência, validando
     * tal número usando o algoritmo <a href="https://pt.wikipedia.org/wiki/Dígito_verificador#Módulo_10">modulo 10</a>.
     * @param numero
     */
    public void setNumero(String numero) {
        final String digitoCalculado = calculaDigitoModulo10(numero);
        if(!numero.endsWith(digitoCalculado)) {
            throw new IllegalArgumentException("Dígito verificador inválido para agência " + numero + ". Esperado: " + digitoCalculado);
        }

        this.numero = numero;
    }

    /**
     * Utiliza o algoritmo <a href="https://pt.wikipedia.org/wiki/Dígito_verificador#Módulo_10">modulo 10</a>
     * para verificar se o número de uma agência ou conta no formato DDDDD-D é válido.
     *
     * @param numero número de agência ou conta a ser validado
     * @return o dígito verificador calculado a partir do número de agência ou conta fornecido
     */
    private String calculaDigitoModulo10(final String numero) {
        //Copia os algarismos antes do hífen
        final char[] algarismos = numero.substring(0, numero.length() - 2).toCharArray();

        //Vetor que armazenará o resultado das operações sobre cada algarismo do número
        final int[] resultados = new int[numero.length()];

        for (int i = 0; i < algarismos.length; i++) {
            final int algarismo = charToInt(algarismos[i]);

            //Em posições pares, o algarismo é multiplicado por 2, em ímpares é multiplicado por 1
            final int multiplicador = i % 2 == 0 ? 2 : 1;

            resultados[i] = somaAlgarismos(algarismo * multiplicador);
        }

        final int soma = Arrays.stream(resultados).sum();
        final int digitoCalculado = 10 - soma%10;

        return Integer.toString(digitoCalculado);
    }

    /**
     * Soma os algarismos de um determinado número inteiro.
     * Isto é parte do processo de validação do dígito de uma agência ou conta
     * por meio do algoritmo <a href="https://pt.wikipedia.org/wiki/Dígito_verificador#Módulo_10">modulo 10</a>.
     * @param numero numero a ter os algarismos somados
     * @return soma dos algarismos do número
     */
    private int somaAlgarismos(final int numero){
        //Se o número só tem um algarismo, a soma dos algarimos é o próprio número
        if(numero <= 9){
            return numero;
        }

        return Integer.toString(numero).chars().map(c -> charToInt((char)c)).sum();
    }

    private int charToInt(final char c){
        //Converte o caractere para inteiro (em base decimal, por isso é 10)
        return Character.digit(c, 10);
    }
}