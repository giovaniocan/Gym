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
        <title>Menu Cliente</title>
         <link rel="stylesheet" href="./css/menu.css"/>
        
    </head>
    <body>
         <tags:header />
        
     <section class="container" >
            
                <div class="title"><h1>Menu do Usuario</h1>

                    <div class="opcoes">
                     <a href="CadastroPlanoCliente"> Insereva-se em um plano</a>
                     <a href="AlterarPlanoCliente"> Alterar Plano</a>
                     <a href="EditarPerfil"> Editar perfil</a>
                     </div>
                 </div>
        </section>    
</body>
</html>
