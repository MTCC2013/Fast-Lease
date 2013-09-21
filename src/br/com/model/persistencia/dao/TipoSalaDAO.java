/*
 * Interface DAO do TipoSala, onde são predefinidos os métodos que seram implementados
 * na classe TipoSalaDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe TipoSala
import br.com.senai.model.negocio.TipoSala;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface TipoSalaDAO  extends DAO<TipoSala, Integer>{
    
    //Listar todos os tipo de salas inseridos na tabela
    List<TipoSala> ListByTipoSala (String tiposala);
    
    //Pesquisar um tipo de sala
    TipoSala getByTipoSala(String tiposala);
    
}
