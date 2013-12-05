package br.com.fastlease.view;

import br.com.fastlease.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Antônio da Silva Júnior, Mauricio Pires Cardoso
 */
public class CategoriaTabelModel extends AbstractTableModel {
    //Declara as colunas da tabela

    private static final int COL_COD = 0;
    private static final int COL_CATEGORIA = 1;
    private List<Categoria> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Categoria"};

    //Cria uma CategoriaTableModel sem nenhuma linha
    public CategoriaTabelModel() {
        linhas = new ArrayList<Categoria>();
    }

    //Cria uma CategoriaTableModel contendo a lista recebida por parâmetro.
    public CategoriaTabelModel(List<Categoria> categorias) {
        this.linhas = new ArrayList<Categoria>(categorias);
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
        } else if (columnIndex == COL_CATEGORIA) {
            return String.class;
        }
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega a categoria da linha
        Categoria m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_COD) {
            return m.getId();
        } else if (column == COL_CATEGORIA) {
            return m.getCategoria();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Categoria u = linhas.get(row);
        if (column == COL_COD) {
            u.setId((Integer) aValue);
        } else if (column == COL_CATEGORIA) {
            u.setCategoria(aValue.toString());
        }
    }

    // Retorna a categoria referente a linha especificada
    public Categoria getCategoria(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona a categoria especificada ao modelo
    public void addCategoria(Categoria categoria) {
        // Adiciona o registro.
        linhas.add(categoria);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);


    }

    public void updateCategoria(int indiceLinha, Categoria categoria) {
        linhas.set(indiceLinha, categoria);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);

    }

    //Remove o sócio da linha especificada.
    public void removeCategoria(int indiceLinha) {
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
