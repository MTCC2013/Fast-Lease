package br.com.model.negocio;

import java.util.Date;

public class Reserva {
    
    private int codigo;
    private Date dt_cadastro;
    private int cod_sala;
    private int cod_prof;
    private int turno;
    private Date dt_reserva;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(Date dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    public int getCod_sala() {
        return cod_sala;
    }

    public void setCod_sala(int cod_sala) {
        this.cod_sala = cod_sala;
    }

    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Date getDt_reserva() {
        return dt_reserva;
    }

    public void setDt_reserva(Date dt_reserva) {
        this.dt_reserva = dt_reserva;
    }
    
    
    
}
