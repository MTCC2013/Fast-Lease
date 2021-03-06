package br.com.fastlease.dao;

import br.com.fastlease.model.AreaUsuario;
import br.com.fastlease.model.Cargo;
import br.com.fastlease.model.Usuario;
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
public class UsuarioDAOJDBC implements UsuarioDAO {

    private final String INSERT = "insert into usuario (nome, login, senha, id_cargo, data_cadastro, id_area) values (?,?,?,?,?,?)";
    private final String UPDATE = "update usuario set nome  = ?, login  = ?, senha  = ?,"+
            "id_cargo = ?, data_cadastro = ?, id_area = ? where codigo = ?";
    private final String DELETE = "delete from usuario where codigo = ?";
    private final String LIST = "SELECT * FROM usuario, cargo, area_usuario WHERE \n" +
    "usuario.id_cargo = cargo.codigo\n" +
    "AND usuario.id_area = area_usuario.codigo";
    private final String LIST_NOME ="select * from usuario, cargo, area_usuario where usuario.id_cargo = cargo.codigo and "
            + "usuario.id_area = area_usuario.codigo and usuario.nome like ?"; 
    private final String LIST_ID = "select * from usuario, cargo, area_usuario where usuario.id_cargo = cargo.codigo and "
            + "usuario.id_area = area_usuario.codigo and usuario.codigo = ?";
    private final String LIST_NOM = "select * from usuario, cargo, area_usuario where usuario.id_cargo = cargo.codigo and"
            + " usuario.id_area = area_usuario.codigo and nome = ?";
    private final String VERIFICALOGIN = "SELECT LOGIN, SENHA FROM USUARIO WHERE LOGIN = ? AND SENHA = ? ";
   

