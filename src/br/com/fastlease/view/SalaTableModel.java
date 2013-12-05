package br.com.fastlease.view;

import br.com.fastlease.model.Arquetipo;
import br.com.fastlease.model.Bloco;
import br.com.fastlease.model.Sala;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
  * @author mauricio_p_cardoso
 */
public class SalaTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_ARQUETIPO = 2;
    private static final int COL_BLOCO = 3;
    private static final int COL_PISO = 4;
    
    private List<Sala> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Nome", "Arquétipo", "Bloco","Piso"};

    //Cria uma ReservaTableModel sem nenhuma linha
    public SalaTableModel() {
        linhas = new ArrayList<Sala>();
    }

    //Cria uma ReservaTableModel contendo a lista recebida por parâmetro.
    public SalaTableModel(List<Sala> prof) {
        this.linhas = new ArrayList<Sala>(prof);
    }

    public int getRowCount() {
        return linhas.size();
    }

    /*
     * Retorna a quantidade de colunas
     * 2 colunas: uma para id e a outra para nome.
     */
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public Class getColumnClass(int columnIndex) {
        //Qual a classe das nossas colunas? A coluna 1 é inteira, as outras string.  
        if (columnIndex == COL_ID) {
            return Integer.class;
        } else if (columnIndex == COL_NOME) {
            return String.class;
        } else if (columnIndex == COL_ARQUETIPO) {
            return Arquetipo.class;
        } else if (columnIndex == COL_BLOCO) {
            return Bloco.class;
        }else if (columnIndex == COL_PISO) {
            return String.class;
        } 
        return Sala.class;
        

    }
     //return null;

   
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega o cliente da linha
        Sala c = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return c.getId();
        } else if (column == COL_NOME) {
            return c.getNome();
        } else if (column == COL_ARQUETIPO) {
            return c.getIdArquetipo();
        } else if (column == COL_BLOCO) {
            return c.getIdBloco();
        } else if (column == COL_PISO) {
            return c.getPiso();
        } 
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Sala c1 = linhas.get(row);
        if (column == COL_ID) {
            c1.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            c1.setNome((String) aValue);
        } else if (column == COL_ARQUETIPO) {
            c1.setIdArquetipo((Arquetipo) aValue);
        } else if (column == COL_BLOCO) {
            c1.setIdBloco((Bloco) aValue);
        } else if (column == COL_PISO) {
            c1.setPiso((String) aValue);
        } 
    }

    // Retorna a marca referente a linha especificada
    public Sala getSala(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


    public void addSala(Sala prof) {
        // Adiciona o registro.
        linhas.add(prof);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        

    }

    public void updateSala(int indiceLinha, Sala prof) {
        linhas.set(indiceLinha, prof);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
       
    }

    //Remove o sócio da linha especificada.
    public void removeSala(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }    
}
