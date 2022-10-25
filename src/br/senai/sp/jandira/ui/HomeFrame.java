
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JTable;
import br.senai.sp.jandira.ui.EspecialidadesPanel;
import java.util.Locale;


public class HomeFrame extends javax.swing.JFrame {

    private PlanosDeSaudePanel planosDeSaudePanel;
    private final int POSICAO_X = 30;
    private final int POSICAO_Y = 160;
    private final int LARGURA = 660;
    private final int ALTURA = 440;
   
    
    
    
    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.gravarPlanoDeSaudeTeste();
        initPanels();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoHome = new javax.swing.JButton();
        botaoAgenda = new javax.swing.JButton();
        botaoPacientes = new javax.swing.JButton();
        botaoMedicos = new javax.swing.JButton();
        botaoEspecialidades = new javax.swing.JButton();
        botaoPlanoDeSaude = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        textoTitulo = new javax.swing.JLabel();
        agenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(900, 900, 900, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/home32.png"))); // NOI18N
        botaoHome.setToolTipText("Home");
        botaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHomeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoHome);
        botaoHome.setBounds(10, 70, 70, 50);

        botaoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda32px.png"))); // NOI18N
        botaoAgenda.setToolTipText("Agenda");
        botaoAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAgenda);
        botaoAgenda.setBounds(460, 70, 70, 50);

        botaoPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pacienteDoente.png"))); // NOI18N
        botaoPacientes.setToolTipText("Pacientes");
        botaoPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPacientes);
        botaoPacientes.setBounds(100, 70, 70, 50);

        botaoMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/doctor32px.png"))); // NOI18N
        botaoMedicos.setToolTipText("Médicos");
        botaoMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMedicos);
        botaoMedicos.setBounds(190, 70, 70, 50);

        botaoEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/especialidades32px.png"))); // NOI18N
        botaoEspecialidades.setToolTipText("Especialidades");
        botaoEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEspecialidades);
        botaoEspecialidades.setBounds(280, 70, 70, 50);

        botaoPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/planoDeSaude32px.png"))); // NOI18N
        botaoPlanoDeSaude.setToolTipText("Plano de Saúde");
        botaoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPlanoDeSaude);
        botaoPlanoDeSaude.setBounds(370, 70, 70, 50);

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/saida32px.png"))); // NOI18N
        botaoSair.setToolTipText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair);
        botaoSair.setBounds(620, 70, 70, 50);

        panelHome.setBackground(new java.awt.Color(51, 153, 255));
        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SISACON", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para agendamento de consultas");
        panelHome.add(jLabel1);
        jLabel1.setBounds(10, 130, 480, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dados para contato:");
        panelHome.add(jLabel2);
        jLabel2.setBounds(470, 140, 200, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail: suporte@gmail.com");
        panelHome.add(jLabel3);
        jLabel3.setBounds(470, 180, 210, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone: (11)9555-5555");
        panelHome.add(jLabel4);
        jLabel4.setBounds(470, 200, 170, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("www.sisacon.com.br");
        panelHome.add(jLabel5);
        jLabel5.setBounds(470, 220, 150, 20);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelHome.add(jPanel3);
        jPanel3.setBounds(0, 110, 660, 3);

        getContentPane().add(panelHome);
        panelHome.setBounds(30, 150, 660, 410);

        textoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        textoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(0, 153, 255));
        textoTitulo.setText("Sistema Para Agendamento de Consultas");
        getContentPane().add(textoTitulo);
        textoTitulo.setBounds(20, 10, 480, 40);

        agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda64px.png"))); // NOI18N
        getContentPane().add(agenda);
        agenda.setBounds(550, -10, 70, 110);

        setBounds(0, 0, 742, 656);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPlanoDeSaudeActionPerformed
        botaoPlanoDeSaude.setBackground(new java.awt.Color(153,255,255));
        botaoHome.setBackground(new java.awt.Color(255,255,255));
        panelHome.setVisible(false);
        planosDeSaudePanel.setVisible(true);
    }//GEN-LAST:event_botaoPlanoDeSaudeActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAgendaActionPerformed

    private void botaoEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEspecialidadesActionPerformed
        botaoEspecialidades.setBackground(new java.awt.Color(153,255,255));
        botaoEspecialidades.setBackground(new java.awt.Color(255,255,255));
        
        panelHome.setVisible(false);
        planosDeSaudePanel.setVisible(false);
        
        
        
        
        
    }//GEN-LAST:event_botaoEspecialidadesActionPerformed

    private void botaoPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPacientesActionPerformed

    private void botaoMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMedicosActionPerformed
        
    }//GEN-LAST:event_botaoMedicosActionPerformed

    private void botaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHomeActionPerformed
      botaoHome.setBackground(new java.awt.Color(153,255,255));  
      botaoPlanoDeSaude.setBackground(new java.awt.Color(255,255,255));
      panelHome.setVisible(true);
    }//GEN-LAST:event_botaoHomeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agenda;
    private javax.swing.JButton botaoAgenda;
    private javax.swing.JButton botaoEspecialidades;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoMedicos;
    private javax.swing.JButton botaoPacientes;
    private javax.swing.JButton botaoPlanoDeSaude;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelHome;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        planosDeSaudePanel = new PlanosDeSaudePanel();
        planosDeSaudePanel.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        getContentPane().add(planosDeSaudePanel);
        planosDeSaudePanel.setVisible(false);
    }

    
    //desativar edição da jTable
    
}
