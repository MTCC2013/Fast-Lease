package br.com.model.persistencia;

import br.com.model.negocio.GrauTurma;
import br.com.model.persistencia.dao.GrauTurmaDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class GrauTurmaDAOImpl extends DAOImpl<GrauTurma, Integer> implements GrauTurmaDAO{

    
    public List<GrauTurma> ListByGrauTurma(String grauturma) {
        return getEntityManager().createQuery("select u from GrauTurma u where u.nome '%" +grauturma+ "%'").getResultList();
    }

    
    public GrauTurma getByGrauTurma(String grauturma) {
       Query q = getEntityManager().createQuery("select s from GrauTurma s where s.nome"
                + " like '" + grauturma + "'", GrauTurma.class);
        List<GrauTurma> grauturmas = q.getResultList();
        GrauTurma gt = new GrauTurma();
        for (GrauTurma g : grauturmas) {
            gt = g;
        }
        return gt;

    }
    
}
