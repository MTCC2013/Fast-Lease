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
public class Particularidade {
    
    @Id
    @GeneratedValue
    private int codigo;
    private int qntMaquina;
    
    @OneToMany            
    @JoinColumn (name = "idSoftware", referencedColumnName = "codigo")
    private Software idSoftware[];

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQntMaquina() {
        return qntMaquina;
    }

    public void setQntMaquina(int qntMaquina) {
        this.qntMaquina = qntMaquina;
    }

    public Software[] getIdSoftware() {
        return idSoftware;
    }

    public void setIdSoftware(Software[] idSoftware) {
        this.idSoftware = idSoftware;
    }

       
    
}
