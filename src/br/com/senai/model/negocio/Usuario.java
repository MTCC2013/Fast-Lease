package br.com.senai.model.negocio;

import java.util.Date;

public class Usuario {
    
    private int codigo;
    private int id_AreaProfessor;
    private String turmas[];
    private String login;
    private String senha;
    private String cargo;
    private Date data_cadastro;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId_AreaProfessor() {
        return id_AreaProfessor;
    }

    public void setId_AreaProfessor(int id_AreaProfessor) {
        this.id_AreaProfessor = id_AreaProfessor;
    }

    public String[] getTurmas() {
        return turmas;
    }

    public void setTurmas(String[] turmas) {
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
