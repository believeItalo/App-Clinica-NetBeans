package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class PlanosDeSaudePanel extends javax.swing.JPanel {

    int linha;

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
        jButtonEditar = new javax.swing.JButton();
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

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar48px.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar Plano");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        panelPlanosDeSaude.add(jButtonEditar);
        jButtonEditar.setBounds(510, 330, 60, 60);

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
        PlanoDeSaudeJDialog planoDeSaudeDialog = new PlanoDeSaudeJDialog
        (null, 
         true, 
         TipoOperacao.ADICIONAR,
         null);
        planoDeSaudeDialog.setVisible(true);
        criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        //obtemos o índice da linha selecionada
        int linha = tabelaPlanosDeSaude.getSelectedRow();

        //verificamos se a linha é diferente de -1
        //-1 significa que o usuário na selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o Plano que você deseja escluir",
                    "Plano De Saúde",
                    JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(linha);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        linha = tabelaPlanosDeSaude.getSelectedRow();

        if (linha != -1) {
            editar();
            
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione um plano de saúde pra alterar",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);

        }
  

    }//GEN-LAST:event_jButtonEditarActionPerformed
    //variaveais declardas dentro de um bloco, são visíveis somente no bloco onde foi criad
    // isso se chama "escopo de visibilidade"

    private void editar() {
        
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        PlanoDeSaudeJDialog planoDeSaudeJDialog = new PlanoDeSaudeJDialog(null,
                true, 
                TipoOperacao.ALTERAR,
                planoDeSaude);
        planoDeSaudeJDialog.setVisible(true);
        
        criarTabelaPlanosDeSaude();
    }

    private void excluir() {
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão do plano de Saúde selecionado?",
                "Plano de saúde",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            
            PlanoDeSaudeDAO.excluir(getCodigo());
            criarTabelaPlanosDeSaude();
        }
    }
    
        private Integer getCodigo(){
        String codigoStr = tabelaPlanosDeSaude.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
        
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonEditar;
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
    }

}
