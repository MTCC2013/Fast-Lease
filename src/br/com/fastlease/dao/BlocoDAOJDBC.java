//Pacotes
package br.com.fastlease.dao;
//Importações
import br.com.senai.dao.FabricaConexao;
import br.com.senai.model.Bloco;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Classe que implementa os métodos CRUD da interface BlocoDAO
 *
 * @author Mauricio Cardoso
 * @version 1.0,17/05/13
 */
public class BlocoDAOJDBC implements BlocoDAO {

    private final String INSERT = "INSERT INTO BLOCO (nome)VALUES(?)";
    private final String DELETE = "DELETE FROM BLOCO where id = ?";
    private final String UPDATE = "UPDATE bloco SET nome = ? where id = ?";
    private final String LIST = "select * from bloco";
    private final String LIST_NOME = "select * from bloco where nome like ?";
    private final String LIST_ID = "select * from bloco where id = ?";
    private final String LIST_NOM = "select * from bloco where nome = ?";
    

    /**
     * Método que faz a inserção de pessoas na base de dados
     *
     * @param bloco
     */
    public void inserir(Bloco bloco) {
        if (bloco != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConexao.getConexao().prepareStatement(INSERT);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setString(1, bloco.getNome());

                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O bloco foi cadastrado com sucesso!");
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
     * @param bloco
     */
    public void atualizar(Bloco bloco) {

        Connection conn = null;
        if (bloco != null) {
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConexao.getConexao().prepareStatement(UPDATE);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 
                
                pstm.setString(1, bloco.getNome());
                pstm.setInt(2, bloco.getId());
                //Executa o comando sql
                pstm.execute();
                //Mensagem na tela                
                JOptionPane.showMessageDialog(null, "O bloco foi atualizada com sucesso!");
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
     * @param bloco
     */
    public void remover(int id) {

        Connection conn = null;
        try {
            conn = FabricaConexao.getConexao();
            PreparedStatement pstm = null;
            pstm = FabricaConexao.getConexao().prepareStatement(DELETE);
            String mensagem = "Você tem certeza que deseja excluir este funcionário?";
            String titulo = "Atenção!";

            int condicao = JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_NO_OPTION);
            if (condicao == JOptionPane.YES_OPTION) {
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 
                pstm.setInt(1, id);
                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O funcionário foi removido com sucesso!");
                FabricaConexao.fecharConexao(conn, pstm);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao deletar pessoa no banco de dados\n" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro com o driver de conexão" + e.getMessage());
        }


    }

    /**
     * Método que faz a lista de todas as pessoas da base de dados
     *
     * @return bloco
     */
    public List<Bloco> getBloco() {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Bloco> bloco = new ArrayList<Bloco>();

        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Bloco pessoa = new Bloco();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                

                bloco.add(pessoa);
            }
            FabricaConexao.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());
        }
        return bloco;
    }

    /**
     * Método que filtra a lista pelo nome da base de dados
     *
     * @param nome
     * @return bloco
     */
    public List<Bloco> getBlocobyNome(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Bloco> pessoas = new ArrayList<Bloco>();
        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Bloco pessoa = new Bloco();
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
     * @return bloco
     */
    public Bloco getBlocobyId(Integer id) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Bloco pessoa = new Bloco();

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
    
    public Bloco getBlocobyNom(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Bloco pessoa = new Bloco();

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
