package main;

public class Passager {
	private String nom;
	private String contact;
	public Passager(String nom, String contact) {
		super();
		this.nom = nom;
		this.contact = contact;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Passager [nom=" + nom + ", contact=" + contact + "]";
	}


}
