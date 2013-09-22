package br.com.controller;
import br.com.model.negocio.Usuario;

import br.com.model.persist.UsuarioDAOImpl;
import br.com.model.persist.dao.UsuarioDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class UsuarioController {
    
    
     public boolean salvar(Usuario usuario) {
        UsuarioDAO dao = new UsuarioDAOImpl();
       return dao.save(usuario);

    }

    public boolean excluir(int id) {
        UsuarioDAO dao = new UsuarioDAOImpl();
        return dao.remove(Usuario.class, id);

    }
    
    public List<Usuario> listarUsuario() {
        UsuarioDAO dao = new UsuarioDAOImpl();
        return dao.getAll(Usuario.class);
    }
    
    public Usuario listarUsuarioById (int id){
        UsuarioDAO dao = new UsuarioDAOImpl();
        return dao.getById(Usuario.class, id);
    }
    
   public List<Usuario> listarByUsuario (String usuario){
        UsuarioDAO dao = new UsuarioDAOImpl();
        return dao.ListByUsuario(usuario);
    }
   
   public Usuario getByUsuario(String usuario){
       UsuarioDAO dao = new UsuarioDAOImpl();
       return dao.getByUsuario(usuario);
   }
    
}
