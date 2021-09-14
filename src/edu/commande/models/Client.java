package edu.commande.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String id;
    private List<Commande> listeCommandes;

    ////////////// CONSTRUCTEUR //////////////
    public Client(String id) {
	this.id = id;
	listeCommandes = new ArrayList<>();
    }

    ////////////// GETTER SETTER//////////////

    public String getId() {
	return this.id;
    }

    public void setId(String newId) {
	this.id = newId;
    }

}
