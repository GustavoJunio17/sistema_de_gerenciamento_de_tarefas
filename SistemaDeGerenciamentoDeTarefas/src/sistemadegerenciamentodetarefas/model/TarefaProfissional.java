/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegerenciamentodetarefas.model;

/**
 *
 * @author gustavo
 */

public class TarefaProfissional extends Tarefa {
    private String responsavel;
    private String projeto;

    public TarefaProfissional(String responsavel, String projeto, int id, String nomeTarefa, String descricaoTarefa, String data, String status) {
        super(id, nomeTarefa, descricaoTarefa, data, status);
        this.responsavel = responsavel;
        this.projeto = projeto;
    }

    public TarefaProfissional(){
        
    }
    
    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    @Override
    public String toString() {
        return "Tarefa Profissional" + "\n" +
                "id =" + super.getId() + "\n" +
                "Tarefa =" + super.getNomeTarefa() + "\n" +
                "Descrição =" + super.getDescricaoTarefa() + "\n" +
                "Data: =" + super.getData() + "\n" +
                "Status =" + super.getStatus() + "\n" +
                "Responsavel: =" + this.responsavel + "\n" +
                "Projeto =" + this.projeto
        ;
    }
}
