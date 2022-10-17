package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class PlanoDeSaudeJDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;

    public PlanoDeSaudeJDialog(java.awt.Frame parent, boolean modal, TipoOperacao operacao, PlanoDeSaude planoDeSaude) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;

        //preencher os campos, caso o tipo de operação for *alterar*
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            preencherFormulario();

        }

    }

    private void preencherFormulario() {
        jLabelTitulo.setText("Planos de Saúde - " + tipoOperacao);
        jTextFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        jTextFieldNomeDaOperadora.setText(planoDeSaude.getOperadora());
        jTextFieldTipoDoPlano.setText(planoDeSaude.gettipoDoPlano());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIconeTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNomeDaOperadora = new javax.swing.JLabel();
        jTextFieldNomeDaOperadora = new javax.swing.JTextField();
        jLabelTituloDoPlano = new javax.swing.JLabel();
        jTextFieldTipoDoPlano = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(757, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setText("Cadastro Planos De Saude");
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(60, 10, 300, 30);

        jLabelIconeTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar48px.png"))); // NOI18N
        jPanel1.add(jLabelIconeTitulo);
        jLabelIconeTitulo.setBounds(10, 10, 48, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel2.setLayout(null);

        jLabelCodigo.setText("Código");
        jPanel2.add(jLabelCodigo);
        jLabelCodigo.setBounds(20, 50, 80, 16);

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(20, 70, 60, 22);

        jLabelNomeDaOperadora.setText("Nome Da Operadora");
        jPanel2.add(jLabelNomeDaOperadora);
        jLabelNomeDaOperadora.setBounds(20, 110, 200, 16);
        jPanel2.add(jTextFieldNomeDaOperadora);
        jTextFieldNomeDaOperadora.setBounds(20, 130, 290, 22);

        jLabelTituloDoPlano.setText("Tipo Do Plano");
        jPanel2.add(jLabelTituloDoPlano);
        jLabelTituloDoPlano.setBounds(20, 170, 240, 16);
        jPanel2.add(jTextFieldTipoDoPlano);
        jTextFieldTipoDoPlano.setBounds(20, 190, 290, 22);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete48px.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jPanel2.add(jButtonCancelar);
        jButtonCancelar.setBounds(440, 230, 60, 60);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/save32.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSalvar);
        jButtonSalvar.setBounds(360, 230, 60, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 530, 300);

        setBounds(0, 0, 569, 464);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        //criar Objeto Plano de Saude
        if(tipoOperacao == TipoOperacao.ADICIONAR){
        gravar();
        
        } else{
        atualizar();
        }
        
        
       


    }//GEN-LAST:event_jButtonSalvarActionPerformed
    
    private void atualizar(){
   //planoDeSaude.setOperadora();
    //planoDeSaude.setTipoDoPlano();
    PlanoDeSaudeDAO.atualizar(planoDeSaude);
    JOptionPane.showMessageDialog(null, 
            "Plano De Saúde atualizado com sucesso!", 
            "Plano De Saude",
            JOptionPane.INFORMATION_MESSAGE);
    
    }
       
    
    
    
    private void gravar(){
    
     PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(jTextFieldNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(jTextFieldTipoDoPlano.getText());

        if (validarCAdastro()) {
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            JOptionPane.showMessageDialog(this,
                    "Plano de Saúde gravado com sucesso",
                    "Plano De Saude",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    
    
    private boolean validarCAdastro() {
        if (jTextFieldNomeDaOperadora.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Digite o nome da Operadora", "ERRO", JOptionPane.ERROR_MESSAGE);
            jTextFieldNomeDaOperadora.requestFocus();
            return false;

        }
        if (jTextFieldTipoDoPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o tipo do Plano", "ERRO", JOptionPane.ERROR_MESSAGE);
            jTextFieldTipoDoPlano.requestFocus();
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelIconeTitulo;
    private javax.swing.JLabel jLabelNomeDaOperadora;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloDoPlano;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNomeDaOperadora;
    private javax.swing.JTextField jTextFieldTipoDoPlano;
    // End of variables declaration//GEN-END:variables
}
