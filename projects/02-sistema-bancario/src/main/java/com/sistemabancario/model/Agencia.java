package main.java.com.sistemabancario.model;

import java.util.*;

/**
 * Representa uma agência bancária.
 */
public class Agencia implements Cadastro {

    /**
     * Default constructor
     */
    public Agencia() {
    }

    /**
     * 
     */
    private long id;

    /**
     * Número único da agência bancária para um banco.
     * 
     * <p>
     * - Deve ter exatamente 5 algarismos, seguido de um hífen e mais um dígito verificador. 
     * ( hífen é pra deixar clara a existência de tal dígito).
     * - Deve ser validado usando o algoritmo modulo 10
     *  https://pt.wikipedia.org/wiki/Dígito_verificador#Módulo_10
     * </p>
     */
    private String numero;


    /**
     * @return
     */
    public long getId() {
        // TODO implement here
        return 0;
    }

    /**
     * @param id
     */
    public void setId(long id) {
        // TODO implement here
    }

}