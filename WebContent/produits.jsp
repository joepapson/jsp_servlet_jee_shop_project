    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produits</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body>
  <div class="container col-md-10 col-md-offset-1">
  
    <div class="panel panel-primary">
       <div class="panel-heading">Recherche des Produits</div>
       <div class="panel-body">
       
         <form action="chercher.jsp" method="get">
             <label>Mot Clé</label>
             <input type="text" name="motCle" value="${model.motCle } " />
             <button type="submit" class="btn btn-primary">Chercher</button>
         </form>  
             
         <%-- <table class="table table-striped">
            <tr>
               <th>ID</th>
               <th>Designation</th>
               <th>Prix</th>
               <th>Quantité</th>
            </tr>
            
           <C:forEach items="${ model.produits}" var="p">        
              <tr>
                <td> ${p.id}</td>
                <td>${p.designation}</td>
                <td>${p.prix}</td>
                <td>${p.quantite}</td>
                <td><a href="supprimer.do?id=${p.id}">Supprimer</a></td>
                <td><a href="edit.do?id=${p.id}">Edit</a></td>
              </tr> 
                        
          </C:forEach>
         </table> --%>
       </div>
    </div>
    
  </div>
</body>
</html>