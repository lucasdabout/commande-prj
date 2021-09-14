package edu.commande.models;

public class Produit {
    private String ref;
    private float pu;

    ////////////// CONSTRUCTEUR //////////////
    public Produit(String ref, float pu) {
	this.ref = ref;
	this.pu = pu;
    }

    ////////////// GETTER //////////////
    public float getPu() {
	return this.pu;
    }

    public String getRef() {
	return ref;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (!(obj instanceof Produit)) {
	    return false;
	}
	return ((Produit) obj).getRef().equals(ref);
    }
}
