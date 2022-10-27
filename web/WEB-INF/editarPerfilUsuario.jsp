<%-- 
    Document   : editarPerfilUsuario
    Created on : 17 de out. de 2022, 22:31:29
    Author     : giovani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>

<%@taglib tagdir="/WEB-INF/tags/" prefix="tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Perfil</title>
         <link rel="stylesheet" href="css/login.css"/>
    </head>
    <body>
         <tags:header />
        <div class="center" style="">
             <section id="container" class="center">
                    <div class="img">
                        <img src="MostrarImg?id=${dados.id}" alt="alt"/>
                    </div>
                        <form action="EditarPerfil" method="post" enctype="multipart/form-data">
                            <input class="tipo" type="number" name="id" value="${dados.id}" readonly >
                            <input type="string" name="nome" value="${dados.nome}">
                            <input type="string" name="email" value="${dados.email}">
                            <input type="string" name="senha" value="${dados.senha}">   
                            <input type="file" name="img" id="file" class="escolherArquivo">
                            <div class="centerr"><input type="submit" name="" value="Editar" class="btn"></div>
                        </form>

          
          </section>
         <div/>
    </body>
</html>
