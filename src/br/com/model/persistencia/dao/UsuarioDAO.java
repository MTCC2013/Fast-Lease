/*
 * Interface DAO do Usuario, onde são predefinidos os métodos que seram implementados
 * na classe UsuarioDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe Usuario
import br.com.senai.model.negocio.Usuario;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface UsuarioDAO  extends DAO<Usuario, Integer>{
    
    //Listar todos os usuarios inseridos na tabela
    List<Usuario> ListByUsuario (String usuario);
    
    //Pesquisar um usuario
    Usuario getByUsuario(String usuario);
    
}
