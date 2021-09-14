package edu.commande.models;

public class commandeSpeciale extends Commande {
    private float promo;

    ////////////// CONSTRUCTEUR QUI HERITE DE LA CLASSE COMMANDE //////////////
    public commandeSpeciale(Client leClient, float promo) {
	super(leClient);
	this.promo = promo;
    }

    ////////////// SURCHARGE //////////////
    @Override
    public float getMontant() {
	return super.getMontant() * (1 - this.promo);
    }
}
