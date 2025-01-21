/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sistemadegerenciamentodetarefas.view;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import sistemadegerenciamentodetarefas.model.TarefaAcademica;

/**
 *
 * @author gustavo
 */

public class JanelaTarefasAcademicas extends javax.swing.JInternalFrame {

    private static JanelaTarefasAcademicas instancia;
    private JanelaOpcaoRelatorios janelaOpcaoRelatorios;
    
    public JanelaTarefasAcademicas(JanelaOpcaoRelatorios janelaOpcaoRelatorios) {
        initComponents();
        this.janelaOpcaoRelatorios = janelaOpcaoRelatorios;
    }
    
    public JanelaTarefasAcademicas() {
        setTitle("Tarefas Acadêmicas");
        setSize(400, 300);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
    }

    public void carregarTarefas(List<TarefaAcademica> listaTarefas) {
        DefaultTableModel modeloTabela = (DefaultTableModel) tableTarefas.getModel();
        modeloTabela.setRowCount(0);
        
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para carregar.");
        }

        for (TarefaAcademica tarefa : listaTarefas) {
            modeloTabela.addRow(new Object[] {
                    tarefa.getId(),
                    tarefa.getNomeTarefa(),
                    tarefa.getDescricaoTarefa(),
                    tarefa.getData(),
                    tarefa.getStatus(),
                    tarefa.getMateria(),
                    tarefa.getProfessor()
            });
            System.out.println("Tarefa carregada: " + tarefa.getNomeTarefa());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableTarefas = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();

        setTitle("Relatório Tarefas Acadêmicas");
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        tableTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tarefa", "Descrição", "Data", "Status", "Matéria", "Professor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableTarefas);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addGap(393, 393, 393))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        fecharJanela();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void fecharJanela(){
        instancia = null;
        dispose();
    }
    
    public static JanelaTarefasAcademicas getInstancia(JanelaOpcaoRelatorios janelaOpcaoRelatorios){
        if(instancia == null)
        instancia = new JanelaTarefasAcademicas(janelaOpcaoRelatorios);
        return instancia;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTarefas;
    // End of variables declaration//GEN-END:variables
}
