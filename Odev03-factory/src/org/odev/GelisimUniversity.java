package org.odev;

public class GelisimUniversity implements University {

	@Override
	public void name() {
		System.out.println("İSTANBUL GELİŞİM ÜNİVERSİTESİ");
		
	}

	@Override
	public void since(int year) {
		System.out.println("KURULUŞ YILI : 2008");
		
	}

}
