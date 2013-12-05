package br.com.fastlease.dao;

import br.com.fastlease.model.Usuario;
import java.util.List;

/**
 *Interface que contém os métodos para acesso a entidade
 * pessoa da base de dados
 * @author antonio_sj
 * @version 1.0, 18/05/13
 */
public interface UsuarioDAO {
    /**
     * Mátodo que faz a inserção de uma nova pessoa na base de dados
     * @param usuario 
     */
    void inserir (Usuario usuario);
    
    /**
     * Método que atualiza uma pessoa na base de dados
     * @param usuario 
     */
    void atualizar (Usuario usuario);
    
    /**
     * Método remove uma pessoa na base de dados
     * @param usuario
     */
    void excluir (int codigo);
    
    /**
     * Método que busca uma pessoa na base de dados
     * @return Array List Pessoa
     */
    List<Usuario> getUsuario();
    
    /**
     * metodo que busca uma pessoa pelo nome
     * @param nome
     * @return 
     */
    List<Usuario> getUsuariobyNome(String nome);    
     /**
      * metodo que busca uma pessoa pelo codigo
      * @param codigo
      * @return 
      */
    Usuario getUsuariobyId(Integer codigo);
    
    Usuario getUsuariobyNom(String nome);
    
    boolean validaLogin(String login, String senha);
    
}
