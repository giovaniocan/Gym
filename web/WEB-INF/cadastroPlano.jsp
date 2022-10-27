
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
         <link rel="stylesheet" href="css/CadastroPlano.css"/> 
    </head>
    <body>
        
       <tags:header />
         <div class="center">
            <section id="container" class="center">

                <form action="CadastroPlano" method="post" class="center">
                    <input type="descricao" name="descricao" placeholder="Descrição do Plano" required >
                    <input type="valor" name="valor" placeholder="Valor do Plano" required>
                    <input type="submit" name="btn" value="Criar" class="btn">
                    
                </form>
            </section>
            
           
        </div>
    </body>
</html>
