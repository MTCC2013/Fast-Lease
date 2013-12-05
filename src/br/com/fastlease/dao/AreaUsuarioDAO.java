/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.dao;


import br.com.fastlease.model.AreaUsuario;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public interface AreaUsuarioDAO {
    
     /**
     * Método de que faz a inserção de um usuario na base de dados.
     * @param usuario 
     */
    void inserir(AreaUsuario usuario);
    /**
     * Método que atualiza um usuario na base de dados
     * @param usuario
     */
    void atualizar (AreaUsuario usuario);
    
    /**
     * Método remove um usuario na base de dados
     * @param codigo
     */
    void excluir (int codigo);
    
    /**
     * Método que busca um usuario na base de dados
     * @return Array List AreaUsuario
     */
    List<AreaUsuario> getAreaUsuario();
    
    /**
     * metodo que busca um usuario pelo numero
     * @param num
     * @return Array List AreaUsuario 
     */
    
    AreaUsuario getAreaById(Integer codigo);
    
    List<AreaUsuario> getAreaUsuariobyNome(String nome); 
    
    AreaUsuario getAreaByNom(String nome);
    
   
}
