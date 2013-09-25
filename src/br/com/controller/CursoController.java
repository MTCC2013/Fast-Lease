package br.com.controller;
import br.com.model.negocio.Curso;

import br.com.model.persistencia.CursoDAOImpl;
import br.com.model.persistencia.dao.CursoDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class CursoController {
    
    
     public boolean salvar(Curso curso) {
        CursoDAO dao = new CursoDAOImpl();
       return dao.save(curso);

    }

    public boolean excluir(int id) {
        CursoDAO dao = new CursoDAOImpl();
        return dao.remove(Curso.class, id);

    }
    
    public List<Curso> listarCurso() {
        CursoDAO dao = new CursoDAOImpl();
        return dao.getAll(Curso.class);
    }
    
    public Curso listarCursoById (int id){
        CursoDAO dao = new CursoDAOImpl();
        return dao.getById(Curso.class, id);
    }
    
   public List<Curso> listarByCurso (String curso){
        CursoDAO dao = new CursoDAOImpl();
        return dao.ListByCurso(curso);
    }
   
   public Curso getByCurso(String curso){
       CursoDAO dao = new CursoDAOImpl();
       return dao.getByCurso(curso);
   }
    
}