    /**
     * Método que faz a inserção de cursos na base de dados
     *
     * @param usuario
     */
    public void inserir(Usuario usuario) {

        Connection conn = null;
                try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(INSERT);

                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, usuario.getNome());
                pstm.setString(2,usuario.getLogin());
                pstm.setString(3,usuario.getSenha());
                pstm.setInt(4,usuario.getIdCargo().getId());
                pstm.setDate(5, new java.sql.Date(usuario.getDataCadastro().getTime()));
                pstm.setInt(6,usuario.getIdAreaUsuario().getId());
                               
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "A usuario foi cadastrado com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir usuario no banco de dados" + e.getMessage());




            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());

            }
        

    }

    /**
     * Método que atualiza os dados de um curso na base de dados.
     *
     * @param usuario
     */
    public void atualizar(Usuario usuario) {

        Connection conn = null;
        if (usuario != null) {
            try {


                conn = FabricaConecta.getConexao();
                PreparedStatement pstm = null;
                pstm = FabricaConecta.getConexao().prepareStatement(UPDATE);
                // Pega os dados que estão no objeto passado parametro e 
                //coloca na instrução de retorno
                pstm.setString(1, usuario.getNome());
                pstm.setString(2,usuario.getLogin());
                pstm.setString(3,usuario.getSenha());
                pstm.setInt(4,usuario.getIdCargo().getId());
                pstm.setDate(5, new java.sql.Date(usuario.getDataCadastro().getTime()));
                pstm.setInt(6,usuario.getIdAreaUsuario().getId());
                pstm.setInt(7, usuario.getId());
                //Executa o comando sql.
                pstm.execute();
                JOptionPane.showMessageDialog(null, "A usuario foi atualizado com sucesso!");
                FabricaConecta.fecharConexao(conn, pstm);


            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar usuario no banco de dados" + e.getMessage());



            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
            }

        }
    }

    /**
     * Método que exclui um curso da base de dados.
     *
     * @param curso
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
                JOptionPane.showMessageDialog(null, "Erro ao excluir usuario do banco de dados" + e.getMessage());




            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro com driver de conexão" + e.getMessage());
            }
        }
    

    /**
     * metodo que lista todos os cursos cadastrados na base de dados
     *
     * @return ArrayList Pessoas
     */
    public List<Usuario> getUsuario() {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("codigo"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                Cargo c = new Cargo();
                c.setId(rs.getInt("cargo.codigo"));
                c.setCargo(rs.getString("cargo.cargo"));
                usuario.setIdCargo(c);
                usuario.setDataCadastro(rs.getDate("data_cadastro"));
                AreaUsuario au = new AreaUsuario();
                au.setId(rs.getInt("area_usuario.codigo"));
                au.setArea(rs.getString("area_usuario.area"));
                usuario.setIdAreaUsuario(au);
                usuarios.add(usuario);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuarios: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar usuarios: " + e.getMessage());
        }
        return usuarios;




    }

    /**
     * Método que procura um curso pelo nome
     * @param nome
     * @return 
     */
    public List<Usuario> getUsuariobyNome(String nome){
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOME);
            pstm.setString(1, "%" +nome+ "%" );
            rs = pstm.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("codigo"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                Cargo c = new Cargo();
                c.setId(rs.getInt("cargo.codigo"));
                c.setCargo(rs.getString("cargo.cargo"));
                usuario.setIdCargo(c);
                usuario.setDataCadastro(rs.getDate("data_cadastro"));
                AreaUsuario au = new AreaUsuario();
                au.setId(rs.getInt("area_usuario.codigo"));
                au.setArea(rs.getString("area_usuario.area"));
                usuario.setIdAreaUsuario(au);
                usuarios.add(usuario);
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuarios na pesquisa: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar usuarios na pesquisa: " + e.getMessage());
        }
        return usuarios;

    }
    /**
     * metodo que procura um curso pelo codigo
     * @param codigo
     * @return 
     */
    public Usuario getUsuariobyId(Integer codigo) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         Usuario usuario = new Usuario();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_ID);
            pstm.setInt(1,codigo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                usuario.setId(rs.getInt("usuario.codigo"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                Cargo c = new Cargo();
                c.setId(rs.getInt("cargo.codigo"));
                c.setCargo(rs.getString("cargo.cargo"));
                usuario.setIdCargo(c);
                usuario.setDataCadastro(rs.getDate("data_cadastro"));
                AreaUsuario au = new AreaUsuario();
                au.setId(rs.getInt("area_usuario.codigo"));
                au.setArea(rs.getString("area_usuario.area"));
                usuario.setIdAreaUsuario(au);
                
                
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuarios por codigo: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar usuarios por codigo: " + e.getMessage());
        }
        return usuario;


    }

   
    public Usuario getUsuariobyNom(String nome) {
        //Abre e fecha conexao
        Connection conn = null;
        //envia p banco
        PreparedStatement pstm = null;
        //tras do banco
        ResultSet rs;
         Usuario usuario = new Usuario();

        try {
            conn = (Connection) FabricaConecta.getConexao();
            pstm = conn.prepareStatement(LIST_NOM);
            pstm.setString(1,nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                usuario.setId(rs.getInt("codigo"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                Cargo c = new Cargo();
                c.setId(rs.getInt("cargo.codigo"));
                c.setCargo(rs.getString("cargo.cargo"));
                usuario.setIdCargo(c);
                usuario.setDataCadastro(rs.getDate("data_cadastro"));
                AreaUsuario au = new AreaUsuario();
                au.setId(rs.getInt("area_usuario.codigo"));
                au.setArea(rs.getString("area_usuario.area"));
                usuario.setIdAreaUsuario(au);
                
                
            }
            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuarios por nome: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao listar usuarios por nome: " + e.getMessage());
        }
        return usuario;

    }
    public boolean validaLogin(String login, String senha) {

        boolean autenticado = false;
        //conectar com banco
        Connection conn = null;
        //pra enviar alguma coisa pro banco
        PreparedStatement pstm = null;
        //receber alguma coisa do banco
        ResultSet rs;
        Usuario usuario = new Usuario();
        try {
            //conectar com banco
            conn = FabricaConecta.getConexao();
            pstm = conn.prepareStatement(VERIFICALOGIN);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }

            FabricaConecta.fecharConexao(conn, pstm, rs);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao validar login e senha: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro ao validar login e senha: " + e.getMessage());
        }
        return autenticado;
    }
}
