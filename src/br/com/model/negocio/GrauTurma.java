package br.com.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
@Entity
public class GrauTurma {
    @Id
    @GeneratedValue
    private int codigo;
    private String grau_turma;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGrau_turma() {
        return grau_turma;
    }

    public void setGrau_turma(String grau_turma) {
        this.grau_turma = grau_turma;
    }
    
    
    
}
