package br.com.fastlease.view;

import br.com.fastlease.controller.CategoriaController;
import br.com.fastlease.controller.CursoController;
import br.com.fastlease.model.Categoria;
import br.com.fastlease.model.Curso;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Classe responsavel pela inteface gráfica do software
 *
 * @author Mauricio
 */
public class CursoEditar extends javax.swing.JFrame {

    int linhaSelecionada;
    int idCurso;
    CursoTabelModel modelo;

    public CursoEditar(int selecionado, int cdModelo, CursoTabelModel mtb) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        linhaSelecionada = selecionado;
        cdModelo = cdModelo;
        modelo = mtb;

        CursoController cc = new CursoController();
        Curso c = new Curso();
        c = cc.buscarCursobyId(cdModelo);

        campoCodigo.setText(String.valueOf(c.getId()));
        campoCurso.setText(c.getCurso());
        for (int i = 0; i <= 12; i++) {
            if (c.getFase().equals("" + i + "")) {
                cbFase.setSelectedIndex(i);
            }
            System.out.println("" + i + "");

        }
        campoDuracao.setText(c.getDuracao());
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formataData.format(c.getDataTermino());
        campoDataTermino.setText(data);

        carregarCombo(c.getIdCategoria().getId());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        vistaInf = new javax.swing.JPanel();
        vistaSup = new javax.swing.JPanel();
        abaCadastroCliente1 = new javax.swing.JPanel();
        labelNomeCadCliente1 = new javax.swing.JLabel();
        labelNomeCadCliente4 = new javax.swing.JLabel();
        campoDuracao = new javax.swing.JTextField();
        labelNomeCadCliente5 = new javax.swing.JLabel();
        labelNomeCadCliente6 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cbFase = new javax.swing.JComboBox();
        campoDataTermino = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        campoCurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        painelCabecalhoCliente1 = new javax.swing.JPanel();
        labelCadCliente1 = new javax.swing.JLabel();
        btCadastroFun = new javax.swing.JButton();
        btApagarFun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Curso");

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
        labelNomeCadCliente1.setText("Curso:");

        labelNomeCadCliente4.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente4.setText("Duração:");

        campoDuracao.setText("2");

        labelNomeCadCliente5.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente5.setText("Data Término:");

        labelNomeCadCliente6.setBackground(new java.awt.Color(204, 204, 0));
        labelNomeCadCliente6.setText("Categoria:");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Técnico" }));

        jLabel1.setText("Fase:");

        cbFase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        try {
            campoDataTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataTermino.setText("15/12/2013");

        jLabel2.setText("Codigo:");

        campoCodigo.setEditable(false);
        campoCodigo.setText("01");

        campoCurso.setText("Informática");

        jLabel3.setText("anos");

        javax.swing.GroupLayout abaCadastroCliente1Layout = new javax.swing.GroupLayout(abaCadastroCliente1);
        abaCadastroCliente1.setLayout(abaCadastroCliente1Layout);
        abaCadastroCliente1Layout.setHorizontalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCadastroCliente1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNomeCadCliente6)
                            .addComponent(jLabel1)
                            .addComponent(labelNomeCadCliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCadastroCliente1Layout.createSequentialGroup()
                                .addComponent(cbFase, 0, 42, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(labelNomeCadCliente4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(labelNomeCadCliente5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoCurso)
                            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        abaCadastroCliente1Layout.setVerticalGroup(
            abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeCadCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomeCadCliente4)
                            .addComponent(campoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(abaCadastroCliente1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomeCadCliente5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaCadastroCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeCadCliente6))
                .addGap(28, 28, 28))
        );

        painelCabecalhoCliente1.setBackground(new java.awt.Color(0, 0, 0));

        labelCadCliente1.setBackground(new java.awt.Color(252, 250, 250));
        labelCadCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadCliente1.setText("ATUALIZAÇÃO DE CURSO");
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
                .addGap(28, 28, 28)
                .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btApagarFun)
                            .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(abaCadastroCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        if (campoCurso.getText().length() <= 0 || campoDuracao.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios vazios");
        } else {
            Curso f = new Curso();
            f.setId(Integer.parseInt(campoCodigo.getText().toString()));
            f.setCurso(campoCurso.getText());
            f.setFase(cbFase.getSelectedItem().toString());
            f.setDuracao(campoDuracao.getText());
            try {
                f.setDataTermino(new SimpleDateFormat("dd/MM/yyyy").parse(campoDataTermino.getText()));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conversão de data" + ex.getMessage());
            }
            f.setIdCategoria((Categoria) cbCategoria.getSelectedItem());
            
            CursoController cc = new CursoController();
            
           
           Curso cursoinserido = pesquisar(f.getCurso());
                if (cursoinserido != null) {
                    cc.atualizar(f);
                    //Adiciona o curso na tabela
                    modelo.updateCurso(linhaSelecionada, f);
                    dispose();
                }
               
        }

    }//GEN-LAST:event_btCadastroFunActionPerformed
    private Curso pesquisar(String curso) {
        CursoController cc = new CursoController();
        return cc.buscarCursobyNom(curso);
    }
    private void btApagarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarFunActionPerformed

        if (evt.getSource() == btApagarFun) {
            // Faz com que o JTextField fique vazio

            campoCurso.setText("");
            cbFase.setSelectedIndex(0);
            campoDuracao.setText("");
            campoDataTermino.setText("");
            cbCategoria.setSelectedIndex(0);

        }
    }//GEN-LAST:event_btApagarFunActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaCadastroCliente1;
    private javax.swing.JButton btApagarFun;
    private javax.swing.JButton btCadastroFun;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoCurso;
    private javax.swing.JFormattedTextField campoDataTermino;
    private javax.swing.JTextField campoDuracao;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbFase;
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
    private void carregarCombo(int cdCategoria) {
        //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCategoria.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Categoria> categorias = new ArrayList<Categoria>();
        CategoriaController a = new CategoriaController();
        categorias = a.buscarCategoria();

        for (int linha = 0; linha < categorias.size(); linha++) {
            //pegando a categoria da lista
            Categoria categoria = categorias.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(categoria);
            if (categoria.getId() == cdCategoria) {
                comboModel.setSelectedItem(categoria);
            }

        }

    }
}
