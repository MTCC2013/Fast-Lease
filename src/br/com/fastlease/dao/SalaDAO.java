package br.com.fastlease.dao;

import br.com.senai.model.Sala;
import java.util.ArrayList;
import java.util.List;

/**
 * Interface que contém os métodos para acesso a entidade sala da base de dados 
 * @author Mauricio Cardoso
 * @version 1.0, 19/05/13
 */
public interface SalaDAO{

    /**
     * Método que faz a inserção de uma nova pessoa na base de dados
     * @param sala
     */
    void inserir(Sala sala);

    /**
     * Método que atualiza uma pessoa na base de dados
     * @param sala
     */
    void atualizar(Sala sala);

    /**
     * Método que remove uma pessoa da base de dados
     * @param sala
     */
    void remover(int id);

    /**
     * Método que lista todas as pessoas da base de dados
     * @return sala
     */
    List<Sala> getSala();

    /**
     * Método que filtra a lista de pessoas pelo nome na base de dados
     * @param nome
     * @return sala
     */
    List<Sala> getSalabyNome(String nome);

    /**
     * Método que filtra a lista de pessoas pelo id na base de dados
     * @param id
     * @return sala
     */
    Sala getSalabyId(Integer id);
    
       
}
