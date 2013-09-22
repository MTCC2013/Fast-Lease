package br.com.controller;
import br.com.model.negocio.Particularidade;

import br.com.model.persist.ParticularidadeDAOImpl;
import br.com.model.persist.dao.ParticularidadeDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class ParticularidadeController {
    
    
     public boolean salvar(Particularidade particularidade) {
        ParticularidadeDAO dao = new ParticularidadeDAOImpl();
       return dao.save(particularidade);

    }

    public boolean excluir(int id) {
        ParticularidadeDAO dao = new ParticularidadeDAOImpl();
        return dao.remove(Particularidade.class, id);

    }
    
    public List<Particularidade> listarParticularidade() {
        ParticularidadeDAO dao = new ParticularidadeDAOImpl();
        return dao.getAll(Particularidade.class);
    }
    
    public Particularidade listarParticularidadeById (int id){
        ParticularidadeDAO dao = new ParticularidadeDAOImpl();
        return dao.getById(Particularidade.class, id);
    }
    
   public List<Particularidade> listarByParticularidade (String particularidade){
        ParticularidadeDAO dao = new ParticularidadeDAOImpl();
        return dao.ListByParticularidade(particularidade);
    }
   
   public Particularidade getByParticularidade(String particularidade){
       ParticularidadeDAO dao = new ParticularidadeDAOImpl();
       return dao.getByParticularidade(particularidade);
   }
    
}
