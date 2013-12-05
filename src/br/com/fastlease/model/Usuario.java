package br.com.fastlease.model;

import java.util.Date;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */

public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String senha;
    private Cargo idCargo;
    private Date dataCadastro;
    private AreaUsuario idAreaUsuario;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
      
    public Cargo getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Cargo idCargo) {
        this.idCargo = idCargo;
    }

    public AreaUsuario getIdAreaUsuario() {
        return idAreaUsuario;
    }

    public void setIdAreaUsuario(AreaUsuario idAreaUsuario) {
        this.idAreaUsuario = idAreaUsuario;
    }
   @Override
    public String toString() {
        return this.nome;
    }
    
    
}
