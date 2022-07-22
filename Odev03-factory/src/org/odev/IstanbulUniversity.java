package org.odev;

public class IstanbulUniversity implements University{

	@Override
	public void name() {
		System.out.println("İSTANBUL ÜNİVERSİTESİ");
		
	}

	@Override
	public void since(int year) {
		System.out.println("KURULUŞ YILI : 1453");
		
	}

}
