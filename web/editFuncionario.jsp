<%-- 
    Document   : editFuncionario
    Created on : 26/10/2015, 15:07:03
    Author     : VIVO
--%>

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
        <form action="ControlerFuncionario" method="get">
            <fieldset>
                 <p>id: <input type="text" name="tid" id="cid"/></p><br>
                <p>nome: <input type="text" name="tnome" id="cnome"/></p><br>
                <p>sobrenome:<input type="text" name="tsobrenome" id="csobrenome"/></p><br>
                <input type="submit" value="SALVAR"/> 
                 <th><a href="listaFuncionario.jsp">Listar Todos</a></th>
            </fieldset>
        </form>
</html>
