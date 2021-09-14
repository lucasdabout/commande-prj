package edu.commande.models;

public class detailCommande {
    private int quantite;
    private Produit leProduit;

    ////////////// CONSTRUCTEUR //////////////
    public detailCommande(Produit p, int quantite) {
	this.leProduit = p;
	this.quantite = quantite;
    }

    ////////////// GETTER SETTER//////////////
    public int getQuantite() {
	return quantite;
    }

    public void setQuantite(int quantite) {
	this.quantite = quantite;
    }

    public Produit getLeProduit() {
	return leProduit;
    }

    public void setLeProduit(Produit leProduit) {
	this.leProduit = leProduit;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (!(obj instanceof detailCommande)) {
	    return false;
	}
	return ((detailCommande) obj).getLeProduit().equals(leProduit);
    }

    public static detailCommande getRef(String ref) {
	return new detailCommande(new Produit(ref, 0), 0);
    }

    public void incQuantite(int quantite) {
	this.quantite += quantite;

    }

}
