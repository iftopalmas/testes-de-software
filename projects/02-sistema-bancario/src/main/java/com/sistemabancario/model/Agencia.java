package com.sistemabancario.model;

/**
 * Representa uma agência bancária.
 */
public class Agencia implements Cadastro {
    private long id;

    /**
     * Número único da agência bancária para um banco.
     *
     * <ul>
     * <li>Deve ter exatamente 5 algarismos, seguido de um hífen e mais um dígito verificador.
     * ( hífen é pra deixar clara a existência de tal dígito).</li>
     * <li>Deve ser validado usando o algoritmo modulo 10
     *  https://pt.wikipedia.org/wiki/Dígito_verificador#Módulo_10</li>
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

    public void setNumero(String numero) {
        this.numero = numero;
    }

}