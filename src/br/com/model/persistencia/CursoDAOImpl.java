package br.com.model.persistencia;

import br.com.model.negocio.Curso;
import br.com.model.persistencia.dao.CursoDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class CursoDAOImpl extends DAOImpl<Curso, Integer> implements CursoDAO{

    
    public List<Curso> ListByCurso(String curso) {
        return getEntityManager().createQuery("select c from Curso c where c.curso '%" +curso+ "%'").getResultList();
    }

    
    public Curso getByCurso(String curso) {
       Query q = getEntityManager().createQuery("select s from Curso s where s.nome"
                + " like '" + curso +"'", Curso.class);
        List<Curso> cursos = q.getResultList();
        Curso cr = new Curso();
        for (Curso c : cursos) {
            cr = c;
        }
        return cr;

    }
    
}
