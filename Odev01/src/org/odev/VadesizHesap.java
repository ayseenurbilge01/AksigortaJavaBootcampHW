package org.odev;

import java.util.Date;

public class VadesizHesap implements IHesaplar{
	
	private int bakiye;
	private Date acilisTarihi;
	
	public VadesizHesap(int bakiye,Date acilisTarihi)
	{
		this.bakiye=bakiye;
		this.acilisTarihi=acilisTarihi;
	}
	
	public int bakiyeGoster()
	{
		return this.bakiye;
	}
	
	public Date acilisTarihiGoster()
	{
		return this.acilisTarihi;
	} 
	
	public void paraCek(int miktar)
	{
		this.bakiye-=miktar;
	}
	
	public void paraYatir(int miktar)
	{
		this.bakiye+=miktar;
	}

}
