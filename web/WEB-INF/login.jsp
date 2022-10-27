    <%-- 
    Document   : login
    Created on : 6 de out. de 2022, 06:44:30
    Author     : giovani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
         <link rel="stylesheet" href="css/login.css"/>
        
    </head>
    <body>
         <div class="center">
            <section id="container" class="center">
                <img src="img/logo.png" alt="alt" id="imgLogo">
                
                
                <form action="Login" method="post" class="center">
                    <input type="email" name="email" placeholder="Email">
                    <input type="password" name="senha" placeholder="Senha">
                    <div class="manter">
                        <label class="">Manter-me Logado</label>
                        <input type="checkbox" name="manter" value="s" required=""/>
                    </div>
                    <input type="submit" name="btn" value="Entrar" class="btn">
                    
                    
                </form>
               
                <a href="Cadastro" >Cadastrar-se</a>
            </section>
        </div>
    </body>
</html>
