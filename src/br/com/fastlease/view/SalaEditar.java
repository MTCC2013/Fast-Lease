package br.com.fastlease.view;

import br.com.fastlease.controller.ArquetipoController;
import br.com.fastlease.controller.BlocoController;

import br.com.fastlease.controller.SalaController;
import br.com.fastlease.model.Arquetipo;
import br.com.fastlease.model.Bloco;

import br.com.fastlease.model.Sala;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Classe responsavel pela inteface gráfica do software
 *
 * @author Mauricio
 */
public class SalaEditar extends javax.swing.JFrame {

    int linhaSelecionada;
    int codigoMarca;
    SalaTableModel model;

    public SalaEditar(int selecionado, int cdSala, SalaTableModel mtb) {

        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        linhaSelecionada = selecionado;
        cdSala = cdSala;
        model = mtb;

        SalaController pc = new SalaController();
        Sala p = new Sala();
        p = pc.buscarSalabyId(cdSala);

        cmpId.setText(Integer.toString(p.getId()));
        cmpNome.setText(p.getNome());

        carregarComboArq();
        carregarComboBloco();
        

        if (p.getPiso().equals("Terreo")) {
            cmbPiso.setSelectedIndex(0);
        } else if (p.getPiso().equals("1")) {
            cmbPiso.setSelectedIndex(1);
        } else if (p.getPiso().equals("2")) {
            cmbPiso.setSelectedIndex(2);
        } else if (p.getPiso().equals("3")) {
            cmbPiso.setSelectedIndex(3);
        } else if (p.getPiso().equals("4")) {
            cmbPiso.setSelectedIndex(4);
        } else if (p.getPiso().equals("5")) {
            cmbPiso.setSelectedIndex(5);
        } else if (p.getPiso().equals("6")) {
            cmbPiso.setSelectedIndex(6);
        }

        txtObs.setText(p.getObs());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        vistaInf = new javax.swing.JPanel();
        vistaSup = new javax.swing.JPanel();
        abaCadastroCliente1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbArquetipo = new javax.swing.JLabel();
        lbBloco = new javax.swing.JLabel();
        cmpNome = new javax.swing.JTextField();
        cmbPiso = new javax.swing.JComboBox();
        lbPiso = new javax.swing.JLabel();
        cmbArquetipo = new javax.swing.JComboBox();
        cmbBloco = new javax.swing.JComboBox();
        lbObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        cmpId = new javax.swing.JTextField();
        lbNome1 = new javax.swing.JLabel();
        painelCabecalhoCliente1 = new javax.swing.JPanel();
        labelCadCliente1 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btApagarFun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Sala");

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        vistaInf.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout vistaInfLayout = new javax.swing.GroupLayout(vistaInf);
        vistaInf.setLayout(vistaInfLayout);
        vistaInfLayout.setHorizontalGroup(
            vistaInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        vistaInfLayout.setVerticalGroup(
            vistaInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        vistaSup.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout vistaSupLayout = new javax.swing.GroupLayout(vistaSup);
        vistaSup.setLayout(vistaSupLayout);
        vistaSupLayout.setHorizontalGroup(
            vistaSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        vistaSupLayout.setVerticalGroup(
            vistaSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        abaCadastroCliente1.setBackground(new java.awt.Color(252, 250, 250));
        abaCadastroCliente1.setForeground(new java.awt.Color(204, 204, 0));
        abaCadastroCliente1.setToolTipText("");

        lbNome.setBackground(new java.awt.Color(204, 204, 0));
        lbNome.setText("Nome:");

        lbArquetipo.setBackground(new java.awt.Color(204, 204, 0));
        lbArquetipo.setText("Arquétipo:");

        lbBloco.setBackground(new java.awt.Color(204, 204, 0));
        lbBloco.setText("Bloco:");

        cmbPiso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terreo", "1", "2", "3", "4", "5", "6" }));

        lbPiso.setBackground(new java.awt.Color(204, 204, 0));
        lbPiso.setText("Piso:");

        cmbArquetipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Feminino", "Masculino" }));

        cmbBloco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Feminino", "Masculino" }));

        lbObs.setBackground(new java.awt.Color(204, 204, 0));
        lbObs.setText("Observações:");

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        cmpId.setEnabled(false);

        lbNome1.setBackground(new java.awt.Color(204, 204, 0));
        lbNome1.setText("Código:");

        javax.swing.GroupLayout abaCadastroCliente1Layout = new javax.swing.GroupLayout(abaCadastroCliente1);
        abaCadastroCliente1.setLayout(abaCadastroCliente1Layout);
        abaCadastroCliente1Layout.setHorizontalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addComponent(lbNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNome)
                                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbBloco)
                                            .addComponent(lbArquetipo))
                                        .addGap(1, 1, 1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCadastroCliente1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbObs)))
                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbArquetipo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbPiso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        abaCadastroCliente1Layout.setVerticalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbArquetipo)
                    .addComponent(cmbArquetipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBloco)
                    .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPiso)
                        .addComponent(cmbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbObs)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        painelCabecalhoCliente1.setBackground(new java.awt.Color(0, 0, 0));

        labelCadCliente1.setBackground(new java.awt.Color(252, 250, 250));
        labelCadCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadCliente1.setText("ATUALIZAÇÃO DE SALAS");
        labelCadCliente1.setOpaque(true);

        btCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setContentAreaFilled(false);
        btCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastrar.setOpaque(true);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btApagarFun.setBackground(new java.awt.Color(255, 255, 255));
        btApagarFun.setText("Apagar");
        btApagarFun.setContentAreaFilled(false);
        btApagarFun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btApagarFun.setOpaque(true);
        btApagarFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarFunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCabecalhoCliente1Layout = new javax.swing.GroupLayout(painelCabecalhoCliente1);
        painelCabecalhoCliente1.setLayout(painelCabecalhoCliente1Layout);
        painelCabecalhoCliente1Layout.setHorizontalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btApagarFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastrar)
                .addContainerGap())
        );
        painelCabecalhoCliente1Layout.setVerticalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addComponent(btApagarFun)
                        .addGap(34, 34, 34))))
            .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistaSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vistaInf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abaCadastroCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCabecalhoCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(vistaSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelCabecalhoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abaCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(vistaInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        Sala f = new Sala();
        if (cmpNome.getText().length() <=0){
            JOptionPane.showMessageDialog(null, "Campos obrigatórios vazios");
        }else{        
        f.setId(Integer.parseInt(cmpId.getText()));
        f.setNome(cmpNome.getText());
        f.setIdArquetipo((Arquetipo) cmbArquetipo.getSelectedItem());
        f.setIdBloco((Bloco) cmbBloco.getSelectedItem());
        f.setPiso(cmbPiso.getSelectedItem().toString());
        f.setObs(txtObs.getText());

        SalaController fc = new SalaController();
        fc.atualizar(f);
        model.updateSala(linhaSelecionada, f);
        dispose();

        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btApagarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarFunActionPerformed

        limpar();
    }//GEN-LAST:event_btApagarFunActionPerformed

    private void limpar() {
        cmpNome.setText("");
        txtObs.setText("");
        cmbArquetipo.setSelectedItem("");
        cmbBloco.setSelectedItem("");
        cmbPiso.setSelectedItem("");
       

    }

    private void carregarComboArq() {
        //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cmbArquetipo.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Arquetipo> s = new ArrayList<Arquetipo>();
        ArquetipoController a = new ArquetipoController();
        s = a.buscarArquetipo();

        for (int linha = 0; linha < s.size(); linha++) {
            //pegando a categoria da lista
            Arquetipo arquetipo = s.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(arquetipo);

        }
    }

    private void carregarComboBloco() {
        //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cmbBloco.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Bloco> s = new ArrayList<Bloco>();
        BlocoController a = new BlocoController();
        s = a.buscarBloco();

        for (int linha = 0; linha < s.size(); linha++) {
            //pegando a categoria da lista
            Bloco bloco = s.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(bloco);

        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaCadastroCliente1;
    private javax.swing.JButton btApagarFun;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JComboBox cmbArquetipo;
    private javax.swing.JComboBox cmbBloco;
    private javax.swing.JComboBox cmbPiso;
    private javax.swing.JTextField cmpId;
    private javax.swing.JTextField cmpNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCadCliente1;
    private javax.swing.JLabel lbArquetipo;
    private javax.swing.JLabel lbBloco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbPiso;
    private javax.swing.JPanel painelCabecalhoCliente1;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JPanel vistaInf;
    private javax.swing.JPanel vistaSup;
    // End of variables declaration//GEN-END:variables
}
