package br.com.fastlease.view;


import br.com.fastlease.controller.*;
import br.com.fastlease.model.Bloco;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * Classe responsável por exibir a interface gráfica da Janela de Relatórios
 *
 * @author mauricio_p_cardoso
 */
public class BlocoLista extends javax.swing.JFrame {

    private BlocoTableModel model;

    public BlocoLista() {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        List<Bloco> lista = new ArrayList<Bloco>();
        BlocoController a = new BlocoController();
        lista = a.buscarBloco();

        //cria o modelo de Produto      
        model = new BlocoTableModel(lista);

        //atribui o modelo à tabela
        tabelaBloco.setModel(model);

        // Ordenar tabela conforme cabeçalho coluna clicado.
        tabelaBloco.setAutoCreateRowSorter(true);



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        paineSup = new javax.swing.JPanel();
        painelInf = new javax.swing.JPanel();
        painelCabecalhoCliente1 = new javax.swing.JPanel();
        labelCadCliente1 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBloco = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        cmpNomePesq = new javax.swing.JTextField();
        labelNomeRelFun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Blocos");

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        paineSup.setBackground(new java.awt.Color(0, 0, 0));

        org.jdesktop.layout.GroupLayout paineSupLayout = new org.jdesktop.layout.GroupLayout(paineSup);
        paineSup.setLayout(paineSupLayout);
        paineSupLayout.setHorizontalGroup(
            paineSupLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        paineSupLayout.setVerticalGroup(
            paineSupLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        painelInf.setBackground(new java.awt.Color(0, 0, 0));

        org.jdesktop.layout.GroupLayout painelInfLayout = new org.jdesktop.layout.GroupLayout(painelInf);
        painelInf.setLayout(painelInfLayout);
        painelInfLayout.setHorizontalGroup(
            painelInfLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        painelInfLayout.setVerticalGroup(
            painelInfLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        painelCabecalhoCliente1.setBackground(new java.awt.Color(0, 0, 0));

        labelCadCliente1.setBackground(new java.awt.Color(252, 250, 250));
        labelCadCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadCliente1.setText("BLOCOS");
        labelCadCliente1.setToolTipText("");
        labelCadCliente1.setOpaque(true);

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setOpaque(true);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(255, 255, 255));
        btEditar.setText("Editar");
        btEditar.setContentAreaFilled(false);
        btEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditar.setOpaque(true);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        btEditar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btEditarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btInserir.setBackground(new java.awt.Color(255, 255, 255));
        btInserir.setText("Inserir");
        btInserir.setContentAreaFilled(false);
        btInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInserir.setOpaque(true);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout painelCabecalhoCliente1Layout = new org.jdesktop.layout.GroupLayout(painelCabecalhoCliente1);
        painelCabecalhoCliente1.setLayout(painelCabecalhoCliente1Layout);
        painelCabecalhoCliente1Layout.setHorizontalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelCadCliente1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 211, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btExcluir)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btEditar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btInserir)
                .addContainerGap())
        );
        painelCabecalhoCliente1Layout.setVerticalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(labelCadCliente1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .add(painelCabecalhoCliente1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btExcluir)
                    .add(btEditar)
                    .add(btInserir))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaBloco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "I - Prédio Principal", "4"},
                {"02", "II - Cerâmica", "1"},
                {"03", "III - Piloto", "1"},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Qtde de Pisos"
            }
        ));
        jScrollPane1.setViewportView(tabelaBloco);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        cmpNomePesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpNomePesqActionPerformed(evt);
            }
        });
        cmpNomePesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpNomePesqKeyPressed(evt);
            }
        });

        labelNomeRelFun.setText("Bloco:");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelNomeRelFun)
                .add(18, 18, 18)
                .add(cmpNomePesq, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cmpNomePesq, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelNomeRelFun, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout painelPrincipalLayout = new org.jdesktop.layout.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(paineSup, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, painelInf, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .add(painelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(painelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(painelCabecalhoCliente1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelPrincipalLayout.createSequentialGroup()
                .add(paineSup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(painelCabecalhoCliente1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(painelInf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelPrincipal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelPrincipal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo do campo nome que procura um funcionario pelo seu nome, no qual é
     * digitado na caixa de texto.
     *
     * @param evt
     */
    private void cmpNomePesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNomePesqActionPerformed
        efetuaPesquisa();
    }//GEN-LAST:event_cmpNomePesqActionPerformed

    /**
     * Método do botão excluir que remove um funcionario da base de dados
     *
     * @param evt
     */
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
int selecionado = -1;
        selecionado = tabelaBloco.getSelectedRow();

        String message = "Você tem certeza que deseja excluir?";
        String title = "Deseja sair?";
        int condicao = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (condicao == JOptionPane.YES_OPTION) {

            if (selecionado >= 0) {
                Integer i = (Integer) model.getValueAt(selecionado, 0);
                BlocoController cc = new BlocoController();
                cc.remover(i);
                model.removeBloco(selecionado);
                JOptionPane.showMessageDialog(null, "Bloco excluido com sucesso");
                
            } else {
                JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
            }
        }


    }//GEN-LAST:event_btExcluirActionPerformed

    /**
     * Método do botão editar que altera os dados de um funcionario.Exibe a
     * Janela Editar
     *
     * @param evt
     */
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        int selecionado = -1;
        selecionado = tabelaBloco.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdModelo = (Integer) model.getValueAt(selecionado, 0);
            BlocoEditar am = new BlocoEditar(selecionado, cdModelo, model);
            am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    /**
     * Método do botão inserir que exibe a InserirSala
     *
     * @param evt
     */
    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed

        BlocoInserir jc = new BlocoInserir(model);
        jc.setVisible(true);
        
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btEditarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarAncestorAdded

    private void cmpNomePesqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNomePesqKeyPressed
        efetuaPesquisa();
    }//GEN-LAST:event_cmpNomePesqKeyPressed
    private void efetuaPesquisa() {
        String nome = cmpNomePesq.getText();
        List<Bloco> lista = new ArrayList<Bloco>();
        BlocoController a = new BlocoController();
        lista = a.buscarBlocobyNome(nome);
        model.limpar();

        //cria o modelo de Produto      
        model = new BlocoTableModel(lista);

        //atribui o modelo à tabela
        tabelaBloco.setModel(model);
    }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JTextField cmpNomePesq;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCadCliente1;
    private javax.swing.JLabel labelNomeRelFun;
    private javax.swing.JPanel paineSup;
    private javax.swing.JPanel painelCabecalhoCliente1;
    private javax.swing.JPanel painelInf;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tabelaBloco;
    // End of variables declaration//GEN-END:variables
}
