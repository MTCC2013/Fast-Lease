package br.com.fastlease.view;

import br.com.fastlease.controller.AreaUsuarioController;
import br.com.fastlease.model.AreaUsuario;
import javax.swing.JOptionPane;

/**
 * Classe responsavel pela inteface gráfica do software, onde serão cadastrados
 * a area dos usuários
 *
 * @author Antônio da Silva Júnior, Mauricio Pires Cardoso
 */
public class AreaUsuarioInserir extends javax.swing.JFrame {
    //Declara a tabelmodel

    AreaUsuarioTabelModel model;

    public AreaUsuarioInserir(AreaUsuarioTabelModel mtb) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        //Inicializa o tabelmodel
        model = mtb;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBtSexo = new javax.swing.ButtonGroup();
        OpcaSexoFun1 = new javax.swing.JComboBox();
        painelPrincipal = new javax.swing.JPanel();
        vistaInf = new javax.swing.JPanel();
        vistaSup = new javax.swing.JPanel();
        abaCadastroCliente1 = new javax.swing.JPanel();
        labelNomeCadCliente1 = new javax.swing.JLabel();
        campoArea = new javax.swing.JTextField();
        painelCabecalhoCliente1 = new javax.swing.JPanel();
        labelCadCliente1 = new javax.swing.JLabel();
        btCadastroFun = new javax.swing.JButton();
        btApagarFun = new javax.swing.JButton();

        OpcaSexoFun1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Feminino", "Masculino" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Área de Usuário");

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        vistaInf.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout vistaInfLayout = new javax.swing.GroupLayout(vistaInf);
        vistaInf.setLayout(vistaInfLayout);
        vistaInfLayout.setHorizontalGroup(
            vistaInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
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

        labelNomeCadCliente1.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente1.setText("Área:");

        javax.swing.GroupLayout abaCadastroCliente1Layout = new javax.swing.GroupLayout(abaCadastroCliente1);
        abaCadastroCliente1.setLayout(abaCadastroCliente1Layout);
        abaCadastroCliente1Layout.setHorizontalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCadastroCliente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNomeCadCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        abaCadastroCliente1Layout.setVerticalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeCadCliente1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        painelCabecalhoCliente1.setBackground(new java.awt.Color(0, 0, 0));

        labelCadCliente1.setBackground(new java.awt.Color(252, 250, 250));
        labelCadCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadCliente1.setText("CADASTRO DE ÁREA USUÁRIO");
        labelCadCliente1.setOpaque(true);

        btCadastroFun.setBackground(new java.awt.Color(255, 255, 255));
        btCadastroFun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCadastroFun.setText("Cadastrar");
        btCadastroFun.setContentAreaFilled(false);
        btCadastroFun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastroFun.setOpaque(true);
        btCadastroFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroFunActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btApagarFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastroFun)
                .addContainerGap())
        );
        painelCabecalhoCliente1Layout.setVerticalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addComponent(btCadastroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addComponent(btApagarFun)
                        .addGap(34, 34, 34))))
            .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(abaCadastroCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
    //Evento Botão cadastro
    private void btCadastroFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroFunActionPerformed

        AreaUsuario f = new AreaUsuario();
        //Validação que não permite que o campo passe vazio
        if (campoArea.getText().length() > 0) {
            f.setArea(campoArea.getText());
            AreaUsuarioController fc = new AreaUsuarioController();
            fc.inserir(f);
            //Insere uma area na tabela apenas se a transação for concluida
            AreaUsuario areainserir = pesquisar(f.getArea());
            if (areainserir != null) {
                //Adiciona a area na tabela
                model.addAreaUsuario(pesquisar(f.getArea()));

                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite a área do usuário");
        }







    }//GEN-LAST:event_btCadastroFunActionPerformed

    private AreaUsuario pesquisar(String area) {
        AreaUsuarioController cc = new AreaUsuarioController();
        return cc.buscarAreaUsuariobyNom(area);
    }
    private void btApagarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarFunActionPerformed

        if (evt.getSource() == btApagarFun) {
            // Faz com que o JTextField fique vazio

            campoArea.setText("");

        }

    }//GEN-LAST:event_btApagarFunActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBtSexo;
    private javax.swing.JComboBox OpcaSexoFun1;
    private javax.swing.JPanel abaCadastroCliente1;
    private javax.swing.JButton btApagarFun;
    private javax.swing.JButton btCadastroFun;
    private javax.swing.JTextField campoArea;
    private javax.swing.JLabel labelCadCliente1;
    private javax.swing.JLabel labelNomeCadCliente1;
    private javax.swing.JPanel painelCabecalhoCliente1;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel vistaInf;
    private javax.swing.JPanel vistaSup;
    // End of variables declaration//GEN-END:variables
}