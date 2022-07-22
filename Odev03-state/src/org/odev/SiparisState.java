package org.odev;

public class SiparisState implements KargoState{

	@Override
	public void next(Kargo kargo) {
		kargo.setState(new AlinanState());
		
	}

	@Override
	public void prev(Kargo kargo) {
		System.out.println("Sipariş oluşturuldu, ilk aşamadır.");
		
	}

	@Override
	public void printStatus() {
		System.out.println("Sipariş kargo şirketi tarafından alındı.");
		
	}

}
