package br.com.fastlease.view;
//@author Mauricio

import br.com.fastlease.controller.ReservaController;
import br.com.fastlease.model.Reserva;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaLista extends javax.swing.JFrame {

    ReservaTableModel model;

    public ReservaLista() {
        initComponents();
        setLocationRelativeTo(null);
        List<Reserva> lista = new ArrayList<Reserva>();
        ReservaController r = new ReservaController();
        lista = r.buscarReserva();

        //cria o modelo de Produto      
        model = new ReservaTableModel(lista);

        //atribui o modelo à tabela
        tabRe.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelCima = new javax.swing.JPanel();
        painelRodape = new javax.swing.JPanel();
        painelCabecalhoCliente1 = new javax.swing.JPanel();
        labelCadCliente1 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        tabSArea = new javax.swing.JScrollPane();
        tabRe = new javax.swing.JTable();
        btRelatorios = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelNomeRelFun = new javax.swing.JLabel();
        campoData = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox();
        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();
        menuLogoff = new javax.swing.JMenuItem();
        menuJanela = new javax.swing.JMenu();
        menuAreaUsuario = new javax.swing.JMenuItem();
        menuArquetipo = new javax.swing.JMenuItem();
        menuBloco = new javax.swing.JMenuItem();
        menuCargo = new javax.swing.JMenuItem();
        menuCategoria = new javax.swing.JMenuItem();
        menuCurso = new javax.swing.JMenuItem();
        menuSala = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Reserva");

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        painelCima.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout painelCimaLayout = new javax.swing.GroupLayout(painelCima);
        painelCima.setLayout(painelCimaLayout);
        painelCimaLayout.setHorizontalGroup(
            painelCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelCimaLayout.setVerticalGroup(
            painelCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        painelRodape.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout painelRodapeLayout = new javax.swing.GroupLayout(painelRodape);
        painelRodape.setLayout(painelRodapeLayout);
        painelRodapeLayout.setHorizontalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelRodapeLayout.setVerticalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        painelCabecalhoCliente1.setBackground(new java.awt.Color(0, 0, 0));

        labelCadCliente1.setBackground(new java.awt.Color(252, 250, 250));
        labelCadCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCadCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadCliente1.setText("RESERVAS DE SALAS E LABORATÓRIOS");
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

        javax.swing.GroupLayout painelCabecalhoCliente1Layout = new javax.swing.GroupLayout(painelCabecalhoCliente1);
        painelCabecalhoCliente1.setLayout(painelCabecalhoCliente1Layout);
        painelCabecalhoCliente1Layout.setHorizontalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btInserir)
                .addContainerGap())
        );
        painelCabecalhoCliente1Layout.setVerticalGroup(
            painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoCliente1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelCabecalhoCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCabecalhoCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btInserir)
                    .addComponent(btEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabSArea.setEnabled(false);

        tabRe.setModel(new javax.swing.table.DefaultTableModel(
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
        tabSArea.setViewportView(tabRe);

        btRelatorios.setBackground(new java.awt.Color(0, 0, 0));
        btRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        btRelatorios.setText("Relatórios");
        btRelatorios.setContentAreaFilled(false);
        btRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRelatorios.setOpaque(true);
        btRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatoriosActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        labelNomeRelFun.setText("Data Reserva:");

        try {
            campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });
        campoData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDataKeyPressed(evt);
            }
        });

        jLabel1.setText("Turno:");

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matutino", "Vespertino", "Noturno" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeRelFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNomeRelFun, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabSArea, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(painelCabecalhoCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btRelatorios)))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCabecalhoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabSArea, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRelatorios)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(painelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        menuAreaUsuario.setText("Area de Usuário");
        menuAreaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAreaUsuarioActionPerformed(evt);
            }
        });
        menuJanela.add(menuAreaUsuario);

        menuArquetipo.setText("Arquetipo");
        menuArquetipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquetipoActionPerformed(evt);
            }
        });
        menuJanela.add(menuArquetipo);

        menuBloco.setText("Bloco");
        menuBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBlocoActionPerformed(evt);
            }
        });
        menuJanela.add(menuBloco);

        menuCargo.setText("Cargo");
        menuCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCargoActionPerformed(evt);
            }
        });
        menuJanela.add(menuCargo);

        menuCategoria.setText("Categoria");
        menuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoriaActionPerformed(evt);
            }
        });
        menuJanela.add(menuCategoria);

        menuCurso.setText("Curso");
        menuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCursoActionPerformed(evt);
            }
        });
        menuJanela.add(menuCurso);

        menuSala.setText("Sala");
        menuSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalaActionPerformed(evt);
            }
        });
        menuJanela.add(menuSala);

        menuUsuario.setText("Usuário");
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });
        menuJanela.add(menuUsuario);

        menuBar.add(menuJanela);

        menuSobre.setText("Sobre");

        menuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSobre.setText("FastLease");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        menuSobre.add(menuItemSobre);

        menuBar.add(menuSobre);

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

    private void menuAreaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAreaUsuarioActionPerformed
        AreaUsuarioLista au = new AreaUsuarioLista();
        au.setVisible(true);
    }//GEN-LAST:event_menuAreaUsuarioActionPerformed

    private void menuJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJanelaActionPerformed
    }//GEN-LAST:event_menuJanelaActionPerformed

    private void menuBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBlocoActionPerformed
        BlocoLista bl = new BlocoLista();
        bl.setVisible(true);
    }//GEN-LAST:event_menuBlocoActionPerformed

    private void menuSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalaActionPerformed
        SalaLista sl = new SalaLista();
        sl.setVisible(true);
    }//GEN-LAST:event_menuSalaActionPerformed

    private void menuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoriaActionPerformed
        CategoriaLista cl = new CategoriaLista();
        cl.setVisible(true);
    }//GEN-LAST:event_menuCategoriaActionPerformed

    private void menuArquetipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquetipoActionPerformed
        ArquetipoLista aq = new ArquetipoLista();
        aq.setVisible(true);
    }//GEN-LAST:event_menuArquetipoActionPerformed

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreActionPerformed
    }//GEN-LAST:event_menuItemSobreActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoActionPerformed

    }//GEN-LAST:event_menuArquivoActionPerformed

    private void menuCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCargoActionPerformed
        CargoLista cl = new CargoLista();
        cl.setVisible(true);
    }//GEN-LAST:event_menuCargoActionPerformed

    private void menuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCursoActionPerformed
        CursoLista cl = new CursoLista();
        cl.setVisible(true);

    }//GEN-LAST:event_menuCursoActionPerformed

    private void menuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoffActionPerformed
        this.dispose();
        JanelaLogin l = new JanelaLogin();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuLogoffActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int selecionado = -1;
        selecionado = tabRe.getSelectedRow();

        String message = "Você tem certeza que deseja excluir?";
        String title = "Deseja sair?";
        int condicao = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (condicao == JOptionPane.YES_OPTION) {

            if (selecionado >= 0) {
                Integer i = (Integer) model.getValueAt(selecionado, 0);
                ReservaController rc = new ReservaController();
                rc.excluir(i);
                model.removeReserva(selecionado);
                JOptionPane.showMessageDialog(null, "Reserva excluída com sucesso");

            } else {
                JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        ReservaInserir ri = new ReservaInserir(model);
        ri.setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int selecionado = -1;
        selecionado = tabRe.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdModelo = (Integer) model.getValueAt(selecionado, 0);
            ReservaEditar am = new ReservaEditar(selecionado, cdModelo, model);
            am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void btRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatoriosActionPerformed
        Relatorio r = new Relatorio();
        r.setVisible(true);

    }//GEN-LAST:event_btRelatoriosActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
        UsuarioLista ul = new UsuarioLista();
        ul.setVisible(true);
    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void campoDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDataKeyPressed
        JOptionPane.showMessageDialog(null,"Recurso em desenvolvimento");
    }//GEN-LAST:event_campoDataKeyPressed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        JOptionPane.showMessageDialog(null,"Recurso em desenvolvimento");
    }//GEN-LAST:event_campoDataActionPerformed
    private void efetuaPesquisa() {
        String date = campoData.getText();
        List<Reserva> lista = new ArrayList<Reserva>();
        ReservaController a = new ReservaController();
        lista = a.buscarReservabyData(date);
        model.limpar();

        //cria o modelo de Produto      
        model = new ReservaTableModel(lista);

        //atribui o modelo à tabela
        tabRe.setModel(model);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRelatorios;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JComboBox cmbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCadCliente1;
    private javax.swing.JLabel labelNomeRelFun;
    private javax.swing.JMenuItem menuAreaUsuario;
    private javax.swing.JMenuItem menuArquetipo;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuBloco;
    private javax.swing.JMenuItem menuCargo;
    private javax.swing.JMenuItem menuCategoria;
    private javax.swing.JMenuItem menuCurso;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JMenu menuJanela;
    private javax.swing.JMenuItem menuLogoff;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSala;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem menuUsuario;
    private javax.swing.JPanel painelCabecalhoCliente1;
    private javax.swing.JPanel painelCima;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JTable tabRe;
    private javax.swing.JScrollPane tabSArea;
    // End of variables declaration//GEN-END:variables

}
