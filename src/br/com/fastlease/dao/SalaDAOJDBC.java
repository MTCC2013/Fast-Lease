//Pacotes
package br.com.fastlease.dao;
//Importações
import br.com.fastlease.model.Arquetipo;
import br.com.fastlease.model.Bloco;
import br.com.fastlease.model.Sala;
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

    private final String INSERT = "INSERT INTO SALA (nome,id_arquetipo,id_bloco, piso,obs)VALUES(?,?,?,?,?)";
    private final String DELETE = "DELETE FROM SALA where codigo = ?";
    private final String UPDATE = "UPDATE sala SET nome = ?, id_arquetipo = ?,id_bloco = ?, piso = ?,obs = ? where codigo = ?";
    private final String LIST = "select * from sala, bloco, arquetipo where sala.id_bloco = bloco.codigo and sala.id_arquetipo = arquetipo.codigo";
    private final String LIST_NOME = "select * from sala, arquetipo, bloco where sala.id_bloco = bloco.codigo and sala.id_arquetipo = arquetipo.codigo and sala.nome like ?";
    private final String LIST_ID = "select * from sala, arquetipo, bloco where sala.id_arquetipo = arquetipo.codigo and sala.id_bloco = bloco.codigo and sala.codigo = ?";
    private final String LIST_NOM = "select * from sala, arquetipo, bloco where sala.id_arquetipo = arquetipo.codigo and sala.id_bloco = bloco.codigo and sala.nome = ?";

    /**
     * Método que faz a inserção de salas na base de dados
     *
     * @param sala
     */
    public void inserir(Sala sala) {
        if (sala != null) {
            Connection conn = null;
            try {
                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(INSERT);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setString(1, sala.getNome());
                pstm.setInt(2, sala.getIdArquetipo().getId());
                pstm.setInt(3, sala.getIdBloco().getId());
                pstm.setString(4, sala.getPiso());
                pstm.setString(5, sala.getObs());

                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O sala foi cadastrada com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (SQLException e) {
                System.out.println("Erro ao inserir sala no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
        }
    }

    /**
     * Método que faz a atualização de salas na base de dados
     *
     * @param sala
     */
    public void atualizar(Sala sala) {

        Connection conn = null;
        if (sala != null) {
            try {
                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(UPDATE);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 
                
                pstm.setString(1, sala.getNome());
                pstm.setInt(2, sala.getIdArquetipo().getId());
                pstm.setInt(3, sala.getIdBloco().getId());
                pstm.setString(4, sala.getPiso());
                pstm.setString(5, sala.getObs());
                pstm.setInt(6, sala.getId());
                //Executa o comando sql
                pstm.execute();
                //Mensagem na tela                
                JOptionPane.showMessageDialog(null, "O sala foi atualizada com sucesso!");
                //Fecha conexão
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (SQLException e) {
                System.out.println("Erro ao atualizar sala no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
        }
    }

    /**
     * Método que faz a remoção de salas na base de dados
     *
     * @param sala
     */
    public void remover(int id) {

        Connection conn = null;
        try {
            conn = FabricaConecta.getConexao();
            PreparedStatement pstm = null;
            pstm = FabricaConecta.getConexao().prepareStatement(DELETE);
            String mensagem = "Você tem certeza que deseja excluir este funcionário?";
            String titulo = "Atenção!";

            int condicao = JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_NO_OPTION);
            if (condicao == JOptionPane.YES_OPTION) {
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 
                pstm.setInt(1, id);
                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O funcionário foi removido com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao deletar sala no banco de dados\n" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro com o driver de conexão" + e.getMessage());
        }


    }

    /**
     * Método que faz a lista de todas as salas da base de dados
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
        List<Sala> salas = new ArrayList<Sala>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Sala sala = new Sala();
                sala.setId(rs.getInt("codigo"));
                sala.setNome(rs.getString("nome"));
                Arquetipo ar = new Arquetipo();
                ar.setId(rs.getInt("arquetipo.codigo"));
                ar.setNome(rs.getString("arquetipo.nome"));
                sala.setIdArquetipo(ar);                
                Bloco b = new Bloco();
                b.setId(rs.getInt("bloco.codigo"));
                b.setNome(rs.getString("bloco.bloco"));
                b.setQntPiso(rs.getInt("bloco.qnt_piso"));
                sala.setIdBloco(b);
                sala.setPiso(rs.getString("piso"));
                sala.setObs(rs.getString("obs"));
                salas.add(sala);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());
        }
        return salas;
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
        List<Sala> salas = new ArrayList<Sala>();
        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Sala sala = new Sala();
                sala.setId(rs.getInt("codigo"));
                sala.setNome(rs.getString("nome"));
                Arquetipo a = new Arquetipo();
                a.setId(rs.getInt("arquetipo.codigo"));
                a.setNome(rs.getString("arquetipo.nome"));
                sala.setIdArquetipo(a);
                Bloco b = new Bloco();
                b.setId(rs.getInt("bloco.codigo"));
                b.setNome(rs.getString("bloco.bloco"));
                b.setQntPiso(rs.getInt("bloco.qnt_piso"));
                sala.setIdBloco(b);
                sala.setPiso(rs.getString("piso"));
                sala.setObs(rs.getString("obs"));
                
                salas.add(sala);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());
        }
        return salas;

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
        Sala sala = new Sala();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                sala.setId(rs.getInt("codigo"));
                sala.setNome(rs.getString("nome"));
                 Arquetipo a = new Arquetipo();
                a.setId(rs.getInt("arquetipo.codigo"));
                a.setNome(rs.getString("arquetipo.nome"));
                sala.setIdArquetipo(a);
                Bloco b = new Bloco();
                b.setId(rs.getInt("bloco.codigo"));
                b.setNome(rs.getString("bloco.bloco"));
                b.setQntPiso(rs.getInt("bloco.qnt_piso"));
                sala.setIdBloco(b);
                sala.setPiso(rs.getString("piso"));
                sala.setObs(rs.getString("obs"));
                
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());
        }
        return sala;

    }


    public Sala getSalabyNom(String nome) {
         //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Sala sala = new Sala();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOM);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                sala.setId(rs.getInt("codigo"));
                sala.setNome(rs.getString("nome"));
                 Arquetipo a = new Arquetipo();
                a.setId(rs.getInt("arquetipo.codigo"));
                a.setNome(rs.getString("arquetipo.nome"));
                sala.setIdArquetipo(a);
                Bloco b = new Bloco();
                b.setId(rs.getInt("bloco.codigo"));
                b.setNome(rs.getString("bloco.bloco"));
                b.setQntPiso(rs.getInt("bloco.qnt_piso"));
                sala.setIdBloco(b);
                sala.setPiso(rs.getString("piso"));
                sala.setObs(rs.getString("obs"));
                
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());
        }
        return sala;
       
    }


    
}
