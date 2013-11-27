package br.com.fastlease.dao;

import br.com.senai.model.Arquetipo;
import br.com.senai.model.Bloco;
import java.util.ArrayList;
import java.util.List;

/**
 * Interface que contém os métodos para acesso a entidade bloco da base de dados 
 * @author Mauricio Cardoso
 * @version 1.0, 19/05/13
 */
public interface BlocoDAO{

    /**
     * Método que faz a inserção de uma nova pessoa na base de dados
     * @param bloco
     */
    void inserir(Bloco bloco);

    /**
     * Método que atualiza uma pessoa na base de dados
     * @param bloco
     */
    void atualizar(Bloco bloco);

    /**
     * Método que remove uma pessoa da base de dados
     * @param bloco
     */
    void remover(int id);

    /**
     * Método que lista todas as pessoas da base de dados
     * @return bloco
     */
    List<Bloco> getBloco();

    /**
     * Método que filtra a lista de pessoas pelo nome na base de dados
     * @param nome
     * @return bloco
     */
    List<Bloco> getBlocobyNome(String nome);

    /**
     * Método que filtra a lista de pessoas pelo id na base de dados
     * @param id
     * @return bloco
     */
    Bloco getBlocobyId(Integer id);
    
    Bloco getBlocobyNom(String nome);
       
}
