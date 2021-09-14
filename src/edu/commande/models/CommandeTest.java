package edu.commande.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommandeTest {
    private Commande laCommande;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
	laCommande = new Commande(new Client("Paul"));

    }

    @Test
    void testGetMontant() {
	assertEquals(0, laCommande.getMontant(), 0);
	laCommande.addProduit(new Produit("Fromage de brebis", 2.0f), 2);
	assertEquals(4.0f, laCommande.getMontant(), 0);
	laCommande.addProduit(new Produit("Saucisson", 1.0f), 10);
	assertEquals(14.0f, laCommande.getMontant(), 0);
    }

    @Test
    void testGetQuantiteProduits() {
	assertEquals(0, laCommande.getQuantiteProduits());
	laCommande.addProduit(new Produit("Fromage de brebis", 2.0f), 2);
	assertEquals(2, laCommande.getQuantiteProduits());
	laCommande.addProduit(new Produit("Saucisson", 1.0f), 10);
	assertEquals(12f, laCommande.getQuantiteProduits(), 0);
    }

    @Test
    void testRetireLigneDetail() {
	assertEquals(0, laCommande.getQuantiteProduits());
	laCommande.addProduit(new Produit("Fromage de brebis", 2.0f), 2);
	assertEquals(2, laCommande.getQuantiteProduits());
	laCommande.addProduit(new Produit("Saucisson", 1.0f), 10);
	assertEquals(12f, laCommande.getQuantiteProduits());
	laCommande.retireLigneDetail("Fromage de brebis");
	assertEquals(10, laCommande.getQuantiteProduits());

	laCommande.retireLigneDetail("xxx");
	assertEquals(10, laCommande.getQuantiteProduits());

	laCommande.retireLigneDetail("Saucisson");
	assertEquals(0, laCommande.getQuantiteProduits());
    }

    @Test
    void testIncProduit() {
	assertEquals(0, laCommande.getQuantiteProduits());
	laCommande.addProduit(new Produit("Fromage de brebis", 2.0f), 2);
	assertEquals(2, laCommande.getQuantiteProduits());
	laCommande.incProduit("Fromage de brebis", 2);
	assertEquals(4, laCommande.getQuantiteProduits());

	laCommande.incProduit("Fromage de brebis", -1);
	assertEquals(3, laCommande.getQuantiteProduits());

	laCommande.incProduit("Fromage de brebiis", 100);
	assertEquals(3, laCommande.getQuantiteProduits());

    }
}
