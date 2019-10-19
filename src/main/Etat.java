package main;
//author Diarra Khadidiatou

public enum Etat {
ANNULEE ("Reservation Annulee"),
CONFIRMEE ("Reservation Confirmee"),
PAYEE ("Reservation Payee"),
CREE ("Reservation Cree");
	 private String etat = "";

	private Etat(String etat) {
		this.etat = etat;
	}
	public String toString(){
	    return etat;
	}
	
}

