/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemadegerenciamentodetarefas.view;

import sistemadegerenciamentodetarefas.model.TarefaProfissional;
import sistemadegerenciamentodetarefas.model.TarefaAcademica;
import sistemadegerenciamentodetarefas.repository.Conexao;
import sistemadegerenciamentodetarefas.repository.ConexaoMySQL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class JanelaPrincipal extends javax.swing.JFrame {

   JanelaCadastroTarefaAcademica janelaCadastroTarefaAcademica;
   JanelaCadastroTarefaProfissional janelaCadastroTarefaProfissional;
   public List<TarefaAcademica> lstTarefaAcademica;
   public List<TarefaProfissional> lstTarefaProfissional;
   public int ultimoId;
   private Conexao conexao;
   public ConexaoMySQL conexaoMySQL;
    
    public JanelaPrincipal() {
        initComponents();
        lstTarefaAcademica = new ArrayList<>();
        lstTarefaProfissional = new ArrayList<>();
        ultimoId = 0;
        conexao = new Conexao (
                "localhost",
                "root",
                "02172527Gus@",
                3306,
                "cadastro_tarefas"
        );
        conexaoMySQL = new ConexaoMySQL(conexao);
        conexaoMySQL.conectar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        tarefasMenu = new javax.swing.JMenu();
        cadastroTarefasAcademicas = new javax.swing.JMenuItem();
        cadastroTarefasProfissionais = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();
        relatoriosMenu = new javax.swing.JMenu();
        ajudaMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Tarefas");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gusta\\OneDrive\\Pictures\\atom_icon.png")); // NOI18N
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        tarefasMenu.setText("Menu");

        cadastroTarefasAcademicas.setText("Cadastro Tarefas Academicas");
        cadastroTarefasAcademicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTarefasAcademicasActionPerformed(evt);
            }
        });
        tarefasMenu.add(cadastroTarefasAcademicas);

        cadastroTarefasProfissionais.setText("Cadastro Tarefas Profissionais");
        cadastroTarefasProfissionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTarefasProfissionaisActionPerformed(evt);
            }
        });
        tarefasMenu.add(cadastroTarefasProfissionais);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        tarefasMenu.add(sair);

        jMenuBar1.add(tarefasMenu);

        relatoriosMenu.setText("Relatórios");
        jMenuBar1.add(relatoriosMenu);

        ajudaMenu.setText("Ajuda");
        jMenuBar1.add(ajudaMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroTarefasAcademicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTarefasAcademicasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cadastroTarefasAcademicasActionPerformed

    private void cadastroTarefasProfissionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTarefasProfissionaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroTarefasProfissionaisActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaMenu;
    private javax.swing.JMenuItem cadastroTarefasAcademicas;
    private javax.swing.JMenuItem cadastroTarefasProfissionais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu relatoriosMenu;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenu tarefasMenu;
    // End of variables declaration//GEN-END:variables
}
