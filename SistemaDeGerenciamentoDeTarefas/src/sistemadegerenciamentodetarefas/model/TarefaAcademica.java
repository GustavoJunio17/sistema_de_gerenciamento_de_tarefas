/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegerenciamentodetarefas.model;

/**
 *
 * @author gustavo
 */

public class TarefaAcademica extends Tarefa {
    private String materia;
    private String professor;

    public TarefaAcademica(){
        
    }
    
    public TarefaAcademica(String materia, String professor, int id, String nomeTarefa, 
                           String descricaoTarefa, String data, String status) {
        super(id, nomeTarefa, descricaoTarefa, data, status);
        this.materia = materia;
        this.professor = professor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Tarefa Academica" + "\n" +
                "id =" + super.getId() + "\n" +
                "Tarefa =" + super.getNomeTarefa() + "\n" +
                "Descrição =" + super.getDescricaoTarefa() + "\n" +
                "Data: =" + super.getData() + "\n" +
                "Status =" + super.getStatus() + "\n" +
                "Matéria: =" + this.materia + "\n" +
                "Profesor =" + this.professor
        ;
    }
}
