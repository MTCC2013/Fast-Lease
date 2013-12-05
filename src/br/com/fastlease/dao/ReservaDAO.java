package br.com.fastlease.dao;

import br.com.fastlease.model.Reserva;
import java.util.Date;
import java.util.List;

/**
 *Interface que contém os métodos para acesso a entidade
 * pessoa da base de dados
 * @author antonio_sj
 * @version 1.0, 18/05/13
 */
public interface ReservaDAO {
    /**
     * Mátodo que faz a inserção de uma nova pessoa na base de dados
     * @param reserva 
     */
    void inserir (Reserva reserva);
    
    /**
     * Método que atualiza uma pessoa na base de dados
     * @param reserva 
     */
    void atualizar (Reserva reserva);
    
    /**
     * Método remove uma pessoa na base de dados
     * @param codigo
     */
    void remover (int codigo);
    
    /**
     * Método que busca uma pessoa na base de dados
     * @return Array List Pessoa
     */
    List<Reserva> getReserva();
    
   /**
      * metodo que busca uma pessoa pelo codigo
      * @param codigo
      * @return 
      */
    Reserva getReservabyId(Integer codigo);
    
    Reserva getReservabyTurno(String turno);   
   
    List<Reserva> getReservabyData(String data);
            
}
