
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JOptionPane;


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
        jButtonExcluir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();

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

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete48px.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Deletar Plano");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        panelPlanosDeSaude.add(jButtonExcluir);
        jButtonExcluir.setBounds(580, 330, 60, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar48px.png"))); // NOI18N
        jButton3.setToolTipText("Editar Plano");
        panelPlanosDeSaude.add(jButton3);
        jButton3.setBounds(510, 330, 60, 60);

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar48px.png"))); // NOI18N
        jButtonAdicionar.setToolTipText("Adicionar Plano");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        panelPlanosDeSaude.add(jButtonAdicionar);
        jButtonAdicionar.setBounds(440, 330, 60, 60);

        add(panelPlanosDeSaude);
        panelPlanosDeSaude.setBounds(0, 0, 660, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
      PlanoDeSaudeJDialog planoDeSaudeDialog = new PlanoDeSaudeJDialog(null, true);
      planoDeSaudeDialog.setVisible(true);
      criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       int resposta = JOptionPane.showConfirmDialog(this,
               "Você confirma a exclusão do plano de Saúde selecionado?",
               "Plano de saúde",
               JOptionPane.QUESTION_MESSAGE,
               JOptionPane.YES_NO_OPTION);
              
        
        
        int linha = tabelaPlanosDeSaude.getSelectedRow();
        if (linha != -1) {
            
            String codigoStr = tabelaPlanosDeSaude.getValueAt(linha, 0).toString();
            Integer codigo = Integer.valueOf(codigoStr);
            
            PlanoDeSaudeDAO.excluir(codigo);
            criarTabelaPlanosDeSaude();
        } else{
            JOptionPane.showMessageDialog(this, "Selecione o Plano que você deseja escluir", 
                    "Plano De Saúde", 
                    JOptionPane.ERROR_MESSAGE);
        }
       
        System.out.println(linha);
    }//GEN-LAST:event_jButtonExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonExcluir;
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
