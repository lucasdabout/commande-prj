package edu.commande.models;

import java.sql.Date;

public class Commande {
    private Date date;

    public Commande(Date date) {
	this.date = date;
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public Commande(Client client) {
    }

    public void addProduit(Produit patate, int quantite) {

    }

    public void getMontant(float pu) {

    }
}
