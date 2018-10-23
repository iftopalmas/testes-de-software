package main.java.com.sistemabancario.dao;

import java.util.*;

/**
 * Interface seguindo o padrão de projetos DAO.
 * Ela  contém os métodos básicos a serem implementados por classes genéricas 
 * que permitem persistir (salvar) objetos de negócio em um banco de dados.
 */
public interface DAO {

    /**
     * @param id 
     * @return
     */
    public T findById(long id);

    /**
     * @param fieldName 
     * @param value 
     * @return
     */
    public T findByField(String fieldName, Object value);

    /**
     * @param entity
     */
    public void remove(T entity);

    /**
     * @param entity
     */
    public void save(T entity);

}