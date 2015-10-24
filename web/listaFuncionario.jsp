<%-- 
    Document   : listaUsuarios
    Created on : 23/10/2015, 16:09:52
    Author     : VIVO
--%>

<%@page import="dao.FuncionarioDao"%>
<%@page import="modelo.Funcionario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div> CADASTRO </div>
        <form action="ControlerFuncionario" method="get">
            <fieldset>
                <p>nome: <input type="text" name="tnome" id="cnome"/></p><br>
                <p>sobrenome:<input type="text" name="tsobrenome" id="csobrenome"/></p><br>
                <input type="submit" value="Enviar"/>   
            </fieldset>
        </form>
        <h1>LISTA FUNCIONARIOS</h1>
        <table border="0">
            <tr> 
                <td>ID</td><td>Nome</td><td>Sobrenome</td><td>Excluir</td><td>Editar</td>
                <td>  
                    <form  method="get" action="stvManterTurma">  
                        <input type="hidden" name="hdAcao" value="ExcluirTurma"/>  
                        <input type="hidden" name="codExcluir" value="${item.id}"/>  
                        <button type="submit"  style=" border:0px; background-image:url('img/excluir.gif'); width: 32px; height: 32px;"/>  
                    </form>  
                </td>  
            </tr>
            <%
                FuncionarioDao dao = new FuncionarioDao();
                List<Funcionario> funcionario = dao.Listar();
                for (Funcionario funci : funcionario) {
            %>

            <tr>
                <th><%= funci.getId()%></th>
                <th><%= funci.getNome()%></th>
                <th><%= funci.getSobrenome()%></th>
                <input type='hidden' name='acao' value=''>
                <th><a href="ExcluirFuncionario?acao=&id=<%= funci.getId()%>"><img src="img/excluir.gif"/></a></th>
                <%=funci.getId()%></a>  
                <th><a href="listaFuncionario.jsp"><img src="img/editar.gif"/></a></th>
            </tr>

            <%

                }
            %>
        </table> 

    </body>
</html>


