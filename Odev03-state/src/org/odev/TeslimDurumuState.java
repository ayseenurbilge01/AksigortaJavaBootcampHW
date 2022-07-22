package org.odev;

public class TeslimDurumuState implements KargoState{

	@Override
	public void next(Kargo kargo) {
		System.out.println("Sipariş müşteriye teslim edildi, son aşamadır.");
		
	}

	@Override
	public void prev(Kargo kargo) {
		kargo.setState(new AlinanState());
		
	}

	@Override
	public void printStatus() {
		System.out.println("Sipariş müşteriye teslim edildi.");
		
	}

}
