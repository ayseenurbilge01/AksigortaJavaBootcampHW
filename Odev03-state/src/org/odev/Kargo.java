package org.odev;

public class Kargo {

	 private KargoState state = (KargoState) new SiparisState();

	   

	    public KargoState getState() {
	    	return state;
	    }

	    public void setState(KargoState state) {
	    	this.state = state;
	    }

		public void previousState() {
	        state.prev(this);
	    }

	    public void nextState() {
	        state.next(this);
	    }

	    public void printStatus() {
	        state.printStatus();
	    }

		
	    
}
