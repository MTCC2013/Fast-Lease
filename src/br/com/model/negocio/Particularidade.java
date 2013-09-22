package br.com.model.negocio;

public class Particularidade {
    
    private int codigo;
    private int qnt_maquina;
    private String idSoftware[];

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
        return idSoftware;
    }

    public void setSoftwares(String[] softwares) {
        this.idSoftware = softwares;
    }
    
    
    
    
}
