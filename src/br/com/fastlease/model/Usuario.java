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
    private Cargo cargo;
    private Date data_cadastro;
    private AreaUsuario areaUsuario;
    

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
   
    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public AreaUsuario getAreaUsuario() {
        return areaUsuario;
    }

    public void setAreaUsuario(AreaUsuario areaUsuario) {
        this.areaUsuario = areaUsuario;
    }
   
    
    
}
