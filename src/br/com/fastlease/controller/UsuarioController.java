/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.controller;

import br.com.fastlease.dao.UsuarioDAO;
import br.com.fastlease.dao.UsuarioDAOJDBC;
import br.com.fastlease.model.Usuario;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class UsuarioController {
    
     /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados
     * @param usuario
     */
    public void inserir(Usuario usuario){
        UsuarioDAO dao = new UsuarioDAOJDBC();
        dao.inserir(usuario);        
    }
 
    /**
     * Método que liga o botão atualizar da interface gráfica com o método atualizar
     * do banco de dados
     * @param usuario
     */
    public void atualizar (Usuario usuario){
        UsuarioDAO dao = new UsuarioDAOJDBC();
        dao.atualizar (usuario);
        
    }
    /**
     * Método que liga o botão remover da interface gráfica com o método remover
     * do banco de dados
     * @param usuario
     */
    public void excluir (int num){
        UsuarioDAO dao = new UsuarioDAOJDBC();
        dao.excluir (num);        
    }
    /**
     * Método que retorna os usuarios cadastrados na base de
     * dados para preencher a tabela presente na view
     * @return lista de usuarios
     */
    public List<Usuario> buscarUsuario(){
        UsuarioDAO dao = new UsuarioDAOJDBC();
        return dao.getUsuario();
    }
    /**
     * Método que retorna os usuarios cadastrados na base de
     * dados para pesquisar um usuario por num
     * @return lista de usuarios
     */
    public List<Usuario> buscarUsuariobyNome(String nome){
      UsuarioDAO dao = new UsuarioDAOJDBC();
       return dao. getUsuariobyNome(nome);
    }
     /**
     * Método que retorna os usuarios cadastrados na base de
     * dados para preencher os campos de edição
     * @return lista de usuarios
     */
    public Usuario buscarUsuariobyId(Integer codigo){
        UsuarioDAO dao = new UsuarioDAOJDBC();
        return dao.getUsuariobyId(codigo);
    }
    
    public Usuario buscarUsuariobyNom(String nome){
        UsuarioDAO dao = new UsuarioDAOJDBC();
        return dao.getUsuariobyNom(nome);
    }
    
     public boolean validaLogin(String login, String senha) {
        UsuarioDAO dao = new UsuarioDAOJDBC();
        return dao.validaLogin(login, senha);
    }
}
