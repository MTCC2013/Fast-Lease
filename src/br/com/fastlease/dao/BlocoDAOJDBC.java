//Pacotes
package br.com.fastlease.dao;
//Importações
import br.com.fastlease.dao.FabricaConecta;
import br.com.fastlease.model.Bloco;
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

    private final String INSERT = "INSERT INTO BLOCO (bloco, qnt_piso)VALUES(?,?)";
    private final String DELETE = "DELETE FROM BLOCO where codigo = ?";
    private final String UPDATE = "UPDATE bloco SET bloco = ?, qnt_piso = ? where codigo = ?";
    private final String LIST = "select * from bloco";
    private final String LIST_NOME = "select * from bloco where bloco like ?";
    private final String LIST_ID = "select * from bloco where codigo = ?";
    private final String LIST_NOM = "select * from bloco where bloco = ?";
    

    /**
     * Método que faz a inserção de blocos na base de dados
     *
     * @param bloco
     */
    public void inserir(Bloco bloco) {
        if (bloco != null) {
            Connection conn = null;
            try {
                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(INSERT);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setString(1, bloco.getNome());
                pstm.setInt(2, bloco.getQntPiso());              

                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O bloco foi cadastrado com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (SQLException e) {
                System.out.println("Erro ao inserir bloco no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
        }
    }

    /**
     * Método que faz a atualização de blocos na base de dados
     *
     * @param bloco
     */
    public void atualizar(Bloco bloco) {

        Connection conn = null;
        if (bloco != null) {
            try {
                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(UPDATE);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 
                
                pstm.setString(1, bloco.getNome());
                 pstm.setInt(2, bloco.getQntPiso());
                pstm.setInt(3, bloco.getId());
                //Executa o comando sql
                pstm.execute();
                //Mensagem na tela                
                JOptionPane.showMessageDialog(null, "O bloco foi atualizada com sucesso!");
                //Fecha conexão
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (SQLException e) {
                System.out.println("Erro ao atualizar bloco no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
        }
    }

    /**
     * Método que faz a remoção de blocos na base de dados
     *
     * @param id
     */
    public void remover(int id) {

        Connection conn = null;
        try {
            conn = FabricaConecta.getConexao();
            PreparedStatement pstm = null;
            pstm = FabricaConecta.getConexao().prepareStatement(DELETE);
            //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 
                pstm.setInt(1, id);
                //Executa o comando sql
                pstm.execute();
                FabricaConecta.fecharConexao(conn, pstm);
            

        } catch (SQLException e) {
            System.out.println("Erro ao deletar bloco no banco de dados\n" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro com o driver de conexão" + e.getMessage());
        }


    }

    /**
     * Método que faz a lista de todas as blocos da base de dados
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
        List<Bloco> blocos = new ArrayList<Bloco>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Bloco bloco = new Bloco();
                bloco.setId(rs.getInt("codigo"));
                bloco.setNome(rs.getString("bloco"));
                bloco.setQntPiso(rs.getInt("qnt_piso"));
                
                

                blocos.add(bloco);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());
        }
        return blocos;
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
        List<Bloco> blocos = new ArrayList<Bloco>();
        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Bloco bloco = new Bloco();
                bloco.setId(rs.getInt("codigo"));
                bloco.setNome(rs.getString("bloco"));
                bloco.setQntPiso(rs.getInt("qnt_piso"));

                blocos.add(bloco);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());
        }
        return blocos;

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
        Bloco bloco = new Bloco();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                bloco.setId(rs.getInt("codigo"));
                bloco.setNome(rs.getString("bloco"));
                bloco.setQntPiso(rs.getInt("qnt_piso"));
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());
        }
        return bloco;

    }
    
    public Bloco getBlocobyNom(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Bloco bloco = new Bloco();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOM);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                bloco.setId(rs.getInt("codigo"));
                bloco.setNome(rs.getString("bloco"));
                bloco.setQntPiso(rs.getInt("qnt_piso"));
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());
        }
        return bloco;


    
    }


    
}
