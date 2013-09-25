package br.com.controller;
import br.com.model.negocio.Software;

import br.com.model.persistencia.SoftwareDAOImpl;
import br.com.model.persistencia.dao.SoftwareDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class SoftwareController {
    
    
     public boolean salvar(Software software) {
        SoftwareDAO dao = new SoftwareDAOImpl();
       return dao.save(software);

    }

    public boolean excluir(int id) {
        SoftwareDAO dao = new SoftwareDAOImpl();
        return dao.remove(Software.class, id);

    }
    
    public List<Software> listarSoftware() {
        SoftwareDAO dao = new SoftwareDAOImpl();
        return dao.getAll(Software.class);
    }
    
    public Software listarSoftwareById (int id){
        SoftwareDAO dao = new SoftwareDAOImpl();
        return dao.getById(Software.class, id);
    }
    
   public List<Software> listarBySoftware (String software){
        SoftwareDAO dao = new SoftwareDAOImpl();
        return dao.ListBySoftware(software);
    }
   
   public Software getBySoftware(String software){
       SoftwareDAO dao = new SoftwareDAOImpl();
       return dao.getBySoftware(software);
   }
    
}
