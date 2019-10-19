package main;
//author Diarra Khadidiatou

import java.util.Date;

public class Reservation {
public Date date;
public long identifiant;
public String etat;
public Vol vol;
public Client client;
public Passager passager;


public Reservation(Date date, long identifiant, Vol vol, Client client, Passager passager) {
	super();
	this.date = date;
	this.identifiant = identifiant;
	this.vol = vol;
	this.client = client;
	this.passager = passager;
	this.etat = Etat.CREE.toString();//A la creation la reservation a un etat cree

}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public Vol getVol() {
	return vol;
}

public void setVol(Vol vol) {
	this.vol = vol;
}

public Passager getPassager() {
	return passager;
}

public void setPassager(Passager passager) {
	this.passager = passager;
}

public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public long getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(long identifiant) {
	this.identifiant = identifiant;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}
public void annuler() {
	this.etat = Etat.ANNULEE.toString();

}
public void confirmer() {
	this.etat = Etat.CONFIRMEE.toString();
	
}
public void payer() {
	this.etat = Etat.PAYEE.toString();
}

@Override
public String toString() {
	return "Reservation [date=" + date + ", identifiant=" + identifiant + ", etat=" + etat + ", vol=" + vol.getIdentifiant()
			+ ", client=" + client.getNom() + ", passager=" + passager.getNom() + "]";
}

}
