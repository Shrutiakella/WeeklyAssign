package com.prodapt.WeeklyAssign;

public class SchoolRecords {
	int ID;
	String Nmae;
	String Address;
	
	void addRecord() {
		System.out.println("Added School Id ");
		System.out.println("Added Schhol Name ");
		System.out.println("Added School Adress");
		
	}
	void displayRecords(int ID,String Name,String Address) {
		System.out.println("The School Id is " + ID);
		System.out.println("The School name is "+ Name);
		System.out.println("The School Adrress is "+Address);
	}
	

}
