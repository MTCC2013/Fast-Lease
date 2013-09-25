package br.com.controller;
import br.com.model.negocio.Grau;

import br.com.model.persistencia.GrauTurmaDAOImpl;
import br.com.model.persistencia.dao.GrauTurmaDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class GrauTurmaController {
    
    
     public boolean salvar(Grau grauturma) {
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
       return dao.save(grauturma);

    }

    public boolean excluir(int id) {
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
        return dao.remove(Grau.class, id);

    }
    
    public List<Grau> listarGrauTurma() {
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
        return dao.getAll(Grau.class);
    }
    
    public Grau listarGrauTurmaById (int id){
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
        return dao.getById(Grau.class, id);
    }
    
   public List<Grau> listarByGrauTurma (String grauturma){
        GrauTurmaDAO dao = new GrauTurmaDAOImpl();
        return dao.ListByGrauTurma(grauturma);
    }
   
   public Grau getByGrauTurma(String grauturma){
       GrauTurmaDAO dao = new GrauTurmaDAOImpl();
       return dao.getByGrauTurma(grauturma);
   }
    
}
