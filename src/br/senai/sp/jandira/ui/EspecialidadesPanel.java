
package br.senai.sp.jandira.ui;


public class EspecialidadesPanel extends javax.swing.JPanel {
    
    int linha;
    
    public EspecialidadesPanel() {
        initComponents();
        setVisible(true);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelEspecialidade = new javax.swing.JPanel();
        panelEspecialidades = new javax.swing.JPanel();
        scrollPanelPlanosDeSaude = new javax.swing.JScrollPane();
        tabelaPlanosDeSaude = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(660, 410));
        setLayout(null);

        jpanelEspecialidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpanelEspecialidade.setDoubleBuffered(false);
        jpanelEspecialidade.setInheritsPopupMenu(true);
        jpanelEspecialidade.setPreferredSize(new java.awt.Dimension(660, 410));
        jpanelEspecialidade.setLayout(null);

        panelEspecialidades.setBackground(new java.awt.Color(51, 153, 255));
        panelEspecialidades.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEspecialidades.setLayout(null);

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

        panelEspecialidades.add(scrollPanelPlanosDeSaude);
        scrollPanelPlanosDeSaude.setBounds(10, 30, 630, 290);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete48px.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Deletar Plano");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        panelEspecialidades.add(jButtonExcluir);
        jButtonExcluir.setBounds(580, 330, 60, 60);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar48px.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar Plano");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        panelEspecialidades.add(jButtonEditar);
        jButtonEditar.setBounds(510, 330, 60, 60);

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar48px.png"))); // NOI18N
        jButtonAdicionar.setToolTipText("Adicionar Plano");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        panelEspecialidades.add(jButtonAdicionar);
        jButtonAdicionar.setBounds(440, 330, 60, 60);

        jLabel1.setText("jLabel1");
        panelEspecialidades.add(jLabel1);
        jLabel1.setBounds(180, 170, 160, 16);

        jpanelEspecialidade.add(panelEspecialidades);
        panelEspecialidades.setBounds(0, 0, 660, 410);

        add(jpanelEspecialidade);
        jpanelEspecialidade.setBounds(0, 0, 660, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

       
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

       

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpanelEspecialidade;
    private javax.swing.JPanel panelEspecialidades;
    private javax.swing.JScrollPane scrollPanelPlanosDeSaude;
    private javax.swing.JTable tabelaPlanosDeSaude;
    // End of variables declaration//GEN-END:variables
}
