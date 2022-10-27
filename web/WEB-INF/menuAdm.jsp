<%-- 
    Document   : telaPrincipal
    Created on : 6 de out. de 2022, 06:49:55
    Author     : giovani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Adm</title>
        
          <link rel="stylesheet" href="css/menu.css"/>

        
    </head>
    <body>
        <tags:header />
        <section class="container" >
            
                <div class="title"><h1>Menu do Adiministrador</h1>

                <div class="opcoes">
                    <a href="CadastroPlano">Criar Plano</a>
                    <a href="ListarPlano">Remover e Alterar Plano</a>
                    <a href="Login">Sair</a>
                    
                 </div>
                  
            </div>
        </section>
    </body>
</html>
