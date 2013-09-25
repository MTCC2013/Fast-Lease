package br.com.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
@Entity
public class Curso {
    @Id
    @GeneratedValue
    private int codigo;
    private String curso;
    private String fase;
    private double duracao;
    
    @OneToMany
    @JoinColumn (name = "idGrauTurma", referencedColumnName = "codigo")
    private Grau idGrauTurma;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Grau getIdGrauTurma() {
        return idGrauTurma;
    }

    public void setIdGrauTurma(Grau idGrauTurma) {
        this.idGrauTurma = idGrauTurma;
    }
   
    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    
    
}
