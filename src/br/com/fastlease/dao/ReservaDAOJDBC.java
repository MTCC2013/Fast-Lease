//Pacotes
package br.com.fastlease.dao;
//Importações

import br.com.fastlease.model.Curso;
import br.com.fastlease.model.Reserva;
import br.com.fastlease.model.Sala;
import br.com.fastlease.model.Usuario;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 * Classe que implementa os métodos CRUD da interface ReservaDAO
 *
 * @author Mauricio Cardoso
 * @version 1.0,17/05/13
 */
public class ReservaDAOJDBC implements ReservaDAO {

    private final String INSERT = "insert into reserva (dt_cadastro,turno, dt_reserva,id_sala,id_usuario, id_curso)"
            + " values (?,?,?,?,?,?)";
    private final String DELETE = "delete from reserva where codigo = ?";
    private final String UPDATE = "update reserva set dt_cadastro  = ?, turno  = ?, dt_reserva  = ?, id_sala = ?, id_usuario = ?,"
            + " id_curso = ? where codigo = ?";
    private final String LIST = "SELECT * FROM reserva, sala, curso, usuario WHERE reserva.id_sala = sala.codigo AND reserva.id_curso = curso.codigo "
            + "AND reserva.id_usuario = usuario.codigo";
    private final String LIST_ID = "SELECT * FROM reserva, sala, curso, usuario WHERE reserva.id_sala = sala.codigo AND reserva.id_curso = curso.codigo "
            + "AND reserva.id_usuario = usuario.codigo and reserva.codigo = ?";
     private final String LIST_TURNO = "SELECT * FROM reserva, sala, curso, usuario WHERE reserva.id_sala = sala.codigo AND reserva.id_curso = curso.codigo AND"
             + " reserva.id_usuario = usuario.codigo and reserva.turno = ?";
     private final String LIST_VALIDA = "SELECT * FROM reserva, sala, curso, usuario WHERE reserva.id_sala = sala.codigo AND "
             + "reserva.id_curso = curso.codigo AND reserva.id_usuario = usuario.codigo and reserva.dt_reserva = ? and reserva.turno = ? AND sala.nome = ?";
     private final String SEARCH =" SELECT * FROM reserva, sala, curso, usuario WHERE reserva.id_sala = sala.codigo AND reserva.id_curso = curso.codigo AND "
             + "reserva.id_usuario = usuario.codigo and reserva.dt_reserva = ?"; 
    /**
     * Método que faz a inserção de reservas na base de dados
     *
     * @param reserva
     */
    public void inserir(Reserva reserva) {
        if (reserva != null) {
            Connection conn = null;
            try {
                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(INSERT);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setDate(1,new java.sql.Date(reserva.getDtCadastro().getTime()));
                pstm.setString(2, reserva.getTurno());
                pstm.setString(3,reserva.getDtReserva());
                pstm.setInt(4, reserva.getIdSala().getId());
                pstm.setInt(5, reserva.getIdUsuario().getId());
                pstm.setInt(6, reserva.getIdCurso().getId());

                //Executa o comando sql
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O reserva foi cadastrada com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (SQLException e) {
                System.out.println("Erro ao inserir reserva no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
        }
    }

    /**
     * Método que faz a atualização de reservas na base de dados
     *
     * @param reserva
     */
    public void atualizar(Reserva reserva) {

        Connection conn = null;
        if (reserva != null) {
            try {
                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(UPDATE);
                //Pega os dados que estão no objeto passado por parametro e coloca na instrução de retorno 

                pstm.setDate(1, new java.sql.Date(reserva.getDtCadastro().getTime()));
                pstm.setString(2, reserva.getTurno());
                pstm.setString(3,reserva.getDtReserva());
                pstm.setInt(4, reserva.getIdSala().getId());
                pstm.setInt(5, reserva.getIdUsuario().getId());
                pstm.setInt(6, reserva.getIdCurso().getId());
                pstm.setInt(7, reserva.getId());
                //Executa o comando sql
                pstm.execute();
                //Mensagem na tela                
                JOptionPane.showMessageDialog(null, "O reserva foi atualizada com sucesso!");
                //Fecha conexão
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (SQLException e) {
                System.out.println("Erro ao atualizar reserva no banco de dados\n" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Erro com o driver de conexão" + e.getMessage());
            }
        }
    }

    /**
     * s
     * Método que faz a remoção de reservas na base de dados
     *
     * @param reserva
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
            System.out.println("Erro ao deletar reserva no banco de dados\n" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro com o driver de conexão" + e.getMessage());
        }

    }

    /**
     * Método que faz a lista de todas as reservas da base de dados
     *
     * @return reserva
     */
    public List<Reserva> getReserva() {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Reserva> reservas = new ArrayList<Reserva>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setId(rs.getInt("codigo"));
                reserva.setDtCadastro(rs.getDate("dt_cadastro"));
                reserva.setTurno(rs.getString("turno"));
                reserva.setDtReserva(rs.getString("dt_reserva"));

                Sala s = new Sala();
                s.setId(rs.getInt("sala.codigo"));
                s.setNome(rs.getString("sala.nome"));

                reserva.setIdSala(s);

                Curso cu = new Curso();
                cu.setId(rs.getInt("codigo"));
                cu.setCurso(rs.getString("curso"));

                reserva.setIdCurso(cu);

                Usuario us = new Usuario();
                us.setId(rs.getInt("codigo"));
                us.setNome(rs.getString("nome"));

                reserva.setIdUsuario(us);

                reservas.add(reserva);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());
        }
        return reservas;
    }

    /**
     * Método que filtra a lista pelo id na base de dados
     *
     * @param id
     * @return reserva
     */
    public Reserva getReservabyId(Integer id) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Reserva reserva = new Reserva();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                reserva.setId(rs.getInt("codigo"));
                reserva.setDtCadastro(rs.getDate("dt_cadastro"));
                reserva.setTurno(rs.getString("turno"));
                reserva.setDtReserva(rs.getString("dt_reserva"));

                Sala s = new Sala();
                s.setId(rs.getInt("sala.codigo"));
                s.setNome(rs.getString("sala.nome"));

                reserva.setIdSala(s);

                Curso cu = new Curso();
                cu.setId(rs.getInt("codigo"));
                cu.setCurso(rs.getString("curso"));

                reserva.setIdCurso(cu);

                Usuario us = new Usuario();
                us.setId(rs.getInt("codigo"));
                us.setNome(rs.getString("nome"));

                reserva.setIdUsuario(us);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());
        }
        return reserva;

    }

    
    public Reserva getReservabyTurno(String turno) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Reserva reserva = new Reserva();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_TURNO);
            pstm.setString(1,turno);
            rs = pstm.executeQuery();
            while (rs.next()) {
                reserva.setId(rs.getInt("codigo"));
                reserva.setDtCadastro(rs.getDate("dt_cadastro"));
                reserva.setTurno(rs.getString("turno"));
                reserva.setDtReserva(rs.getString("dt_reserva"));

                Sala s = new Sala();
                s.setId(rs.getInt("sala.codigo"));
                s.setNome(rs.getString("sala.nome"));

                reserva.setIdSala(s);

                Curso cu = new Curso();
                cu.setId(rs.getInt("codigo"));
                cu.setCurso(rs.getString("curso"));

                reserva.setIdCurso(cu);

                Usuario us = new Usuario();
                us.setId(rs.getInt("codigo"));
                us.setNome(rs.getString("nome"));

                reserva.setIdUsuario(us);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());
        }
        return reserva;
    }

    public Reserva validaReserva(Date data, String turno, String sala) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        Reserva reserva = new Reserva();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_VALIDA);
            pstm.setDate(1, new java.sql.Date(data.getTime()));
            pstm.setString(2,turno);
            pstm.setString(3, sala);
            rs = pstm.executeQuery();
            while (rs.next()) {
                reserva.setId(rs.getInt("reserva.codigo"));
                reserva = new Reserva();
                reserva.setDtCadastro(rs.getDate("dt_cadastro"));
                reserva.setTurno(rs.getString("turno"));
                reserva.setDtReserva(rs.getString("dt_reserva"));

                Sala s = new Sala();
                s.setId(rs.getInt("sala.codigo"));
                s.setNome(rs.getString("sala.nome"));

                reserva.setIdSala(s);

                Curso cu = new Curso();
                cu.setId(rs.getInt("codigo"));
                cu.setCurso(rs.getString("curso"));

                reserva.setIdCurso(cu);

                Usuario us = new Usuario();
                us.setId(rs.getInt("codigo"));
                us.setNome(rs.getString("nome"));

                reserva.setIdUsuario(us);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());
        }
        return reserva;
    }

    
    public List<Reserva> getReservabyData(String data) {
      //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Reserva> reservas = new ArrayList<Reserva>();
        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(SEARCH);
             pstm.setString(1, "%" + data + "%");
                        
            rs = pstm.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setId(rs.getInt("codigo"));
                reserva.setDtCadastro(rs.getDate("dt_cadastro"));
                reserva.setTurno(rs.getString("turno"));
                reserva.setDtReserva(rs.getString("dt_reserva"));

                Sala s = new Sala();
                s.setId(rs.getInt("sala.codigo"));
                s.setNome(rs.getString("sala.nome"));

                reserva.setIdSala(s);

                Curso cu = new Curso();
                cu.setId(rs.getInt("codigo"));
                cu.setCurso(rs.getString("curso"));

                reserva.setIdCurso(cu);

                Usuario us = new Usuario();
                us.setId(rs.getInt("codigo"));
                us.setNome(rs.getString("nome"));

                reserva.setIdUsuario(us);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar salas: " + e.getMessage());
        }
        return reservas;
    }

}
