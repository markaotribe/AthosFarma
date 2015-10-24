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
public class JDBCFuncionarioDao implements FuncionarioDao{

    Connection connection;
   
    public JDBCFuncionarioDao() {
        
        connection = Conexao.getConexao();
    }

   
    
    
    @Override
    public void inserir(Funcionario funcionario) {
        try {
            String SQL = "INSERT INTO funcionario (nome,sobrenome) VALUES (?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1,funcionario.getNome());
            ps.setString(2,funcionario.getSobrenome());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCFuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    public void remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> listar() {
        
        List<Funcionario>  funcionarios = new ArrayList<Funcionario>();
        try {
            String SQL = "SELECT * FROM funcionario";
           
            PreparedStatement ps = connection.prepareStatement(SQL);
             ResultSet rs = ps.executeQuery();
             while (rs.next()){
                 Funcionario funcionario = new Funcionario();
                 funcionario.setId(Integer.SIZE);
                 funcionario.setNome(rs.getString("nome"));
                 funcionario.setSobrenome(rs.getString("sobrenome"));
                 funcionarios.add(funcionario);
             }
             return funcionarios;
        } catch (SQLException ex) {
            Logger.getLogger(JDBCFuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao listar JDBC",ex);
        }
          
    }

    @Override
    public Funcionario buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
