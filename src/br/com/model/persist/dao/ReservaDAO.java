package br.com.model.persist.dao;

import br.com.model.negocio.Reserva;

import java.util.List;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public interface ReservaDAO  extends DAO<Reserva, Integer>{
    
    List<Reserva> ListByReserva (String reserva);
       
    Reserva getByReserva(String reserva);
    
}
