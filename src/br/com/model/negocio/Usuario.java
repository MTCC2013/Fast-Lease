package br.com.model.negocio;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private String cargo;
    
    @Temporal (TemporalType.DATE)
    private Date data_cadastro;
    
    @ManyToOne
    @JoinColumn (name = "codAreaUsuario", referencedColumnName = "codigo")
    private AreaUsuario codAreaUsuario;
    
    @OneToMany
    @JoinColumn (name = "codTurma", referencedColumnName = "codigo")
    private Curso turmas[];

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

    public AreaUsuario getCodAreaUsuario() {
        return codAreaUsuario;
    }

    public void setCodAreaUsuario(AreaUsuario codAreaUsuario) {
        this.codAreaUsuario = codAreaUsuario;
    }

    public Curso[] getTurmas() {
        return turmas;
    }

    public void setTurmas(Curso[] turmas) {
        this.turmas = turmas;
    }
        public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
    
    
    
}
