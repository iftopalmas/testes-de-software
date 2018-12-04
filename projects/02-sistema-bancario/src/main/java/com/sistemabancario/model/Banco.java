package com.sistemabancario.model;

/**
 * Representa uma instituição bancária com os seguintes requisitos:
 * 
 * - Ao cadastrar um banco, deve ser criada ao menos uma agência.
 * - Não deve-se excluir um banco se este tiver agências cadastradas.
 */
public class Banco implements Cadastro {

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
     * Default constructor
     */
    public Banco() {
    }

    /**
     * @return
     */
    public long getId() {
        // TODO: Você precisa implementar este método
        return 0;
    }

    /**
     * @param id
     */
    public void setId(long id) {
        // TODO: Você precisa implementar este método
    }

}