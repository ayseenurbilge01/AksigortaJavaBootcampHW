package org.odev;

public class Malzeme {
	
	private String ad;
	private olcu birim;
	private int miktar;
	private int birimFiyat;

	public Malzeme(String ad, olcu birim, int miktar, int birimFiyat) {
	this.ad = ad;
	this.birim = birim;
	this.miktar = miktar;
	this.birimFiyat = birimFiyat;
	}

	public Malzeme(String ad, olcu birim) {
	this.ad = ad;
	this.birim = birim;
	}

	public String getAd() {
	return ad;
	}

	public void setAd(String ad) {
	this.ad = ad;
	}

	public olcu getBirim() {
	return birim;
	}

	public void setBirim(olcu birim) {
	this.birim = birim;
	}

	public int getMiktar() {
	return miktar;
	}

	public void setMiktar(int miktar) {
	this.miktar = miktar;
	}

	public int getBirimFiyat() {
	return birimFiyat;
	}

	public void setBirimFiyat(int birimFiyat) {
	this.birimFiyat = birimFiyat;
	}
}
