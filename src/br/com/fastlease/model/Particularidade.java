package br.com.fastlease.model;

/**
 * Classe responsavel por modelar os objetos do tipo funcionario
 * @author Mauricio Cardoso
 * @version 1.0, 17/05/13
 */
public class Particularidade{

    private int id;
    private String nome;
    private int qtdeMaq;    
    private String obs;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdeMaq() {
        return qtdeMaq;
    }

    public void setQtdeMaq(int qtdeMaq) {
        this.qtdeMaq = qtdeMaq;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
           
    public String toString() {
        return this.nome;
    }
}
