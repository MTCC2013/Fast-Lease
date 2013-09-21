/*
 * Interface DAO do AreaProfessor, onde são predefinidos os métodos que seram implementados
 * na classe AreaProfessorDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe AreaProfessor
import br.com.senai.model.negocio.AreaProfessor;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface AreaProfessorDAO  extends DAO<AreaProfessor, Integer>{
    
    //Listar todos as areas dos professors inseridos na tabela
    List<AreaProfessor> ListByAreaProfessor (String areaprofessor);
    
    //Pesquisar a area de um professor
    AreaProfessor getByAreaProfessor(String areaprofessor);
    
}
