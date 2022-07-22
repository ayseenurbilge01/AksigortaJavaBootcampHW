package org.odev;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {
	
	 public static void main(String[] args) {
		 
		
		 Calendar today = Calendar.getInstance();
		 Date simdikiZaman = today.getTime();
		 IHesaplar h1 = new VadeliHesap(5000,simdikiZaman);
		 IHesaplar h2 = new VadesizHesap(1000,simdikiZaman);	
		 IHesaplar hesap = null;
			
			
		 while (true)
		 {
			 System.out.print(" 1-Vadeli Hesap \n 2-Vadesiz Hesap \n   İşlem yapmak istediğiniz hesap türünü seçiniz:  ");
				Scanner hesapTuru = new Scanner(System.in);
				int h = hesapTuru.nextInt();
				
				if(h==1)
				{
					hesap = h1;
					break;
				}
				else if(h==2)
				{
					hesap = h2;
					break;
				}
				else
					System.err.println("Geçerli bir değer girmediniz !");
		 }
			
		System.out.print(" 1-Bakiye göster \n 2-Para Çek \n 3-Para Yatır \n  Lütfen yapmak istediğiniz işlemi seçiniz:  ");
		Scanner secim = new Scanner(System.in);
		int sonuc = secim.nextInt();
			
		switch(sonuc)
		{
		case 1:
			System.out.println("Bakiyeniz: "+hesap.bakiyeGoster());
			break;
		case 2:
			System.out.print(" Miktar belirleyiniz:  ");
			Scanner cekilecekMiktar = new Scanner(System.in);
			int cm = cekilecekMiktar.nextInt();
			if(hesap.bakiyeGoster()>cm)
			{
				hesap.paraCek(cm);
				System.out.println("Güncel bakiyeniz: "+hesap.bakiyeGoster());
			}
			else
				System.out.println("Bakiye yetersiz");
			break;
		case 3:
			System.out.print(" Miktar belirleyiniz:  ");
			Scanner yatirilacakMiktar = new Scanner(System.in);
			int ym = yatirilacakMiktar.nextInt();
			hesap.paraYatir(ym);
			System.out.println("Güncel bakiyeniz: "+hesap.bakiyeGoster());
			break;
		default:
			System.err.println("Geçerli bir değer girmediniz !");
			break;
			
		}
		
	}
}
