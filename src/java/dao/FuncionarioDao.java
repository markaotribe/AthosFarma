/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Funcionario;

/**
 *
 * @author VIVO
 */
public interface FuncionarioDao {
    
    public void inserir(Funcionario funcionario);
    public void remover(int id);
    public List<Funcionario> listar();
    public Funcionario buscar(int id);
    public void editar(Funcionario funcionario);
    
    
}
