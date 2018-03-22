package com.mana.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mana.entities.Produit;

public class ProduitDaoImpl implements IProduitDao{

	@Override
	public Produit save(Produit p) {
		
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO produit(designation,prix,quantite) VALUES(?,?,?)");
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			
			ps.executeUpdate();
			
			/*PreparedStatement ps2 = connection.prepareStatement("select MAX(ID) as MAX_ID from produit");	
			ResultSet rs = ps2.executeQuery();
			if(rs.next()) {
				
				p.setId(rs.getLong("MAX_ID"));
			}
			ps.close();*/
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<Produit> produitsParMC(String mc) {
		
		List<Produit>produits = new ArrayList<Produit>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("select * from produit where designation like ?");
			ps.setString(1, mc);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Produit p = new Produit();
				
				p.setId(rs.getLong("id"));
				p.setDesignation(rs.getString("designation"));
				p.setPrix(rs.getDouble("prix"));
				p.setQuantite(rs.getInt("quantite"));
				
				produits.add(p);
			}
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		return produits;
	}
	
   public void removeProduit(Long id) {
	
	
	      Connection con = SingletonConnection.getConnection();
			
			
			PreparedStatement ps;
			
			try {
				ps = con.prepareStatement("DELETE from produit WHERE id = ?");
				ps.setLong(1, id);			
				ps.execute();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}			
		
	}

   @Override
   public List<Produit> getAll() {
	
	List<Produit>listproduits = new ArrayList<>();
		
		 Connection con = SingletonConnection.getConnection();
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("SELECT * FROM produit");
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
				
				Produit p = new Produit();
				p.setId(rs.getLong("id"));
				p.setDesignation(rs.getString("designation"));
				p.setPrix(rs.getDouble("prix"));
				p.setQuantite(rs.getInt("quantite"));
				
				listproduits.add(p);
			}
		}catch(SQLException e){
			
			e.printStackTrace();
		}
	
	       return listproduits;
	

			}

}
