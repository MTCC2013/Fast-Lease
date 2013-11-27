package br.com.fastlease.view;

import br.com.fastlease.controller.AreaUsuarioController;
import br.com.fastlease.controller.CargoController;
import br.com.fastlease.controller.UsuarioController;
import br.com.model.negocio.AreaUsuario;
import br.com.model.negocio.Cargo;
import br.com.model.negocio.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Classe responsavel pela inteface gráfica do software, aonde são inseridos os
 * usuários
 *
 * @author Antônio da Silva Júnior, Mauricio Pires Cardoso
 */
public class JanelaCadastroUsuario extends javax.swing.JFrame {
    //Declara tabelmodel

    UsuarioTabelModel model;

    public JanelaCadastroUsuario(UsuarioTabelModel mtb) {
        initComponents();
        //Inicializa tabelmodel
        model = mtb;
        //Carrega combos
        carregarComboArea();
        carregarComboCargo();
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
        campoNome = new javax.swing.JTextField();
        labelNomeCadCliente4 = new javax.swing.JLabel();
        labelNomeCadCliente5 = new javax.swing.JLabel();
        labelNomeCadCliente6 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        campoDataCadastro = new javax.swing.JFormattedTextField();
        campoLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbArea = new javax.swing.JComboBox();
        campoSenha = new javax.swing.JPasswordField();
        painelCabecalhoCliente1 = new javax.swing.JPanel();
        labelCadCliente1 = new javax.swing.JLabel();
        btCadastroFun = new javax.swing.JButton();
        btApagarFun = new javax.swing.JButton();

        OpcaSexoFun1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Feminino", "Masculino" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");

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

        labelNomeCadCliente1.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente1.setText("nome:");

        labelNomeCadCliente4.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente4.setText("senha");

        labelNomeCadCliente5.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente5.setText("cargo");

        labelNomeCadCliente6.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente6.setText("data cadastro");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("login");

        try {
            campoDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("area");

        cbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout abaCadastroCliente1Layout = new javax.swing.GroupLayout(abaCadastroCliente1);
        abaCadastroCliente1.setLayout(abaCadastroCliente1Layout);
        abaCadastroCliente1Layout.setHorizontalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                .addComponent(labelNomeCadCliente1)
                                .addGap(10, 10, 10)
                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomeCadCliente4)
                                    .addComponent(jLabel1))
                                .addGap(10, 10, 10)
                                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(campoSenha)))
                            .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                    .addComponent(labelNomeCadCliente5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(labelNomeCadCliente6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        abaCadastroCliente1Layout.setVerticalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCadCliente1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCadCliente4)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCadCliente5)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeCadCliente6)
                    .addComponent(campoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        painelCabecalhoCliente1.setBackground(new java.awt.Color(0, 0, 0));

        labelCadCliente1.setBackground(new java.awt.Color(252, 250, 250));
        labelCadCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senai/Imagens/Cliente.png"))); // NOI18N
        labelCadCliente1.setText("CADASTRO DE CLIENTE");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btApagarFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastroFun)
                .addContainerGap())
        );
        painelCabecalhoCliente1Layout.setVerticalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                                .addComponent(btCadastroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                                .addComponent(btApagarFun)
                                .addGap(34, 34, 34))))
                    .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addComponent(labelCadCliente1)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
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
    //Método botão cadastrar
    private void btCadastroFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroFunActionPerformed
        //Validações
        String msg = "";
        int validamsg = 0;

        if (campoNome.getText().length() <= 0) {
            msg = msg + "Informe o nome\n";
            validamsg = +1;
        }
        if (campoLogin.getText().length() <= 0) {
            msg = msg + "Informe o login\n";
            validamsg = +1;
        }
        if (campoSenha.getText().length() <= 0) {
            msg = msg + "Informe a senha\n";
            validamsg = +1;
        } else {

            Usuario u = new Usuario();
            u.setNome(campoNome.getText());
            u.setLogin(campoLogin.getText());
            u.setSenha(campoSenha.getText());
            u.setCargo((Cargo) cbCargo.getSelectedItem());
            try {
                u.setData_cadastro(new SimpleDateFormat("dd/MM/yyyy").parse(campoDataCadastro.getText()));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conversão de datas " + ex.getMessage());
            }
            u.setAreaUsuario((AreaUsuario) cbArea.getSelectedItem());

            UsuarioController uc = new UsuarioController();
            uc.inserir(u);
            //Insere apenas de a transação for concluída
            Usuario usuarioinserido = pesquisar(u.getNome());
            if (usuarioinserido != null) {
                //Insere Usuario na tabela
                model.addUsuario(pesquisar(u.getNome()));

                dispose();
            }
        }
        if (validamsg > 0) {
            JOptionPane.showMessageDialog(rootPane, msg);
        }

    }//GEN-LAST:event_btCadastroFunActionPerformed
    //Método que pesquisa pelo nome

    private Usuario pesquisar(String usuario) {
        UsuarioController cc = new UsuarioController();
        return cc.buscarUsuariobyNom(usuario);
    }
    private void btApagarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarFunActionPerformed

        if (evt.getSource() == btApagarFun) {
            // Faz com que o JTextField fique vazio

            campoNome.setText("");
            campoLogin.setText("");
            campoSenha.setText("");
            cbCargo.setSelectedIndex(0);
            campoDataCadastro.setText("");
            cbArea.setSelectedIndex(0);


        }
    }//GEN-LAST:event_btApagarFunActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBtSexo;
    private javax.swing.JComboBox OpcaSexoFun1;
    private javax.swing.JPanel abaCadastroCliente1;
    private javax.swing.JButton btApagarFun;
    private javax.swing.JButton btCadastroFun;
    private javax.swing.JFormattedTextField campoDataCadastro;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JComboBox cbArea;
    private javax.swing.JComboBox cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCadCliente1;
    private javax.swing.JLabel labelNomeCadCliente1;
    private javax.swing.JLabel labelNomeCadCliente4;
    private javax.swing.JLabel labelNomeCadCliente5;
    private javax.swing.JLabel labelNomeCadCliente6;
    private javax.swing.JPanel painelCabecalhoCliente1;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel vistaInf;
    private javax.swing.JPanel vistaSup;
    // End of variables declaration//GEN-END:variables
    // Método que carrega combo da classe Cargo

    private void carregarComboCargo() {
        //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCargo.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Cargo> cargos = new ArrayList<Cargo>();
        CargoController a = new CargoController();
        cargos = a.buscarCargo();

        for (int linha = 0; linha < cargos.size(); linha++) {
            //pegando a curso da lista
            Cargo cargo = cargos.get(linha);
            //adicionando a curso no combo
            comboModel.addElement(cargo);
        }
    }
    //Método que carrega combo da classe AreaUsuario

    private void carregarComboArea() {
        //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbArea.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<AreaUsuario> areas = new ArrayList<AreaUsuario>();
        AreaUsuarioController a = new AreaUsuarioController();
        areas = a.buscarAreaUsuario();

        for (int linha = 0; linha < areas.size(); linha++) {
            //pegando a curso da lista
            AreaUsuario area = areas.get(linha);
            //adicionando a curso no combo
            comboModel.addElement(area);
        }
    }
}
