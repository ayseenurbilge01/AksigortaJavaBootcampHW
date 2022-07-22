package org.odev;

public class App {
	
	public static void main(String[] args) {

		Malzeme patlican = new Malzeme("Bostan patlican",olcu.adet,1,3);
		Malzeme seker = new Malzeme("Toz şeker",olcu.bardak,1, 1);
		Malzeme un = new Malzeme("Buğday unu",olcu.bardak,1,1);
		Malzeme yag = new Malzeme("Ayçiçek yağı",olcu.kaşık,2,1);
		Malzeme su = new Malzeme("İçme suyu",olcu.litre,1,1);

		Yemek helva = new Yemek("Un helvası",20, tur.tatlı);
		helva.icerikEkle(un);
		helva.icerikEkle(su);
		helva.icerikEkle(seker);
		helva.icerikEkle(yag);

		System.out.println(helva.tarifEt());
		System.out.println(helva.maliyet()+" TL");
		}
}
