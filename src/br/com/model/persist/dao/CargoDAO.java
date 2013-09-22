package br.com.model.persist.dao;
import br.com.model.negocio.Cargo;
import java.util.List;

/**
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface CargoDAO  extends DAO<Cargo, Integer>{
    
    List<Cargo> ListByCargo (String cargo);
        
    Cargo getByCargo(String cargo);
    
}
