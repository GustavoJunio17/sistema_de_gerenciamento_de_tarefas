/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegerenciamentodetarefas.repository;

import sistemadegerenciamentodetarefas.model.TarefaAcademica;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author gustavo
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
            String comando = "INSERT INTO tarefa_academica(nome_tarefa, descricao, data, status, materia, professor)" +
                             "VALUES(?, ?, ?, ?, ?, ?)";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, tarefa.getNomeTarefa());
            stmt.setString(2, tarefa.getDescricaoTarefa());
            stmt.setString(3, tarefa.getData());
            stmt.setString(4, tarefa.getStatus());
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
            stmt.setString(4, tarefa.getStatus());
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
                    tarefa.setStatus(res.getString("status"));
                    tarefa.setMateria(res.getString("materia"));
                    tarefa.setProfessor(res.getString("professor"));
                    break;
                    
                }
            }
            return tarefa;
        }catch(Exception ex){
            return null;
        }
    }
    public List<TarefaAcademica> selecionarTodos(Connection connection, int id){
        try{
            List<TarefaAcademica> tarefas = new ArrayList<>();
            PreparedStatement stmt = null;
            
            String comando = "SELECT * FROM tarefa_academica";
            
            stmt = connection.prepareStatement(comando);
            ResultSet res = stmt.executeQuery();
            
            while(res.next()){
                TarefaAcademica tarefa = new TarefaAcademica();
                tarefa.setId(res.getInt("id"));
                tarefa.setNomeTarefa(res.getString("nome_tarefa"));
                tarefa.setDescricaoTarefa(res.getString("descricao"));
                tarefa.setData(res.getString("data"));
                tarefa.setStatus(res.getString("status"));
                tarefa.setMateria(res.getString("materia"));
                tarefa.setProfessor(res.getString("professor"));
                
                tarefas.add(tarefa);   
            }
            return tarefas;

        }catch(Exception ex){
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
    public List<TarefaAcademica> buscarPorNome(Connection connection, String nome) {
        List<TarefaAcademica> tarefas = new ArrayList<>();
        String sql = "SELECT * FROM tarefa_academica WHERE nome_tarefa LIKE ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, "%" + nome + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    TarefaAcademica tarefa = new TarefaAcademica();
                    tarefa.setId(rs.getInt("id"));
                    tarefa.setNomeTarefa(rs.getString("nome_tarefa"));
                    tarefa.setDescricaoTarefa(rs.getString("descricao"));
                    tarefa.setData(rs.getString("data"));
                    tarefa.setStatus(rs.getString("status"));
                    tarefa.setMateria(rs.getString("materia"));
                    tarefa.setProfessor(rs.getString("professor"));
                    tarefas.add(tarefa);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tarefas;
    }
}
