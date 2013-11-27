package br.com.fastlease.model;

/**
 * Classe responsavel por modelar os objetos do tipo funcionario
 * @author Mauricio Cardoso
 * @version 1.0, 17/05/13
 */
public class Arquetipo{

    private int id;
    private String nome;    

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

   
     public String toString() {
        return this.nome;
    }
    
}
