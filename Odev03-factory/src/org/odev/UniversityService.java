package org.odev;

public class UniversityService {
	
	public static void main(String[] args) {
	
	UniversityFactory universityFactory = new UniversityFactory();
	
	University university = universityFactory.createUniversity("Gelisim");
	
	university.name();
	
	
	}

}
