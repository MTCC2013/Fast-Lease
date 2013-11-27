/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.dao;

import br.com.model.negocio.AreaUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que implementa os métodos CRUD da interface AreaUsuarioDAO
 *
 * @author antonio_sj
 * @version 1.0, 06/05/13
 */
public class AreaUsuarioDAOJDBC implements AreaUsuarioDAO {
 
    private final String INSERT = "insert into area_usuario (area) values (?)";
    private final String UPDATE = "update area_usuario set area = ? where codigo = ?";
    private final String DELETE = "delete from area_usuario where codigo = ?";
    private final String LIST = "select * from area_usuario";
    private final String LIST_NUM = "select * from area_usuario where area like ?";
    private final String LIST_ID = "select * from area_usuario where codigo= ?";
    private final String LIST_NOME = "select * from area_usuario where area = ?";
     
    
    /**
     * Método que faz a inserção de usuarios na base de dados
     *
     * @param usuario
     */
    public void inserir(AreaUsuario usuario) {
        Connection conn = null;
                try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(INSERT);

                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, usuario.getArea());
                
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "A área foi inserida com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir área no banco de dados" + e.getMessage());




            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());

            }
        
        
        
    }

    /**
     * Método que atualiza os dados de um usuario na base de dados.
     *
     * @param usuario
     */
    public void atualizar(AreaUsuario usuario) {
        Connection conn = null;
        if (usuario != null) {
            try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(UPDATE);
                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, usuario.getArea());
                pstm.setInt(2,usuario.getCodigo());
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "A área foi atualizada com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);


            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar área no banco de dados" + e.getMessage());



            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
            }
        }        
        
    }

    /**
     * Método que exclui um usuario da base de dados.
     *
     * @param usuario
     */
    public void excluir(int codigo) {
         Connection conn = null;        
            try {
                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(DELETE);
                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setInt(1, codigo);
                pstm.execute();
                
                FabricaConecta.fecharConexao(conn, pstm);                                  
                
                
                } catch (ClassNotFoundException e) {
                
                    JOptionPane.showMessageDialog(null, "Erro ao excluir área do banco de dados" + e.getMessage());
               } catch (SQLException e) {
                
                    JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
}
      
    }

    /**
     * metodo que lista todos os usuarios cadastrados na base de dados
     *
     * @return ArrayList AreaUsuarios
     */
    public List<AreaUsuario> getAreaUsuario() {
         //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        
        List<AreaUsuario> usuarios = new ArrayList<AreaUsuario>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                AreaUsuario usuario = new AreaUsuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setArea(rs.getString("area"));
                usuarios.add(usuario);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar área de usuario: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar área de usuario: " + e.getMessage());
        }
        return usuarios;          
        
    } 
    /**
     * Método que procura um usuario pelo areaero
     * @param area
     * @return ArrayList AreaUsuarios
     */
    public List<AreaUsuario> getAreaUsuariobyNome(String area) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        
        List<AreaUsuario> usuarios = new ArrayList<AreaUsuario>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NUM);
            pstm.setString(1, "%" +area+ "%" );
            rs = pstm.executeQuery();
            while (rs.next()) {
                AreaUsuario usuario = new AreaUsuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setArea(rs.getString("area"));
                usuarios.add(usuario);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar área de usuario na pesquisa: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar área de usuario na pesquisa: " + e.getMessage());
        }
        return usuarios;
       
    }        
    /**
     * metodo que procura um usuario pelo codigo
     * @param codigo
     * @return ArrayList AreaUsuarios
     */
    public AreaUsuario getAreaById(Integer codigo) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         AreaUsuario usuario = new AreaUsuario();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1,codigo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setArea(rs.getString("area"));
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Código não encontrado: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Código não encontrado: " + e.getMessage());
        }
        return usuario;
    }

    
    public AreaUsuario getAreaByNom(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         AreaUsuario usuario = new AreaUsuario();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1,nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setArea(rs.getString("area"));
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar área por nome: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar área por nome: " + e.getMessage());
        }
        return usuario;
        
    }
    
    
 }
