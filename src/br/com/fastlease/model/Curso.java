package br.com.fastlease.model;

import java.util.Date;


/**
 *
 * author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * version 1.0 21/09/2013
 */
public class Curso {
    private int id;
    private String curso;
    private String fase;
    private String duracao;
    private Date dataTermino;
    private Categoria idCategoria;

    public int getCodigo() {
        return id;
    }

    public void setCodigo(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }
    
    @Override
    public String toString() {
        return this.curso;
    }
    
}
