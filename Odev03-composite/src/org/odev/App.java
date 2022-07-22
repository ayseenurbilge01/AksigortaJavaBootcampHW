package org.odev;

public class App {

	public static void main(String[] args) {
		IDepartman uretimDepartmani = new UretimDepartmani(1,"Üretim Departmanı");
		IDepartman insanKaynaklariDepartmani = new InsanKaynaklariDepartmani(2,"İnsan Kaynakları Departmanı");
		IDepartman muhasebeDepartmani = new MuhasebeDepartmani(3,"Muhasebe Departmanı");
		YonetimDepartmani yonetimDepartmani = new YonetimDepartmani(4,"Yönetim Departmanı");
		
		yonetimDepartmani.addDepartment(insanKaynaklariDepartmani);
		yonetimDepartmani.addDepartment(uretimDepartmani);
		System.out.println("DEPARTMAN İSİMLERİ");
		yonetimDepartmani.printDepartmentName();
		

	}

}
