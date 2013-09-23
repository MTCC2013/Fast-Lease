package br.com.model.negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
@Entity
public class Sala implements Serializable {
    
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private String tipo;
    
    @OneToOne
    @JoinColumn (name = "id_part", referencedColumnName = "codigo")
    private Particularidade idPart;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Particularidade getIdPart() {
        return idPart;
    }

    public void setIdPart(Particularidade idPart) {
        this.idPart = idPart;
    }
  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
