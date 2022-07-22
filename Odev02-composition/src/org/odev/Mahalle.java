package org.odev;

import java.util.ArrayList;

public class Mahalle {
	private String ad;
	private ArrayList<Sokak> sokaklar = new ArrayList();

	public Mahalle(String ad) 
	{
		this.ad = ad;
	}

	public String getAd() 
	{
		return ad;
	}

	public void setAd(String ad) 
	{
		this.ad = ad;
	}

	public void ekleSokak(Sokak s) 
	{ 
		this.sokaklar.add(s); 
		s.setMah(this);
	}
	public void cikarSokak(Sokak s) 
	{ 
		this.sokaklar.remove(s); 
		s.setMah(null);
	}
}
