package org.odev;

import java.util.ArrayList;

public class Yemek {
		
		private String ad;
		private int pismeSuresi;
		private tur tip;
		private ArrayList<Malzeme> icerik = new ArrayList();

		public Yemek(String ad, int pismeSuresi, tur tip) {
		this.ad = ad;
		this.pismeSuresi = pismeSuresi;
		this.tip = tip;
		}
		
		public String getAd() {
		return ad;
		}

		public void setAd(String ad) {
		this.ad = ad;
		}

		public int getPismeSuresi() {
		return pismeSuresi;
		}

		public void setPismeSuresi(int pismeSuresi) {
		this.pismeSuresi = pismeSuresi;
		}

		public tur getTip() {
		return tip;
		}

		public void setTip(tur tip) {
		this.tip = tip;
		}

		public void icerikEkle(Malzeme m) {
		if(!icerik.contains(m))
		this.icerik.add(m);
		}

		public void icerikCikar(Malzeme m) {
		this.icerik.remove(m);
		}

		public int maliyet() {
		int top=0;
		for(int i=0; i<icerik.size(); i++)
		top += icerik.get(i).getBirimFiyat()*icerik.get(i).getMiktar();
		return top;
		}


		public String tarifEt() {
		String tarif = "";
		tarif += this.getAd()+" Tarifi: \n";
		for(Malzeme m:this.icerik)
		tarif += m.getMiktar()+" "+ m.getBirim()+" "+m.getAd()+" ekleyin \n";
		tarif +="Afiyet Olsun! :) ";
		return tarif;
		}
		
}
