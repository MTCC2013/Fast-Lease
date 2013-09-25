package br.com.model.persistencia.dao;

import br.com.model.negocio.GrauTurma;

import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface GrauTurmaDAO  extends DAO<GrauTurma, Integer>{
    
    List<GrauTurma> ListByGrauTurma (String grau);
    
    GrauTurma getByGrauTurma(String grau);
    
}
