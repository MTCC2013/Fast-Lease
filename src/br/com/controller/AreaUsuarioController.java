package br.com.controller;
import br.com.model.negocio.AreaUsuario;

import br.com.model.persistencia.AreaUsuarioDAOImpl;
import br.com.model.persistencia.dao.AreaUsuarioDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class AreaUsuarioController {
    
    
     public boolean salvar(AreaUsuario areausuario) {
        AreaUsuarioDAO dao = new AreaUsuarioDAOImpl();
       return dao.save(areausuario);

    }

    public boolean excluir(int id) {
        AreaUsuarioDAO dao = new AreaUsuarioDAOImpl();
        return dao.remove(AreaUsuario.class, id);

    }
    
    public List<AreaUsuario> listarAreaUsuario() {
        AreaUsuarioDAO dao = new AreaUsuarioDAOImpl();
        return dao.getAll(AreaUsuario.class);
    }
    
    public AreaUsuario listarAreaUsuarioById (int id){
        AreaUsuarioDAO dao = new AreaUsuarioDAOImpl();
        return dao.getById(AreaUsuario.class, id);
    }
    
   public List<AreaUsuario> listarByAreaUsuario (String areausuario){
        AreaUsuarioDAO dao = new AreaUsuarioDAOImpl();
        return dao.ListByAreaUsuario(areausuario);
    }
   
   public AreaUsuario getByAreaUsuario(String areausuario){
       AreaUsuarioDAO dao = new AreaUsuarioDAOImpl();
       return dao.getByAreaUsuario(areausuario);
   }
    
}
