package org.odev;

public class AlinanState implements KargoState{

	@Override
	public void next(Kargo kargo) {
		kargo.setState(new TeslimDurumuState());
		
	}

	
	@Override
	public void printStatus() {
		System.out.println("Sipariş dağıtım şubesine ulaştı.");
		
	}



	@Override
	public void prev(Kargo kargo) {
		kargo.setState(new SiparisState());
		
	}

}
