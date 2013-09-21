/*
 * Interface DAO Particularidade, onde são predefinidos os métodos que seram implementados
 * na classe ParticularidadeDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe Particularidade
import br.com.senai.model.negocio.Particularidade;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface PartcularidadeDAO  extends DAO<Particularidade, Integer>{
    
    //Listar todas as particularidades inseridas na tabela
    List<Particularidade> ListByParticularidade (String particularidade);
    
    //Pesquisar uma particularidade 
    Particularidade getByParticularidade(String particularidade);
    
}
