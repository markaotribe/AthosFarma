<%-- 
    Document   : cadFuncionario
    Created on : 26/10/2015, 13:14:09
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
        <div> CADASTRO </div>
        <form action="ControlerFuncionario" method="get" name="cadfuncionario" id="cadfuncionario">
            <fieldset>
                Nome: <input type="text" name="tnome" id="cnome"/>
                Sobrenome:<input type="text" name="tsobrenome" id="csobrenome"/><br><br>
                CPF:<input type="text" name="tcpf" id="ccpf" maxlength="14" OnKeyPress="formatar('###.###.###-##', this)"/>
                RG:<input type="text" name="trg" id="crg"/>
                Data Nascimneto:<input type="date" name="tdata" id="cdata"/>
                <P>Endereço:<input type="text" name="tendreco" id="cendereco"/></P>
                <p>CEP<input type="text" name="tcep" id="ccep"/></p>
                <P>Cidade<input type="text" name="tcidade" id="ccidade"/></p>
                <p>Função<input type="text" name="tfuncao" id="cfuncao"/></p>
                <p>Salario</P>
                Data Admisao:<input type="date" name="tadmisao" id="cadmisao"/>
                Data Demisao:<input type="date" name="tdemisao" id="cdemisao"/><br>
                <input type="submit" value="SALVAR"/> 
                 <th><a href="listaFuncionario.jsp">Listar Todos</a></th>
            </fieldset>
        </form>
</html>