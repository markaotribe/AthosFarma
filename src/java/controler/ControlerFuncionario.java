/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.FuncionarioDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Funcionario;

/**
 *
 * @author VIVO
 */
public class ControlerFuncionario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nome = request.getParameter("tnome");
        String sobrenome = request.getParameter("tsobrenome");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setSobrenome(sobrenome);
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        funcionarioDao.inserir(funcionario);
        response.sendRedirect("listaFuncionario"); 
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nome = request.getParameter("tnome");
        String sobrenome = request.getParameter("tsobrenome");
        
        System.out.println("nome");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setSobrenome(sobrenome);
        
        
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        funcionarioDao.inserir(funcionario);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
