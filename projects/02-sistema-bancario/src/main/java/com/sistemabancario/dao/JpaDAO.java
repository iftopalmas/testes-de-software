package com.sistemabancario.dao;

import com.sistemabancario.model.Cadastro;

import javax.persistence.EntityManager;

/**
 * Classe que representa um DAO genérico para persistir qualquer objeto de negócio no banco de dados utilizando JPA.
 * 
 * Com isto, por padrão, só precisamos desta única classe para persistir qualquer objeto 
 * que não possua regras de negócio específicas.
 * 
 * No caso de objetos como Conta que possuem tais regras de negócio, é preciso criar uma subclasse de JpaDAO, 
 * como ContaJpaDAO para implementar tais regras 
 * quando estas não puderem ser implementadas diretamente no banco de dados.
 */
public class JpaDAO<T extends Cadastro> implements DAO<T> {

    /**
     *
     */
    private EntityManager em;

    /**
     *
     */
    private Class<T> classe;

    /**
     * Default constructor
     */
    public JpaDAO() {
    }

    /**
     * @param em 
     * @param classe
     */
    public void JpaDAO(EntityManager em, Class<T> classe) {
        // TODO: Você precisa implementar este método
    }

    @Override
    public T findById(long id) {
        //Apague esta linha abaixo quando implementar o método
        throw new UnsupportedOperationException("Você ainda não implementou este método!");
    }

    @Override
    public T findByField(String fieldName, Object value) {
        //Apague esta linha abaixo quando implementar o método
        throw new UnsupportedOperationException("Você ainda não implementou este método!");
    }

    @Override
    public void remove(T entity) {
        //Apague esta linha abaixo quando implementar o método
        throw new UnsupportedOperationException("Você ainda não implementou este método!");
    }

    @Override
    public void save(T entity) {
        //Apague esta linha abaixo quando implementar o método
        throw new UnsupportedOperationException("Você ainda não implementou este método!");
    }
}