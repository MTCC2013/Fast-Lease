package br.com.fastlease.view;

import br.com.fastlease.controller.CargoController;
import br.com.fastlease.model.Cargo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe responsável por exibir a interface gráfica da Janela de Relatórios
 *
 * @author mauricio_p_cardoso
 */
public class CargoLista extends javax.swing.JFrame {

    private CargoTabelModel modelo;

    public CargoLista() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        List<Cargo> lista = new ArrayList<Cargo>();
        CargoController a = new CargoController();
        lista = a.buscarCargo();

        //cria o modelo de Produto      
        modelo = new CargoTabelModel(lista);

        //atribui o modelo à tabela
        tabArea.setModel(modelo);
    }

    /**
     * Construtor que cria a tabela
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
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        tabSArea = new javax.swing.JScrollPane();
        tabArea = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        labelNomeRelFun = new javax.swing.JLabel();
        campoNomeRelFun = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Cargos");

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
        labelCadCliente1.setText("CARGOS");
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

        org.jdesktop.layout.GroupLayout painelCabecalhoCliente1Layout = new org.jdesktop.layout.GroupLayout(painelCabecalhoCliente1);
        painelCabecalhoCliente1.setLayout(painelCabecalhoCliente1Layout);
        painelCabecalhoCliente1Layout.setHorizontalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelCadCliente1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 244, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 317, Short.MAX_VALUE)
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
                    .add(btInserir)
                    .add(btEditar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Professora - Metodologia Ciêntifica"},
                {"02", "Professor - Teste de Software"},
                {"03", "Coordenador - Informática"},
                {"04", "Coordenador Pedagógico"}
            },
            new String [] {
                "Código", "Cargo"
            }
        ));
        tabSArea.setViewportView(tabArea);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        labelNomeRelFun.setText("Cargo: ");

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

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelNomeRelFun)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(campoNomeRelFun, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelNomeRelFun, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(campoNomeRelFun, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
                        .add(tabSArea)
                        .add(painelCabecalhoCliente1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelPrincipalLayout.createSequentialGroup()
                .add(paineSup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(painelCabecalhoCliente1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(tabSArea, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
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
     * Método do botão excluir que remove um funcionario da base de dados
     *
     * @param evt
     */
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int selecionado = -1;
        selecionado = tabArea.getSelectedRow();

        String message = "Você tem certeza que deseja excluir?";
        String title = "Deseja sair?";
        int condicao = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (condicao == JOptionPane.YES_OPTION) {

            if (selecionado >= 0) {
                Integer i = (Integer) modelo.getValueAt(selecionado, 0);
                CargoController cc = new CargoController();
                cc.excluir(i);
                modelo.removeCargo(selecionado);
                JOptionPane.showMessageDialog(null, "Cargo excluído com sucesso");
                
            } else {
                JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
            }
        }

    }//GEN-LAST:event_btExcluirActionPerformed

   /**
     * Método do botão inserir que exibe a JanelaCadastroFuncionario
     *
     * @param evt
     */
    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        CargoInserir jc = new CargoInserir(modelo);
        jc.setVisible(true);
        jc.setLocationRelativeTo(null);
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int selecionado = -1;
        selecionado = tabArea.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdModelo = (Integer) modelo.getValueAt(selecionado, 0);
            CargoEditar ac = new CargoEditar(selecionado, cdModelo, modelo);
            ac.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
        }
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void campoNomeRelFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeRelFunActionPerformed
        efetuaPesquisa();
    }//GEN-LAST:event_campoNomeRelFunActionPerformed

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
    private javax.swing.JTextField campoNomeRelFun;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelCadCliente1;
    private javax.swing.JLabel labelNomeRelFun;
    private javax.swing.JPanel paineSup;
    private javax.swing.JPanel painelCabecalhoCliente1;
    private javax.swing.JPanel painelInf;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tabArea;
    private javax.swing.JScrollPane tabSArea;
    // End of variables declaration//GEN-END:variables
private void efetuaPesquisa() {
        String nome = campoNomeRelFun.getText();
        List<Cargo> lista = new ArrayList<Cargo>();
        CargoController a = new CargoController();
        lista = a.buscarCargobyNome(nome);
        modelo.limpar();

        //cria o modelo de Produto      
        modelo = new CargoTabelModel(lista);

        //atribui o modelo à tabela
        tabArea.setModel(modelo);
}
}
