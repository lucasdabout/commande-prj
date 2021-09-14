package edu.commande.models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Commande {
    private Date date;
    private Client leClient; // Client -> classe alors que leClient -> instance de la classe Client
    private Map<String, detailCommande> listeDetails;

    ////////////// CONSTRUCTEUR //////////////
    public Commande(Client leClient) {
	this.leClient = leClient;
	listeDetails = new HashMap<>();
	date = new Date();
    }

    ////////////// MÉTHODES //////////////
    public void addProduit(Produit produit, int quantite) {
	if (listeDetails.containsKey(produit.getRef())) {
	    incProduit(produit.getRef(), quantite);
	} else {
	    this.listeDetails.put(produit.getRef(), new detailCommande(produit, quantite));
	}
    }

    public void incProduit(String ref, int quantite) {
	int index = listeDetails.indexOf(detailCommande.getRef(ref));
	if (index != -1) {
	    listeDetails.get(index).incQuantite(quantite);
	}
    }

    public float getMontant() {
	float montant = 0;
	for (detailCommande ligneDetail : this.listeDetails) {
	    montant += ligneDetail.getQuantite() * ligneDetail.getLeProduit().getPu();
	}
	return montant;
    }

    public int getQuantiteProduits() {
	int quantite = 0;
	for (detailCommande ligneDetail : this.listeDetails) {
	    quantite += ligneDetail.getQuantite();
	}
	return quantite;
    }

    public boolean retireLigneDetail(String ref) {
	/*
	 * for (detailCommande ligneDetail : this.listeDetails) { if
	 * (ref.equals(ligneDetail.getLeProduit().getRef())) { return
	 * this.listeDetails.remove(ligneDetail); } } return true;
	 */
	return listeDetails.remove(new detailCommande(new Produit(ref, 0), 0));
    }
}
