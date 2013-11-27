//Pacotes
package br.com.fastlease.dao;
//Importações
import br.com.senai.dao.FabricaConexao;
import br.com.senai.model.Bloco;
import br.com.senai.model.Sala;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Classe que implementa os métodos CRUD da interface SalaDAO
 *
 * @author Mauricio Cardoso
 * @version 1.0,17/05/13
 */
public class SalaDAOJDBC implements SalaDAO {

    private final String INSERT = "INSERT INTO SALA (nome,arquetipo,id_bloco,qnt_piso,obs,id_software)VALUES(?,?,?,?,?,?)";
    private final String DELETE = "DELETE FROM SALA where id = ?";
    private final String UPDATE = "UPDATE sala SET nome = ?,arquetipo = ?,id_bloco = ?,qnt_piso = ?,obs = ?,id_software = ? where id = ?";
    private final String LIST = "select * from sala";
    private final String LIST_NOME = "select * from sala where nome like ?";
    private final String LIST_ID = "select * from sala where id = ?";
    

    /**
     * Método que faz a inserção de pessoas na base de dados
     *
     * @param sala
     */
    public void inserir(Sala sala) {
        if (sala != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConexao.getConexao().prepareStatement(INSERT);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setString(1, sala.getNome());
                pstm.setString(2, sala.getArquetipo());
                pstm.setInt(3, sala.getIdBloco().getId());
                pstm.setInt(4, sala.getPiso());
                pstm.setString(5, sala.getObs());

                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O sala foi cadastrada com sucesso!");
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
     * @param sala
     */
    public void atualizar(Sala sala) {

        Connection conn = null;
        if (sala != null) {
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConexao.getConexao().prepareStatement(UPDATE);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 
                
                pstm.setString(1, sala.getNome());
                pstm.setString(2, sala.getArquetipo());
                pstm.setInt(3, sala.getIdBloco().getId());
                pstm.setInt(4, sala.getPiso());
                pstm.setString(5, sala.getObs());
                pstm.setInt(7, sala.getId());
                //Executa o comando sql
                pstm.execute();
                //Mensagem na tela                
                JOptionPane.showMessageDialog(null, "O sala foi atualizada com sucesso!");
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
     * @param sala
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
     * @return sala
     */
    public List<Sala> getSala() {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Sala> sala = new ArrayList<Sala>();

        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Sala pessoa = new Sala();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setArquetipo(rs.getString("arquetipo"));
                Bloco b = new Bloco();
                b.setId(rs.getInt("bloco.id"));
                b.setNome(rs.getString("bloco.nome"));
                b.setQntPiso(rs.getInt("bloco.qnt_piso"));
                pessoa.setIdBloco(b);
                pessoa.setPiso(rs.getInt("qnt_piso"));
                pessoa.setObs(rs.getString("obs"));
                sala.add(pessoa);
            }
            FabricaConexao.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar pessoas: " + e.getMessage());
        }
        return sala;
    }

    /**
     * Método que filtra a lista pelo nome da base de dados
     *
     * @param nome
     * @return sala
     */
    public List<Sala> getSalabyNome(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Sala> pessoas = new ArrayList<Sala>();
        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Sala pessoa = new Sala();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setArquetipo(rs.getString("arquetipo"));
                Bloco b = new Bloco();
                b.setId(rs.getInt("bloco.id"));
                b.setNome(rs.getString("bloco.nome"));
                b.setQntPiso(rs.getInt("bloco.qnt_piso"));
                pessoa.setIdBloco(b);
                pessoa.setPiso(rs.getInt("qnt_piso"));
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
     * @return sala
     */
    public Sala getSalabyId(Integer id) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Sala pessoa = new Sala();

        try {
            conn = (Connection) FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setArquetipo(rs.getString("arquetipo"));
                Bloco b = new Bloco();
                b.setId(rs.getInt("bloco.id"));
                b.setNome(rs.getString("bloco.nome"));
                b.setQntPiso(rs.getInt("bloco.qnt_piso"));
                pessoa.setIdBloco(b);
                pessoa.setPiso(rs.getInt("qnt_piso"));
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
