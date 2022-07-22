package org.odev;

public class App {
	
	public static void main(String[] args) {
	Daire d1 = new Daire(1);
	Daire d2 = new Daire(2);

	Bina b1 = new Bina(35, "Kardeşler Apt.");
	b1.ekleDaire(d1);
	b1.ekleDaire(d2);

	Sokak s1 = new Sokak("Katip Çelebi");

	Mahalle m1 = new Mahalle("Muratpaşa");

	m1.ekleSokak(s1);
	s1.ekleBina(b1);

	System.out.println(b1.getAd() + "binasında " + b1.kacDairenVar()+ " adet daire var");
	System.out.println(d1.binaSoyle().getAd());
	System.out.println(d1.binaSoyle().sokaginiSoyle().mahalleniSoyle().getAd());
	}
}
