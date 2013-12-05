package br.com.fastlease.view;

import br.com.fastlease.model.Categoria;
import br.com.fastlease.model.Curso;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Antônio da Silva Júnior, Mauricio Pires Cardoso
 */
public class CursoTabelModel extends AbstractTableModel {

    private static final int COL_COD = 0;
    private static final int COL_CURSO = 1;
    private static final int COL_FASE = 2;
    private static final int COL_DURACAO = 3;
    private static final int COL_DATATERMINO = 4;
    private static final int COL_CATEGORIA = 5;
    private List<Curso> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Curso", "Fase", "Duração", "Data Término", "Categoria"};

    //Cria uma CursoTableModel sem nenhuma linha
    public CursoTabelModel() {
        linhas = new ArrayList<Curso>();
    }

    //Cria uma CursoTableModel contendo a lista recebida por parâmetro.
    public CursoTabelModel(List<Curso> cursos) {
        this.linhas = new ArrayList<Curso>(cursos);
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
        } else if (columnIndex == COL_CURSO) {
            return String.class;
        } else if (columnIndex == COL_FASE) {
            return String.class;
        } else if (columnIndex == COL_DURACAO) {
            return String.class;
        } else if (columnIndex == COL_DATATERMINO) {
            return Date.class;
        } else if (columnIndex == COL_CATEGORIA) {
            return Categoria.class;
        }
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega o curso da linha
        Curso c = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_COD) {
            return c.getId();
        } else if (column == COL_CURSO) {
            return c.getCurso();
        } else if (column == COL_FASE) {
            return c.getFase();
        } else if (column == COL_DURACAO) {
            return c.getDuracao();
        } else if (column == COL_DATATERMINO) {
            return c.getDataTermino();
        } else if (column == COL_CATEGORIA) {
            return c.getIdCategoria();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Seta valor as colunas
        Curso c = linhas.get(row);
        if (column == COL_COD) {
            c.setId((Integer) aValue);
        } else if (column == COL_CURSO) {
            c.setCurso(aValue.toString());
        } else if (column == COL_FASE) {
            c.setFase(aValue.toString());
        } else if (column == COL_DURACAO) {
            c.setDuracao(aValue.toString());
        } else if (column == COL_DATATERMINO) {
            c.setDataTermino((Date) aValue);
        } else if (column == COL_CATEGORIA) {
            c.setIdCategoria((Categoria) aValue);
        }
    }

    // Retorna o curso referente a linha especificada
    public Curso getCurso(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona o curso especificado ao modelo
    public void addCurso(Curso categoria) {
        // Adiciona o registro.
        linhas.add(categoria);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);


    }

    public void updateCurso(int indiceLinha, Curso marca) {
        linhas.set(indiceLinha, marca);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);

    }

    //Remove o sócio da linha especificada.
    public void removeCurso(int indiceLinha) {
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
