package org.odev;

import java.util.Date;

public interface IHesaplar {
	
     public int bakiyeGoster();
     public void paraYatir(int miktar);
     public void paraCek(int miktar);
	 public Date acilisTarihiGoster();
	 
}
