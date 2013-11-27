/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.dao;

import br.com.model.negocio.Cargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que implementa os métodos CRUD da interface CargoDAO
 *
 * @author antonio_sj
 * @version 1.0, 06/05/13
 */
public class CargoDAOJDBC implements CargoDAO {
 
    private final String INSERT = "insert into cargo (cargo) values (?)";
    private final String UPDATE = "update cargo set cargo = ? where codigo = ?";
    private final String DELETE = "delete from cargo where codigo = ?";
    private final String LIST = "select * from cargo";
    private final String LIST_ID = "select * from cargo where codigo = ?";
    private final String LIST_NUM = "select * from cargo where cargo like ?";
    private final String LIST_NOME = "select * from cargo where cargo = ?";
    
    /**
     * Método que faz a inserção de cargos na base de dados
     */
     
    public void inserir(Cargo cargo) {
        Connection conn = null;
                try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(INSERT);

                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, cargo.getCargo());
                
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Cargo cadastrado com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir cargo no banco de dados" + e.getMessage());




            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());

            }
        
        
        
    }

    /**
     * Método que atualiza os dados de um cargo na base de dados.
     *
     * @param cargo
     */
    public void atualizar(Cargo cargo) {
        Connection conn = null;
        if (cargo != null) {
            try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(UPDATE);
                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, cargo.getCargo());
                pstm.setInt(2,cargo.getCodigo());
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Cargo atualizado com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);


            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar cargo no banco de dados" + e.getMessage());



            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
            }
        }        
        
    }

    /**
     * Método que exclui um cargo da base de dados.
     *
     * @param cargo
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
                
                JOptionPane.showMessageDialog(null, "Erro ao excluir cargo do banco de dados" + e.getMessage());
            } catch (SQLException e) {
                
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
            }
       
    }

    /**
     * metodo que lista todos os cargos cadastrados na base de dados
     *
     * @return ArrayList Cargos
     */
    public List<Cargo> getCargo() {
         //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        
        List<Cargo> cargos = new ArrayList<Cargo>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Cargo cargo = new Cargo();
                cargo.setCodigo(rs.getInt("codigo"));
                cargo.setCargo(rs.getString("cargo"));
                cargos.add(cargo);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar cargos: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar cargos: " + e.getMessage());
        }
        return cargos;          
        
    } 
    /**
     * Método que procura um cargo pelo cargoero
     * @param cargo
     * @return ArrayList Cargos
     */
    public List<Cargo> getCargobyNome(String cargo) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        
        List<Cargo> cargos = new ArrayList<Cargo>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NUM);
            pstm.setString(1, "%" +cargo+ "%" );
            rs = pstm.executeQuery();
            while (rs.next()) {
                Cargo carg = new Cargo();
                carg.setCodigo(rs.getInt("codigo"));
                carg.setCargo(rs.getString("cargo"));
                cargos.add(carg);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar cargos na pesquisa: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar cargos na pesquisa: " + e.getMessage());
        }
        return cargos;
       
    }        
    /**
     * metodo que procura um cargo pelo codigo
     * @param codigo
     * @return ArrayList Cargos
     */
    public Cargo getCargobyId(Integer codigo) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         Cargo cargo = new Cargo();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1,codigo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cargo.setCodigo(rs.getInt("codigo"));
                cargo.setCargo(rs.getString("cargo"));
               
                             
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar cargos por codigo: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar cargos por codigo: " + e.getMessage());
        }
        return cargo;
    }

    
    public Cargo getCargobyNom(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         Cargo cargo = new Cargo();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1,nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cargo.setCodigo(rs.getInt("codigo"));
                cargo.setCargo(rs.getString("cargo"));
               
                             
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar cargos por nome: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar cargos por nome: " + e.getMessage());
        }
        return cargo;
    
   
 }
}
