package br.com.fastlease.view;

import br.com.fastlease.controller.AreaUsuarioController;
import br.com.fastlease.controller.CargoController;
import br.com.fastlease.controller.CursoController;
import br.com.fastlease.controller.UsuarioController;
import br.com.model.negocio.AreaUsuario;
import br.com.model.negocio.Cargo;
import br.com.model.negocio.Curso;
import br.com.model.negocio.Usuario;
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
public class JanelaEditarUsuario extends javax.swing.JFrame {
    
    int linhaSelecionada;
    int idUsuario;
    UsuarioTabelModel modelo; 
    
    public JanelaEditarUsuario(int selecionado, int cdModelo, UsuarioTabelModel mtb) {
        initComponents();
        linhaSelecionada = selecionado;
        cdModelo = cdModelo;
        modelo = mtb;

        UsuarioController cc = new UsuarioController();
        Usuario c = new Usuario();
        c = cc.buscarUsuariobyId(cdModelo);
        
        campoCodigo.setText(String.valueOf(c.getCodigo()));
        campoNome.setText(c.getNome());
        campoLogin.setText(c.getLogin());
        campoSenha.setText(c.getSenha());
        
        carregarComboCargo(c.getCargo().getCodigo());
        
        Date dataTemp = new Date();      
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(c.getData_cadastro());
        campoDataCadastro.setText(data);
        carregarComboArea(c.getAreaUsuario().getCodigo());
       
        
        
        
        
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        labelNomeCadCliente4 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox();
        labelNomeCadCliente5 = new javax.swing.JLabel();
        labelNomeCadCliente6 = new javax.swing.JLabel();
        campoDataCadastro = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        cbArea = new javax.swing.JComboBox();
        campoSenha = new javax.swing.JPasswordField();
        painelCabecalhoCliente1 = new javax.swing.JPanel();
        labelCadCliente1 = new javax.swing.JLabel();
        btCadastroFun = new javax.swing.JButton();
        btApagarFun = new javax.swing.JButton();

        OpcaSexoFun1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Feminino", "Masculino" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE CLIENTES");

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

        jLabel2.setText("codigo");

        campoCodigo.setEditable(false);

        labelNomeCadCliente1.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente1.setText("nome:");

        jLabel1.setText("login");

        labelNomeCadCliente4.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente4.setText("senha");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelNomeCadCliente5.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente5.setText("cargo");

        labelNomeCadCliente6.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente6.setText("data cadastro");

        try {
            campoDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("area");

        cbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout abaCadastroCliente1Layout = new javax.swing.GroupLayout(abaCadastroCliente1);
        abaCadastroCliente1.setLayout(abaCadastroCliente1Layout);
        abaCadastroCliente1Layout.setHorizontalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
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
                                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                        .addComponent(labelNomeCadCliente5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                            .addComponent(labelNomeCadCliente6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        abaCadastroCliente1Layout.setVerticalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNomeCadCliente1)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelNomeCadCliente4)
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
                        .addComponent(jLabel3)
                        .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(74, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
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
            u.setCodigo(Integer.parseInt(campoCodigo.getText()));
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
            uc.atualizar(u);
            modelo.updateUsuario(linhaSelecionada, u);

            dispose();
        }
        if (validamsg > 0) {
            JOptionPane.showMessageDialog(rootPane, msg);
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
            if ( cargo.getCodigo() == cdCargo){
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
            if ( area.getCodigo() == cdArea){
                comboModel.setSelectedItem(area);
            }
            
        }
        
    }

}
