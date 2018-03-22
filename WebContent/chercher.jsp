<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Detail</title>
</head>
<body>

  <h1>Product Details</h1>

   <table class="table table-striped">
            <tr>
               <th>ID</th>
               <th>Designation</th>
               <th>Prix</th>
               <th>Quantité</th>
            </tr>           
           <C:forEach items="${model.produits}" var="p">        
              <tr>
                <td>${p.id}</td>
                <td>${p.designation}</td>
                <td>${p.prix}</td>
                <td>${p.quantite}</td>
                <td><a href="supprimer.do?id=${p.id}">Supprimer</a></td>
                <td><a href="edit.do?id=${p.id}">Edit</a></td>
              </tr> 
            </C:forEach>
            
         </table>
</body>
</html>