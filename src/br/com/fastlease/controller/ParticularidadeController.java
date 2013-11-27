//Pacote controller
package br.com.fastlease.controller;
//Importações
import br.com.senai.dao.*;
import br.com.senai.model.Particularidade;
import java.util.List;

/**
 * classe responsável por fazer a ligação entre a pessoaDAO e a interface;
 *
 * @author Mauricio Cardoso
 * @version 1.0, 21/05/13
 */
public class ParticularidadeController{

    /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados.
     *
     * @param particularidade
     */
    public void inserir(Particularidade particularidade) {
        ParticularidadeDAO dao = new ParticularidadeDAOJDBC();
        dao.inserir(particularidade);
    }

    /**
     * Método que liga o botão atualizar da interface gráfica com o método
     * atualizar do banco de dados.
     *
     * @param particularidade
     */
    public void atualizar(Particularidade particularidade) {
        ParticularidadeDAO dao = new ParticularidadeDAOJDBC();
        dao.atualizar(particularidade);
    }

    /**
     * Método que liga o botão atualizar da interface gráfica com o método
     * atualizar do banco de dados.
     *
     * @param particularidade
     */
    public void remover(int id) {
        ParticularidadeDAO dao = new ParticularidadeDAOJDBC();
        dao.remover(id);
    }

    /**
     * Métodoque retorna os particularidades cadastrados na base de dados para
     * preencher a tabela contidos na view
     *
     * @return particularidade
     */
    public List<Particularidade> buscarParticularidade() {
        ParticularidadeDAO dao = new ParticularidadeDAOJDBC();
        return dao.getParticularidade();
    }

    /**
     * Método retorna os particularidades cadastrados na base de dados para
     * preencher a tabela contidos na view pelo nome
     *
     * @param nome
     * @return ParticularidadebyNome
     */
    public List<Particularidade> buscarParticularidadebyNome(String nome) {
        ParticularidadeDAO dao = new ParticularidadeDAOJDBC();
        return dao.getParticularidadebyNome(nome);
    }

    /**
     * retorna os particularidades cadastrados na base de dados para preencher a
     * tabela contidos na view pelo id
     *
     * @param id
     * @return particularidade
     */
    public Particularidade buscarParticularidadebyId(Integer id) {
        ParticularidadeDAO dao = new ParticularidadeDAOJDBC();
        return (Particularidade) dao.getParticularidadebyId(id);
    }
    
    
}

