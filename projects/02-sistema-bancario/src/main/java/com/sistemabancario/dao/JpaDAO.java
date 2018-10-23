package main.java.com.sistemabancario.dao;

import java.util.*;

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
public class JpaDAO implements DAO {

    /**
     * Default constructor
     */
    public JpaDAO() {
    }

    /**
     * 
     */
    private EntityManager em;

    /**
     * 
     */
    private Class<T> classe;

    /**
     * @param em 
     * @param classe
     */
    public void JpaDAO(EntityManager em, Class<T> classe) {
        // TODO implement here
    }

}