package br.com.fastlease.view;

import br.com.fastlease.model.AreaUsuario;
import br.com.fastlease.model.Cargo;
import br.com.fastlease.model.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Antônio da Silva Júnior
 */
public class UsuarioTabelModel extends AbstractTableModel {

    //Declara as colunas da tabela
    private static final int COL_COD = 0;
    private static final int COL_NOME = 1;   
    private static final int COL_CARGO = 2;
    private static final int COL_DATACADASTRO = 3;
    private static final int COL_AREA = 4;
    private List<Usuario> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Nome", "Cargo",
        "Data Cadastro", "Àrea"};

    //Cria uma UsuarioTabelModel sem nenhuma linha
    public UsuarioTabelModel() {
        linhas = new ArrayList<Usuario>();
    }

    //Cria uma UsuarioTableModel contendo a lista recebida por parâmetro.
    public UsuarioTabelModel(List<Usuario> usuarios) {
        this.linhas = new ArrayList<Usuario>(usuarios);
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
        } else if (columnIndex == COL_NOME) {
            return String.class;
        }  else if (columnIndex == COL_CARGO) {
            return Cargo.class;
        } else if (columnIndex == COL_DATACADASTRO) {
            return Date.class;
        } else if (columnIndex == COL_AREA) {
            return AreaUsuario.class;
        } else if (columnIndex == COL_DATACADASTRO) {
            return Date.class;
        }
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega o usuario da linha
        Usuario c = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_COD) {
            return c.getId();
        } else if (column == COL_NOME) {
            return c.getNome();
        } else if (column == COL_CARGO) {
            return c.getIdCargo();
        } else if (column == COL_DATACADASTRO) {
            return c.getDataCadastro();
        } else if (column == COL_AREA) {
            return c.getIdAreaUsuario();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Seta valor as colunas
        Usuario c = linhas.get(row);

        if (column == COL_COD) {
            c.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            c.setNome(aValue.toString());
        } else if (column == COL_CARGO) {
            c.setIdCargo((Cargo) aValue);
        } else if (column == COL_DATACADASTRO) {
            c.setDataCadastro((Date) aValue);
        } else if (column == COL_AREA) {
            c.setIdAreaUsuario((AreaUsuario) aValue);
        }
    }

    // Retorna o usuario referente a linha especificada
    public Usuario getUsuario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona o usuario especificado ao modelo
    public void addUsuario(Usuario usuario) {
        // Adiciona o registro.
        linhas.add(usuario);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);


    }

    public void updateUsuario(int indiceLinha, Usuario usuario) {
        linhas.set(indiceLinha, usuario);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);

    }

    //Remove o sócio da linha especificada.
    public void removeUsuario(int indiceLinha) {
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
