package br.com.fastlease.view;

import br.com.model.negocio.AreaUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Antônio da Silva Júnior, Mauricio Pires Cardoso
 */
public class AreaUsuarioTabelModel extends AbstractTableModel {

    // Declaração de colunas na tabela   
    private static final int COL_COD = 0;
    private static final int COL_AREA = 1;
    private List<AreaUsuario> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Área"};

    //Cria uma AreaUsuarioTableModel sem nenhuma linha
    public AreaUsuarioTabelModel() {
        linhas = new ArrayList<AreaUsuario>();
    }

    //Cria uma AreaUsuarioTableModel contendo a lista recebida por parâmetro.
    public AreaUsuarioTabelModel(List<AreaUsuario> areas) {
        this.linhas = new ArrayList<AreaUsuario>(areas);
    }

    public int getRowCount() {
        return linhas.size();
    }

    /*
     * Retorna a quantidade de colunas
     * 
     */
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public Class getColumnClass(int columnIndex) {
        //Tipos das colunas 
        if (columnIndex == COL_COD) {
            return Integer.class;
        } else if (columnIndex == COL_AREA) {
            return String.class;
        }
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. A tabela inteira será editável.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega a area da linha
        AreaUsuario m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_COD) {
            return m.getCodigo();
        } else if (column == COL_AREA) {
            return m.getArea();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        // Seta os valores as colunas 
        AreaUsuario u = linhas.get(row);
        if (column == COL_COD) {
            u.setCodigo((Integer) aValue);
        } else if (column == COL_AREA) {
            u.setArea(aValue.toString());
        }
    }

    // Retorna a area referente a linha especificada
    public AreaUsuario getAreaUsuario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona a area especificada ao modelo
    public void addAreaUsuario(AreaUsuario area) {
        // Adiciona o registro.
        linhas.add(area);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);


    }

    public void updateAreaUsuario(int indiceLinha, AreaUsuario area) {
        linhas.set(indiceLinha, area);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);

    }

    //Remove o sócio da linha especificada.
    public void removeAreaUsuario(int indiceLinha) {
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
