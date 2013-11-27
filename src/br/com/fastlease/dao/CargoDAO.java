/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.dao;


import br.com.model.negocio.Cargo;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public interface CargoDAO {
    
     /**
     * Método de que faz a inserção de um cargo na base de dados.
     * @param cargo 
     */
    void inserir(Cargo cargo);
    /**
     * Método que atualiza um cargo na base de dados
     * @param cargo
     */
    void atualizar (Cargo cargo);
    
    /**
     * Método remove um cargo na base de dados
     * @param codigo
     */
    void excluir (int codigo);
    
    /**
     * Método que busca um cargo na base de dados
     * @return Array List Cargo
     */
    List<Cargo> getCargo();
    
    /**
     * metodo que busca um cargo pelo numero
     * @param num
     * @return Array List Cargo 
     */
    List<Cargo> getCargobyNome(String nome);  
    
    /**
     * metodo que busca um cargo pelo codigo
     * @param codigo
     * @return Array List Cargo
     */
    Cargo getCargobyId(Integer codigo);
    
    Cargo getCargobyNom(String nome);
    
    
}
