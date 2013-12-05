package br.com.fastlease.view;

import br.com.fastlease.model.Bloco;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author Rosicléia Frasson
 */
public class BlocoTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_PISO = 2;
    
    
    private List<Bloco> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Nome","Qnt Pisos"};

    //Cria uma BlocoTableModel sem nenhuma linha
    public BlocoTableModel() {
        linhas = new ArrayList<Bloco>();
    }

    //Cria uma BlocoTableModel contendo a lista recebida por parâmetro.
    public BlocoTableModel(List<Bloco> blocos) {
        this.linhas = new ArrayList<Bloco>(blocos);
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
        if(columnIndex == COL_NOME){
            return String.class;
        }
        if (columnIndex == COL_PISO){
            return Integer.class;
        }
        return null;
        
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega a bloco da linha
        Bloco m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return m.getId();
        } else if (column == COL_NOME) {
            return m.getNome();
        }else if (column == COL_PISO) {
            return m.getQntPiso();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Bloco u = linhas.get(row);
        if (column == COL_ID) {
            u.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome(aValue.toString());
        } 
        else if (column == COL_PISO) {
            u.setQntPiso((Integer)aValue);
        } 
    }

    // Retorna a bloco referente a linha especificada
    public Bloco getBloco(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


// Adiciona a bloco especificada ao modelo
    public void addBloco(Bloco bloco) {
        // Adiciona o registro.
        linhas.add(bloco);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        

    }
    
        public void updateBloco(int indiceLinha, Bloco bloco) {
            linhas.set(indiceLinha, bloco);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        
    }
    
    //Remove o sócio da linha especificada.
    public void removeBloco(int indiceLinha) {
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
