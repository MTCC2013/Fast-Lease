package br.com.fastlease.view;

import br.com.fastlease.controller.AreaUsuarioController;
import br.com.fastlease.controller.CargoController;
import br.com.fastlease.controller.UsuarioController;
import br.com.fastlease.model.AreaUsuario;
import br.com.fastlease.model.Cargo;
import br.com.fastlease.model.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 * Classe responsavel pela inteface gráfica do software
 * @author Mauricio
 */
public class UsuarioEditar extends javax.swing.JFrame {
    
    int linhaSelecionada;
    int idUsuario;
    UsuarioTabelModel modelo; 
    
    public UsuarioEditar(int selecionado, int cdModelo, UsuarioTabelModel mtb) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        linhaSelecionada = selecionado;
        cdModelo = cdModelo;
        modelo = mtb;

        UsuarioController cc = new UsuarioController();
        Usuario c = new Usuario();
        c = cc.buscarUsuariobyId(cdModelo);
        
        campoCodigo.setText(String.valueOf(c.getId()));
        campoNome.setText(c.getNome());
        campoLogin.setText(c.getLogin());
        campoSenha.setText(c.getSenha());
        
        carregarComboCargo(c.getIdCargo().getId());
        
        Date dataTemp = new Date();      
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(c.getDataCadastro());
        campoDataCadastro.setText(data);
        carregarComboArea(c.getIdAreaUsuario().getId());
        
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
        jLabel2 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        labelNomeCadCliente1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        cbCargo = new javax.swing.JComboBox();
        labelNomeCadCliente5 = new javax.swing.JLabel();
        labelNomeCadCliente6 = new javax.swing.JLabel();
        campoDataCadastro = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        cbArea = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        labelNomeCadCliente4 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        painelCabecalhoCliente1 = new javax.swing.JPanel();
        labelCadCliente1 = new javax.swing.JLabel();
        btCadastroFun = new javax.swing.JButton();
        btApagarFun = new javax.swing.JButton();

        OpcaSexoFun1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Feminino", "Masculino" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Usuário");

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

        jLabel2.setText("Código:");

        campoCodigo.setEditable(false);

        labelNomeCadCliente1.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente1.setText("Nome:");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelNomeCadCliente5.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente5.setText("Cargo:");

        labelNomeCadCliente6.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente6.setText("Data Cadastro:");

        try {
            campoDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Área:");

        cbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabel1.setText("Login:");

        labelNomeCadCliente4.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente4.setText("Senha:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelNomeCadCliente4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCadCliente4)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaCadastroCliente1Layout = new javax.swing.GroupLayout(abaCadastroCliente1);
        abaCadastroCliente1.setLayout(abaCadastroCliente1Layout);
        abaCadastroCliente1Layout.setHorizontalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNomeCadCliente5)
                            .addComponent(labelNomeCadCliente1)
                            .addComponent(labelNomeCadCliente6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                    .addComponent(cbCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        abaCadastroCliente1Layout.setVerticalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCadCliente1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeCadCliente5))
                .addGap(11, 11, 11)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeCadCliente6))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCabecalhoCliente1.setBackground(new java.awt.Color(0, 0, 0));

        labelCadCliente1.setBackground(new java.awt.Color(252, 250, 250));
        labelCadCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadCliente1.setText("ATUALIZAÇÃO DE USUÁRIO");
        labelCadCliente1.setOpaque(true);

        btCadastroFun.setBackground(new java.awt.Color(255, 255, 255));
        btCadastroFun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCadastroFun.setText("Atualizar");
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
                .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btApagarFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastroFun)
                .addContainerGap())
        );
        painelCabecalhoCliente1Layout.setVerticalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addComponent(btCadastroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                        .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btApagarFun))
                        .addGap(34, 34, 34))))
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

    private void btCadastroFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroFunActionPerformed
        if (campoNome.getText().length() <= 0 || campoLogin.getText().length() <= 0 || campoSenha.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null,"Campos obrigatórios vazios");
        } else {

            Usuario u = new Usuario();
            u.setId(Integer.parseInt(campoCodigo.getText()));
            u.setNome(campoNome.getText());
            u.setLogin(campoLogin.getText());
            u.setSenha(campoSenha.getText());
            u.setIdCargo((Cargo) cbCargo.getSelectedItem());
            try {
                u.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse(campoDataCadastro.getText()));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conversão de datas " + ex.getMessage());
            }
            u.setIdAreaUsuario((AreaUsuario) cbArea.getSelectedItem());
            UsuarioController uc = new UsuarioController();
            uc.atualizar(u);
            modelo.updateUsuario(linhaSelecionada, u);

            dispose();
        }
       

    }//GEN-LAST:event_btCadastroFunActionPerformed
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
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JFormattedTextField campoDataCadastro;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JComboBox cbArea;
    private javax.swing.JComboBox cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel6;
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
private void carregarComboCargo(int cdCargo) {
         //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCargo.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Cargo> cargos = new ArrayList<Cargo>();
        CargoController a = new CargoController();
        cargos = a.buscarCargo();
        
     
        for (int linha = 0; linha < cargos.size(); linha++) {
            //pegando a categoria da lista
            Cargo cargo = cargos.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(cargo);
            if ( cargo.getId() == cdCargo){
                comboModel.setSelectedItem(cargo);
            }
            
        }
        
    }
private void carregarComboArea(int cdArea) {
         //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbArea.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<AreaUsuario> areas = new ArrayList<AreaUsuario>();
        AreaUsuarioController a = new AreaUsuarioController();
        areas = a.buscarAreaUsuario();
        
     
        for (int linha = 0; linha < areas.size(); linha++) {
            //pegando a categoria da lista
            AreaUsuario area = areas.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(area);
            if ( area.getId() == cdArea){
                comboModel.setSelectedItem(area);
            }
            
        }
        
    }

}
