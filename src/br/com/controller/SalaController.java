package br.com.controller;
import br.com.model.negocio.Sala;

import br.com.model.persist.SalaDAOImpl;
import br.com.model.persist.dao.SalaDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class SalaController {
    
    
     public boolean salvar(Sala sala) {
        SalaDAO dao = new SalaDAOImpl();
       return dao.save(sala);

    }

    public boolean excluir(int id) {
        SalaDAO dao = new SalaDAOImpl();
        return dao.remove(Sala.class, id);

    }
    
    public List<Sala> listarSala() {
        SalaDAO dao = new SalaDAOImpl();
        return dao.getAll(Sala.class);
    }
    
    public Sala listarSalaById (int id){
        SalaDAO dao = new SalaDAOImpl();
        return dao.getById(Sala.class, id);
    }
    
   public List<Sala> listarBySala (String sala){
        SalaDAO dao = new SalaDAOImpl();
        return dao.ListBySala(sala);
    }
   
   public Sala getBySala(String sala){
       SalaDAO dao = new SalaDAOImpl();
       return dao.getBySala(sala);
   }
    
}
