package br.com.fastlease.dao;

import br.com.fastlease.model.Curso;
import java.util.List;

/**
 *Interface que contém os métodos para acesso a entidade
 * pessoa da base de dados
 * @author antonio_sj
 * @version 1.0, 18/05/13
 */
public interface CursoDAO {
    /**
     * Mátodo que faz a inserção de uma nova pessoa na base de dados
     * @param curso 
     */
    void inserir (Curso curso);
    
    /**
     * Método que atualiza uma pessoa na base de dados
     * @param curso 
     */
    void atualizar (Curso curso);
    
    /**
     * Método remove uma pessoa na base de dados
     * @param curso
     */
    void excluir (int codigo);
    
    /**
     * Método que busca uma pessoa na base de dados
     * @return Array List Pessoa
     */
    List<Curso> getCurso();
    
    /**
     * metodo que busca uma pessoa pelo nome
     * @param nome
     * @return 
     */
    List<Curso> getCursobyNome(String nome);    
     /**
      * metodo que busca uma pessoa pelo codigo
      * @param codigo
      * @return 
      */
    Curso getCursobyId(Integer codigo);
    
    Curso getCursobyNom(String nome);
    
}
