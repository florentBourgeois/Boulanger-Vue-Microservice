package fr.CCI.Java.boulangerievuemicroservice.bean;

public class ProduitBean {
	
	private int id; 
	private String nom;
	private int valeur;
	private String img;
	
	
	public ProduitBean() {
	}
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return id+ " " + nom + " vendu à " + valeur + " euro";
	}
	
	

	
}
