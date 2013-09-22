package br.com.model.persist.dao;
import br.com.model.negocio.Curso;
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface CursoDAO  extends DAO<Curso, Integer>{
    
    
    List<Curso> ListByCurso (String curso);
    
     
    Curso getByCurso(String curso);
    
}
