package org.odev;

public class InsanKaynaklariDepartmani implements IDepartman{
	
	private int id;
	private String name;

	public InsanKaynaklariDepartmani(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());		
	}

}
