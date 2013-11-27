package br.com.fastlease.dao;

import br.com.fastlease.model.Arquetipo;
import java.util.List;

/**
 * Interface que contém os métodos para acesso a entidade arquetipo da base de dados 
 * @author Mauricio Cardoso
 * @version 1.0, 19/05/13
 */
public interface ArquetipoDAO{

    /**
     * Método que faz a inserção de uma nova pessoa na base de dados
     * @param arquetipo
     */
    void inserir(Arquetipo arquetipo);

    /**
     * Método que atualiza uma pessoa na base de dados
     * @param arquetipo
     */
    void atualizar(Arquetipo arquetipo);

    /**
     * Método que remove uma pessoa da base de dados
     * @param arquetipo
     */
    void remover(int id);

    /**
     * Método que lista todas as pessoas da base de dados
     * @return arquetipo
     */
    List<Arquetipo> getArquetipo();

    /**
     * Método que filtra a lista de pessoas pelo nome na base de dados
     * @param nome
     * @return arquetipo
     */
    List<Arquetipo> getArquetipobyNome(String nome);

    /**
     * Método que filtra a lista de pessoas pelo id na base de dados
     * @param id
     * @return arquetipo
     */
    Arquetipo getArquetipobyId(Integer id);
    
    Arquetipo getArquetipobyNom(String nome);

    
       
}
