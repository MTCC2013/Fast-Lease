package br.com.fastlease.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe que fecha a conexao com o banco de dados
 *
 * @author antonio_sj
 * @version 1.0, 18/05/13
 */
public class FabricaConecta {

    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String DATABASE = "fastlease";
    private static final String DRIVER_CONEXAO = "com.mysql.jdbc.Driver";
    private static final String STR_CONEXAO = "jdbc:mysql://localhost:3306/";

    /**
     * Método que faz a conexão com o banco de dados
     *
     * @return Connection
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Connection getConexao() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName(DRIVER_CONEXAO);
            // DriverManager é a classe responsável por verificar
            // os drivers contidos no projeto.
            conn = DriverManager.getConnection(STR_CONEXAO + DATABASE, USUARIO, SENHA);
            // Imprime menssagem  caso conexão tenha sido efetuada
            System.out.println("Banco conectado com sucesso");
            // Retorna conexão
            return conn;

            //Driver de conexão MySql não está adicionado ao projrto
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException("DriverMysql não foi encontrado" + e.getMessage());
            // Erro de conexão com o banco   
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar com base de dados " + e.getMessage());

        }

    }
    
    /**
     * Método que fecha a conexão com o banco de dados.
     *
     * @param Connection
     */
    public static void fecharConexao(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Conexão fechada com sucesso");
            }
        } catch (Exception e) {
            System.out.println("Erro ao fechar a conexão " + e.getMessage());
        }
    }

    

    public static void fecharConexao(Connection conn, Statement stmt) {

        try {
            if (conn != null) {
                fecharConexao(conn);
            }
            if (stmt != null) {
                stmt.close();
                System.out.println("Statement fechado com sucesso");
            }

        } catch (Exception e) {
            System.out.println("Não foi possivel fechar o statement" + e.getMessage());
        }

    }
    public static void fecharConexao(Connection conn, Statement stm, ResultSet rs){
        
        try{
            if (conn != null || stm != null){
                fecharConexao(conn);
            }
            if (rs != null){
                rs.close();
                System.out.println("Result set fechado com sucesso");
            }
        }catch(Exception e){
            System.out.println("Não foi possível fechar o result set" + e.getMessage());
            
        }
        
    }
}
