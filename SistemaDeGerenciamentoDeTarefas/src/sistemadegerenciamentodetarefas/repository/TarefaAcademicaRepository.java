/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegerenciamentodetarefas.repository;

import java.sql.Connection;
import sistemadegerenciamentodetarefas.model.TarefaAcademica;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
        
/**
 *
 * @author gusta
 *//**
 *
 * @author gusta
 */

public class TarefaAcademicaRepository implements Crud<TarefaAcademica>{
    
    public TarefaAcademicaRepository(){
        
    }
    
    public TarefaAcademica selecionar(int id){
        return null;
    }

    @Override
    public boolean inserir(Connection connection, TarefaAcademica tarefa) {
        PreparedStatement stmt = null;
        try{
            String comando = "INSERT INTO tarefa_profissional(nome_tarefa, descricao, data, status, materia, professor)" +
                             "VALUES(?, ?, ?, ?, ?, ?)";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, tarefa.getNomeTarefa());
            stmt.setString(2, tarefa.getDescricaoTarefa());
            stmt.setString(3, tarefa.getData());
            stmt.setInt(4, tarefa.getStatus());
            stmt.setString(5, tarefa.getMateria());
            stmt.setString(6, tarefa.getProfessor());
            
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao inserir tarefa: " + ex.getMessage(),
                    "Erro ao inserir",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
    }

    @Override
    public boolean atualizar(Connection connection, TarefaAcademica tarefa) {
        PreparedStatement stmt = null;
        try{
            String comando = "UPDATE tarefa_academica SET " +
                             "nome_tarefa = ?, descricao = ?, data = ?, status = ?, materia = ?, professor = ?" +
                             "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, tarefa.getNomeTarefa());
            stmt.setString(2, tarefa.getDescricaoTarefa());
            stmt.setString(3, tarefa.getData());
            stmt.setInt(4, tarefa.getStatus());
            stmt.setString(5, tarefa.getMateria());
            stmt.setString(6, tarefa.getProfessor());
            stmt.setInt(7, tarefa.getId());
            
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao atualizar tarefa: " + ex.getMessage(),
                    "Erro ao atualizar",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        return false;
    }

    @Override
    public boolean deletar(Connection connection, TarefaAcademica tarefa) {
        PreparedStatement stmt = null;
        try{
            String comando = "DELETE FROM tarefa_academica " + 
                             "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setInt(1, tarefa.getId());
            
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao excluir tarefa: " + ex.getMessage(),
                    "Erro ao excluir",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
    }

    @Override
    public TarefaAcademica selecionar(Connection connection, String operador, int id) {
        try{
            TarefaAcademica tarefa = new TarefaAcademica();
            PreparedStatement stmt = null;
            String comando = "SELECT * FROM tarefa_academica WHERE id " +
                             operador + "? ";
            if(operador.equals("<"))
                comando += " ORDER BY id DESC";
            stmt = connection.prepareStatement(comando);
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery();
            if(res != null){
                while(res.next()){
                    tarefa.setId(Integer.parseInt(res.getString("id")));
                    tarefa.setNomeTarefa(res.getString("nome_tarefa"));
                    tarefa.setDescricaoTarefa(res.getString("descricao"));
                    tarefa.setData(res.getString("data"));
                    tarefa.setStatus(Integer.parseInt(res.getString("status")));
                    tarefa.setMateria(res.getString("responsavel"));
                    tarefa.setProfessor(res.getString("projeto"));
                    break;
                    
                }
            }
            return tarefa;
        }catch(Exception ex){
            return null;
        }
    }
}
