package br.com.controller;
import br.com.model.negocio.Cargo;

import br.com.model.persist.CargoDAOImpl;
import br.com.model.persist.dao.CargoDAO;
import java.util.List;


/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class CargoController {
    
    
     public boolean salvar(Cargo cargo) {
        CargoDAO dao = new CargoDAOImpl();
       return dao.save(cargo);

    }

    public boolean excluir(int id) {
        CargoDAO dao = new CargoDAOImpl();
        return dao.remove(Cargo.class, id);

    }
    
    public List<Cargo> listarCargo() {
        CargoDAO dao = new CargoDAOImpl();
        return dao.getAll(Cargo.class);
    }
    
    public Cargo listarCargoById (int id){
        CargoDAO dao = new CargoDAOImpl();
        return dao.getById(Cargo.class, id);
    }
    
   public List<Cargo> listarByCargo (String cargo){
        CargoDAO dao = new CargoDAOImpl();
        return dao.ListByCargo(cargo);
    }
   
   public Cargo getByCargo(String cargo){
       CargoDAO dao = new CargoDAOImpl();
       return dao.getByCargo(cargo);
   }
    
}
