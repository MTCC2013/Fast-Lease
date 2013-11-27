package br.com.fastlease.model;

/**
 * Classe responsavel por modelar os objetos do tipo funcionario
 * @author Mauricio Cardoso
 * @version 1.0, 17/05/13
 */
public class Bloco{

    private int id;
    private String nome;    
    private int qntPiso;
       

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

    public int getQntPiso() {
        return qntPiso;
    }

    public void setQntPiso(int qntPiso) {
        this.qntPiso = qntPiso;
    }
       
     public String toString() {
        return this.nome;
    }
    
}
