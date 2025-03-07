/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sistemadegerenciamentodetarefas.view;

import sistemadegerenciamentodetarefas.model.TarefaProfissional;
import sistemadegerenciamentodetarefas.repository.TarefaProfissionalRepository;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */

public class JanelaCadastroTarefaProfissional extends javax.swing.JInternalFrame {

    private static JanelaCadastroTarefaProfissional instancia;
    private JanelaPrincipal janelaPrincipal;
   
    public JanelaCadastroTarefaProfissional(JanelaPrincipal janelaPrincipal) {
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

        txtResponsavel = new javax.swing.JTextField();
        boxConcluida = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeTarefa = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        btnProximo1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        txtData = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtProjeto = new javax.swing.JTextField();
        boxEmAndamento = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        boxNaoConcluida = new javax.swing.JCheckBox();

        setTitle("Cadastro Tarefa Profissional");
        setVisible(true);

        txtResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsavelActionPerformed(evt);
            }
        });

        boxConcluida.setText("Concluída");

        jLabel6.setText("Responsável");

        btnAnterior.setText("<=");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome da Tarefa");

        jLabel4.setText("Status");

        txtNomeTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeTarefaActionPerformed(evt);
            }
        });

        txtStatus.setEditable(false);
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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
        txtData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataFocusLost(evt);
            }
        });
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

        txtProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProjetoActionPerformed(evt);
            }
        });

        boxEmAndamento.setText("Em Andamento");

        jLabel5.setText("Projeto");

        boxNaoConcluida.setText("Não concluída");
        boxNaoConcluida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNaoConcluidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(boxNaoConcluida)
                .addGap(10, 10, 10)
                .addComponent(boxEmAndamento)
                .addGap(24, 24, 24)
                .addComponent(boxConcluida))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnCadastrar)
                .addGap(20, 20, 20)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnFechar)
                .addGap(18, 18, 18)
                .addComponent(btnProximo1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeTarefa)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProjeto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResponsavel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1))
                    .addComponent(txtNomeTarefa))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(txtDescricao))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProjeto)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtResponsavel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtData)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addComponent(txtStatus))
                .addGap(10, 10, 10)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxNaoConcluida)
                    .addComponent(boxEmAndamento)
                    .addComponent(boxConcluida))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnterior)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnFechar)
                    .addComponent(btnProximo1))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsavelActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        limparJanela();
        TarefaProfissionalRepository tarefaProfissionalRepository = new TarefaProfissionalRepository();
        TarefaProfissional tarefaProfissional = tarefaProfissionalRepository.selecionar(
            janelaPrincipal.conexaoMySQL.connection,
            "<",
            Integer.parseInt(txtId.getText()));
        if(tarefaProfissional != null){
            //passar os dados para a tela:
            txtNomeTarefa.setText(tarefaProfissional.getNomeTarefa());
            txtDescricao.setText(tarefaProfissional.getDescricaoTarefa());
            txtData.setText(tarefaProfissional.getData());
            txtStatus.setText(tarefaProfissional.getStatus());
            txtResponsavel.setText(tarefaProfissional.getResponsavel());
            txtProjeto.setText(tarefaProfissional.getProjeto());
            txtId.setText(String.valueOf(tarefaProfissional.getId()));
        }else{
            limparJanela();
            txtId.setText("0");
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNomeTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeTarefaActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        TarefaProfissional tarefaProfissional = new TarefaProfissional();
        tarefaProfissional.setNomeTarefa(txtNomeTarefa.getText());
        tarefaProfissional.setDescricaoTarefa(txtDescricao.getText());
        tarefaProfissional.setData(txtData.getText());
        if(boxNaoConcluida.isSelected()){
                tarefaProfissional.setStatus("Não concluída");
            }
        if(boxEmAndamento.isSelected()){
                tarefaProfissional.setStatus("Em andamento");
            }
        if(boxConcluida.isSelected()){
                tarefaProfissional.setStatus("Concluída");
            }
        tarefaProfissional.setResponsavel(txtResponsavel.getText());
        tarefaProfissional.setProjeto(txtProjeto.getText());
        tarefaProfissional.setId(id);
        //inserir tarefa profissional no banco de dados:
        TarefaProfissionalRepository tarefaProfissionalRepository = new TarefaProfissionalRepository();
        boolean retornoBanco = false;
        if(Integer.parseInt(txtId.getText()) == 0){
            //inserir
            retornoBanco = tarefaProfissionalRepository.inserir(
                    janelaPrincipal.conexaoMySQL.connection,
                    tarefaProfissional);
        }else{
            //atualizar
            retornoBanco = tarefaProfissionalRepository.atualizar(
                    janelaPrincipal.conexaoMySQL.connection,
                    tarefaProfissional);
        }
        if(retornoBanco){
            JOptionPane.showMessageDialog(
                    this,
                    "Tarefa atualizado com sucesso!",
                    "Tela de cadastro tarefas profissionais",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limparJanela();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnProximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximo1ActionPerformed
        // TODO add your handling code here:
        limparJanela();
        TarefaProfissionalRepository tarefaProfissionalRepository = new TarefaProfissionalRepository();
        TarefaProfissional tarefaProfissional = tarefaProfissionalRepository.selecionar(
            janelaPrincipal.conexaoMySQL.connection,
            ">",
            Integer.parseInt(txtId.getText()));
        if(tarefaProfissional != null){
            //passar os dados para a tela:
            txtNomeTarefa.setText(tarefaProfissional.getNomeTarefa());
            txtDescricao.setText(tarefaProfissional.getDescricaoTarefa());
            txtData.setText(tarefaProfissional.getData());
            txtStatus.setText(tarefaProfissional.getStatus());
            txtResponsavel.setText(tarefaProfissional.getResponsavel());
            txtProjeto.setText(tarefaProfissional.getProjeto());
            txtId.setText(String.valueOf(tarefaProfissional.getId()));
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
        if(Integer.parseInt(txtId.getText()) > 0){
            int resposta = JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente excluir esse registro?",
                    "Excluir?",
                    JOptionPane.YES_NO_OPTION
            );
            if(resposta == JOptionPane.YES_OPTION){
                //excluir registro:
                int id = Integer.parseInt(txtId.getText());
                TarefaProfissional tarefa = new TarefaProfissional();
                tarefa.setId(id);
                TarefaProfissionalRepository tarefaProfissionalRepository = new TarefaProfissionalRepository();
                boolean retornoBanco = tarefaProfissionalRepository.deletar(
                        janelaPrincipal.conexaoMySQL.connection,
                        tarefa
                );
                if(retornoBanco){
                    limparJanela();
                    txtId.setText("0");
                    //atualizaIdLista();
                    JOptionPane.showMessageDialog(
                            this,
                            "Registro excluído com sucesso!",
                            "Tela de cadastro de tarefas profissionais",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }                
                
            }            
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProjetoActionPerformed

    private void boxNaoConcluidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNaoConcluidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNaoConcluidaActionPerformed

    private void txtDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFocusGained
        // TODO add your handling code here:
        if (txtData.getText().equals("dd/mm/aaaa")) {
            txtData.setText("");
       }

    }//GEN-LAST:event_txtDataFocusGained

    private void txtDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFocusLost
        // TODO add your handling code here:
        if (txtData.getText().isEmpty()) {
            txtData.setText("dd/mm/aaaa");
        }

    }//GEN-LAST:event_txtDataFocusLost

    private void limparJanela(){
        txtNomeTarefa.setText("");
        txtDescricao.setText("");
        txtData.setText("dd/mm/aaaa");
        txtStatus.setText("");
        txtResponsavel.setText("");
        txtProjeto.setText("");
        txtNomeTarefa.requestFocus();
    }
    
    private void fecharJanela(){
        instancia = null;
        dispose();
    }
    
    public static JanelaCadastroTarefaProfissional getInstancia(JanelaPrincipal janelaPrincipal){
        if(instancia == null)
            instancia = new JanelaCadastroTarefaProfissional(janelaPrincipal);
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
    private javax.swing.JTextField txtNomeTarefa;
    private javax.swing.JTextField txtProjeto;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
