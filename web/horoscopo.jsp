<%-- 
    Document   : horoscopo
    Created on : Mar 11, 2021, 9:47:21 PM
    Author     : nkdz
--%>

<%@page import="util.VerificaDados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    boolean logado=false;
    if (session!=null)
    {
        VerificaDados usuario=(VerificaDados)session.getAttribute("usuario");
        if (usuario!=null && usuario.verificaSenha())
            logado=true;
    }
    if (!logado)
       response.sendRedirect(".");
%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./styles.css">
        
        <script src="script.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="container-horoscopo">
            <div id="logout-box">
                <button id="logout"><a href="InvalidaSessao">X</a></button>
            </div>
            
            <form onsubmit="gerarHoroscopo(this)" class="box">   
                <label for="dtNasc">Data de Nascimento:</label>
                <input id="dtNasc" type="date" name="date">
                <button type="submit">Gerar Horóscopo Diário</button>
            </form>
            
            <div id="answer-box" class="box">
<!--                <p id="horoscopo-signo"></p>
                <p id="horoscopo-mensagem"> </p>
                <div id="horoscopo-imagem">-->
                    
                </div>
            </div>
        
        </div>
    </body>
</html>
