package br.com.model.persistencia;

import br.com.model.negocio.AreaUsuario;
import br.com.model.persistencia.dao.AreaUsuarioDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class AreaUsuarioDAOImpl extends DAOImpl<AreaUsuario, Integer> implements AreaUsuarioDAO{

    
    public List<AreaUsuario> ListByAreaUsuario(String areausuario) {
        return getEntityManager().createQuery("select u from AreaUsuario u where u.nome '%" +areausuario+ "%'").getResultList();
    }

    
    public AreaUsuario getByAreaUsuario(String areausuario) {
       Query q = getEntityManager().createQuery("select s from AreaUsuario s where s.nome"
                + " like '" + areausuario + "'", AreaUsuario.class);
        List<AreaUsuario> areausuarios = q.getResultList();
        AreaUsuario au = new AreaUsuario();
        for (AreaUsuario a : areausuarios) {
            au = a;
        }
        return au;

    }
    
}
