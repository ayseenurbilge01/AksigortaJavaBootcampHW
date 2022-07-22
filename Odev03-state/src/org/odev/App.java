package org.odev;

public class App {
	
	public static void main(String[] args) {

        Kargo kargo = new Kargo();
        
        kargo.printStatus();

        kargo.nextState();
        kargo.printStatus();

        kargo.nextState();
        kargo.printStatus();
    }

}
