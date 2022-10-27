<%-- 
    Document   : tabelaDePlanos
    Created on : 25 de out. de 2022, 14:24:14
    Author     : giovani
--%>

<%@tag description="tablePlanos" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>
<html>
    <head>
         <script src="https://kit.fontawesome.com/f9c75e61f8.js" crossorigin="anonymous"></script>
         <link rel="stylesheet" href="css/alterarCAdastro.css"/> 
     
    </head>
    <body>
        
        
        <div class="container">
            
                <li class="table-header">
                    <div class="col-col-1">#</div>
                    <div class="col col-2">Descrição</div>
                    <div class="col col-3">Preço</div>

                </li>
                <ul class="responsive-">
                <c:forEach varStatus="status" var="model" items="${planos}">
                    <li class="table-roww">
                        <div class="col-col-1" data-label="Job Id">${status.index + 1}</div>
                        <div class="col col-2" data-label="Amount">${model.descricao}</div>
                        <div class="col col-3" data-label="Payment Status">${model.valor}</div>
                        
                        <div class="col col-4" data-label="Payment Status"><a href="EfetuarCadastroPlanoCliente?indice=${model.id}"><i class="fa-solid fa-pencil"></a></i></div>
                      
                    </li>

                </c:forEach>
            </ul>
        </div>
    </body>
</html>