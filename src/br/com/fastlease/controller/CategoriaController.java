/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.controller;

import br.com.fastlease.dao.CategoriaDAO;
import br.com.fastlease.dao.CategoriaDAOJDBC;
import br.com.fastlease.model.Categoria;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class CategoriaController {
    
     /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados
     * @param categoria
     */
    public void inserir(Categoria categoria){
        CategoriaDAO dao = new CategoriaDAOJDBC();
        dao.inserir(categoria);        
    }
 
    /**
     * Método que liga o botão atualizar da interface gráfica com o método atualizar
     * do banco de dados
     * @param categoria
     */
    public void atualizar (Categoria categoria){
        CategoriaDAO dao = new CategoriaDAOJDBC();
        dao.atualizar (categoria);
        
    }
    /**
     * Método que liga o botão remover da interface gráfica com o método remover
     * do banco de dados
     * @param categoria
     */
    public void excluir (int num){
        CategoriaDAO dao = new CategoriaDAOJDBC();
        dao.excluir (num);        
    }
    /**
     * Método que retorna os categorias cadastrados na base de
     * dados para preencher a tabela presente na view
     * @return lista de categorias
     */
    public List<Categoria> buscarCategoria(){
        CategoriaDAO dao = new CategoriaDAOJDBC();
        return dao.getCategoria();
    }
     /**
     * Método que retorna os categorias cadastrados na base de
     * dados para pesquisar um categoria por num
     * @return lista de categorias
     */
    public List<Categoria> buscarCategoriabyNome(String nome){
      CategoriaDAO dao = new CategoriaDAOJDBC();
       return dao. getCategoriabyNome(nome);
    }
     /**
     * Método que retorna os categorias cadastrados na base de
     * dados para preencher os campos de edição
     * @return lista de categorias
     */
    public Categoria buscarCategoriabyId(Integer codigo){
        CategoriaDAO dao = new CategoriaDAOJDBC();
        return dao.getCategoriabyId(codigo);
    }
    
     public Categoria buscarCategoriabyNom(String nome){
        CategoriaDAO dao = new CategoriaDAOJDBC();
        return dao.getCategoriabyNom(nome);
    }
    
}
