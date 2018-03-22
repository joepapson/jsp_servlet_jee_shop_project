<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<html>
<head>
<title>Produits</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body>

 <h2 style="text-align: center">Tutoriel J2EE(JSP, Servlet, MVC, JDBC)</h2>
  
  <h3 style="text-align: center">Sauvegarder un nouveau produit</h3>
  
  <div class="container col-md-10 col-md-offset-1">
  
    <div class="panel panel-primary">
       <div class="panel-heading">Recherche des Produits</div>
       <div class="panel-body">
       
    <form action="produitsservlet" method="post" class="form">
       <table>
        <tr>
           <td>Designation:</td>
           <td><input type="text" name="designation" /></td>
        </tr>
         <tr>
           <td>Prix</td>
          <td><input type="text" name="prix" /></td>
        </tr>
         <tr>
           <td>Quantite</td>
           <td><input type="text" name="quantite"></td>
        </tr>
        <tr>
           <td colspan="2"><input type="submit" value="Valider" class="btn btn-primary"></td>          
        </tr>
     </table>
   </form>
     
   <table class="table table-striped">
     <tr>
        <th>ID</th>
        <th>Designation</th>
        <th>Prix</th>
        <th>Quantite</th>
     </tr> 
      <C:forEach items="${ modele.produits}" var="p">   
     <tr>
         <td>${p.id}</td>
        <td>${p.designation}</td>
        <td>${p.prix}</td>
        <td>${p.quantite}</td>       
     </tr>
     </C:forEach>
   </table>  
       </div>
    </div>
  </div>
</body>
</html>