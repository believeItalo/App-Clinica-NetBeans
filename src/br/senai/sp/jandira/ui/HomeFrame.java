
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JTable;


public class HomeFrame extends javax.swing.JFrame {

   
    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.gravarPlanoDeSaudeTeste();
        criarTabelaPlanosDeSaude();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botaoAgenda = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        planoDeSaude = new javax.swing.JButton();
        botaoEspecialidades = new javax.swing.JButton();
        botaoPacientes = new javax.swing.JButton();
        botaoMedicos = new javax.swing.JButton();
        cabecalho = new javax.swing.JPanel();
        textoTitulo = new javax.swing.JLabel();
        faixaTopoTitulo = new javax.swing.JPanel();
        agenda = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelPlanosDeSaude = new javax.swing.JPanel();
        scrollPanelPlanosDeSaude = new javax.swing.JScrollPane();
        tabelaPlanosDeSaude = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        botaoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda32px.png"))); // NOI18N
        botaoAgenda.setToolTipText("Agenda");
        botaoAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendaActionPerformed(evt);
            }
        });
        jPanel2.add(botaoAgenda);
        botaoAgenda.setBounds(30, 90, 70, 50);

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/saida32px.png"))); // NOI18N
        botaoSair.setToolTipText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        jPanel2.add(botaoSair);
        botaoSair.setBounds(590, 90, 70, 50);

        planoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/planoDeSaude32px.png"))); // NOI18N
        planoDeSaude.setToolTipText("Plano de Saúde");
        planoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planoDeSaudeActionPerformed(evt);
            }
        });
        jPanel2.add(planoDeSaude);
        planoDeSaude.setBounds(350, 90, 70, 50);

        botaoEspecialidades.setBackground(new java.awt.Color(102, 153, 255));
        botaoEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/especialidades32px.png"))); // NOI18N
        botaoEspecialidades.setToolTipText("Especialidades");
        botaoEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEspecialidadesActionPerformed(evt);
            }
        });
        jPanel2.add(botaoEspecialidades);
        botaoEspecialidades.setBounds(270, 90, 70, 50);

        botaoPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pacienteDoente.png"))); // NOI18N
        botaoPacientes.setToolTipText("Pacientes");
        botaoPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPacientesActionPerformed(evt);
            }
        });
        jPanel2.add(botaoPacientes);
        botaoPacientes.setBounds(110, 90, 70, 50);

        botaoMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/doctor32px.png"))); // NOI18N
        botaoMedicos.setToolTipText("Médicos");
        botaoMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMedicosActionPerformed(evt);
            }
        });
        jPanel2.add(botaoMedicos);
        botaoMedicos.setBounds(190, 90, 70, 50);

        cabecalho.setBackground(new java.awt.Color(255, 255, 255));
        cabecalho.setLayout(null);

        textoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        textoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(0, 153, 255));
        textoTitulo.setText("Sistema Para Agendamento de Consultas");
        cabecalho.add(textoTitulo);
        textoTitulo.setBounds(20, 30, 480, 40);

        faixaTopoTitulo.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout faixaTopoTituloLayout = new javax.swing.GroupLayout(faixaTopoTitulo);
        faixaTopoTitulo.setLayout(faixaTopoTituloLayout);
        faixaTopoTituloLayout.setHorizontalGroup(
            faixaTopoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        faixaTopoTituloLayout.setVerticalGroup(
            faixaTopoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        cabecalho.add(faixaTopoTitulo);
        faixaTopoTitulo.setBounds(0, 0, 870, 20);

        agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda64px.png"))); // NOI18N
        cabecalho.add(agenda);
        agenda.setBounds(500, 0, 70, 110);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        cabecalho.add(jPanel1);
        jPanel1.setBounds(620, 50, 100, 5);

        jPanel2.add(cabecalho);
        cabecalho.setBounds(0, 0, 720, 80);

        panelPlanosDeSaude.setBackground(new java.awt.Color(51, 153, 255));
        panelPlanosDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de saúde ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelPlanosDeSaude.setLayout(null);

        tabelaPlanosDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tabelaPlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPanelPlanosDeSaude.setViewportView(tabelaPlanosDeSaude);

        panelPlanosDeSaude.add(scrollPanelPlanosDeSaude);
        scrollPanelPlanosDeSaude.setBounds(10, 30, 630, 290);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete48px.png"))); // NOI18N
        jButton2.setToolTipText("Deletar Plano");
        panelPlanosDeSaude.add(jButton2);
        jButton2.setBounds(580, 330, 60, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar48px.png"))); // NOI18N
        jButton3.setToolTipText("Editar Plano");
        panelPlanosDeSaude.add(jButton3);
        jButton3.setBounds(510, 330, 60, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar48px.png"))); // NOI18N
        jButton4.setToolTipText("Adicionar Plano");
        panelPlanosDeSaude.add(jButton4);
        jButton4.setBounds(440, 330, 60, 60);

        jPanel2.add(panelPlanosDeSaude);
        panelPlanosDeSaude.setBounds(30, 160, 660, 410);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 720, 630);

        setBounds(0, 0, 736, 658);
    }// </editor-fold>//GEN-END:initComponents

    private void planoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planoDeSaudeActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAgendaActionPerformed

    private void botaoEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEspecialidadesActionPerformed

    private void botaoPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPacientesActionPerformed

    private void botaoMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMedicosActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agenda;
    private javax.swing.JButton botaoAgenda;
    private javax.swing.JButton botaoEspecialidades;
    private javax.swing.JButton botaoMedicos;
    private javax.swing.JButton botaoPacientes;
    private javax.swing.JButton botaoSair;
    private javax.swing.JPanel cabecalho;
    private javax.swing.JPanel faixaTopoTitulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelPlanosDeSaude;
    private javax.swing.JButton planoDeSaude;
    private javax.swing.JScrollPane scrollPanelPlanosDeSaude;
    private javax.swing.JTable tabelaPlanosDeSaude;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {
        tabelaPlanosDeSaude.setModel(PlanoDeSaudeDAO.getTableModel());
        //Desativar redimensionamento
        
        // Definir lagura de cada coluna
        tabelaPlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaPlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(225);
        tabelaPlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(225);
        //impedir a movimentação das colunas
        tabelaPlanosDeSaude.getTableHeader().setReorderingAllowed(false);
        //impedindo digitar nos campos da tabela
        tabelaPlanosDeSaude.setDefaultEditor(Object.class, null);
    }
    //desativar edição da jTable
    
}
