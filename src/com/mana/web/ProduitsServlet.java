package com.mana.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mana.dao.ProduitDaoImpl;
import com.mana.entities.Produit;


@WebServlet(name="produitsservlet", urlPatterns="/produitsservlet")
public class ProduitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitDaoImpl metier;
	
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		metier = new ProduitDaoImpl();
		
		//Recuperer les informations
		
				String designation = request.getParameter("designation");
				String prix = request.getParameter("prix");
				String quantite = request.getParameter("quantite");
				
				//set the value in model class
				
				Produit p = new Produit(1L,designation,Double.parseDouble(prix),Integer.parseInt(quantite));
							
				/*p.setDesignation(designation);
				p.setPrix(Double.parseDouble(prix));
				p.setQuantite(Integer.parseInt(quantite));*/
	            
				metier.save(p);
	            
				
				// this our Java bean
	            ProduitModel pb = new ProduitModel();
	    		
	            // set a liste of java bean
	    		pb.setProduits(metier.getAll());
	    		
	    		request.setAttribute("modele", pb);
	    		
	    		request.getRequestDispatcher("prods.jsp").forward(request, response);
	    		
				
		
		
	}

}
