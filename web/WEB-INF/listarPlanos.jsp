<%-- 
    Document   : listarPlanos
    Created on : 16 de out. de 2022, 20:01:15
    Author     : giovani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tags" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Planos</title>
             <script src="https://kit.fontawesome.com/f9c75e61f8.js" crossorigin="anonymous"></script>
      <link rel="stylesheet" href="css/alterarCAdastro.css"/> 
        
    </head>
    <body>
        <tags:header />
        <div class="container">
            
                <li class="table-header">
                    <div class="col-col-1">#</div>
                    <div class="col col-2">Descrição</div>
                    <div class="col col-3">Preço</div>

                </li>
                <ul class="responsive-">
                <c:forEach varStatus="status" var="model" items="${planos}" >
                    <li class="table-row">
                        <div class="col-col-1" data-label="Job Id">${status.index + 1}</div>
                        <div class="col col-2" data-label="Amount">${model.descricao}</div>
                        <div class="col col-3" data-label="Payment Status">${model.valor}</div>
                        
                        <div class="col-col-4" data-label="Payment Status"><a href="AlterarPlano?indice=${model.id}"><i class="fa-solid fa-pencil"></a></i></div>
                        <div class="col col-5" data-label="Payment Status"><a href="ExcluirPlano?indice=${model.id}"><i class="fa-solid fa-trash-can"></a></i></div>
                 

                    </li>

                </c:forEach>
                 </ul>
        </div>
    </body>
</html>
