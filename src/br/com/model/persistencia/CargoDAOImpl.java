package br.com.model.persistencia;

import br.com.model.negocio.Cargo;
import br.com.model.persistencia.dao.CargoDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class CargoDAOImpl extends DAOImpl<Cargo, Integer> implements CargoDAO{

    
    public List<Cargo> ListByCargo(String cargo) {
        return getEntityManager().createQuery("select u from Cargo u where u.nome '%" +cargo+ "%'").getResultList();
    }

    
    public Cargo getByCargo(String cargo) {
       Query q = getEntityManager().createQuery("select s from Cargo s where s.nome"
                + " like '" + cargo + "'", Cargo.class);
        List<Cargo> cargos = q.getResultList();
        Cargo cg = new Cargo();
        for (Cargo c : cargos) {
            cg = c;
        }
        return cg;

    }
    
}
