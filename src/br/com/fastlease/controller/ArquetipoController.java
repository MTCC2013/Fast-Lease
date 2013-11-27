//Pacote controller
package br.com.fastlease.controller;
//Importações
import br.com.fastlease.dao.*;
import br.com.senai.fastlease.Arquetipo;
import java.util.List;

/**
 * classe responsável por fazer a ligação entre a pessoaDAO e a interface;
 *
 * @author Mauricio Cardoso
 * @version 1.0, 21/05/13
 */
public class ArquetipoController{

    /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados.
     *
     * @param arquetipo
     */
    public void inserir(Arquetipo arquetipo) {
        ArquetipoDAO dao = new ArquetipoDAOJDBC();
        dao.inserir(arquetipo);
    }

    /**
     * Método que liga o botão atualizar da interface gráfica com o método
     * atualizar do banco de dados.
     *
     * @param arquetipo
     */
    public void atualizar(Arquetipo arquetipo) {
        ArquetipoDAO dao = new ArquetipoDAOJDBC();
        dao.atualizar(arquetipo);
    }

    /**
     * Método que liga o botão atualizar da interface gráfica com o método
     * atualizar do banco de dados.
     *
     * @param arquetipo
     */
    public void remover(int id) {
        ArquetipoDAO dao = new ArquetipoDAOJDBC();
        dao.remover(id);
    }

    /**
     * Métodoque retorna os arquetipos cadastrados na base de dados para
     * preencher a tabela contidos na view
     *
     * @return arquetipo
     */
    public List<Arquetipo> buscarArquetipo() {
        ArquetipoDAO dao = new ArquetipoDAOJDBC();
        return dao.getArquetipo();
    }

    /**
     * Método retorna os arquetipos cadastrados na base de dados para
     * preencher a tabela contidos na view pelo nome
     *
     * @param nome
     * @return ArquetipobyNome
     */
    public List<Arquetipo> buscarArquetipobyNome(String nome) {
        ArquetipoDAO dao = new ArquetipoDAOJDBC();
        return dao.getArquetipobyNome(nome);
    }

    /**
     * retorna os arquetipos cadastrados na base de dados para preencher a
     * tabela contidos na view pelo id
     *
     * @param id
     * @return arquetipo
     */
    public Arquetipo buscarArquetipobyId(Integer id) {
        ArquetipoDAO dao = new ArquetipoDAOJDBC();
        return (Arquetipo) dao.getArquetipobyId(id);
    }
     public Arquetipo buscarArquetipobyNom(String nome) {
        ArquetipoDAO dao = new ArquetipoDAOJDBC();
        return (Arquetipo) dao.getArquetipobyNom(nome);
    }
    
         
}

