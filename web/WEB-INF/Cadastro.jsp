<%-- 
    Document   : Cadastro
    Created on : 6 de out. de 2022, 15:23:23
    Author     : giovani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar-se</title>
          <link rel="stylesheet" href="css/login.css"/>
    </head>
    <body>
        <tags:header />
       <div class="center">
            <section id="container" class="center">
               

                <form action="Cadastro" method="post" class="center" enctype="multipart/form-data">
                    <input type="email" name="email" placeholder="Email">
                    <input type="password" name="senha" placeholder="Senha">
                     <input type="nome" name="nome" placeholder="Nome">
                     <label for="file"> <h1>Adicione uma foto sua </h1><i class="fa-solid fa-image"></i></label>
                        <input type="file" name="img" id="file" class="escolherArquivo">
                    <input type="submit" name="btn" value="Cadastrar" class="btn">
                </form>
               
           
            </section>
        </div>
    </body>
</html>
