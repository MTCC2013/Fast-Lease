package br.com.fastlease.view;

import br.com.fastlease.model.Cargo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Antônio da Silva Júnior, Mauricio Pires Cardoso
 */
public class CargoTabelModel extends AbstractTableModel {

    //Declara as colunas das tabelas
    private static final int COL_COD = 0;
    private static final int COL_CARGO = 1;
    private List<Cargo> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Cargo"};

    //Cria uma CargoTableModel sem nenhuma linha
    public CargoTabelModel() {
        linhas = new ArrayList<Cargo>();
    }

    //Cria uma CargoTableModel contendo a lista recebida por parâmetro.
    public CargoTabelModel(List<Cargo> cargos) {
        this.linhas = new ArrayList<Cargo>(cargos);
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
        //Tipo das colunas
        if (columnIndex == COL_COD) {
            return Integer.class;
        } else if (columnIndex == COL_CARGO) {
            return String.class;
        }
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. A tabela toda é editável.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega o cargo da linha
        Cargo m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_COD) {
            return m.getId();
        } else if (column == COL_CARGO) {
            return m.getCargo();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Seta valores nos campos 
        Cargo u = linhas.get(row);
        if (column == COL_COD) {
            u.setId((Integer) aValue);
        } else if (column == COL_CARGO) {
            u.setCargo(aValue.toString());
        }
    }

    // Retorna o cargo referente a linha especificada
    public Cargo getCargo(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona o cargo especificado ao modelo
    public void addCargo(Cargo cargo) {
        // Adiciona o registro.
        linhas.add(cargo);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);


    }

    public void updateCargo(int indiceLinha, Cargo marca) {
        linhas.set(indiceLinha, marca);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);

    }

    //Remove o sócio da linha especificada.
    public void removeCargo(int indiceLinha) {
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
