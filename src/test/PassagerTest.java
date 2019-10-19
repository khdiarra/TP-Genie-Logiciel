package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Client;
import main.Passager;

class PassagerTest {

	@Test
	void getNomTest() {
		Passager passager = new Passager("Khadi","kh@gmail.com");
		assertEquals("Khadi", passager.getNom());
		assertNotEquals("Khadi2", passager.getNom());
	}
	
	@Test
	void getContactTest() {
		Passager passager = new Passager("Khadi","kh@gmail.com");
		assertEquals("kh@gmail.com", passager.getContact());
		assertNotEquals("k@gmai.com", passager.getContact());
		
	}
	

}
