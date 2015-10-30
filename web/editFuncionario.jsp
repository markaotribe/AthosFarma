<%-- 
    Document   : editFuncionario
    Created on : 26/10/2015, 15:07:03
    Author     : VIVO
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.Funcionario"%>
<%@page import="dao.FuncionarioDao"%>
<%@page import="javax.servlet.*"%>  
<%@page import="javax.servlet.http.*"%>  

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div> EDITAR </div>
        <c:out value="${funcionario}"/> 
        <form action="EditFuncionario" method="get" class="">
           <%= request.getParameter("nome")%>
            <fieldset>
              <p>id: <input type="text" name="tid" id="cid" value="<%= request.getParameter("id")%>"/></p><br>
              <p>nome: <input type="text" name="tnome" id="cnome"value="<%= request.getParameter("nome")%>"/></p><br>
              <p>sobrenome:<input type="text" name="tsobrenome" id="csobrenome" value="<%= request.getParameter("sobrenome")%>"/></p><br>
              <input type="submit" value="SALVAR"/> 
                <th><a href="listaFuncionario.jsp">Listar Todos</a>
            </fieldset>
        </form>
</html>
