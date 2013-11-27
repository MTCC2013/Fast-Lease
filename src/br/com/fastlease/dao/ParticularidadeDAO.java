package br.com.fastlease.dao;

import br.com.senai.model.Particularidade;
import java.util.List;

/**
 * Interface que contém os métodos para acesso a entidade particularidade da base de dados 
 * @author Mauricio Cardoso
 * @version 1.0, 19/05/13
 */
public interface ParticularidadeDAO{

    /**
     * Método que faz a inserção de uma nova pessoa na base de dados
     * @param particularidade
     */
    void inserir(Particularidade particularidade);

    /**
     * Método que atualiza uma pessoa na base de dados
     * @param particularidade
     */
    void atualizar(Particularidade particularidade);

    /**
     * Método que remove uma pessoa da base de dados
     * @param particularidade
     */
    void remover(int id);

    /**
     * Método que lista todas as pessoas da base de dados
     * @return particularidade
     */
    List<Particularidade> getParticularidade();

    /**
     * Método que filtra a lista de pessoas pelo nome na base de dados
     * @param nome
     * @return particularidade
     */
    List<Particularidade> getParticularidadebyNome(String nome);

    /**
     * Método que filtra a lista de pessoas pelo id na base de dados
     * @param id
     * @return particularidade
     */
    Particularidade getParticularidadebyId(Integer id);
    
       
}
