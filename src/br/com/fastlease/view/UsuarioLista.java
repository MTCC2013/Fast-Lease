package br.com.fastlease.view;

import br.com.fastlease.controller.UsuarioController;
import br.com.fastlease.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * Classe responsável por exibir a interface gráfica da Janela de Relatórios
 *
 * @author mauricio_p_cardoso
 */
public class UsuarioLista extends javax.swing.JFrame {

    private UsuarioTabelModel model;

    public UsuarioLista() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        List<Usuario> lista = new ArrayList<Usuario>();
        UsuarioController a = new UsuarioController();
        
        lista = a.buscarUsuario();
        
        //cria o modelo de Produto      
        model = new UsuarioTabelModel(lista);

        //atribui o modelo à tabela
        tabUsuario.setModel(model);
        
    }

    /**
     * Construtor que cria a tabela
     */
    
    /**
     * Método para carregar os dados da base de dados e coloca na tabela
     */
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
        tabUsuario = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        campoNomeRelFun = new javax.swing.JTextField();
        labelNomeRelFun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de usuários");

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
        labelCadCliente1.setText("USUÁRIO");
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
                .add(10, 10, 10)
                .add(labelCadCliente1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btExcluir)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btEditar)
                .add(10, 10, 10)
                .add(btInserir)
                .addContainerGap())
        );
        painelCabecalhoCliente1Layout.setVerticalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelCabecalhoCliente1Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(labelCadCliente1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .add(painelCabecalhoCliente1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(painelCabecalhoCliente1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(btExcluir)
                        .add(btEditar))
                    .add(btInserir)))
        );

        tabUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabUsuario);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        campoNomeRelFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeRelFunActionPerformed(evt);
            }
        });
        campoNomeRelFun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeRelFunKeyPressed(evt);
            }
        });

        labelNomeRelFun.setText("Usuário");

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelNomeRelFun)
                .add(16, 16, 16)
                .add(campoNomeRelFun, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(labelNomeRelFun, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(campoNomeRelFun, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                    .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelPrincipalLayout.createSequentialGroup()
                .add(paineSup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(painelCabecalhoCliente1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, Short.MAX_VALUE)
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
    private void campoNomeRelFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeRelFunActionPerformed
        efetuaPesquisa();
    }//GEN-LAST:event_campoNomeRelFunActionPerformed

    /**
     * Método do botão excluir que remove um funcionario da base de dados
     *
     * @param evt
     */
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int selecionado = -1;
        selecionado = tabUsuario.getSelectedRow();

        String message = "Você tem certeza que deseja excluir?";
        String title = "Deseja sair?";
        int condicao = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (condicao == JOptionPane.YES_OPTION) {

            if (selecionado >= 0) {
                Integer i = (Integer) model.getValueAt(selecionado, 0);
                UsuarioController cc = new UsuarioController();
                cc.excluir(i);
                model.removeUsuario(selecionado);
                JOptionPane.showMessageDialog(null, "Usuario excluído com sucesso");

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
        selecionado = tabUsuario.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdModelo = (Integer) model.getValueAt(selecionado, 0);
            UsuarioEditar ac = new UsuarioEditar(selecionado, cdModelo, model);
            ac.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    /**
     * Método do botão inserir que exibe a JanelaCadastroFuncionario
     *
     * @param evt
     */
    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        UsuarioInserir jc = new UsuarioInserir(model);
        jc.setVisible(true);
        jc.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btEditarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarAncestorAdded

    private void campoNomeRelFunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeRelFunKeyPressed
        efetuaPesquisa();
    }//GEN-LAST:event_campoNomeRelFunKeyPressed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JFormattedTextField campoData1;
    private javax.swing.JFormattedTextField campoData2;
    private javax.swing.JFormattedTextField campoData3;
    private javax.swing.JFormattedTextField campoData4;
    private javax.swing.JTextField campoNomeRelFun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCadCliente1;
    private javax.swing.JLabel labelNomeRelFun;
    private javax.swing.JLabel labelNomeRelFun1;
    private javax.swing.JLabel labelNomeRelFun2;
    private javax.swing.JLabel labelNomeRelFun3;
    private javax.swing.JLabel labelNomeRelFun4;
    private javax.swing.JLabel labelNomeRelFun5;
    private javax.swing.JPanel paineSup;
    private javax.swing.JPanel painelCabecalhoCliente1;
    private javax.swing.JPanel painelInf;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tabUsuario;
    // End of variables declaration//GEN-END:variables
 private void efetuaPesquisa() {
        String nome = campoNomeRelFun.getText();
        List<Usuario> lista = new ArrayList<Usuario>();
        UsuarioController a = new UsuarioController();
        lista = a.buscarUsuariobyNome(nome);
        model.limpar();

        //cria o modelo de Produto      
        model = new UsuarioTabelModel(lista);

        //atribui o modelo à tabela
        tabUsuario.setModel(model);
}   
   
}
