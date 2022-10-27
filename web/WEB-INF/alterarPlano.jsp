<%-- 
    Document   : alterarPlano
    Created on : 16 de out. de 2022, 19:51:56
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
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="css/ManipulaçãoPlanos.css"/> 
    </head>
    <body>
        <tags:header />
            <div class="center"> 
               <section id="container" class="center">

               
                    <form action="AlterarPlano" method="post" >
                        <input  class="col-col-1" type="number" name="id" value="${p.id}" readonly >
                        <input type="textarea" name="descricao" placeholder="Descrição" value="${p.descricao}">
                        <input type="number" name="valor" placeholder="valor" value="${p.valor}">
                        <div class="centerr"><input type="submit" name="" value="Editar" class="btn"></div>
                    </form>
        
               <section/>
            </div>
     
    </body>
</html>
