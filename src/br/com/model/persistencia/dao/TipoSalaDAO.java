package br.com.model.persistencia.dao;
import br.com.model.negocio.TipoSala;
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface TipoSalaDAO  extends DAO<TipoSala, Integer>{
    
   
    List<TipoSala> ListByTipoSala (String tiposala);
    
    
    TipoSala getByTipoSala(String tiposala);
    
}
