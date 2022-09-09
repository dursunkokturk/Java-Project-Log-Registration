package day3_lecture1_topic_15;

public class CustomerManager {
	
	// Logger Hepsinde Ortak Oldugudan Logger Uzerinden Tum Log lara Ulasmak Icin
	// Add Fonksiyonu Icinde Logger i Parametre Olarak Veriyoruz
	public void add(Logger logger) {
		System.out.println("Customer Added");
		
		// Yapýlan Log lama Isleminin Hangisi Oldugunu Gosteriyoruz
		logger.log();
	}
}