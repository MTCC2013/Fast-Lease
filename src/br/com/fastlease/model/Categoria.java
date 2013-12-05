package br.com.fastlease.model;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class Categoria {
    private int id;
    private String categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String Categoria) {
        this.categoria = Categoria;
    }
    
    @Override
    public String toString() {
        return this.categoria;
    }
    
    
}
