/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegerenciamentodetarefas.repository;

import java.sql.Connection;
import sistemadegerenciamentodetarefas.model.TarefaAcademica;
        

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
    public boolean inserir(Connection connection, TarefaAcademica entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atualizar(Connection connection, TarefaAcademica entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deletar(Connection connection, TarefaAcademica entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TarefaAcademica selecionar(Connection connection, String operador, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
