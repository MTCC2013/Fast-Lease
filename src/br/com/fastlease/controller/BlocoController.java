//Pacote controller
package br.com.fastlease.controller;
//Importações
import br.com.fastlease.dao.*;
import br.com.fastlease.model.Bloco;
import java.util.List;

/**
 * classe responsável por fazer a ligação entre a pessoaDAO e a interface;
 *
 * @author Mauricio Cardoso
 * @version 1.0, 21/05/13
 */
public class BlocoController{

    /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados.
     *
     * @param bloco
     */
    public void inserir(Bloco bloco) {
        BlocoDAO dao = new BlocoDAOJDBC();
        dao.inserir(bloco);
    }

    /**
     * Método que liga o botão atualizar da interface gráfica com o método
     * atualizar do banco de dados.
     *
     * @param bloco
     */
    public void atualizar(Bloco bloco) {
        BlocoDAO dao = new BlocoDAOJDBC();
        dao.atualizar(bloco);
    }

    /**
     * Método que liga o botão atualizar da interface gráfica com o método
     * atualizar do banco de dados.
     *
     * @param bloco
     */
    public void remover(int id) {
        BlocoDAO dao = new BlocoDAOJDBC();
        dao.remover(id);
    }

    /**
     * Métodoque retorna os blocos cadastrados na base de dados para
     * preencher a tabela contidos na view
     *
     * @return bloco
     */
    public List<Bloco> buscarBloco() {
        BlocoDAO dao = new BlocoDAOJDBC();
        return dao.getBloco();
    }

    /**
     * Método retorna os blocos cadastrados na base de dados para
     * preencher a tabela contidos na view pelo nome
     *
     * @param nome
     * @return BlocobyNome
     */
    public List<Bloco> buscarBlocobyNome(String nome) {
        BlocoDAO dao = new BlocoDAOJDBC();
        return dao.getBlocobyNome(nome);
    }

    /**
     * retorna os blocos cadastrados na base de dados para preencher a
     * tabela contidos na view pelo id
     *
     * @param id
     * @return bloco
     */
    public Bloco buscarBlocobyId(Integer id) {
        BlocoDAO dao = new BlocoDAOJDBC();
        return (Bloco) dao.getBlocobyId(id);
    }
    
     public Bloco buscarBlocobyNom(String nome) {
       BlocoDAO dao = new BlocoDAOJDBC();
        return (Bloco) dao.getBlocobyNom(nome);
    }
    
}

