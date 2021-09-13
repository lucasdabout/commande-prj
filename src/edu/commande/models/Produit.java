package edu.commande.models;

public class Produit {
    private String ref;
    private float pu;

    public Produit(String ref, float pu) {
	this.ref = ref;
	this.pu = pu;
    }

    public String getRef() {
	return ref;
    }

    public void setRef(String ref) {
	this.ref = ref;
    }

    public float getPu() {
	return pu;
    }

    public void setPu(float pu) {
	this.pu = pu;
    }

    public Produit(String ref, float pu) {
	return this.ref + pu;
    }

    public void getPu(float pu) {
    }
}
