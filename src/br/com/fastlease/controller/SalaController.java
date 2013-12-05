//Pacote controller
package br.com.fastlease.controller;
//Importações
import br.com.fastlease.dao.*;
import br.com.fastlease.model.Sala;
import java.util.List;

/**
 * classe responsável por fazer a ligação entre a pessoaDAO e a interface;
 *
 * @author Mauricio Cardoso
 * @version 1.0, 21/05/13
 */
public class SalaController{

    /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados.
     *
     * @param sala
     */
    public void inserir(Sala sala) {
        SalaDAO dao = new SalaDAOJDBC();
        dao.inserir(sala);
    }

    /**
     * Método que liga o botão atualizar da interface gráfica com o método
     * atualizar do banco de dados.
     *
     * @param sala
     */
    public void atualizar(Sala sala) {
        SalaDAO dao = new SalaDAOJDBC();
        dao.atualizar(sala);
    }

    /**
     * Método que liga o botão atualizar da interface gráfica com o método
     * atualizar do banco de dados.
     *
     * @param sala
     */
    public void remover(int id) {
        SalaDAO dao = new SalaDAOJDBC();
        dao.remover(id);
    }

    /**
     * Métodoque retorna os salas cadastrados na base de dados para
     * preencher a tabela contidos na view
     *
     * @return sala
     */
    public List<Sala> buscarSala() {
        SalaDAO dao = new SalaDAOJDBC();
        return dao.getSala();
    }

    /**
     * Método retorna os salas cadastrados na base de dados para
     * preencher a tabela contidos na view pelo nome
     *
     * @param nome
     * @return SalabyNome
     */
    public List<Sala> buscarSalabyNome(String nome) {
        SalaDAO dao = new SalaDAOJDBC();
        return dao.getSalabyNome(nome);
    }

    /**
     * retorna os salas cadastrados na base de dados para preencher a
     * tabela contidos na view pelo id
     *
     * @param id
     * @return sala
     */
    public Sala buscarSalabyId(Integer id) {
        SalaDAO dao = new SalaDAOJDBC();
        return (Sala) dao.getSalabyId(id);
    }
    
    public Sala buscarSalabyNom(String nome) {
        SalaDAO dao = new SalaDAOJDBC();
        return (Sala) dao.getSalabyNom(nome);
    }
    
}

