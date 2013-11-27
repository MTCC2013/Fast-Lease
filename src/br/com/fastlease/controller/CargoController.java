/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.controller;

import br.com.fastlease.dao.CargoDAO;
import br.com.fastlease.dao.CargoDAOJDBC;
import br.com.model.negocio.Cargo;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class CargoController {
    
     /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados
     * @param cargo
     */
    public void inserir(Cargo cargo){
        CargoDAO dao = new CargoDAOJDBC();
        dao.inserir(cargo);        
    }
 
    /**
     * Método que liga o botão atualizar da interface gráfica com o método atualizar
     * do banco de dados
     * @param cargo
     */
    public void atualizar (Cargo cargo){
        CargoDAO dao = new CargoDAOJDBC();
        dao.atualizar (cargo);
        
    }
    /**
     * Método que liga o botão remover da interface gráfica com o método remover
     * do banco de dados
     * @param cargo
     */
    public void excluir (int num){
        CargoDAO dao = new CargoDAOJDBC();
        dao.excluir (num);        
    }
    /**
     * Método que retorna os cargos cadastrados na base de
     * dados para preencher a tabela presente na view
     * @return lista de cargos
     */
    public List<Cargo> buscarCargo(){
        CargoDAO dao = new CargoDAOJDBC();
        return dao.getCargo();
    }
     /**
     * Método que retorna os cargos cadastrados na base de
     * dados para pesquisar um cargo por num
     * @return lista de cargos
     */
    public List<Cargo> buscarCargobyNome(String nome){
      CargoDAO dao = new CargoDAOJDBC();
       return dao. getCargobyNome(nome);
    }
     /**
     * Método que retorna os cargos cadastrados na base de
     * dados para preencher os campos de edição
     * @return lista de cargos
     */
    public Cargo buscarCargobyId(Integer codigo){
        CargoDAO dao = new CargoDAOJDBC();
        return dao.getCargobyId(codigo);
    }
    
    public Cargo buscarCargobyNom(String nome){
        CargoDAO dao = new CargoDAOJDBC();
        return dao.getCargobyNom(nome);
    }
    
}
