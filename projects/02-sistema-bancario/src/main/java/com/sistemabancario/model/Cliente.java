package main.java.com.sistemabancario.model;

import java.util.*;

/**
 * Cliente do banco tendo os seguintes requisitos:
 * 
 * - Ao cadastrar um cliente, deve ser criada ao menos uma conta.
 * - Não deve-se excluir um cliente se este tiver contas cadastradas.
 */
public class Cliente implements Cadastro {

    /**
     * Default constructor
     */
    public Cliente() {
    }

    /**
     * 
     */
    private long id;

    /**
     * CPF que é uma das formas de permitir representar o cliente unicamente.
     * 
     * Não pode ser vazio nem nulo, não pode ter todos os dígitos iguais, não pode conter hífens e traços.
     */
    private String cpf;

    /**
     * 
     */
    private String nome;


    /**
     * @return
     */
    public boolean isCpfValido() {
        // TODO implement here
        return false;
    }

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