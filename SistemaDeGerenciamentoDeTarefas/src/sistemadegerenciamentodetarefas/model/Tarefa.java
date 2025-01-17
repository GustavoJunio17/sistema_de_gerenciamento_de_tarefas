/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegerenciamentodetarefas.model;

/**
 *
 * @author gusta
 */
public class Tarefa {
    private int id;
    private String nomeTarefa;
    private String descricaoTarefa;
    private String data;
    private String status;

    public Tarefa(int id, String nomeTarefa, String descricaoTarefa, String data, String status) {
        this.id = id;
        this.nomeTarefa = nomeTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.data = data;
        this.status = status;
    }
    
    public Tarefa(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "id =" + this.id + "\n" +
                "Tarefa =" + this.nomeTarefa + "\n" +
                "Descrição =" + this.descricaoTarefa + "\n" +
                "Data: =" + this.data + "\n" +
                "Status =" + this.status
        ;
    }
    
    
}
