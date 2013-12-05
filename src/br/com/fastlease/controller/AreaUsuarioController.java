/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.controller;

import br.com.fastlease.dao.AreaUsuarioDAO;
import br.com.fastlease.dao.AreaUsuarioDAOJDBC;
import br.com.fastlease.model.AreaUsuario;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class AreaUsuarioController {
    
     /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados
     * @param areausu
     */
    public void inserir(AreaUsuario areausu){
        AreaUsuarioDAO dao = new AreaUsuarioDAOJDBC();
        dao.inserir(areausu);        
    }
 
    /**
     * Método que liga o botão atualizar da interface gráfica com o método atualizar
     * do banco de dados
     * @param areausu
     */
    public void atualizar (AreaUsuario areausu){
        AreaUsuarioDAO dao = new AreaUsuarioDAOJDBC();
        dao.atualizar (areausu);
        
    }
    /**
     * Método que liga o botão remover da interface gráfica com o método remover
     * do banco de dados
     * @param areausu
     */
    public void excluir (int num){
        AreaUsuarioDAO dao = new AreaUsuarioDAOJDBC();
        dao.excluir (num);        
    }
    /**
     * Método que retorna os areausus cadastrados na base de
     * dados para preencher a tabela presente na view
     * @return lista de areausus
     */
    public List<AreaUsuario> buscarAreaUsuario(){
        AreaUsuarioDAO dao = new AreaUsuarioDAOJDBC();
        return dao.getAreaUsuario();
    }
     /**
     * Método que retorna os areausus cadastrados na base de
     * dados para pesquisar um areausu por num
     * @return lista de areausus
     */
    public List<AreaUsuario> buscarAreaUsuariobyNome(String nome){
      AreaUsuarioDAO dao = new AreaUsuarioDAOJDBC();
       return dao. getAreaUsuariobyNome(nome);
    }
             
    public AreaUsuario buscarAreaUsuariobyId(Integer codigo){
        AreaUsuarioDAO dao = new AreaUsuarioDAOJDBC();
        return dao.getAreaById(codigo);
    }
    public AreaUsuario buscarAreaUsuariobyNom(String nome){
        AreaUsuarioDAO dao = new AreaUsuarioDAOJDBC();
        return dao.getAreaByNom(nome);
    }
    
}
