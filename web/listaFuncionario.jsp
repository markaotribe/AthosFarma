<%-- 
    Document   : listaUsuarios
    Created on : 23/10/2015, 16:09:52
    Author     : VIVO
--%>

<%@page import="modelo.Funcionario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<h1>LISTA FUNCIONARIOS</h1>
<table border="1">
<tr> 
    <td>ID</td><td>Nome</td><td>Sobrenome</td>      
</tr>
<c:forEach var="registrofuncionarios" items="${sesaofuncionarios}">
    <tr>
        <td>${registrofuncionarios[id]}</td>
        <td>${registrofuncionarios[nome]}</td>
        <td>${registrofuncionarios[sobrenome]}</td>

    </c:forEach>
</tr>  
