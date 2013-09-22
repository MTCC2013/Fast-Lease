package br.com.controller;
import br.com.model.negocio.Reserva;

import br.com.model.persist.ReservaDAOImpl;
import br.com.model.persist.dao.ReservaDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class ReservaController {
    
    
     public boolean salvar(Reserva reserva) {
        ReservaDAO dao = new ReservaDAOImpl();
       return dao.save(reserva);

    }

    public boolean excluir(int id) {
        ReservaDAO dao = new ReservaDAOImpl();
        return dao.remove(Reserva.class, id);

    }
    
    public List<Reserva> listarReserva() {
        ReservaDAO dao = new ReservaDAOImpl();
        return dao.getAll(Reserva.class);
    }
    
    public Reserva listarReservaById (int id){
        ReservaDAO dao = new ReservaDAOImpl();
        return dao.getById(Reserva.class, id);
    }
    
   public List<Reserva> listarByReserva (String reserva){
        ReservaDAO dao = new ReservaDAOImpl();
        return dao.ListByReserva(reserva);
    }
   
   public Reserva getByReserva(String reserva){
       ReservaDAO dao = new ReservaDAOImpl();
       return dao.getByReserva(reserva);
   }
    
}
