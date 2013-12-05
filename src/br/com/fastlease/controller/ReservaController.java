/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastlease.controller;

import br.com.fastlease.dao.ReservaDAO;
import br.com.fastlease.dao.ReservaDAOJDBC;
import br.com.fastlease.model.Reserva;
import java.util.Date;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class ReservaController {
    
     /**
     * Método que liga o botão inserir da interface gráfica com o método inserir
     * do banco de dados
     * @param reserva
     */
    public void inserir(Reserva reserva){
        ReservaDAO dao = new ReservaDAOJDBC();
        dao.inserir(reserva);        
    }
 
    /**
     * Método que liga o botão atualizar da interface gráfica com o método atualizar
     * do banco de dados
     * @param reserva
     */
    public void atualizar (Reserva reserva){
        ReservaDAO dao = new ReservaDAOJDBC();
        dao.atualizar (reserva);
        
    }
    /**
     * Método que liga o botão remover da interface gráfica com o método remover
     * do banco de dados
     * @param reserva
     */
    public void excluir (int num){
        ReservaDAO dao = new ReservaDAOJDBC();
        dao.remover (num);        
    }
    /**
     * Método que retorna os reservas cadastrados na base de
     * dados para preencher a tabela presente na view
     * @return lista de reservas
     */
    public List<Reserva> buscarReserva(){
        ReservaDAO dao = new ReservaDAOJDBC();
        return dao.getReserva();
    }
  
     /**
     * Método que retorna os reservas cadastrados na base de
     * dados para preencher os campos de edição
     * @return lista de reservas
     */
    public Reserva buscarReservabyId(Integer codigo){
        ReservaDAO dao = new ReservaDAOJDBC();
        return dao.getReservabyId(codigo);
    }
    public Reserva buscarReservabyTurno(String turno){
        ReservaDAO dao = new ReservaDAOJDBC();
        return dao.getReservabyTurno(turno);
    }
    
    public List<Reserva> buscarReservabyData(String data){
         ReservaDAO dao = new ReservaDAOJDBC();
        return dao.getReservabyData(data);
    }
}
