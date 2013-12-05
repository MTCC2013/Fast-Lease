/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.controller;

import br.com.fastlease.dao.CursoDAO;
import br.com.fastlease.dao.CursoDAOJDBC;
import br.com.fastlease.model.Curso;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class CursoController {
    
     /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados
     * @param curso
     */
    public void inserir(Curso curso){
        CursoDAO dao = new CursoDAOJDBC();
        dao.inserir(curso);        
    }
 
    /**
     * Método que liga o botão atualizar da interface gráfica com o método atualizar
     * do banco de dados
     * @param curso
     */
    public void atualizar (Curso curso){
        CursoDAO dao = new CursoDAOJDBC();
        dao.atualizar (curso);
        
    }
    /**
     * Método que liga o botão remover da interface gráfica com o método remover
     * do banco de dados
     * @param curso
     */
    public void excluir (int num){
        CursoDAO dao = new CursoDAOJDBC();
        dao.excluir (num);        
    }
    /**
     * Método que retorna os cursos cadastrados na base de
     * dados para preencher a tabela presente na view
     * @return lista de cursos
     */
    public List<Curso> buscarCurso(){
        CursoDAO dao = new CursoDAOJDBC();
        return dao.getCurso();
    }
    /**
     * Método que retorna os cursos cadastrados na base de
     * dados para pesquisar um curso por num
     * @return lista de cursos
     */
    public List<Curso> buscarCursobyNome(String nome){
      CursoDAO dao = new CursoDAOJDBC();
       return dao. getCursobyNome(nome);
    }
     /**
     * Método que retorna os cursos cadastrados na base de
     * dados para preencher os campos de edição
     * @return lista de cursos
     */
    public Curso buscarCursobyId(Integer codigo){
        CursoDAO dao = new CursoDAOJDBC();
        return dao.getCursobyId(codigo);
    }
    
    public Curso buscarCursobyNom(String nome){
        CursoDAO dao = new CursoDAOJDBC();
        return dao.getCursobyNom(nome);
    }
    
    
}
