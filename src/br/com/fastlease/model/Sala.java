package br.com.fastlease.model;

/**
 * Classe responsavel por modelar os objetos do tipo funcionario
 * @author Mauricio Cardoso
 * @version 1.0, 17/05/13
 */
public class Sala{

    private int id;
    private String nome;
    private Arquetipo idArquetipo;
    private Bloco idBloco;    
    private String piso;
    private String obs;
      
       

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

    public Arquetipo getIdArquetipo() {
        return idArquetipo;
    }

    public void setIdArquetipo(Arquetipo idArquetipo) {
        this.idArquetipo = idArquetipo;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }


    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Bloco getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(Bloco idBloco) {
        this.idBloco = idBloco;
    }

    public String toString() {
        return this.nome;
    }
    
}
