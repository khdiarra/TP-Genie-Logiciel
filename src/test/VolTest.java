package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

import main.Vol;
//author Diarra Khadidiatou

class VolTest {

	@Test
	void dureeTest() {
		ZonedDateTime depart = ZonedDateTime.of(2018,11,2,15,58,20,8000, ZoneId.systemDefault());
		ZonedDateTime arrivee = ZonedDateTime.of(2018,11,3,12,50,40,9000, ZoneId.systemDefault());
		Vol vol1 = new Vol("AF12",depart,arrivee);
		assertEquals(20, vol1.duree());
		assertNotEquals(22, vol1.duree());
	}
	@Test
	void ouvrirTest() {
		ZonedDateTime depart = ZonedDateTime.of(2018,11,2,15,58,20,8000, ZoneId.systemDefault());
		ZonedDateTime arrivee = ZonedDateTime.of(2018,11,3,12,50,40,9000, ZoneId.systemDefault());
		Vol vol1 = new Vol("AF12",depart,arrivee);
		vol1.ouvrir();
		assertEquals(true, vol1.isOuvert());
		assertNotEquals(false,vol1.isOuvert());
		
		
		
	}
	@Test
	void fermerTest() {
		ZonedDateTime depart = ZonedDateTime.of(2018,11,2,15,58,20,8000, ZoneId.systemDefault());
		ZonedDateTime arrivee = ZonedDateTime.of(2018,11,3,12,50,40,9000, ZoneId.systemDefault());
		Vol vol1 = new Vol("AF12",depart,arrivee);
		vol1.fermer();
		assertEquals(false, vol1.isOuvert());
		assertNotEquals(true,vol1.isOuvert());
		
		
		
	}

}
