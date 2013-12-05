/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.dao;


import br.com.fastlease.model.Categoria;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public interface CategoriaDAO {
    
     /**
     * Método de que faz a inserção de um categoria na base de dados.
     * @param categoria 
     */
    void inserir(Categoria categoria);
    /**
     * Método que atualiza um categoria na base de dados
     * @param categoria
     */
    void atualizar (Categoria categoria);
    
    /**
     * Método remove um categoria na base de dados
     * @param codigo
     */
    void excluir (int codigo);
    
    /**
     * Método que busca um categoria na base de dados
     * @return Array List Categoria
     */
    List<Categoria> getCategoria();
    
    /**
     * metodo que busca um categoria pelo numero
     * @param num
     * @return Array List Categoria 
     */
    List<Categoria> getCategoriabyNome(String nome);  
    
    /**
     * metodo que busca um categoria pelo codigo
     * @param codigo
     * @return Array List Categoria
     */
    Categoria getCategoriabyId(Integer codigo);
    
    Categoria getCategoriabyNom(String nome);
}
