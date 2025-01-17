/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sistemadegerenciamentodetarefas.view;

import sistemadegerenciamentodetarefas.model.TarefaAcademica;
import sistemadegerenciamentodetarefas.model.Tarefa;
import sistemadegerenciamentodetarefas.model.TarefaProfissional;
import sistemadegerenciamentodetarefas.repository.TarefaAcademicaRepository;
import sistemadegerenciamentodetarefas.repository.TarefaProfissionalRepository;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */

public class JanelaCadastroTarefaAcademica extends javax.swing.JInternalFrame {

    private static JanelaCadastroTarefaAcademica instancia;
    private JanelaPrincipal janelaPrincipal;
    /**
     * Creates new form JanelaCadastro
     */
    public JanelaCadastroTarefaAcademica(JanelaPrincipal janelaPrincipal) {
        initComponents();
        this.janelaPrincipal = janelaPrincipal;
        txtId.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxConcluida = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtNomeTarefa = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        btnProximo1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        txtData = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtMateria = new javax.swing.JTextField();
        boxEmAndamento = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        boxNaoConcluida = new javax.swing.JCheckBox();
        txtProfessor = new javax.swing.JTextField();

        boxConcluida.setText("Concluída");

        jLabel6.setText("Professor");

        jLabel4.setText("Status");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome da Tarefa");

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        txtNomeTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeTarefaActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        btnAnterior.setText("<=");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        btnProximo1.setText("=>");
        btnProximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximo1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Data");

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        txtData.setText("dd/mm/aaaa");
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMateriaActionPerformed(evt);
            }
        });

        boxEmAndamento.setText("Em Andamento");

        jLabel5.setText("Matéria");

        boxNaoConcluida.setText("Não concluída");
        boxNaoConcluida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNaoConcluidaActionPerformed(evt);
            }
        });

        txtProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar)
                        .addGap(18, 18, 18)
                        .addComponent(btnProximo1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(boxNaoConcluida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxEmAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boxConcluida, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxNaoConcluida)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxConcluida)
                        .addComponent(boxEmAndamento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnterior)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir)
                        .addComponent(btnFechar)
                        .addComponent(btnProximo1)
                        .addComponent(btnCadastrar)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtNomeTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeTarefaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        TarefaAcademica tarefaAcademica = new TarefaAcademica();
        tarefaAcademica.setNomeTarefa(txtNomeTarefa.getText());
        tarefaAcademica.setDescricaoTarefa(txtDescricao.getText());
        tarefaAcademica.setData(txtData.getText());
        tarefaAcademica.setStatus(Integer.parseInt(txtStatus.getText()));
        tarefaAcademica.setMateria(txtMateria.getText());
        tarefaAcademica.setProfessor(txtProfessor.getText());
        tarefaAcademica.setId(id);
        //inserir tarefa academica no banco de dados:
        TarefaAcademicaRepository tarefaAcademicaRepository = new TarefaAcademicaRepository();
        boolean retornoBanco = false;
        if(Integer.parseInt(txtId.getText()) == 0){
            //inserir
            retornoBanco = tarefaAcademicaRepository.inserir(
                janelaPrincipal.conexaoMySQL.connection,
                tarefaAcademica);
        }else{
            //atualizar
            retornoBanco = tarefaAcademicaRepository.atualizar(
                janelaPrincipal.conexaoMySQL.connection,
                tarefaAcademica
            );
        }
        if(retornoBanco){
            JOptionPane.showMessageDialog(
                this,
                "Cadastro atualizado com sucesso!",
                "Tela de cadastro tarefas academicas",
                JOptionPane.INFORMATION_MESSAGE
            );
            //limpar a janela
            limparJanela();
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        limparJanela();
        TarefaAcademicaRepository tarefaAcademicaRepository = new TarefaAcademicaRepository();
        TarefaAcademica tarefaAcademica = tarefaAcademicaRepository.selecionar(
            janelaPrincipal.conexaoMySQL.connection,
            "<",
            Integer.parseInt(txtId.getText()));
        if(tarefaAcademica != null){
            //passar os dados para a tela:
            txtNomeTarefa.setText(tarefaAcademica.getNomeTarefa());
            txtDescricao.setText(tarefaAcademica.getDescricaoTarefa());
            txtData.setText(tarefaAcademica.getData());
            txtStatus.setText(String.valueOf(tarefaAcademica.getStatus()));
            txtMateria.setText(tarefaAcademica.getMateria());
            txtProfessor.setText(tarefaAcademica.getProfessor());
            txtId.setText(String.valueOf(tarefaAcademica.getId()));
        }else{
            limparJanela();
            txtId.setText("0");
        }

    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnProximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximo1ActionPerformed
        // TODO add your handling code here:
        limparJanela();
        TarefaAcademicaRepository tarefaAcademicaRepository = new TarefaAcademicaRepository();
        TarefaAcademica tarefaAcademica = tarefaAcademicaRepository.selecionar(
            janelaPrincipal.conexaoMySQL.connection,
            ">",
            Integer.parseInt(txtId.getText()));
        if(tarefaAcademica != null){
            //passar os dados para a tela:
            txtNomeTarefa.setText(tarefaAcademica.getNomeTarefa());
            txtDescricao.setText(tarefaAcademica.getDescricaoTarefa());
            txtData.setText(tarefaAcademica.getData());
            txtStatus.setText(String.valueOf(tarefaAcademica.getStatus()));
            txtMateria.setText(tarefaAcademica.getMateria());
            txtProfessor.setText(tarefaAcademica.getProfessor());
            txtId.setText(String.valueOf(tarefaAcademica.getId()));
        }else{
            limparJanela();
            txtId.setText("0");
        }
    }//GEN-LAST:event_btnProximo1ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        fecharJanela();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateriaActionPerformed

    private void boxNaoConcluidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNaoConcluidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNaoConcluidaActionPerformed

    private void txtProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfessorActionPerformed

    private void limparJanela(){
    txtNomeTarefa.setText("");
    txtDescricao.setText("");
    txtData.setText("");
    txtStatus.setText("");
    txtMateria.setText("");
    txtProfessor.setText("");
    txtNomeTarefa.requestFocus();
    }
    
    private void fecharJanela(){
        instancia = null;
        dispose();
    }
    
    public static JanelaCadastroTarefaAcademica getInstancia(JanelaPrincipal janelaPrincipal){
        if(instancia == null)
            instancia = new JanelaCadastroTarefaAcademica(janelaPrincipal);
        return instancia;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxConcluida;
    private javax.swing.JCheckBox boxEmAndamento;
    private javax.swing.JCheckBox boxNaoConcluida;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnProximo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtNomeTarefa;
    private javax.swing.JTextField txtProfessor;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
