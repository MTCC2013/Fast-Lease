/*
 * Interface DAO Cursos, onde são predefinidos os métodos que seram implementados
 * na classe CursoDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe Curso
import br.com.senai.model.negocio.Curso;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface CursoDAO  extends DAO<Curso, Integer>{
    
    //Listar todas os cursos na tabela
    List<Curso> ListByCurso (String curso);
    
    //Pesquisar um curso 
    Curso getByCurso(String curso);
    
}
