//Pacotes
package br.com.fastlease.dao;
//Importações
import br.com.senai.dao.FabricaConexao;
import br.com.senai.model.Arquetipo;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Classe que implementa os métodos CRUD da interface ArquetipoDAO
 *
 * @author Mauricio Cardoso
 * @version 1.0,17/05/13
 */
public class ArquetipoDAOJDBC implements ArquetipoDAO {

    private final String INSERT = "INSERT INTO ARQUETIPO (nome)VALUES(?)";
    private final String DELETE = "DELETE FROM ARQUETIPO where id = ?";
    private final String UPDATE = "UPDATE arquetipo SET nome = ? where id = ?";
    private final String LIST = "select * from arquetipo";
    private final String LIST_NOME = "select * from arquetipo where nome like ?";
    private final String LIST_ID = "select * from arquetipo where id = ?";
    private final String LIST_NOM = "select * from arquetipo where nome = ?";

    /**
     * Método que faz a inserção de pessoas na base de dados
     *
     * @param arquetipo
     */
    public void inserir(Arquetipo arquetipo) {
        if (arquetipo != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConexao.getConexao().prepareStatement(INSERT);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setString(1, arquetipo.getNome());

                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O arquetipo foi cadastrado com sucesso!");
                FabricaConexao.fecharConexao(conn, pstm);

            } catch (SQLException e) {
                System.out.println("Erro ao inserir pessoa no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
        }
    }

    /**
     * Método que faz a atualização de pessoas na base de dados
     *
     * @param arquetipo
     */
    public void atualizar(Arquetipo arquetipo) {

        Connection conn = null;
        if (arquetipo != null) {
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConexao.getConexao().prepareStatement(UPDATE);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setString(1, arquetipo.getNome());
                pstm.setInt(2, arquetipo.getId());
                //Executa o comando sql
                pstm.execute();
                //Mensagem na tela                
                JOptionPane.showMessageDialog(null, "O arquetipo foi atualizada com sucesso!");
                //Fecha conexão
                FabricaConexao.fecharConexao(conn, pstm);

            } catch (SQLException e) {
                System.out.println("Erro ao atualizar pessoa no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
        }
    }

    /**
     * Método que faz a remoção de pessoas na base de dados
     *
     * @param arquetipo
     */
    public void remover(int id) {

        Connection conn = null;
        try {
            conn = FabricaConexao.getConexao();
            PreparedStatement pstm = null;
            pstm = FabricaConexao.getConexao().prepareStatement(DELETE);
            pstm.setInt(1, id);
            //Executa o comando sql
            pstm.execute();

            FabricaConexao.fecharConexao(conn, pstm);


        } catch (SQLException e) {
            System.out.println("Erro ao deletar pessoa no banco de dados\n" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro com o driver de conexão" + e.getMessage());
        }


    }

    /**
     * Método que faz a lista de todas as pessoas da base de dados
     *
     * @return arquetipo
     */
    public List<Arquetipo> getArquetipo() {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Arquetipo> arquetipo = new ArrayList<Arquetipo>();

        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Arquetipo pessoa = new Arquetipo();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));

                arquetipo.add(pessoa);
            }
            FabricaConexao.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());
        }
        return arquetipo;
    }

    /**
     * Método que filtra a lista pelo nome da base de dados
     *
     * @param nome
     * @return arquetipo
     */
    public List<Arquetipo> getArquetipobyNome(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Arquetipo> pessoas = new ArrayList<Arquetipo>();
        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Arquetipo pessoa = new Arquetipo();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));

                pessoas.add(pessoa);
            }
            FabricaConexao.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());
        }
        return pessoas;

    }

    /**
     * Método que filtra a lista pelo id na base de dados
     *
     * @param id
     * @return arquetipo
     */
    public Arquetipo getArquetipobyId(Integer id) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Arquetipo pessoa = new Arquetipo();

        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
            }
            FabricaConexao.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());
        }
        return pessoa;

    }

    public Arquetipo getArquetipobyNom(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Arquetipo pessoa = new Arquetipo();

        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST_NOM);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
            }
            FabricaConexao.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());
        }
        return pessoa;



    }
}
