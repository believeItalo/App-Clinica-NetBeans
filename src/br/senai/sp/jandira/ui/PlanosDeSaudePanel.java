
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;


public class PlanosDeSaudePanel extends javax.swing.JPanel {

    
    public PlanosDeSaudePanel() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlanosDeSaude = new javax.swing.JPanel();
        scrollPanelPlanosDeSaude = new javax.swing.JScrollPane();
        tabelaPlanosDeSaude = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setDoubleBuffered(false);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(660, 410));
        setLayout(null);

        panelPlanosDeSaude.setBackground(new java.awt.Color(51, 153, 255));
        panelPlanosDeSaude.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPlanosDeSaude.setLayout(null);

        tabelaPlanosDeSaude.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelPlanosDeSaude.add(jButton4);
        jButton4.setBounds(440, 330, 60, 60);

        add(panelPlanosDeSaude);
        panelPlanosDeSaude.setBounds(0, 0, 660, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PlanoDeSaudeDialog planoDialog = new PlanoDeSaudeDialog();
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel panelPlanosDeSaude;
    private javax.swing.JScrollPane scrollPanelPlanosDeSaude;
    private javax.swing.JTable tabelaPlanosDeSaude;
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
    }}
