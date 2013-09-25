package br.com.model.persistencia;

import br.com.model.negocio.Sala;
import br.com.model.persistencia.dao.SalaDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class SalaDAOImpl extends DAOImpl<Sala, Integer> implements SalaDAO{

    
    public List<Sala> ListBySala(String sala) {
        return getEntityManager().createQuery("select s from Sala s where s.nome '%" +sala+ "%'").getResultList();
    }

    
    public Sala getBySala(String sala) {
       Query q = getEntityManager().createQuery("select s from Sala s where s.nome"
                + " like '" + sala + "'", Sala.class);
        List<Sala> salas = q.getResultList();
        Sala sa = new Sala();
        for (Sala m : salas) {
            sa = m;
        }
        return sa;

    }
    
}
