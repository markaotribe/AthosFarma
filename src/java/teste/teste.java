/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dao.FuncionarioDao;
import java.util.List;
import java.util.Scanner;
import modelo.Funcionario;

/**
 *
 * @author VIVO
 */
public class teste {

    public static void main(String[] args) {
        
        
        Scanner e = new Scanner(System.in);
        FuncionarioDao dao = new FuncionarioDao();
        
        System.out.println("remover");
        int id = e.nextInt();
        
        dao.remover(id);

        List<Funcionario> funcionario = dao.Listar();
        for (Funcionario funci : funcionario) {
            
            System.out.print(funci.getNome());
            System.out.println("");
            System.out.print(funci.getSobrenome());

        }

    }
}
