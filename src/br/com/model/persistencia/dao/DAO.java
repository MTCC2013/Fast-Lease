package br.com.model.persistencia.dao;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface DAO <T, I extends Serializable> {
    
    public boolean save (T entity);
   
    
    public boolean remove (Class<T> classe, I pk);
    
    
    public T getById (Class<T> classe, I pk);
    
    
    public List<T> getAll (Class<T> classe);
    
    
    public EntityManager getEntityManager();
    
}
