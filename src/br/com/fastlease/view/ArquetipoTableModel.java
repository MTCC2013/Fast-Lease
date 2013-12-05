package br.com.fastlease.view;

import br.com.fastlease.model.Arquetipo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author Rosicléia Frasson
 */
public class ArquetipoTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    
    
    private List<Arquetipo> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Nome"};

    //Cria uma ArquetipoTableModel sem nenhuma linha
    public ArquetipoTableModel() {
        linhas = new ArrayList<Arquetipo>();
    }

    //Cria uma ArquetipoTableModel contendo a lista recebida por parâmetro.
    public ArquetipoTableModel(List<Arquetipo> arquetipos) {
        this.linhas = new ArrayList<Arquetipo>(arquetipos);
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
        }
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega a arquetipo da linha
        Arquetipo m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return m.getId();
        } else if (column == COL_NOME) {
            return m.getNome();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Arquetipo u = linhas.get(row);
        if (column == COL_ID) {
            u.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome(aValue.toString());
        } 
    }

    // Retorna a arquetipo referente a linha especificada
    public Arquetipo getArquetipo(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


// Adiciona a arquetipo especificada ao modelo
    public void addArquetipo(Arquetipo arquetipo) {
        // Adiciona o registro.
        linhas.add(arquetipo);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
      

    }
    
        public void updateArquetipo(int indiceLinha, Arquetipo arquetipo) {
            linhas.set(indiceLinha, arquetipo);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        
    }
    
    //Remove o sócio da linha especificada.
    public void removeArquetipo(int indiceLinha) {
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
