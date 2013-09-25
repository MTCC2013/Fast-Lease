package br.com.model.persistencia.dao;

import br.com.model.negocio.Sala;

import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface SalaDAO  extends DAO<Sala, Integer>{
    
    List<Sala> ListBySala (String sala);
    
    Sala getBySala(String sala);
    
}
