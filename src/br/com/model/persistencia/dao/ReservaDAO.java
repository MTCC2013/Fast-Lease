/*
 * Interface DAO Reservas, onde são predefinidos os métodos que seram implementados
 * na classe ReservaDAOImpl
 */

//Pacote que se encontra a Interface
package br.com.model.persistencia.dao;

//Importação da Classe Reserva
import br.com.senai.model.negocio.Reserva;

//Importação da lista (List)
import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface ReservaDAO  extends DAO<Reserva, Integer>{
    
    //Listar todas as reservas inseridas na tabela
    List<Reserva> ListByReserva (String reserva);
    
    //Pesquisar uma reserva 
    Reserva getByReserva(String reserva);
    
}
