package org.odev;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VadeliHesap implements IHesaplar {
	
	private int bakiye;
	private Date acilisTarihi;
	
	public VadeliHesap(int bakiye,Date acilisTarihi)
	{
		this.bakiye=bakiye;
		this.acilisTarihi=acilisTarihi;
	}
	
	@Override
	public int bakiyeGoster()
	{
		return this.bakiye;
	}
	
	@Override
	public Date acilisTarihiGoster()
	{
		return this.acilisTarihi;
	}
	
	
	@Override
	public void paraCek(int miktar)
	{
		this.bakiye-=miktar;
	}
	@Override
	public void paraYatir(int miktar)
	{
		this.bakiye+=miktar;
	}

	public String kapanisTarihiGoster()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(acilisTarihi); // Now use today date.
		c.add(Calendar.MONTH, 1); // Adding 5 days
		String output = sdf.format(c.getTime());

		return output;
	}

}
