package br.com.senai.model;

public class Particularidades {
    
    private int codigo;
    private int qnt_maquina;
    private String softwares[];

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQnt_maquina() {
        return qnt_maquina;
    }

    public void setQnt_maquina(int qnt_maquina) {
        this.qnt_maquina = qnt_maquina;
    }

    public String[] getSoftwares() {
        return softwares;
    }

    public void setSoftwares(String[] softwares) {
        this.softwares = softwares;
    }
    
    
    
    
}
