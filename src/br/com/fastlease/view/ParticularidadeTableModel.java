package br.com.fastlease.view;

import br.com.senai.model.Particularidade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author Rosicléia Frasson
 */
public class ParticularidadeTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_QTDEMAQUINA = 2;
    
    private List<Particularidade> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Nome","Qtde Máquinas"};

    //Cria uma ParticularidadeTableModel sem nenhuma linha
    public ParticularidadeTableModel() {
        linhas = new ArrayList<Particularidade>();
    }

    //Cria uma ParticularidadeTableModel contendo a lista recebida por parâmetro.
    public ParticularidadeTableModel(List<Particularidade> particularidades) {
        this.linhas = new ArrayList<Particularidade>(particularidades);
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
        if (columnIndex == COL_NOME) {
            return String.class;
        }
        if (columnIndex == COL_QTDEMAQUINA) {
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
        //pega a particularidade da linha
        Particularidade m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return m.getId();
        } else if (column == COL_NOME) {
            return m.getNome();        
        } else if (column == COL_QTDEMAQUINA) {
            return m.getQtdeMaq();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Particularidade u = linhas.get(row);
        if (column == COL_ID) {
            u.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome(aValue.toString());
        } else if (column == COL_QTDEMAQUINA) {
            u.setQtdeMaq((Integer) aValue);
        }
    }
    // Retorna a particularidade referente a linha especificada
    public Particularidade getParticularidade(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


// Adiciona a particularidade especificada ao modelo
    public void addParticularidade(Particularidade particularidade) {
        // Adiciona o registro.
        linhas.add(particularidade);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        ordenarPorNome();

    }
    
        public void updateParticularidade(int indiceLinha, Particularidade particularidade) {
            linhas.set(indiceLinha, particularidade);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarPorNome();
    }
    
    //Remove o sócio da linha especificada.
    public void removeParticularidade(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        ordenarPorNome();
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
    
    public void ordenarPorNome() {
        //ordena pelo nome
        Collections.sort(linhas, new Comparator<Particularidade>() {

            public int compare(Particularidade o1, Particularidade o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }
}
