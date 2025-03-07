/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemadegerenciamentodetarefas.repository;
import java.sql.Connection;

/**
 *
 * @author gustavo
 */

public interface Crud<T> {
    public boolean inserir(Connection connection, T entity);
    public boolean atualizar(Connection connection, T entity);
    public boolean deletar(Connection connection, T entity);
    public T selecionar(Connection connection, String operador, int id);
}
