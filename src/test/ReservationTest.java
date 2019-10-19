package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

import main.Client;
import main.Passager;
import main.Reservation;
import main.Vol;

class ReservationTest {

	@Test
	void confirmerTest() throws ParseException {
		ZonedDateTime depart = ZonedDateTime.of(2018,11,2,15,58,20,8000, ZoneId.systemDefault());
		ZonedDateTime arrivee = ZonedDateTime.of(2018,11,3,12,50,40,9000, ZoneId.systemDefault());
		
		Vol vol1 = new Vol("AF12",depart,arrivee);
		Client client1= new Client("Alice","512Euros","alice@gmail.com","ref13g");
		Passager passager1 = new Passager("Alice","alice@gmail.com");


		Reservation reservation1 = new Reservation(new SimpleDateFormat("dd/MM/yyyy").parse("02/11/2018"),20040065, vol1,client1,passager1);		
		reservation1.confirmer();
		assertEquals("Reservation Confirmee",reservation1.getEtat());
		assertNotEquals("Reservation Annulee",reservation1.getEtat());
		
	}

	
}
