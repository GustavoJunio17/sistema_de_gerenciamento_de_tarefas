/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegerenciamentodetarefas.repository;

import sistemadegerenciamentodetarefas.model.TarefaProfissional;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author gustavo
 */

public class ConexaoMySQL {
    private Conexao conexao = null;
    public static Connection connection = null;
    
    public ConexaoMySQL(Conexao conexao){
        this.conexao = conexao;
    }
    
    public boolean conectar(){
        if(conexao != null){
            try{
                String url = "jdbc:mysql://" + conexao.getEndereco() +
                             ":" + conexao.getPorta() +
                             "/" + conexao.getNomeBanco();
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                connection = DriverManager.getConnection(
                        url,
                        conexao.getUser(),
                        conexao.getPassword()
                );
                return true;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(
                        null,
                        "Erro ao conectar no banco de dados: " + ex.getMessage(),
                        "Erro ao conectar",
                        JOptionPane.ERROR_MESSAGE
                );
                return false;
            }
        }else{
            return false;
        }
    }
    
    public boolean insert(TarefaProfissional tarefa){
        PreparedStatement stmt = null;
        try{
            String comando = "INSET INTO tarefa_profissioanl(nome_tarefa, descricao, data, status, responsalve, projeto)" +
                             "VALUES(?, ?, ?, ?, ?, ?)";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, tarefa.getNomeTarefa());
            stmt.setString(2, tarefa.getDescricaoTarefa());
            stmt.setString(3, tarefa.getData());
            stmt.setString(4, tarefa.getStatus());
            stmt.setString(5, tarefa.getResponsavel());
            stmt.setString(6, tarefa.getProjeto());

            stmt.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
