package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) throws ParseException {
		Client client1= new Client("Rahma","500Euros","diarrarahma@gmail.com","ref12g");
		System.out.println(client1.toString());
		
		Client client2= new Client("Alice","512Euros","alice@gmail.com","ref13g");
		System.out.println(client2.toString());
		
		Client client3= new Client("Bob","400Euros","bob@gmail.com","ref13g");
		System.out.println(client3.toString());
		
		Passager passager1 = new Passager("Alice","alice@gmail.com");
		System.out.println(passager1.toString());
		
		Passager passager2 = new Passager("Bob","bob@gmail.com");
		System.out.println(passager2.toString());
		
		Passager passager3 = new Passager("Rahma","diarrarahma@gmail.com");
		System.out.println(passager3.toString());
		
		ZonedDateTime depart = ZonedDateTime.of(2018,11,2,15,58,20,8000, ZoneId.systemDefault());
		ZonedDateTime arrivee = ZonedDateTime.of(2018,11,3,12,50,40,9000, ZoneId.systemDefault());
		
		Vol vol1 = new Vol("AF12",depart,arrivee);
		System.out.println(vol1.toString());
		vol1.fermer();
		System.out.println(vol1.toString());
		
		Reservation reservation1 = new Reservation(new SimpleDateFormat("dd/MM/yyyy").parse("02/11/2018"),20040065, vol1,client1,passager1);		
		System.out.println(reservation1.toString());
		reservation1.confirmer();
		System.out.println(reservation1.toString());
		
		Reservation reservation2 = new Reservation(new SimpleDateFormat("dd/MM/yyyy").parse("02/11/2018"),20040066, vol1,client2,passager2);
		System.out.println(reservation2.toString());
		reservation2.annuler();
		System.out.println(reservation2.toString());
		
		Reservation reservation3 = new Reservation(new SimpleDateFormat("dd/MM/yyyy").parse("02/11/2018"),20040068, vol1,client3,passager3);
		System.out.println(reservation3.toString());
		reservation3.payer();
		System.out.println(reservation3.toString());
		System.out.println("Bon vol! ");


	}

}
