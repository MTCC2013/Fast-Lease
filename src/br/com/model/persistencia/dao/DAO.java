
/*
 * Interface DAO genérica responsável pela implementação de todas as outras classes
 * DAO do projeto.
 */
// Pacote que se encontra a Interface 
package br.com.model.persistencia.dao;
//Bibliotecas Hibernate e JPA importadas no projeto
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface DAO <T, I extends Serializable> {
    
    // Salvar
    public boolean save (T entity);
   
    //Remover
    public boolean remove (Class<T> classe, I pk);
    
    //Selecionar Id(Código)
    public T getById (Class<T> classe, I pk);
    
    //Listar todos inseridos na tabela
    public List<T> getAll (Class<T> classe);
    
    //EntityManager JPA
    public EntityManager getEntityManager();
    
}
