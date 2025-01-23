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
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */

public class JanelaPrincipal extends javax.swing.JFrame {

   JanelaCadastroTarefaAcademica janelaCadastroTarefaAcademica;
   JanelaCadastroTarefaProfissional janelaCadastroTarefaProfissional;
   JanelaOpcaoRelatorios janelaOpcaoRelatorios;
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
                "admin",
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

        desktopPane = new javax.swing.JDesktopPane();
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
        setMinimumSize(new java.awt.Dimension(900, 700));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        tarefasMenu.setMnemonic('m');
        tarefasMenu.setText("Menu");

        cadastroTarefasAcademicas.setMnemonic('a');
        cadastroTarefasAcademicas.setText("Cadastro Tarefas Academicas");
        cadastroTarefasAcademicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTarefasAcademicasActionPerformed(evt);
            }
        });
        tarefasMenu.add(cadastroTarefasAcademicas);

        cadastroTarefasProfissionais.setMnemonic('p');
        cadastroTarefasProfissionais.setText("Cadastro Tarefas Profissionais");
        cadastroTarefasProfissionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTarefasProfissionaisActionPerformed(evt);
            }
        });
        tarefasMenu.add(cadastroTarefasProfissionais);

        sair.setMnemonic('s');
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        tarefasMenu.add(sair);

        jMenuBar1.add(tarefasMenu);

        relatoriosMenu.setMnemonic('r');
        relatoriosMenu.setText("Relatórios");
        relatoriosMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatoriosMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(relatoriosMenu);

        ajudaMenu.setMnemonic('a');
        ajudaMenu.setText("Ajuda");
        ajudaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajudaMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(ajudaMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroTarefasAcademicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTarefasAcademicasActionPerformed
        // TODO add your handling code here:
        try{
            janelaCadastroTarefaAcademica = JanelaCadastroTarefaAcademica.getInstancia(this);
            if(!desktopPane.isAncestorOf(janelaCadastroTarefaAcademica)){
                desktopPane.add("JanelaCadastroTarefaAcademica", janelaCadastroTarefaAcademica);
                janelaCadastroTarefaAcademica.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
                int x = (getDesktopPane().getWidth() - janelaCadastroTarefaAcademica.getWidth()) / 2;
                int y = (getDesktopPane().getHeight() - janelaCadastroTarefaAcademica.getHeight()) / 2;
                janelaCadastroTarefaAcademica.setLocation(x, y);
            }
            
            janelaCadastroTarefaAcademica.setSelected(true);
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null, 
                    "Erro ao abrir a tela de cadastro de tarefa acadêmica: ",
                    "Cadastro tarefa acadêmica",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_cadastroTarefasAcademicasActionPerformed

    private void cadastroTarefasProfissionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTarefasProfissionaisActionPerformed
        // TODO add your handling code here:
        try{
            janelaCadastroTarefaProfissional = JanelaCadastroTarefaProfissional.getInstancia(this);
            if(!desktopPane.isAncestorOf(janelaCadastroTarefaProfissional)){
                desktopPane.add("JanelaCadastroTarefaProfissional", janelaCadastroTarefaProfissional);
                janelaCadastroTarefaProfissional.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
                int x = (getDesktopPane().getWidth() - janelaCadastroTarefaProfissional.getWidth()) / 2;
                int y = (getDesktopPane().getHeight() - janelaCadastroTarefaProfissional.getHeight()) / 2;
                janelaCadastroTarefaProfissional.setLocation(x, y);
            }
            
            janelaCadastroTarefaProfissional.setSelected(true);
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null, 
                    "Erro ao abrir a tela de cadastro de tarefa profissional: ",
                    "Cadastro de tarefa profissional",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastroTarefasProfissionaisActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void relatoriosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatoriosMenuMouseClicked
                                      
        try {
            janelaOpcaoRelatorios = JanelaOpcaoRelatorios.getInstancia(this);

            if (!janelaOpcaoRelatorios.isVisible()) {
                desktopPane.add(janelaOpcaoRelatorios);
                janelaOpcaoRelatorios.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
                janelaOpcaoRelatorios.setVisible(true);
                int x = (getDesktopPane().getWidth() - janelaOpcaoRelatorios.getWidth()) / 2;
                int y = (getDesktopPane().getHeight() - janelaOpcaoRelatorios.getHeight()) / 2;
                janelaOpcaoRelatorios.setLocation(x, y); 
            }

            janelaOpcaoRelatorios.setSelected(true);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Erro ao abrir a tela de opções de relatórios: " + ex.getMessage(),
                    "Opção relatório",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_relatoriosMenuMouseClicked

    private void ajudaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajudaMenuMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,
                    "Comandos: \na - Cadastro de Tarefas Acadêmicas\np - Cadastro de Tarefas Profissionais\ns - Sair" ,
                    "Ajuda",
                    JOptionPane.DEFAULT_OPTION);
        
    }//GEN-LAST:event_ajudaMenuMouseClicked

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

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaMenu;
    private javax.swing.JMenuItem cadastroTarefasAcademicas;
    private javax.swing.JMenuItem cadastroTarefasProfissionais;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu relatoriosMenu;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenu tarefasMenu;
    // End of variables declaration//GEN-END:variables

}
