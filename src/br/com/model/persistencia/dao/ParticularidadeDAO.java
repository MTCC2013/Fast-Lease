package br.com.model.persistencia.dao;

import br.com.model.negocio.Particularidade;

import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface ParticularidadeDAO  extends DAO<Particularidade, Integer>{
    
    List<Particularidade> ListByParticularidade (String particularidade);
    
    Particularidade getByParticularidade(String particularidade);
    
}
