//Pacotes
package br.com.fastlease.dao;
//Importações
import br.com.senai.dao.FabricaConexao;
import br.com.senai.model.Particularidade;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Classe que implementa os métodos CRUD da interface ParticularidadeDAO
 *
 * @author Mauricio Cardoso
 * @version 1.0,17/05/13
 */
public class ParticularidadeDAOJDBC implements ParticularidadeDAO {

    private final String INSERT = "INSERT INTO PARTICULARIDADE (nome,qt_maq,obs)VALUES(?,?,?)";
    private final String DELETE = "DELETE FROM PARTICULARIDADE where id = ?";
    private final String UPDATE = "UPDATE particularidade SET nome = ?,qt_maq = ?,obs = ? where id = ?";
    private final String LIST = "select * from particularidade";
    private final String LIST_NOME = "select * from particularidade where nome like ?";
    private final String LIST_NOM = "select * from particularidade where nome = ?";
    private final String LIST_ID = "select * from particularidade where id = ?";

    /**
     * Método que faz a inserção de pessoas na base de dados
     *
     * @param particularidade
     */
    public void inserir(Particularidade particularidade) {
        if (particularidade != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConexao.getConexao().prepareStatement(INSERT);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 
                pstm.setString(1, particularidade.getNome());
                pstm.setInt(2, particularidade.getQtdeMaq());
                pstm.setString(3, particularidade.getObs());

                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O particularidade foi cadastrado com sucesso!");
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
     * @param particularidade
     */
    public void atualizar(Particularidade particularidade) {

        Connection conn = null;
        if (particularidade != null) {
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConexao.getConexao().prepareStatement(UPDATE);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 
                pstm.setString(1, particularidade.getNome());
                pstm.setInt(2, particularidade.getQtdeMaq());
                pstm.setString(3, particularidade.getObs());
                pstm.setInt(4, particularidade.getId());
                //Executa o comando sql
                pstm.execute();
                //Mensagem na tela                
                JOptionPane.showMessageDialog(null, "O particularidade foi atualizada com sucesso!");
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
     * @param particularidade
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
     * @return particularidade
     */
    public List<Particularidade> getParticularidade() {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Particularidade> particularidade = new ArrayList<Particularidade>();

        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Particularidade pessoa = new Particularidade();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setQtdeMaq(rs.getInt("qt_maq"));
                pessoa.setObs(rs.getString("obs"));
             
                
                particularidade.add(pessoa);
            }
            FabricaConexao.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());
        }
        return particularidade;
    }

    /**
     * Método que filtra a lista pelo nome da base de dados
     *
     * @param nome
     * @return particularidade
     */
    public List<Particularidade> getParticularidadebyNome(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Particularidade> pessoas = new ArrayList<Particularidade>();
        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Particularidade pessoa = new Particularidade();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setQtdeMaq(rs.getInt("qt_maq"));
                pessoa.setObs(rs.getString("obs"));
      

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
     * @return particularidade
     */
    public Particularidade getParticularidadebyNom(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Particularidade pessoa = new Particularidade();

        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST_NOM);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setQtdeMaq(rs.getInt("qt_maq"));
                pessoa.setObs(rs.getString("obs"));
           
            }
            FabricaConexao.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());
        }
        return pessoa;

    }
    public Particularidade getParticularidadebyId(Integer id) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Particularidade pessoa = new Particularidade();

        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setQtdeMaq(rs.getInt("qt_maq"));
                pessoa.setObs(rs.getString("obs"));
            
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
