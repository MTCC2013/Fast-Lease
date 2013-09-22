package br.com.model.persist;
import br.com.model.negocio.Reserva;
import br.com.model.persist.dao.ReservaDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class ReservaDAOImpl extends DAOImpl<Reserva, Integer> implements ReservaDAO{

    
    public List<Reserva> ListByReserva(String reserva) {
        return null;
        
    }
   
    public Reserva getByReserva(String reserva) {
       return null;

    }
    
}
