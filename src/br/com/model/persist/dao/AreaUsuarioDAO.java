package br.com.model.persist.dao;
import br.com.model.negocio.AreaUsuario;
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface AreaUsuarioDAO  extends DAO<AreaUsuario, Integer>{
    
    
    List<AreaUsuario> ListByAreaUsuario (String areaprofessor);
        
    AreaUsuario getByAreaUsuario(String areaprofessor);
    
}
