package br.com.model.persist;

import br.com.model.negocio.TipoSala;
import br.com.model.persist.dao.TipoSalaDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class TipoSalaDAOImpl extends DAOImpl<TipoSala, Integer> implements TipoSalaDAO{

    
    public List<TipoSala> ListByTipoSala(String tiposala) {
        return getEntityManager().createQuery("select u from TipoSala u where u.nome '%" +tiposala+ "%'").getResultList();
    }

    
    public TipoSala getByTipoSala(String tiposala) {
       Query q = getEntityManager().createQuery("select s from TipoSala s where s.nome"
                + " like '" + tiposala + "'", TipoSala.class);
        List<TipoSala> tiposalas = q.getResultList();
        TipoSala ts = new TipoSala();
        for (TipoSala t : tiposalas) {
            ts = t;
        }
        return ts;

    }
    
}
