package br.com.controller;
import br.com.model.negocio.GrauTurma;

import br.com.model.persist.GrauTurmaDAOImpl;
import br.com.model.persist.dao.GrauTurmaDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class GrauTurmaController {
    
    
     public boolean salvar(GrauTurma grauturma) {
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
       return dao.save(grauturma);

    }

    public boolean excluir(int id) {
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
        return dao.remove(GrauTurma.class, id);

    }
    
    public List<GrauTurma> listarGrauTurma() {
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
        return dao.getAll(GrauTurma.class);
    }
    
    public GrauTurma listarGrauTurmaById (int id){
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
        return dao.getById(GrauTurma.class, id);
    }
    
   public List<GrauTurma> listarByGrauTurma (String grauturma){
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
        return dao.ListByGrauTurma(grauturma);
    }
   
   public GrauTurma getByGrauTurma(String grauturma){
       GrauTurmaDAO dao = new GrauTurmaDAOImpl();
       return dao.getByGrauTurma(grauturma);
   }
    
}
