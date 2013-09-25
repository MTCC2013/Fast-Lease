package br.com.model.persistencia;

import br.com.model.negocio.Usuario;
import br.com.model.persistencia.dao.UsuarioDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class UsuarioDAOImpl extends DAOImpl<Usuario, Integer> implements UsuarioDAO{

    
    public List<Usuario> ListByUsuario(String usuario) {
        return getEntityManager().createQuery("select u from Usuario u where u.nome '%" +usuario+ "%'").getResultList();
    }

    
    public Usuario getByUsuario(String usuario) {
       Query q = getEntityManager().createQuery("select s from Usuario s where s.nome"
                + " like '" + usuario + "'", Usuario.class);
        List<Usuario> usuarios = q.getResultList();
        Usuario us = new Usuario();
        for (Usuario s : usuarios) {
            us = s;
        }
        return us;

    }
    
}
