package br.com.model.persistencia.dao;
import br.com.model.negocio.Usuario;
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface UsuarioDAO  extends DAO<Usuario, Integer>{
    
    
    List<Usuario> ListByUsuario (String usuario);
    
   
    Usuario getByUsuario(String usuario);
    
}
