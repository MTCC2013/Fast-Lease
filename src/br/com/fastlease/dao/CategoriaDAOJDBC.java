/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.dao;

import br.com.model.negocio.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que implementa os métodos CRUD da interface CategoriaDAO
 *
 * @author antonio_sj
 * @version 1.0, 06/05/13
 */
public class CategoriaDAOJDBC implements CategoriaDAO {
 
    private final String INSERT = "insert into categoria (categoria) values (?)";
    private final String UPDATE = "update categoria set categoria = ? where codigo = ?";
    private final String DELETE = "delete from categoria where codigo = ?";
    private final String LIST = "select * from categoria";
    private final String LIST_ID = "select * from categoria where codigo = ?";
    private final String LIST_NUM = "select * from categoria where categoria like ?";
    private final String LIST_NOME = "select * from categoria where categoria =  ?";
    
    /**
     * Método que faz a inserção de categorias na base de dados
     *
     * @param categoria
     */
    public void inserir(Categoria categoria) {
        Connection conn = null;
                try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(INSERT);

                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, categoria.getCategoria());
                
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir categoria no banco de dados" + e.getMessage());




            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());

            }
        
        
        
    }

    /**
     * Método que atualiza os dados de um categoria na base de dados.
     *
     * @param categoria
     */
    public void atualizar(Categoria categoria) {
        Connection conn = null;
        if (categoria != null) {
            try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(UPDATE);
                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, categoria.getCategoria());
                pstm.setInt(2,categoria.getCodigo());
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "A categoria foi atualizada com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);


            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar categoria no banco de dados" + e.getMessage());



            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
            }
        }        
        
    }

    /**
     * Método que exclui um categoria da base de dados.
     *
     * @param categoria
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
                
                JOptionPane.showMessageDialog(null, "Erro ao excluir categoria do banco de dados" + e.getMessage());
            } catch (SQLException e) {
                
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
            }
       
    }

    /**
     * metodo que lista todos os categorias cadastrados na base de dados
     *
     * @return ArrayList Categorias
     */
    public List<Categoria> getCategoria() {
         //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        
        List<Categoria> categorias = new ArrayList<Categoria>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setCodigo(rs.getInt("codigo"));
                categoria.setCategoria(rs.getString("categoria"));
                categorias.add(categoria);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar categorias: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar categorias: " + e.getMessage());
        }
        return categorias;          
        
    } 
    /**
     * Método que procura um categoria pelo categoriaero
     * @param categoria
     * @return ArrayList Categorias
     */
    public List<Categoria> getCategoriabyNome(String categoria) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        
        List<Categoria> categorias = new ArrayList<Categoria>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NUM);
            pstm.setString(1, "%" +categoria+ "%" );
            rs = pstm.executeQuery();
            while (rs.next()) {
                Categoria carg = new Categoria();
                carg.setCodigo(rs.getInt("codigo"));
                carg.setCategoria(rs.getString("categoria"));
                categorias.add(carg);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar categorias na pesquisa: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar categorias na pesquisa: " + e.getMessage());
        }
        return categorias;
       
    }        
    /**
     * metodo que procura um categoria pelo codigo
     * @param codigo
     * @return ArrayList Categorias
     */
    public Categoria getCategoriabyId(Integer codigo) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         Categoria categoria = new Categoria();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1,codigo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                categoria.setCodigo(rs.getInt("codigo"));
                categoria.setCategoria(rs.getString("categoria"));
               
                             
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar categorias por código: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar categorias por código: " + e.getMessage());
        }
        return categoria;
    }

    
    public Categoria getCategoriabyNom(String nome) {
       //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         Categoria categoria = new Categoria();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1,nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                categoria.setCodigo(rs.getInt("codigo"));
                categoria.setCategoria(rs.getString("categoria"));
               
                             
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar categorias por nome: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar categorias por nome: " + e.getMessage());
        }
        return categoria;
    }
   
 }
