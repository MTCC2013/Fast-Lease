//Pacotes
package br.com.fastlease.dao;
//Importações
import br.com.fastlease.model.Arquetipo;
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
    private final String DELETE = "DELETE FROM ARQUETIPO where codigo = ?";
    private final String UPDATE = "UPDATE arquetipo SET nome = ? where codigo = ?";
    private final String LIST = "select * from arquetipo";
    private final String LIST_NOME = "select * from arquetipo where nome like ?";
    private final String LIST_ID = "select * from arquetipo where codigo = ?";
    private final String LIST_NOM = "select * from arquetipo where nome = ?";

    /**
     * Método que faz a inserção de arquetipos na base de dados
     *
     * @param arquetipo
     */
    public void inserir(Arquetipo arquetipo) {
        if (arquetipo != null) {
            Connection conn = null;
            try {
                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(INSERT);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setString(1, arquetipo.getNome());

                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O arquetipo foi cadastrado com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (SQLException e) {
               JOptionPane.showMessageDialog(null,"Erro ao inserir arquetipo no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
        }
    }

    /**
     * Método que faz a atualização de arquetipos na base de dados
     *
     * @param arquetipo
     */
    public void atualizar(Arquetipo arquetipo) {

        Connection conn = null;
        if (arquetipo != null) {
            try {
                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(UPDATE);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setString(1, arquetipo.getNome());
                pstm.setInt(2, arquetipo.getId());
                //Executa o comando sql
                pstm.execute();
                //Mensagem na tela                
                JOptionPane.showMessageDialog(null,"Arquetipo atualizado com sucesso");
         
                //Fecha conexão
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (SQLException e) {
                System.out.println("Erro ao atualizar arquetipo no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
          
        }
    }

    /**
     * Método que faz a remoção de arquetipos na base de dados
     *
     * @param arquetipo
     */
    public void remover(int id) {

        Connection conn = null;
        try {
            conn = FabricaConecta.getConexao();
            PreparedStatement pstm = null;
            pstm = FabricaConecta.getConexao().prepareStatement(DELETE);
            pstm.setInt(1, id);
            //Executa o comando sql
            pstm.execute();

            FabricaConecta.fecharConexao(conn, pstm);


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar arquetipo no banco de dados\n" + e.getMessage());
        } catch (ClassNotFoundException e) {
           JOptionPane.showMessageDialog(null,"Erro com o driver de conexão" + e.getMessage());
        }


    }

    /**
     * Método que faz a lista de todas as arquetipos da base de dados
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
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Arquetipo arquetip = new Arquetipo();
                arquetip.setId(rs.getInt("codigo"));
                arquetip.setNome(rs.getString("nome"));

                arquetipo.add(arquetip);
            }
         FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar arquetipos: " + e.getMessage());

        } catch (ClassNotFoundException e) {
           JOptionPane.showMessageDialog(null,"Erro ao listar arquetipos: " + e.getMessage());
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
        List<Arquetipo> arquetipos = new ArrayList<Arquetipo>();
        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Arquetipo arquetipo = new Arquetipo();
                arquetipo.setId(rs.getInt("codigo"));
                arquetipo.setNome(rs.getString("nome"));

                arquetipos.add(arquetipo);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar arquetipos por nome: " + e.getMessage());

        } catch (ClassNotFoundException e) {
           JOptionPane.showMessageDialog(null,"Erro ao listar arquetipos por nome: " + e.getMessage());
        }
        return arquetipos;

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
        Arquetipo arquetipo = new Arquetipo();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                arquetipo.setId(rs.getInt("codigo"));
                arquetipo.setNome(rs.getString("nome"));
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Erro ao listar arquetipos por id: " + e.getMessage());

        } catch (ClassNotFoundException e) {
           JOptionPane.showMessageDialog(null,"Erro ao listar arquetipos por id: " + e.getMessage());
        }
    
        return arquetipo;

    }

    public Arquetipo getArquetipobyNom(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Arquetipo arquetipo = new Arquetipo();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOM);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                arquetipo.setId(rs.getInt("codigo"));
                arquetipo.setNome(rs.getString("nome"));
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Erro ao atualizar tabela: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: " + e.getMessage());
        }
        return arquetipo;



    }
}
