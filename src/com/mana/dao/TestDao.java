package com.mana.dao;

import java.util.List;

import com.mana.entities.Produit;

public class TestDao {
	
	public static void main(String[] args) {
		
		ProduitDaoImpl dao = new ProduitDaoImpl();
		
		Produit p1 = dao.save(new Produit("Visco 750",9600,13));
		Produit p2 = dao.save(new Produit("Toyota",1100,63));
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println("--------------------------");
		System.out.println("Chercher des produits");
		List<Produit>prods = dao.produitsParMC("%H%");
		
		for(Produit pr : prods) {
			
			System.out.println(pr.toString());
		}
		
	}

}
