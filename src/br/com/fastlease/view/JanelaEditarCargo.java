package br.com.fastlease.view;

import br.com.fastlease.controller.CargoController;
import br.com.model.negocio.Cargo;
import javax.swing.JOptionPane;

/**
 * Classe responsavel pela inteface gráfica do software, aonde os cargos são atualizados
 *
 * @author Antônio da Silva Júnior, Mauricio Pires Cardoso
 */
public class JanelaEditarCargo extends javax.swing.JFrame {
    // Variável que representa a linha selecionada
    int linhaSelecionada;
    //Variável que representa o codigo do cargo
    int idCargo;
    //Declara o tabelmodel
    CargoTabelModel modelo;

    public JanelaEditarCargo(int selecionado, int cdModelo, CargoTabelModel mtb) {
        initComponents();
        campoCodigo.setEditable(false);
        //linha selecionada recebe parametro pelo construtor
        linhaSelecionada = selecionado;
        cdModelo = cdModelo;
        //Inicializa o tabelmodel
        modelo = mtb;

        CargoController cc = new CargoController();
        Cargo p = new Cargo();
        p = cc.buscarCargobyId(cdModelo);;

        campoCodigo.setText(String.valueOf(p.getCodigo()));
        campoCargo.setText(p.getCargo());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBtSexo = new javax.swing.ButtonGroup();
        OpcaSexoFun1 = new javax.swing.JComboBox();
        painelPrincipal = new javax.swing.JPanel();
        vistaSup = new javax.swing.JPanel();
        painelCabecalhoCliente1 = new javax.swing.JPanel();
        labelCadCliente1 = new javax.swing.JLabel();
        btAtualizarFun = new javax.swing.JButton();
        btApagarFun = new javax.swing.JButton();
        abaCadastroCliente1 = new javax.swing.JPanel();
        labelNomeCadCliente1 = new javax.swing.JLabel();
        campoCargo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        vistaInf = new javax.swing.JPanel();

        OpcaSexoFun1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Feminino", "Masculino" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ATUALIZAÇÃO DE FUNCIONÁRIOS");

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

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

        painelCabecalhoCliente1.setBackground(new java.awt.Color(0, 0, 0));

        labelCadCliente1.setBackground(new java.awt.Color(252, 250, 250));
        labelCadCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadCliente1.setText("             ATUALIZAÇÃO DE CLIENTE");
        labelCadCliente1.setOpaque(true);

        btAtualizarFun.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizarFun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAtualizarFun.setText("Atualizar");
        btAtualizarFun.setContentAreaFilled(false);
        btAtualizarFun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizarFun.setOpaque(true);
        btAtualizarFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarFunActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btApagarFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAtualizarFun)
                .addContainerGap())
        );
        painelCabecalhoCliente1Layout.setVerticalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addComponent(btAtualizarFun, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btApagarFun))
                        .addGap(30, 30, 30))))
        );

        abaCadastroCliente1.setBackground(new java.awt.Color(252, 250, 250));
        abaCadastroCliente1.setForeground(new java.awt.Color(204, 204, 0));
        abaCadastroCliente1.setToolTipText("");

        labelNomeCadCliente1.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente1.setText("Nome Completo:");

        jLabel1.setText("Código:");

        javax.swing.GroupLayout abaCadastroCliente1Layout = new javax.swing.GroupLayout(abaCadastroCliente1);
        abaCadastroCliente1.setLayout(abaCadastroCliente1Layout);
        abaCadastroCliente1Layout.setHorizontalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(labelNomeCadCliente1))
                .addGap(10, 10, 10)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaCadastroCliente1Layout.setVerticalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCadCliente1)
                    .addComponent(campoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistaSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCabecalhoCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abaCadastroCliente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(vistaInf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(vistaSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelCabecalhoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abaCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btAtualizarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarFunActionPerformed

        Cargo c = new Cargo();
        if (campoCargo.getText().length() > 0){
        c.setCodigo(Integer.parseInt(campoCodigo.getText()));
         c.setCargo(campoCargo.getText());

            CargoController fc = new CargoController();
            fc.atualizar(c);
            modelo.updateCargo(linhaSelecionada, c);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Digite o cargo do usuário");
        }      
    }//GEN-LAST:event_btAtualizarFunActionPerformed

    private void btApagarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarFunActionPerformed
        //JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
        if (evt.getSource() == btApagarFun) {

            // Faz com que o JTextField fique vazio
            campoCargo.setText("");

        }
    }//GEN-LAST:event_btApagarFunActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBtSexo;
    private javax.swing.JComboBox OpcaSexoFun1;
    private javax.swing.JPanel abaCadastroCliente1;
    private javax.swing.JButton btApagarFun;
    private javax.swing.JButton btAtualizarFun;
    private javax.swing.JTextField campoCargo;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCadCliente1;
    private javax.swing.JLabel labelNomeCadCliente1;
    private javax.swing.JPanel painelCabecalhoCliente1;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel vistaInf;
    private javax.swing.JPanel vistaSup;
    // End of variables declaration//GEN-END:variables
}
