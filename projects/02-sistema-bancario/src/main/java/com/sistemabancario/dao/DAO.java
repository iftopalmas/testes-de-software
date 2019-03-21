package com.sistemabancario.dao;

import com.sistemabancario.model.Cadastro;

/**
 * Interface seguindo o padrão de projetos DAO.
 * Ela  contém os métodos básicos a serem implementados por classes genéricas 
 * que permitem persistir (salvar) objetos de negócio em um banco de dados.
 */
public interface DAO<T extends Cadastro> {

    /**
     * @param id 
     * @return
     */
    T findById(long id);

    /**
     * @param fieldName 
     * @param value 
     * @return
     */
    T findByField(String fieldName, Object value);

    /**
     * @param entity
     */
    void remove(T entity);

    /**
     * @param entity
     */
    void save(T entity);
}