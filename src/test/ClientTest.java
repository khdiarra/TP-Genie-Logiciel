package test;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import main.Client;




class ClientTest {

	@Test
	void getNomTest() {
		Client client = new Client("Khadi","Cheque", "bla", "Bllala");
		assertEquals("Khadi", client.getNom());
		assertNotEquals("Khadi2", client.getNom());
	}

}
