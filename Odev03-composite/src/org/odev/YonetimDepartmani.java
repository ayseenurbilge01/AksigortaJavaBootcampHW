package org.odev;

import java.util.ArrayList;
import java.util.List;

public class YonetimDepartmani implements IDepartman{
	
	private int id;
	private String name;
	private List<IDepartman> childDepartments;
	
	public YonetimDepartmani(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

	@Override
	public void printDepartmentName() {
		childDepartments.forEach(IDepartman::printDepartmentName);		
	}
	
	public void addDepartment(IDepartman department) {
        childDepartments.add(department);
    }

    public void removeDepartment(IDepartman department) {
        childDepartments.remove(department);
    }

}
