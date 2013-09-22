package br.com.controller;
import br.com.model.negocio.TipoSala;

import br.com.model.persist.TipoSalaDAOImpl;
import br.com.model.persist.dao.TipoSalaDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class TipoSalaController {
    
    
     public boolean salvar(TipoSala tiposala) {
        TipoSalaDAO dao = new TipoSalaDAOImpl();
       return dao.save(tiposala);

    }

    public boolean excluir(int id) {
        TipoSalaDAO dao = new TipoSalaDAOImpl();
        return dao.remove(TipoSala.class, id);

    }
    
    public List<TipoSala> listarTipoSala() {
        TipoSalaDAO dao = new TipoSalaDAOImpl();
        return dao.getAll(TipoSala.class);
    }
    
    public TipoSala listarTipoSalaById (int id){
        TipoSalaDAO dao = new TipoSalaDAOImpl();
        return dao.getById(TipoSala.class, id);
    }
    
   public List<TipoSala> listarByTipoSala (String tiposala){
        TipoSalaDAO dao = new TipoSalaDAOImpl();
        return dao.ListByTipoSala(tiposala);
    }
   
   public TipoSala getByTipoSala(String tiposala){
       TipoSalaDAO dao = new TipoSalaDAOImpl();
       return dao.getByTipoSala(tiposala);
   }
    
}
