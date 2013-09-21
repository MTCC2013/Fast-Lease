/*
 * Interface DAO Softwares, onde são predefinidos os métodos que seram implementados
 * na classe SoftwareDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe Software
import br.com.senai.model.negocio.Software;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface SoftwareDAO  extends DAO<Software, Integer>{
    
    //Listar todas os softwares inseridos na tabela
    List<Software> ListBySoftware (String software);
    
    //Pesquisar uma software 
    Software getBySoftware(String software);
    
}
