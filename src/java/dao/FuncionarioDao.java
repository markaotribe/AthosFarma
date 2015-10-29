/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Funcionario;
import util.Conexao;

/**
 *
 * @author VIVO
 */
public class FuncionarioDao {
    

    Connection connection;

    public FuncionarioDao() {
        
        connection = Conexao.getConexao();
    }

   
    
    
    
    public void inserir(Funcionario funcionario){
     try {
            String SQL = "INSERT INTO funcionario (nome,sobrenome) VALUES (?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1,funcionario.getNome());
            ps.setString(2,funcionario.getSobrenome());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void remover(int id){
        
        try{
            
            String SQL = "DELETE FROM funcionario WHERE id= ?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
        
    }  catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro na exclusao",ex);
        
        }
    }
    public List<Funcionario> Listar(){
         List<Funcionario>  funcionarios = new ArrayList<Funcionario>();
         
        try {
            String SQL = "SELECT * FROM funcionario";
           
            PreparedStatement ps = connection.prepareStatement(SQL);
             ResultSet rs = ps.executeQuery();
             while (rs.next()){
                 Funcionario funcionario = new Funcionario();
                 funcionario.setId(rs.getInt("id"));
                 funcionario.setNome(rs.getString("nome"));
                 funcionario.setSobrenome(rs.getString("sobrenome"));
                 funcionarios.add(funcionario);
             }
             return funcionarios;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao listar JDBC",ex);
        }   
    }
   
    public Funcionario buscar(int id){
        
        try {
            Funcionario funcionario = new Funcionario();
            String SQL = "SELECCT * FROM funcionario WHERE id=?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            rs.next();
            funcionario.setNome(rs.getString("nome"));
            funcionario.setSobrenome(rs.getString("sobrenome"));
            
            return funcionario;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao buscar",ex);
        }
    
    }
    public void editar(Funcionario funcionario){
        
        
        try {
            String SQL = "UPDATE funcionario SET nome=? sobrenome=? WHERE id=?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setInt(0,funcionario.getId());
            ps.setString(1,funcionario.getNome());
            ps.setString(2,funcionario.getSobrenome());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao atualizar JDBC",ex);
        }
        
            
    
}
}