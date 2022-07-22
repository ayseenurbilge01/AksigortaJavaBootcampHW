package org.odev;

import java.util.ArrayList;

public class Sokak
{
	private String ad;
	private ArrayList<Bina> binalar = new ArrayList();
	private Mahalle mah;

	public Sokak(String ad) {
	this.ad = ad;
	}

	public String getAd() {
	return ad;
	}

	public void setAd(String ad) {
	this.ad = ad;
	}

	public void ekleBina(Bina b) { this.binalar.add(b); b.setSk(this);}
	public void cikarBina(Bina b) { this.binalar.remove(b); b.setSk(null);}

	public Mahalle mahalleniSoyle() { return this.mah; }

	public Mahalle getMah() {
	return mah;
	}

	public void setMah(Mahalle mah) {
	this.mah = mah;
	}

}



