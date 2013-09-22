package br.com.model.persist;

import br.com.model.negocio.Software;
import br.com.model.persist.dao.SoftwareDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class SoftwareDAOImpl extends DAOImpl<Software, Integer> implements SoftwareDAO{

    
    public List<Software> ListBySoftware(String software) {
        return getEntityManager().createQuery("select s from Software s where u.nome '%" +software+ "%'").getResultList();
    }

    
    public Software getBySoftware(String software) {
       Query q = getEntityManager().createQuery("select s from Software s where s.nome"
                + " like '" + software + "'", Software.class);
        List<Software> softwares = q.getResultList();
        Software ts = new Software();
        for (Software t : softwares) {
            ts = t;
        }
        return ts;

    }
    
}
