package br.com.model.persistencia;

import br.com.model.negocio.Grau;
import br.com.model.persistencia.dao.GrauTurmaDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class GrauTurmaDAOImpl extends DAOImpl<Grau, Integer> implements GrauTurmaDAO{

    
    public List<Grau> ListByGrauTurma(String grauturma) {
        return getEntityManager().createQuery("select u from GrauTurma u where u.nome '%" +grauturma+ "%'").getResultList();
    }

    
    public Grau getByGrauTurma(String grauturma) {
       Query q = getEntityManager().createQuery("select s from GrauTurma s where s.nome"
                + " like '" + grauturma + "'", Grau.class);
        List<Grau> grauturmas = q.getResultList();
        Grau gt = new Grau();
        for (Grau g : grauturmas) {
            gt = g;
        }
        return gt;

    }
    
}
