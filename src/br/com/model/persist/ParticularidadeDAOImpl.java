package br.com.model.persist;
import br.com.model.negocio.Particularidade;
import br.com.model.persist.dao.ParticularidadeDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class ParticularidadeDAOImpl extends DAOImpl<Particularidade, Integer> implements ParticularidadeDAO{

    
    public List<Particularidade> ListByParticularidade(String particularidade) {
        return getEntityManager().createQuery("select p from Particularidade p where p.idSoftware '%" +particularidade+ "%'").getResultList();
    }

    
    public Particularidade getByParticularidade(String particularidade) {
       Query q = getEntityManager().createQuery("select p from Particularidade p where p.idSoftware"
                + " like '" + particularidade + "'", Particularidade.class);
        List<Particularidade> particularidades = q.getResultList();
        Particularidade pa = new Particularidade();
        for (Particularidade p : particularidades) {
            pa = p;
        }
        return pa;

    }
    
}
