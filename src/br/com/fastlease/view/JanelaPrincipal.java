package br.com.fastlease.view;
//@author Mauricio

import javax.swing.JFrame;


public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();
        menuLogoff = new javax.swing.JMenuItem();
        menuJanela = new javax.swing.JMenu();
        menuHistorico = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenuItem();
        menuFornecedor = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenuItem();
        menuFinanceiro = new javax.swing.JMenuItem();
        menuCaixa = new javax.swing.JMenuItem();
        menuTreino = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BODYBUILDER SYSTEM");

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuArquivo.setText("Arquivo");
        menuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoActionPerformed(evt);
            }
        });

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        menuLogoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        menuLogoff.setText("Fazer Logoff");
        menuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoffActionPerformed(evt);
            }
        });
        menuArquivo.add(menuLogoff);

        menuBar.add(menuArquivo);

        menuJanela.setText("Janelas");
        menuJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJanelaActionPerformed(evt);
            }
        });

        menuHistorico.setText("Sala");
        menuHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHistoricoActionPerformed(evt);
            }
        });
        menuJanela.add(menuHistorico);

        menuCadastro.setText("Cadastro");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });
        menuJanela.add(menuCadastro);

        menuFornecedor.setText("Fornecedor");
        menuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFornecedorActionPerformed(evt);
            }
        });
        menuJanela.add(menuFornecedor);

        menuProdutos.setText("Produtos");
        menuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosActionPerformed(evt);
            }
        });
        menuJanela.add(menuProdutos);

        menuFinanceiro.setText("Financeiro");
        menuFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFinanceiroActionPerformed(evt);
            }
        });
        menuJanela.add(menuFinanceiro);

        menuCaixa.setText("Caixa");
        menuCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCaixaActionPerformed(evt);
            }
        });
        menuJanela.add(menuCaixa);

        menuTreino.setText("Treino");
        menuTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTreinoActionPerformed(evt);
            }
        });
        menuJanela.add(menuTreino);

        menuBar.add(menuJanela);

        menuSobre.setText("Sobre");

        menuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSobre.setText("BodyBuilderSystem ");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        menuSobre.add(menuItemSobre);

        menuBar.add(menuSobre);

        menuAjuda.setText("Ajuda");

        menuManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuManual.setText("Manual");
        menuManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManualActionPerformed(evt);
            }
        });
        menuAjuda.add(menuManual);

        menuBar.add(menuAjuda);

        setJMenuBar(menuBar);

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
//BOTOES

    private void menuHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHistoricoActionPerformed
        SalaLista sl = new SalaLista();
        sl.setVisible(true);
        sl.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuHistoricoActionPerformed

    private void menuJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJanelaActionPerformed
    }//GEN-LAST:event_menuJanelaActionPerformed

    private void menuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFornecedorActionPerformed
    }//GEN-LAST:event_menuFornecedorActionPerformed

    private void menuTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTreinoActionPerformed
    }//GEN-LAST:event_menuTreinoActionPerformed

    private void menuFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFinanceiroActionPerformed
        
    }//GEN-LAST:event_menuFinanceiroActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed

    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreActionPerformed
    }//GEN-LAST:event_menuItemSobreActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManualActionPerformed
       
    }//GEN-LAST:event_menuManualActionPerformed

    private void menuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoActionPerformed
               
    }//GEN-LAST:event_menuArquivoActionPerformed

    private void menuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosActionPerformed
   
    }//GEN-LAST:event_menuProdutosActionPerformed

    private void menuCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCaixaActionPerformed

    }//GEN-LAST:event_menuCaixaActionPerformed

    private void menuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoffActionPerformed

    }//GEN-LAST:event_menuLogoffActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuCadastro;
    private javax.swing.JMenuItem menuCaixa;
    private javax.swing.JMenuItem menuFinanceiro;
    private javax.swing.JMenuItem menuFornecedor;
    private javax.swing.JMenuItem menuHistorico;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JMenu menuJanela;
    private javax.swing.JMenuItem menuLogoff;
    private javax.swing.JMenuItem menuManual;
    private javax.swing.JMenuItem menuProdutos;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem menuTreino;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
