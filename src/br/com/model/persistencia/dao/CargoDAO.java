/*
 * Interface DAO do Cargo, onde são predefinidos os métodos que seram implementados
 * na classe CargoDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe Cargo
import br.com.senai.model.negocio.Cargo;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface CargoDAO  extends DAO<Cargo, Integer>{
    
    //Listar todos os cargos inseridos na tabela
    List<Cargo> ListByCargo (String cargo);
    
    //Pesquisar um cargo
    Cargo getByCargo(String cargo);
    
}
