package br.com.model.negocio;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
@Entity
public class Reserva {
    
    @Id
    @GeneratedValue
    private int codigo;
    
    @Temporal(TemporalType.DATE)
    private Date dt_cadastro;
    private String turno;
    @Temporal(TemporalType.DATE)
    private Date dt_reserva;
    
    @OneToMany
    @JoinColumn (name = "codSala", referencedColumnName = "codigo")
    private Sala codSala;
    
    @OneToMany
    @JoinColumn (name = "codSala", referencedColumnName = "codigo")
    private Usuario codUsuario;
    
    @OneToMany
    @JoinColumn (name = "codCurso", referencedColumnName = "codigo")
    private Curso codCurso;

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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Sala getCodSala() {
        return codSala;
    }

    public void setCodSala(Sala codSala) {
        this.codSala = codSala;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Curso getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Curso codCurso) {
        this.codCurso = codCurso;
    }
    
    public Date getDt_reserva() {
        return dt_reserva;
    }

    public void setDt_reserva(Date dt_reserva) {
        this.dt_reserva = dt_reserva;
    }
    
    
    
}
