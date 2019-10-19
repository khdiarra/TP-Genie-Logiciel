package main;
//author Diarra Khadidiatou

import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Vol {
	private String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private boolean ouvert; // pour savoir si le vol est ouvert ou fermee
	
	public Vol(String identifiant, ZonedDateTime depart, ZonedDateTime arrivee) {
		super();
		this.identifiant = identifiant;
		this.depart = depart;
		this.arrivee = arrivee;
		this.ouvert = true;
	}
	public ZonedDateTime getDepart() {
		return depart;
	}
	public void setDepart(ZonedDateTime depart) {
		this.depart = depart;
	}
	public ZonedDateTime getArrivee() {
		return arrivee;
	}
	public void setArrivee(ZonedDateTime arrivee) {
		this.arrivee = arrivee;
	}
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public boolean isOuvert() {
		return ouvert;
	}
	public void setOuvert(boolean ouvert) {
		this.ouvert = ouvert;
	}
	

	@Override
	public String toString() {
		if (this.isOuvert()) {
			return "Le Vol identifiant =" + identifiant + ", depart=" + depart + ", arrivee=" + arrivee + ", de duree = "+this.duree()+ " heures est ouvert";
			
		} else {
			return "Le Vol identifiant =" + identifiant + ", depart=" + depart + ", arrivee=" + arrivee + ", de duree = "+this.duree()+ " heures est ferme";

		}
			}
	public long duree() {
		return ChronoUnit.HOURS.between(this.getDepart(),this.getArrivee());
	}
	public void ouvrir() {
		this.ouvert=true;
	}
	public void fermer() {
		this.ouvert=false;
		
		
	}

}
