package br.com.model.persist.dao;

import br.com.model.negocio.Software;


import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface SoftwareDAO  extends DAO<Software, Integer>{
    
   
    List<Software> ListBySoftware (String software);
    
    Software getBySoftware(String software);
    
}
