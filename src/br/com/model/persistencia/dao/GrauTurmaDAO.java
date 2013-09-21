/*
 * Interface DAO do GrauTurma, onde são predefinidos os métodos que seram implementados
 * na classe GrauTurmaDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe GrauTurma
import br.com.senai.model.negocio.GrauTurma;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface GrauTurmaDAO  extends DAO<GrauTurma, Integer>{
    
    //Listar todos os graus de turma inseridos na tabela
    List<GrauTurma> ListByGrauTurma (String grau);
    
    //Pesquisar um grau
    GrauTurma getByGrauTurma(String grau);
    
}
