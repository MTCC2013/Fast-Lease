package br.com.fastlease.view;

import br.com.fastlease.model.Arquetipo;
import br.com.fastlease.model.Bloco;
import br.com.fastlease.model.Reserva;
import br.com.fastlease.model.Reserva;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
  * @author mauricio_p_cardoso
 */
public class ReservaTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_DATACAD = 1;
    private static final int COL_DATARES = 2;
    private static final int COL_TURNO = 3;
        
    private List<Reserva> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código","Data de cadastro", "Data reservada", "Turno"};

    //Cria uma ReservaTableModel sem nenhuma linha
    public ReservaTableModel() {
        linhas = new ArrayList<Reserva>();
    }

    //Cria uma ReservaTableModel contendo a lista recebida por parâmetro.
    public ReservaTableModel(List<Reserva> prof) {
        this.linhas = new ArrayList<Reserva>(prof);
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
        } else if (columnIndex == COL_DATACAD) {
            return Date.class;
        } else if (columnIndex == COL_DATARES) {
            return String.class;
        } else if (columnIndex == COL_TURNO) {
            return String.class;
        } 
        return Reserva.class;
        

    }
     //return null;

   
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega o cliente da linha
        Reserva c = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return c.getId();
        } else if (column == COL_DATACAD) {
            return c.getDtCadastro();
        } else if (column == COL_DATARES) {
            return c.getDtReserva();
        } else if (column == COL_TURNO) {
            return c.getTurno();
        } 
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Reserva c1 = linhas.get(row);
        
        if (column == COL_ID) {
            c1.setId((Integer) aValue);
        } else if (column == COL_DATACAD) {
            c1.setDtCadastro((Date) aValue);
        } else if (column == COL_DATARES) {
            c1.setDtReserva((String) aValue);
        } else if (column == COL_TURNO) {
            c1.setTurno((String) aValue);
        } 
    }

    // Retorna a marca referente a linha especificada
    public Reserva getReserva(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


    public void addReserva(Reserva res) {
        // Adiciona o registro.
        linhas.add(res);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        

    }

    public void updateReserva(int indiceLinha, Reserva res) {
        linhas.set(indiceLinha, res);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
       
    }

    //Remove o sócio da linha especificada.
    public void removeReserva(int indiceLinha) {
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
