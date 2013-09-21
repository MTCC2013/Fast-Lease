/*
 * Interface DAO Salas, onde são predefinidos os métodos que seram implementados
 * na classe SalaDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe Sala
import br.com.senai.model.negocio.Sala;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface SalaDAO  extends DAO<Sala, Integer>{
    
    //Listar todas as salas inseridas na tabela
    List<Sala> ListBySala (String sala);
    
    //Pesquisar uma sala 
    Sala getBySala(String sala);
    
}
