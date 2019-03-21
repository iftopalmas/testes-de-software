package com.sistemabancario.model;

import java.util.*;

/**
 * Interface contendo os métodos básicos que qualquer entidade 
 * (classe de negócio que será persistida no banco de dados) deve ter. 
 * 
 * Todas as classes apresentadas abaixo que tem <<Cadastro>> no título, implementam tal interface. 
 * O relacionamento só não é mostrado para não complicar o diagrama (que viraria uma teia de aranha).
 */
public interface Cadastro {

    /**
     * @return
     */
    long getId();

    /**
     * @param id
     */
    void setId(long id);

}