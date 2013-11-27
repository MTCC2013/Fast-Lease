package br.com.fastlease.dao;

import br.com.model.negocio.Categoria;
import br.com.model.negocio.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que implementa os métodos CRUD da interface PessoaDAO
 *
 * @author antonio_sj
 * @version 1.0, 06/05/13
 */
public class CursoDAOJDBC implements CursoDAO {

    private final String INSERT = "insert into curso (curso, fase, duracao, data_termino, id_categoria) values (?,?,?,?,?)";
    private final String UPDATE = "update curso set curso  = ?, fase  = ?, duracao  = ?,"+
            "data_termino = ?, id_categoria = ? where codigo = ?";
    private final String DELETE = "delete from curso where codigo = ?";
    private final String LIST = "select * from curso, categoria where curso.id_categoria = categoria.codigo";
    private final String LIST_NOME = "select * from categoria, curso where categoria.codigo = curso.id_categoria and curso like ?";
    private final String LIST_ID = "select * from categoria, curso where categoria.codigo = curso.id_categoria and curso.codigo = ?";
    private final String LIST_NOM = "select * from categoria, curso where categoria.codigo = curso.id_categoria and curso = ?";
   

    /**
     * Método que faz a inserção de cursos na base de dados
     *
     * @param curso
     */
    public void inserir(Curso curso) {

        Connection conn = null;
               try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(INSERT);

                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, curso.getCurso());
                pstm.setString(2,curso.getFase());
                pstm.setString(3,curso.getDuracao());
                pstm.setDate(4, new java.sql.Date(curso.getDataTermino().getTime()));
                pstm.setInt(5,curso.getCategoria().getCodigo());
                
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O curso foi cadastrado com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);
               
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir curso no banco de dados" + e.getMessage());
                  



            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexãio" + e.getMessage());

            }
        

    }

    /**
     * Método que atualiza os dados de um curso na base de dados.
     *
     * @param curso
     */
    public void atualizar(Curso curso) {

        Connection conn = null;
        if (curso != null) {
            try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(UPDATE);
                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, curso.getCurso());
                pstm.setString(2,curso.getFase());
                pstm.setString(3,curso.getDuracao());
                pstm.setDate(4, new java.sql.Date(curso.getDataTermino().getTime()));
                pstm.setInt(5,curso.getCategoria().getCodigo());
                pstm.setInt(6, curso.getCodigo());
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "O curso foi atualizado com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);


            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar curso no banco de dados" + e.getMessage());



            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
            }

        }
    }

    /**
     * Método que exclui um curso da base de dados.
     *
     * @param codigo
     */
    public void excluir(int codigo) {
        
        Connection conn = null;        
            try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(DELETE);
                pstm.setInt(1, codigo);
                pstm.execute();
                FabricaConecta.fecharConexao(conn, pstm);
                                   
                

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir curso do banco de dados" + e.getMessage());




            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
            }
        }
    

    /**
     * metodo que lista todos os cursos cadastrados na base de dados
     *
     * @return ArrayList Pessoas
     */
    public List<Curso> getCurso() {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        
        List<Curso> cursos = new ArrayList<Curso>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Curso curso = new Curso();
                curso.setCodigo(rs.getInt("codigo"));
                curso.setCurso(rs.getString("curso"));
                curso.setFase(rs.getString("fase"));
                curso.setDuracao(rs.getString("duracao"));
                curso.setDataTermino(rs.getDate("data_termino"));
                Categoria c = new Categoria();
                c.setCodigo(rs.getInt("categoria.codigo"));
                c.setCategoria(rs.getString("categoria.categoria"));
                curso.setCategoria(c);
                
                cursos.add(curso);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar cursos: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar cursos: " + e.getMessage());
        }
        return cursos;




    }

    /**
     * Método que procura um curso pelo nome
     * @param nome
     * @return 
     */
    public List<Curso> getCursobyNome(String nome){
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Curso> cursos = new ArrayList<Curso>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1, "%" +nome+ "%" );
            rs = pstm.executeQuery();
            while (rs.next()) {
                Curso curso = new Curso();
                curso.setCodigo(rs.getInt("codigo"));
                curso.setCurso(rs.getString("curso"));
                curso.setFase(rs.getString("fase"));
                curso.setDuracao(rs.getString("duracao"));
                curso.setDataTermino(rs.getDate("data_termino"));
                Categoria c = new Categoria();
                c.setCodigo(rs.getInt("categoria.codigo"));
                c.setCategoria(rs.getString("categoria.categoria"));
                curso.setCategoria(c);
                cursos.add(curso);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar cursos na pesquisa: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar cursos na pesquisa: " + e.getMessage());
        }
        return cursos;

    }
    /**
     * metodo que procura um curso pelo codigo
     * @param codigo
     * @return 
     */
    public Curso getCursobyId(Integer codigo) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         Curso curso = new Curso();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1,codigo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                curso.setCodigo(rs.getInt("curso.codigo"));
                curso.setCurso(rs.getString("curso"));
                curso.setFase(rs.getString("fase"));
                curso.setDuracao(rs.getString("duracao"));
                curso.setDataTermino(rs.getDate("data_termino"));
                Categoria c = new Categoria();
                c.setCodigo(rs.getInt("categoria.codigo"));
                c.setCategoria(rs.getString("categoria.categoria"));
                curso.setCategoria(c);
                
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar cursos por código: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar cursos por código: " + e.getMessage());
        }
        return curso;


    }

    
    public Curso getCursobyNom(String nome) {
         //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         Curso curso = new Curso();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOM);
            pstm.setString(1,nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                curso.setCodigo(rs.getInt("codigo"));
                curso.setCurso(rs.getString("curso"));
                curso.setFase(rs.getString("fase"));
                curso.setDuracao(rs.getString("duracao"));
                curso.setDataTermino(rs.getDate("data_termino"));
                Categoria c = new Categoria();
                c.setCodigo(rs.getInt("categoria.codigo"));
                c.setCategoria(rs.getString("categoria.categoria"));
                curso.setCategoria(c);
                
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar cursos por nome: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar cursos por nome: " + e.getMessage());
        }
        return curso;

    }
    
    
}

   