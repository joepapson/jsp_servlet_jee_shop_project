package com.mana.dao;

import java.util.List;

import com.mana.entities.Produit;

public interface IProduitDao {
	
	public Produit save(Produit p);
	public List<Produit> produitsParMC(String mc);

}
