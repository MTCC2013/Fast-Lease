package br.com.fastlease.model;

import java.util.Date;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */

public class Reserva {
    
    private int id;
    private Date dtCadastro;
    private String turno;
    private String dtReserva;
    private Sala idSala;
    private Usuario idUsuario;
    private Curso idCurso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDtReserva() {
        return dtReserva;
    }

    public void setDtReserva(String dtReserva) {
        this.dtReserva = dtReserva;
    }

    public Sala getIdSala() {
        return idSala;
    }

    public void setIdSala(Sala idSala) {
        this.idSala = idSala;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }
    
    @Override
    public String toString() {
        return this.turno;
    }
    
   }
