package main.java.com.sistemabancario.model;

import java.util.*;

/**
 * Representa uma instituição bancária com os seguintes requisitos:
 * 
 * - Ao cadastrar um banco, deve ser criada ao menos uma agência.
 * - Não deve-se excluir um banco se este tiver agências cadastradas.
 */
public class Banco implements Cadastro {

    /**
     * Default constructor
     */
    public Banco() {
    }

    /**
     * 
     */
    private long id;

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private String sigla;

    /**
     * Número único do banco. Deve ter exatamente 3 algarismos.
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