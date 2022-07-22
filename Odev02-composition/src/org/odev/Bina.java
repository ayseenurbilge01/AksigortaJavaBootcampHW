package org.odev;

import java.util.ArrayList;

public  class Bina {
	private int no;
	private String ad;
	private ArrayList<Daire> daireler = new ArrayList();
	private Sokak sk;

	public Bina(int no, String ad) 
	{
		this.no = no;
		this.ad = ad;
	}

	public int getNo() 
	{
		return no;
	}

	public void setNo(int no) 
	{
		this.no = no;
	}

	public String getAd() 
	{
		return ad;
	}

	public void setAd(String ad) 
	{
		this.ad = ad;
	}

	public void ekleDaire(Daire d) 
	{ 
		this.daireler.add(d); 
		d.bin = this;
	}
	public void cikarDaire(Daire d) 
	{ 
		this.daireler.remove(d); 
		d.bin = null;
	}
	public int kacDairenVar() 
	{ 
		return this.daireler.size();
	}

	public Sokak getSk() 
	{
		return sk;
	}

	public void setSk(Sokak sk) 
	{
		this.sk = sk;
	}

	public Sokak sokaginiSoyle() 
	{ 
		return this.sk;
	}
}
