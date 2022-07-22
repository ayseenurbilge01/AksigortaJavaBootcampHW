package org.odev;

public class UniversityFactory {
	
	
	public University createUniversity(String university){
		
		 if (university == null || university.isEmpty())
	            return null;
	        switch (university) {
	        case "Gelisim":
	            return new GelisimUniversity();
	        case "Istanbul":
	            return new IstanbulUniversity();
	        default:
	            throw new IllegalArgumentException("University "+university);
	        }
	}

}
